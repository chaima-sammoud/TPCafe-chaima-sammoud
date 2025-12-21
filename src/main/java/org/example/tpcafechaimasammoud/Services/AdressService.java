package org.example.tpcafechaimasammoud.Services;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseRequest;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;

import java.util.List;

//@Component
@Service
@AllArgsConstructor
public class AdressService implements IAdressService {

    AdresseRepository repo;
    AdresseMaper mapper;
    ClientRepository clientRepo;

    @Override
    public Adresse addAdress(Adresse a) {
        return repo.save(a);
    }

    @Override
    public AdresseResponse addAdressDTO(AdresseRequest a) {
        // ** Conversion AdresseRequest to Adresse entity
//        Adresse adresse = mapper.fromDTOToEntity(a);
        // ** Save Adresse entity
//        Adresse savedAdresse = repo.save(adresse);
        // ** transformation Adresse entity to AdresseResponse
//        AdresseResponse response = mapper.fromEntityToDTO(savedAdresse);
//        return response;

        //Optimisation(best practice)
        return mapper.fromEntityToDTO(repo.save(mapper.fromDTOToEntity(a)));
    }

    @Override
    public List<Adresse> saveAdress(List<Adresse> adresses) {
        return repo.saveAll(adresses);
    }

    @Override
    public List<AdresseResponse> addListAdressDTO(List<AdresseRequest> adresses) {
        return mapper.fromListEntityToListDTO(repo.saveAll(mapper.fromListDTOToListEntity(adresses)));
    }

    @Override
    public Adresse selectAdressByIdWithGet(long id) {
        return repo.findById(id).get();
    }

    @Override
    public AdresseResponse selectAdressByIdDTO(long id) {
        return mapper.fromEntityToDTO(repo.findById(id).get());
    }

    @Override
    public Adresse selectAdressByIdWithOrElse(long id) {
        Adresse fakeAdress = Adresse.builder()
                .rue("soukra")
                .ville("Ariana")
                .codePostal(2036)
                .build();
        return repo.findById(id).orElse(fakeAdress);
    }

    @Override
    public List<Adresse> selectAllAdress() {
        return repo.findAll();
    }

    @Override
    public List<AdresseResponse> selectAllAdressDTO() {
        return mapper.fromListEntityToListDTO(repo.findAll());
    }

    @Override
    public void deleteAdress(Adresse a) {
        repo.delete(a);
    }

    @Override
    public void deleteAdressDTO(AdresseRequest a) {
        repo.delete(mapper.fromDTOToEntity(a));
    }

    @Override
    public void deleteAllAdress() {
        repo.deleteAll();
    }


    @Override
    public void deleteAdressById(long id) {
        repo.deleteById(id);
    }

    @Override
    public long countingAdress() {
        return repo.count();
    }

    @Override
    public boolean verifAdressById(long id) {
        return repo.existsById(id);
    }

    @Override
    public String affecterAdresseAClient(String rue, String nom,String prenom) {
        Adresse adresse = repo.findByRue(rue);
        Client client = clientRepo.findByNomAndPrenom(nom, prenom);
        client.setAdresse(adresse);
        clientRepo.save(client);
        return "L'affectation de"+nom+prenom+ " a la rue"+rue+"a été afectue avec succés";
    }

}
