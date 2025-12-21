package org.example.tpcafechaimasammoud.Services;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.dto.detailCommande.DetailCommandeRequest;
import org.example.tpcafechaimasammoud.dto.detailCommande.DetailCommandeResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailCommandeService implements IDetailCommandeService {
    DetailCommandeRepository repo;
    DetailCommandeMapper mapper;

    @Override
    public Detail_Commande addDetailCommande(Detail_Commande a) {
        return repo.save(a);
    }

    @Override
    public DetailCommandeResponse saveDetailCommandeDTO(DetailCommandeRequest d) {
        return mapper.fromEntityToDTO(repo.save(mapper.fromDTOToEntity(d)));
    }

    @Override
    public List<Detail_Commande> saveDetailCommande(List<Detail_Commande> detailCommandes) {
        return repo.saveAll(detailCommandes);
    }

    @Override
    public List<DetailCommandeResponse> saveDetailCommandesDTO(List<DetailCommandeRequest> d) {
        return mapper.fromListEntityToListDTO(repo.saveAll(mapper.fromListDTOToListEntity(d)));
    }

    @Override
    public Detail_Commande selectDetailCommandeByIdWithGet(long id) {
        return repo.findById(id).get();
    }

    @Override
    public DetailCommandeResponse getDetailCommandeByIdDTO(long id) {
        return mapper.fromEntityToDTO(repo.findById(id).get());
    }

    @Override
    public Detail_Commande selectDetailCommandeByIdWithOrElse(long id) {
        Detail_Commande fakeDetailCommande = Detail_Commande.builder()
                .quantiteArticle(10)
                .sousTotalDetailArticle(0)
                .sousTotalDetailArticleApresPromo(3)
                .build();
        return repo.findById(id).orElse(fakeDetailCommande);
    }

    @Override
    public List<Detail_Commande> selectAllDetailCommande() {
        return repo.findAll();
    }

    @Override
    public List<DetailCommandeResponse> getAllDetailCommandesDTO() {
        return mapper.fromListEntityToListDTO(repo.findAll());
    }

    @Override
    public void deleteDetailCommande(Detail_Commande a) {
        repo.delete(a);
    }

    @Override
    public void deleteAllDetailCommande() {
        repo.deleteAll();
    }

    @Override
    public void deleteDetailCommandeById(long id) {
        repo.deleteById(id);
    }

    @Override
    public long countingDetailCommande() {
        return repo.count();
    }

    @Override
    public boolean verifDetailCommandeById(long id) {
        return repo.existsById(id);
    }
}
