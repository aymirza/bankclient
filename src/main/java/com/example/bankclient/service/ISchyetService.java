package com.example.bankclient.service;


import com.example.bankclient.model.Schyet;

import java.util.List;

public interface ISchyetService {
    List<Schyet> getAllSchyets();
    Schyet getByIdSchyet(Long id);
    Schyet saveSchyet(Schyet schyet);
    void updateSchyet(Long id,Schyet schyet);
    void deleteSchyet(Long id);

}
