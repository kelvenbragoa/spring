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

    @GetMapping("/devices")
    public List<DeviceDTO> getDevice(){
        return deviceService.getAllDevices();
    }

    @GetMapping("/devices/{id}")
    public DeviceDTO getOneDevice(@PathVariable("id") int id){
        return deviceService.getOneDevices(id);
    }

    @PostMapping("/devices")
    public DeviceDTO saveDevice(@RequestBody DeviceDTO studentDTO){
        return deviceService.saveDevice(studentDTO);
    }

    @PutMapping("/devices")
    public DeviceDTO updateDevice(@RequestBody DeviceDTO studentDTO){
        return deviceService.updateDevice(studentDTO);
    }

    @DeleteMapping("/devices")
    public boolean deleteDevice(@RequestBody DeviceDTO studentDTO){
        return deviceService.deleteDevice(studentDTO);
    }

}
