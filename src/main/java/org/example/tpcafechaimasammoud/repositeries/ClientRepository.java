package org.example.tpcafechaimasammoud.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.tpcafechaimasammoud.entite.*;

import java.time.LocalDate;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long> {

    Client findByNomAndPrenom(String nom, String prenom);
    List<Client> findByDateNaissance(LocalDate date);
}
