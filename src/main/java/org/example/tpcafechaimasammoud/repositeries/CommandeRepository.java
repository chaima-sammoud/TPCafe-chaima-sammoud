package org.example.tpcafechaimasammoud.repositeries;

import org.example.tpcafechaimasammoud.entite.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
    // find by id_adresse


    @Override
    List<Commande> findAll();
    List<Commande> findCommandesByStatut(String statut);
    List<Commande> findCommandesByMontantGreaterThan(Double montant);

}
