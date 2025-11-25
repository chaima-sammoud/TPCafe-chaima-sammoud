package org.example.tpcafechaimasammoud.Services;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Mapper.AdresseMaper;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseRequest;
import org.example.tpcafechaimasammoud.entite.Adresse;
import org.example.tpcafechaimasammoud.repositeries.AdresseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class AdresseService implements IAdresseService{


    AdresseRepository adresseRepository;
    AdresseMaper maper;



    @Override
    public Adresse addAdresse(Adresse adresse) {
        return adresseRepository.save(adresse);
    }
/* dans interface :; AdresseRequest addAsresseWithDTO(AdresseRequest adresseRequest);*/
    @Override
    public AdresseRequest addAsresseWithDTO(AdresseRequest adresseRequest) {
       /* Adresse adresse= maper.formDTOToEntity(adresseRequest);
        Adresse adresseadd= adresseRepository.save(adresse);
        AdresseRequest adresseResponse= maper.formEntityToDTO(adresseadd);
        return adresseResponse;*/

        // or
        return maper.formEntityToDTO(
                adresseRepository.save(
                        maper.formDTOToEntity(adresseRequest)
                )
        );



    }

    @Override
    //find by idAdresse par DTO
    public AdresseRequest getAdresseDTO(Long id) {
        Adresse adresse= adresseRepository.findById(id).orElse(null);
        return maper.formEntityToDTO(adresse);
    }



    @Override
    public List<Adresse> saveAdresses(List<Adresse> adresses) {
        return adresseRepository.saveAll(adresses);
    }

    @Override
    public Adresse selectAdresseByIdWithGet(long id) {
        return adresseRepository.findById(id).get() ;
    }

    @Override
    public Adresse selectAdresseByIdWithOrElse(long id) {
        Adresse fakeUser = Adresse.builder().rue("kelibia").ville("Kelibia").codePostal("8090").idAdresse(1200).build();
        return adresseRepository.findById(id).orElse(null)  ;
    }

    @Override
    public List<Adresse> selectAllAdresses() {
        return adresseRepository.findAll();
    }

    @Override
    public void deleteAdresse(Adresse adresse) {
        adresseRepository.delete(adresse);

    }

    @Override
    public void deleteAllAdresses() {
        adresseRepository.deleteAll();

    }

    @Override
    public void deleteAdresseById(long id) {
        adresseRepository.deleteById(id);

    }

    @Override
    public long countingAdresses() {
        return adresseRepository.count();
    }

    @Override
    public boolean verifAdresseById(long id) {
        return adresseRepository.existsById(id);
    }


}
