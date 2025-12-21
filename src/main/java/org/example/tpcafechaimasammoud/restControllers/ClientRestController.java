package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.IClientService;
import org.example.tpcafechaimasammoud.dto.client.ClientRequest;
import org.example.tpcafechaimasammoud.dto.client.ClientResponse;
import org.springframework.web.bind.annotation.*;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseRequest;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("client")
public class ClientRestController {
    IClientService service;

    @PostMapping("saveClientDTO")
    public ClientResponse saveClientDTO(@RequestBody ClientRequest c){
        return service.saveClientDTO(c);
    }

    @PostMapping("saveListClientsDTO")
    public List<ClientResponse> saveListClientsDTO(@RequestBody List<ClientRequest> c){
        return service.saveListClientsDTO(c);
    }

    @GetMapping("getClientByIdDTO/{id}")
    public ClientResponse getClientByIdDTO(@PathVariable long id){
        return service.getClientByIdDTO(id);
    }

    @GetMapping("getAllClientsDTO")
    public List<ClientResponse> getAllClientsDTO(){
        return service.getAllClientsDTO();
    }

    @PostMapping("ajouterClient")
    public void ajouterClient(@RequestBody Client c){
        service.ajouterClient(c);
    }

    @PostMapping("ajouterClientEtCarteFideliteCascade")
    public void ajouterClientEtCarteFideliteCascade(@RequestBody Client client){
        service.ajouterClientEtCarteFideliteCascade(client);
    }

    @DeleteMapping("supprimerClientEtCarteFideliteCascade")
    public void supprimerClientEtCarteFideliteCascade(@RequestBody Client client){
        service.supprimerClientEtCarteFideliteCascade(client);
    }
}
