package org.example.tpcafechaimasammoud.Mapper;


import org.example.tpcafechaimasammoud.entite.Commande;
import org.mapstruct.Mapper;
import org.example.tpcafechaimasammoud.dto.detailCommande.DetailCommandeRequest;
import org.example.tpcafechaimasammoud.dto.detailCommande.DetailCommandeResponse;
import org.example.tpcafechaimasammoud.dto.commande.CommandeRequest;
import org.example.tpcafechaimasammoud.dto.commande.CommandeResponse;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CommandeMapper {
    Commande fromDTOToEntity(CommandeRequest c);
    CommandeResponse fromEntityToDTO(Commande c);

    List<Commande> fromListDTOToListEntity(List<CommandeRequest> c);
    List<CommandeResponse> fromListEntityToListDTO(List<Commande> c);
}