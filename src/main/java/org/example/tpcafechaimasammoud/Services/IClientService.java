package org.example.tpcafechaimasammoud.Services;

import org.example.tpcafechaimasammoud.entite.Client;

import java.util.List;

public interface IClientService {
    Client addClient(Client client);
    List<Client> saveClients(List<Client> clients);
    Client selectClientByIdWithGet(long id);
    Client selectClientByIdWithOrElse(long id);
    List<Client> selectAllClients();
    void deleteClient(Client client);
    void deleteAllClients();
    void deleteClientById(long id);
    long countingClients();
    boolean verifClientById(long id);

    List<Client> incrementerPts();
}