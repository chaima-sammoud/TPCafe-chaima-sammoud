package org.example.tpcafechaimasammoud.Mapper;


import org.mapstruct.Mapper;
import org.example.tpcafechaimasammoud.dto.detailCommande.DetailCommandeRequest;
import org.example.tpcafechaimasammoud.dto.detailCommande.DetailCommandeResponse;
import org.example.tpcafechaimasammoud.entite.Detail_Commande;
import java.util.List;

@Mapper(componentModel = "spring")
public interface DetailCommandeMapper {
    Detail_Commande fromDTOToEntity(DetailCommandeRequest d);
    DetailCommandeResponse fromEntityToDTO(Detail_Commande d);

    List<Detail_Commande> fromListDTOToListEntity(List<DetailCommandeRequest> d);
    List<DetailCommandeResponse> fromListEntityToListDTO(List<Detail_Commande> d);
}