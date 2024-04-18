package com.diveandcode.app.service;

import com.diveandcode.app.dto.TypeDeviceDTO;
import com.diveandcode.app.entity.Device;
import com.diveandcode.app.entity.TypeDevice;
import com.diveandcode.app.repository.TypeDeviceRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TypeDeviceService {

    @Autowired
    private TypeDeviceRepository typedeviceRepository;

    @Autowired
    private ModelMapper modelMapper;

    public TypeDeviceDTO saveDevice(TypeDeviceDTO typedeviceDTO){
        typedeviceRepository.save(modelMapper.map(typedeviceDTO, TypeDevice.class));
        return typedeviceDTO;
    }

    public List<TypeDeviceDTO> getAllTypeDevice(){
        List<TypeDevice> deviceList = typedeviceRepository.findAll();
        return modelMapper.map(deviceList, new TypeToken<List<TypeDeviceDTO>>(){}.getType());
    }

    public TypeDeviceDTO getOneTypeDevice(int id){
        Optional<TypeDevice> device = typedeviceRepository.findById(id);
        return modelMapper.map(device, new TypeToken<TypeDeviceDTO>(){}.getType());
    }

    public TypeDeviceDTO updateTypeDevice(TypeDeviceDTO typedeviceDTO){
        typedeviceRepository.save(modelMapper.map(typedeviceDTO,TypeDevice.class));
        return typedeviceDTO;
    }

    public boolean deleteTypeDevice(TypeDeviceDTO typedeviceDTO){
        typedeviceRepository.delete(modelMapper.map(typedeviceDTO, TypeDevice.class));
        return true;
    }
}
