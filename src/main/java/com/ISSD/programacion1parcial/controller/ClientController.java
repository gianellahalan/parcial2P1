package com.ISSD.programacion1parcial.controller;

import com.ISSD.programacion1parcial.model.Client;
import com.ISSD.programacion1parcial.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    //get all users
    @GetMapping
    public List<Client> getClient() {
        return clientService.getClient();
    }

    //get user by id
    @GetMapping("/{id}")
    public ResponseEntity<Client> getClient(@PathVariable Long id) {
        Client client = clientService.getById(id).orElseThrow(() -> new RuntimeException("No existe un usuario con el id " + id));
        return ResponseEntity.ok(client);
    }

    //delete an user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarClient(@PathVariable Long id){
        clientService.eliminarClient(id);
        return ResponseEntity.noContent().build();
    }

    //get all active clients
    @GetMapping("/active")
    public List<Client> getActiveClient(){
        return clientService.getActiveClient();
    }

    //get active user by id
    @GetMapping("/active/{id}")
    public ResponseEntity<Client> getActiveClientById(@PathVariable Long id){
        Client client = clientService.getActiveClientById(id).orElseThrow(()-> new RuntimeException("El cliente no existe o no esta activo"));
        return ResponseEntity.ok(client);
    }

    //get user by reference
    @GetMapping("/reference/{reference}")
    public ResponseEntity<Client> getClientByReference(@PathVariable String reference){
        Client client = clientService.getClientByReference(reference).orElseThrow(()-> new RuntimeException("El cliente no existe"));
        return ResponseEntity.ok(client);
    }

    //get user by email
    @GetMapping("/email/{email}")
    public ResponseEntity<Client> getClientByEmail(@PathVariable String email){
        Client client = clientService.getClientByEmail(email).orElseThrow(()-> new RuntimeException("El cliente no existe"));
        return ResponseEntity.ok(client);
    }
}