package org.example.tpcafechaimasammoud.Services;


import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.dto.commande.CommandeRequest;
import org.example.tpcafechaimasammoud.dto.commande.CommandeResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;

import java.time.LocalDate;
import java.util.List;

public interface ICommandeService {
    Commande addCommande(Commande a);

    CommandeResponse saveCommandeDTO(CommandeRequest c);

    List<Commande> saveCommande(List<Commande> commandes);
    List<CommandeResponse> saveListCommandesDTO(List<CommandeRequest> c);

    Commande selectCommandeByIdWithGet(long id);
    CommandeResponse getCommandeByIdDTO(long id);

    Commande selectCommandeByIdWithOrElse(long id);
    List<Commande> selectAllCommande();
    List<CommandeResponse> getAllCommandesDTO();

    void deleteCommande(Commande a);
    void deleteAllCommande();
    void deleteCommandeById(long id);
    long countingCommande();
    boolean verifCommandeById(long id);

    void affecterCommandeAClient(long idCommande, long idClient);
    void affecterCommandeAClient2(LocalDate dateCommande,String nomClient, String prenomClient);
    void desaffecterCommandeDeClient(long idCommande);
}
