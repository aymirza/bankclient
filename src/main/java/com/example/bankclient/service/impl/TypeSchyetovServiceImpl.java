package com.example.bankclient.service.impl;

import com.example.bankclient.model.TypeSchyotov;
import com.example.bankclient.repository.TypeSchyetovRepository;
import com.example.bankclient.service.ITypeSchyotovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeSchyetovServiceImpl implements ITypeSchyotovService {

    @Autowired
    private TypeSchyetovRepository typeSchyotovRepository;

    @Override
    public List<TypeSchyotov> allTypeSchyotov() {
        return typeSchyotovRepository.findAll();
    }

    @Override
    public TypeSchyotov getByIdTypeSchyotov(Long id) {
        return null;
    }

    @Override
    public TypeSchyotov saveTypeSchyotov(TypeSchyotov typeSchyotov) {
        return typeSchyotovRepository.save(typeSchyotov);
    }

    @Override
    public void updateByIdtypeSchyotov(Long id, TypeSchyotov typeSchyotov) {

    }

    @Override
    public void deleteTypeSchyotov(Long id) {

    }
}
