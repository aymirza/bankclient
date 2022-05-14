package com.example.bankclient.controller;

import com.example.bankclient.model.Schyet;
import com.example.bankclient.service.impl.SchyetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Entity;
import java.util.List;

@RestController
@RequestMapping("/api/schyets")
public class SchyetController {

    @Autowired
    private SchyetServiceImpl schyetService;

    @GetMapping("")
    public List<Schyet> getAllSchyets(){
        return schyetService.getAllSchyets();
    }
    @GetMapping("/{id}")
    public  Schyet  getByIdSchyet(@PathVariable Long id){
        return schyetService.getByIdSchyet(id);
    }
    @PostMapping("")
    public Schyet createSchyet(@RequestBody Schyet schyet){
        return schyetService.saveSchyet(schyet);
    }
}
