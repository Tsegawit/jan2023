package com.example.jan2023.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/employ")
public class controller {
    @Autowired
    employ service;
    @GetMapping("/all")
    public List void<employ> void getallemploy(){
        service.getallemploys();
    }
}
