package org.example.tpcafechaimasammoud.Services;

import org.example.tpcafechaimasammoud.entite.Client;
import org.example.tpcafechaimasammoud.repositeries.ClientRepository;

import java.time.LocalDate;
import java.util.List;

public class ClientService implements IClientService {
    ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> saveClients(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }

    @Override
    public Client selectClientByIdWithGet(long id) {
        return clientRepository.findById(id).get();
    }

    @Override
public Client selectClientByIdWithOrElse(long id) {
    Client fakeClient = Client.builder()
        .nom("Sammoud")
        .prenom("Chaima")
        .dateNaissance(LocalDate.of(1990, 1, 1))
        .build();
    return clientRepository.findById(id).orElse(fakeClient);
}

    @Override
    public List<Client> selectAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClient(Client client) {
        clientRepository.delete(client);
    }

    @Override
    public void deleteAllClients() {
        clientRepository.deleteAll();
    }

    @Override
    public void deleteClientById(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public long countingClients() {
        return clientRepository.count();
    }

    @Override
    public boolean verifClientById(long id) {
        return clientRepository.existsById(id);
    }
}