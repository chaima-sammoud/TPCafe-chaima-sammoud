package org.example.tpcafechaimasammoud.Services;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseRequest;
import org.example.tpcafechaimasammoud.entite.Adresse;

import java.util.List;

public interface IAdresseService {
    Adresse addAdresse(Adresse adresse);
    /********/
    AdresseRequest addAsresseWithDTO(AdresseRequest adresseRequest);
    AdresseRequest getAdresseDTO(Long id);

    List<Adresse>   saveAdresses(List<Adresse> adresses);
    Adresse selectAdresseByIdWithGet(long id);
    Adresse selectAdresseByIdWithOrElse(long id);
    List<Adresse> selectAllAdresses();
    void deleteAdresse(Adresse adresse);
    void deleteAllAdresses();
    void deleteAdresseById(long id);
    long countingAdresses();
    boolean verifAdresseById(long id);



}
