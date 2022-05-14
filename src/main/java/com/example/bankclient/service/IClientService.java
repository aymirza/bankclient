package com.example.bankclient.service;

import com.example.bankclient.model.Client;

import java.util.List;

public interface IClientService {

    List<Client> getAllClients();
    Client getByIdClient(Long id);
    Client saveClient(Client client);
    void updateClient(Long id, Client client);
    void deleteClient(Long id);

}
