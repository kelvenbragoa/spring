package com.diveandcode.app.controller;

import com.diveandcode.app.dto.TypeDeviceDTO;
import com.diveandcode.app.service.TypeDeviceService;
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
    public TypeDeviceDTO saveTypeDevice(@Valid @RequestBody TypeDeviceDTO typedeviceDTO){
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
