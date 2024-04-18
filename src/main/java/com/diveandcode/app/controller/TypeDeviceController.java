package com.diveandcode.app.controller;

import com.diveandcode.app.dto.TypeDeviceDTO;
import com.diveandcode.app.service.TypeDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api/v1/")
@CrossOrigin
public class TypeDeviceController {

    @Autowired
    private TypeDeviceService typedeviceService;

    @GetMapping("/typedevice")
    public List<TypeDeviceDTO> getTypeDevice(){
        return typedeviceService.getAllTypeDevice();
    }

    @GetMapping("/typedevice/{id}")
    public TypeDeviceDTO getOneTypeDevice(@PathVariable("id") int id){
        return typedeviceService.getOneTypeDevice(id);
    }

    @PostMapping("/typedevice")
    public TypeDeviceDTO saveTypeDevice(@RequestBody TypeDeviceDTO typedeviceDTO){
        return typedeviceService.saveDevice(typedeviceDTO);
    }

    @PutMapping("/typedevice")
    public TypeDeviceDTO updateTypeDevice(@RequestBody TypeDeviceDTO typedeviceDTO){
        return typedeviceService.updateTypeDevice(typedeviceDTO);
    }

    @DeleteMapping("/typedevice")
    public boolean deleteTypeDevice(@RequestBody TypeDeviceDTO typedeviceDTO){
        return typedeviceService.deleteTypeDevice(typedeviceDTO);
    }

}
