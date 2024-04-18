package com.diveandcode.app.controller;

import com.diveandcode.app.dto.UserDTO;
import com.diveandcode.app.service.UserService;
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
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<UserDTO> getUser(){
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public UserDTO getOneUser(@PathVariable("id") int id){
        return userService.getOneUser(id);
    }

    @PostMapping("/user")
    public UserDTO saveUser(@Valid @RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @PutMapping("/user")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/user")
    public boolean deleteUser(@RequestBody UserDTO userDTO){
        return userService.deleteUser(userDTO);
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
