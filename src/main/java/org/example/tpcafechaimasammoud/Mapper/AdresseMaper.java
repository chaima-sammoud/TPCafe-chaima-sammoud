package org.example.tpcafechaimasammoud.Mapper;

import org.example.tpcafechaimasammoud.dto.adresse.*;
import org.example.tpcafechaimasammoud.entite.Adresse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdresseMaper {
    Adresse fromDTOToEntity(AdresseRequest a);
    AdresseResponse fromEntityToDTO(Adresse a);

    List<Adresse> fromListDTOToListEntity(List<AdresseRequest> a);
    List<AdresseResponse> fromListEntityToListDTO(List<Adresse> a);

    //AdresseResponse fromIdToDTO(long id);



}
