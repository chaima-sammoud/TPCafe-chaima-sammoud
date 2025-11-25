package org.example.tpcafechaimasammoud.Services;

import org.example.tpcafechaimasammoud.entite.Commande;

import java.util.List;

public interface ICommandeService {
    Commande addCommande(Commande commande);
    List<Commande> saveCommandes(List<Commande> commandes);
    Commande selectCommandeByIdWithGet(long id);
    Commande selectCommandeByIdWithOrElse(long id);
    List<Commande> selectAllCommandes();
    void deleteCommande(Commande commande);
    void deleteAllCommandes();
    void deleteCommandeById(long id);
    long countingCommandes();
    boolean verifCommandeById(long id);
    //find by id

    void affecterCommandeAClient(Long idCommande, Long idClient);
}