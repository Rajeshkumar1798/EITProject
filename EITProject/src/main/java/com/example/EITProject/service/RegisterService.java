package com.example.EITProject.service;

import com.example.EITProject.model.Register;
import com.example.EITProject.repository.RegisterRepo;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegisterService {

    @Autowired
    RegisterRepo registerRepo;

    public List<Register> registeredSub() {
        return registerRepo.findAll();
    }
}
