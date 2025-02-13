package com.example.EITProject.controller;

import com.example.EITProject.model.Register;
import com.example.EITProject.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {

    @Autowired
    RegisterService registerService;

    @GetMapping("/registers")
    public List<Register> registeredSub(){
        return registerService.registeredSub();
    }


}
