package com.example.bankclient.service.impl;

import com.example.bankclient.model.Schyet;
import com.example.bankclient.repository.SchyetRepository;
import com.example.bankclient.service.ISchyetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchyetServiceImpl implements ISchyetService {

    @Autowired
    private SchyetRepository schyetRepository;

    @Override
    public List<Schyet> getAllSchyets() {
        return schyetRepository.findAll();
    }

    @Override
    public Schyet getByIdSchyet(Long id) {
        return schyetRepository.getById(id);
    }

    @Override
    public Schyet saveSchyet(Schyet schyet) {
        return schyetRepository.save(schyet);
    }

    @Override
    public void updateSchyet(Long id, Schyet schyet) {

    }

    @Override
    public void deleteSchyet(Long id) {
        schyetRepository.deleteById(id);

    }
}
