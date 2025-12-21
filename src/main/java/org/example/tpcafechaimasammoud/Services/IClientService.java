package org.example.tpcafechaimasammoud.Services;


import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.dto.client.ClientRequest;
import org.example.tpcafechaimasammoud.dto.client.ClientResponse;
import org.example.tpcafechaimasammoud.dto.commande.CommandeRequest;
import org.example.tpcafechaimasammoud.dto.commande.CommandeResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;

import java.util.List;

public interface IClientService {
    Client addClient(Client a);


    ClientResponse saveClientDTO(ClientRequest c);

    List<Client> saveClient(List<Client> clients);
    List<ClientResponse> saveListClientsDTO(List<ClientRequest> c);

    Client selectClientByIdWithGet(long id);
    ClientResponse getClientByIdDTO(long id);

    Client selectClientByIdWithOrElse(long id);
    List<Client> selectAllClient();
    List<ClientResponse> getAllClientsDTO();

    void deleteClient(Client a);
    void deleteAllClient();
    void deleteClientById(long id);
    long countingClient();
    boolean verifClientById(long id);
    void ajouterClient(Client c);

    void ajouterCommandeEtAffecterAClient(Commande c, String nomClient, String prenomClient);
    void ajouterEtAffecterAdresseAClient(Adresse adresse, Client client);
    void ajoutClientEtCarteFidelite(CarteFidelite carte);
    void ajouterClientEtCarteFideliteCascade(Client client);
    void supprimerClientEtCarteFideliteCascade(Client client);
    void addClientEtCarteFidelite(Client client);
    List <Client> incrementerPts();
}
