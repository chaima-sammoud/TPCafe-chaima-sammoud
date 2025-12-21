package org.example.tpcafechaimasammoud.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.tpcafechaimasammoud.entite.*;

public interface DetailCommandeRepository extends JpaRepository<Detail_Commande,Long> {
}
