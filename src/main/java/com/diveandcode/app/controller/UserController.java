package com.diveandcode.app.controller;

import com.diveandcode.app.dto.UserDTO;
import com.diveandcode.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
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

}
