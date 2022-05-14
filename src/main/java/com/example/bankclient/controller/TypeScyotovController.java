package com.example.bankclient.controller;


import com.example.bankclient.model.TypeSchyotov;
import com.example.bankclient.service.impl.TypeSchyotovServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/typeschyotov")
public class TypeScyotovController {

    @Autowired
    private TypeSchyotovServiceImpl typeSchyotovService;

    @GetMapping("/get")
    public List<TypeSchyotov> getAllTypeSchyotov(){
        return typeSchyotovService.allTypeSchyotov();
    }






}
