package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.ICommandeService;
import org.example.tpcafechaimasammoud.dto.commande.CommandeRequest;
import org.example.tpcafechaimasammoud.dto.commande.CommandeResponse;
import org.springframework.web.bind.annotation.*;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseRequest;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;


import java.time.LocalDate;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("commande")
public class CommandeRestController {
    ICommandeService service;

    @PostMapping("saveCommandeDTO")
    public CommandeResponse saveCommandeDTO(@RequestBody CommandeRequest c) {
        return service.saveCommandeDTO(c);
    }

    @PostMapping("saveListCommandesDTO")
    public List<CommandeResponse> saveListCommandesDTO(@RequestBody List<CommandeRequest> c) {
        return service.saveListCommandesDTO(c);
    }

    @GetMapping("getCommandeByIdDTO/{id}")
    public CommandeResponse getCommandeByIdDTO(@PathVariable("id") long id) {
        return service.getCommandeByIdDTO(id);
    }

    @GetMapping("getAllCommandesDTO")
    public List<CommandeResponse> getAllCommandesDTO() {
        return service.getAllCommandesDTO();
    }

    @PutMapping("affecterCommandeAClient")
    public void affecterCommandeAClient(long idCommande, long idClient){
        service.affecterCommandeAClient(idCommande, idClient);
    }

    @PutMapping("affecterCommandeAClient2")
    public void affecterCommandeAClient2(LocalDate dateCommande, String nomClient, String prenomClient){
        service.affecterCommandeAClient2(dateCommande, nomClient, prenomClient);
    }

    @PutMapping("desaffecterCommandeDeClient")
    public void desaffecterCommandeDeClient(long idCommande){
        service.desaffecterCommandeDeClient(idCommande);
    }
}
