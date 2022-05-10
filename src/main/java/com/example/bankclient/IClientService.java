package com.example.bankclient;

import java.util.List;

public interface IClientService {

    List<Client> getAllClients();
    Client getByIdClient(Long id);
    Client saveClient(Client client);
    void updateClient(Long id, Client client);
    void deleteClient(Long id);

}
