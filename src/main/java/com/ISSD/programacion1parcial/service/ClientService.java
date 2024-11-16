package com.ISSD.programacion1parcial.service;

import com.ISSD.programacion1parcial.model.Client;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<Client> getClient();

    Optional<Client> getById(Long id);

    void eliminarClient(Long id);

    List<Client> getActiveClient();

    Optional<Client> getActiveClientById(Long id);

    Optional<Client> getClientByReference(String reference);

    Optional<Client> getClientByEmail(String email);
}
