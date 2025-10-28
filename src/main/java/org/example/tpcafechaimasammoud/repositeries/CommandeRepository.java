package org.example.tpcafechaimasammoud.repositeries;

import org.example.tpcafechaimasammoud.entite.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
