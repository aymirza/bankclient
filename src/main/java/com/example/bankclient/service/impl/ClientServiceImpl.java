package com.example.bankclient.service.impl;

import  com.example.bankclient.model.Client;
import com.example.bankclient.repository.ClientRepository;
import com.example.bankclient.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {


    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getByIdClient(Long id) {
        return clientRepository.getById(id);
    }
    @Override
    public void updateClient(Long id, Client client) {
        Client clientFromDb = clientRepository.findById(id).get();
        System.out.println(clientFromDb.toString());
        clientFromDb.setImiya(client.getImiya());
        clientFromDb.setFamiliya(client.getFamiliya());
        clientFromDb.setOtchestvo(client.getOtchestvo());
        clientFromDb.setData_rojdeniya(client.getData_rojdeniya());
        clientFromDb.setAddress(client.getAddress());
        clientFromDb.setNumber_passport(client.getNumber_passport());
        clientFromDb.setSrok_passporta(client.getSrok_passporta());
        clientRepository.save(clientFromDb);
    }
    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);

    }
}
