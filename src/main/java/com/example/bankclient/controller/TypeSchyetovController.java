package com.example.bankclient.controller;


import com.example.bankclient.model.TypeSchyotov;
import com.example.bankclient.service.impl.TypeSchyetovServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typeschyetov")
public class TypeSchyetovController {

    @Autowired
    private TypeSchyetovServiceImpl typeSchyotovService;

    @GetMapping("")
    public List<TypeSchyotov> getAllTypeSchyotov(){
        return typeSchyotovService.allTypeSchyotov();
    }

    @PostMapping("")
    public TypeSchyotov createTypeSchyetov(@RequestBody TypeSchyotov typeSchyotov){
        return typeSchyotovService.saveTypeSchyotov(typeSchyotov);
    }
}







