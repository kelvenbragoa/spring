package com.diveandcode.app.controller;

import com.diveandcode.app.dto.DeviceDTO;
import com.diveandcode.app.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/")
@CrossOrigin
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping("/device")
    public List<DeviceDTO> getDevice(){
        return deviceService.getAllDevices();
    }

    @GetMapping("/device/{id}")
    public DeviceDTO getOneDevice(@PathVariable("id") int id){
        return deviceService.getOneDevices(id);
    }

    @PostMapping("/device")
    public DeviceDTO saveDevice(@RequestBody DeviceDTO deviceDTO){
        return deviceService.saveDevice(deviceDTO);
    }

    @PutMapping("/device")
    public DeviceDTO updateDevice(@RequestBody DeviceDTO deviceDTO){
        return deviceService.updateDevice(deviceDTO);
    }

    @DeleteMapping("/device")
    public boolean deleteDevice(@RequestBody DeviceDTO deviceDTO){
        return deviceService.deleteDevice(deviceDTO);
    }

}
