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

public interface IDetailCommandeService {
    Detail_Commande addDetailCommande(Detail_Commande a);
    DetailCommandeResponse saveDetailCommandeDTO(DetailCommandeRequest d);

    List<Detail_Commande> saveDetailCommande(List<Detail_Commande> detailCommandes);
    List<DetailCommandeResponse> saveDetailCommandesDTO(List<DetailCommandeRequest> d);

    Detail_Commande selectDetailCommandeByIdWithGet(long id);
    DetailCommandeResponse getDetailCommandeByIdDTO(long id);

    Detail_Commande selectDetailCommandeByIdWithOrElse(long id);
    List<Detail_Commande> selectAllDetailCommande();
    List<DetailCommandeResponse> getAllDetailCommandesDTO();

    void deleteDetailCommande(Detail_Commande a);
    void deleteAllDetailCommande();
    void deleteDetailCommandeById(long id);
    long countingDetailCommande();
    boolean verifDetailCommandeById(long id);
}
