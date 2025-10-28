package org.example.tpcafechaimasammoud.repositeries;

import org.example.tpcafechaimasammoud.entite.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
