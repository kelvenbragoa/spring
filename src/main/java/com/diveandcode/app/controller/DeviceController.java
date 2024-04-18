package com.diveandcode.app.controller;

import com.diveandcode.app.dto.DeviceDTO;
import com.diveandcode.app.service.DeviceService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public DeviceDTO saveDevice(@Valid @RequestBody DeviceDTO deviceDTO){
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

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
