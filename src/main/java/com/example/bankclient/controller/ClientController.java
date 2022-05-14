package com.example.bankclient.controller;


import com.example.bankclient.service.impl.ClientServiceImpl;
import com.example.bankclient.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping("")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @PostMapping("")
    public Client createNewClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClientById(@PathVariable ("id_client") Long id_client, @RequestBody Client clientRequest){
       clientService.updateClient(id_client,clientRequest);
       return new ResponseEntity<>(clientService.getByIdClient(id_client), HttpStatus.OK);
    }

    @DeleteMapping("")
    public void deleteByIdClient(@PathVariable Long id){
         clientService.deleteClient(id);
    }



}
