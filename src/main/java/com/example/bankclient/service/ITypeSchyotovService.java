package com.example.bankclient.service;

import com.example.bankclient.model.TypeSchyotov;

import java.util.List;

public interface ITypeSchyotovService {
    List<TypeSchyotov> allTypeSchyotov();
    TypeSchyotov getByIdTypeSchyotov(Long id);
    TypeSchyotov saveTypeSchyotov(TypeSchyotov typeSchyotov);
    void updateByIdtypeSchyotov(Long id, TypeSchyotov typeSchyotov);
    void deleteTypeSchyotov(Long id);


}
