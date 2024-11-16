package com.ISSD.programacion1parcial.service;

import com.ISSD.programacion1parcial.model.Client;
import com.ISSD.programacion1parcial.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class ClientServiceImpl implements ClientService{

    private final ClientRepository clientRepository;

    //GET
    @Override
    public List<Client> getClient() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public void eliminarClient(Long id){
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> getActiveClient() {
        return clientRepository.findAllActive();
    }

    @Override
    public Optional<Client> getActiveClientById(Long id) {
        return clientRepository.findActiveById(id);
    }

    @Override
    public Optional<Client> getClientByReference(String reference) {
        return clientRepository.findActiveByReference(reference);
    }

    @Override
    public Optional<Client> getClientByEmail(String email) {
        return clientRepository.findActiveByEmail(email);
    }

}
