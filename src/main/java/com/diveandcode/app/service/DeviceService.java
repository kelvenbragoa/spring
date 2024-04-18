package com.diveandcode.app.service;

import com.diveandcode.app.dto.DeviceDTO;
import com.diveandcode.app.entity.Device;
import com.diveandcode.app.repository.DeviceRepository;
import com.diveandcode.app.repository.DeviceRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private ModelMapper modelMapper;

    public DeviceDTO saveDevice(DeviceDTO deviceDTO){
        deviceRepository.save(modelMapper.map(deviceDTO, Device.class));
        return deviceDTO;
    }

    public List<DeviceDTO> getAllDevices(){
        List<Device> deviceList = deviceRepository.findAll();
        return modelMapper.map(deviceList, new TypeToken<List<DeviceDTO>>(){}.getType());
    }

    public DeviceDTO getOneDevices(int id){
        Optional<Device> device = deviceRepository.findById(id);
        return modelMapper.map(device, new TypeToken<DeviceDTO>(){}.getType());
    }

    public DeviceDTO updateDevice(DeviceDTO deviceDTO){
        deviceRepository.save(modelMapper.map(deviceDTO,Device.class));
        return deviceDTO;
    }

    public boolean deleteDevice(DeviceDTO deviceDTO){
        deviceRepository.delete(modelMapper.map(deviceDTO, Device.class));
        return true;
    }
}
