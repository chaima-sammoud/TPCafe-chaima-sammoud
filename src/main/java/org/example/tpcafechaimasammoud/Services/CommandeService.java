package org.example.tpcafechaimasammoud.Services;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.entite.Client;
import org.example.tpcafechaimasammoud.entite.Commande;
import org.example.tpcafechaimasammoud.repositeries.CommandeRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
@AllArgsConstructor
public class CommandeService implements ICommandeService {
    CommandeRepository commandeRepository;

    @Override
    public Commande addCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public List<Commande> saveCommandes(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }

    @Override
    public Commande selectCommandeByIdWithGet(long id) {
        return commandeRepository.findById(id).get();
    }

    @Override
public Commande selectCommandeByIdWithOrElse(long id) {
    Commande fakeCommande = Commande.builder()
        .dateCommande(LocalDate.now())
        .totalCommande(1200)
        .build();
    return commandeRepository.findById(id).orElse(fakeCommande);
}

    @Override
    public List<Commande> selectAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public void deleteCommande(Commande commande) {
        commandeRepository.delete(commande);
    }

    @Override
    public void deleteAllCommandes() {
        commandeRepository.deleteAll();
    }

    @Override
    public void deleteCommandeById(long id) {
        commandeRepository.deleteById(id);
    }

    @Override
    public long countingCommandes() {
        return commandeRepository.count();
    }

    @Override
    public boolean verifCommandeById(long id) {
        return commandeRepository.existsById(id);
    }
    @Override
    public void affecterCommandeAClient(Long idCommande, Long idClient) {
        //Recuperer les objets
        Commande commande=CommandeRepository.findById(idCommande).get();
        Client client=CommandeRepository.findById(idClient).get();
        //2-parent (commande)? child (client)?
        //3 on affecte le child au paerent
        commande.setClient(client);
        //4-Persistance de affection (save du parent)
        CommandeRepository.save(commande);


    }
}