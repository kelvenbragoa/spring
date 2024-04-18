package com.diveandcode.app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/")
@CrossOrigin


public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "HNelllo";
    }
}
