package com.example.bankclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientServiceImpl clientService;

    @GetMapping("/clients")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @PostMapping("/clients")
    public Client createNewClient(@RequestBody Client client){
        return clientService.saveClient(client);
    }

    @PutMapping("/clients/{id_client}")
    public ResponseEntity<Client> updateClientById(@PathVariable ("id_client") Long id_client, @RequestBody Client clientRequest){
       clientService.updateClient(id_client,clientRequest);
       return new ResponseEntity<>(clientService.getByIdClient(id_client), HttpStatus.OK);
    }

}
