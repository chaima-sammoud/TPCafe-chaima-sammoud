package org.example.tpcafechaimasammoud.Mapper;

import org.example.tpcafechaimasammoud.dto.adresse.AdresseRequest;
import org.example.tpcafechaimasammoud.entite.Adresse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdresseMaper {
    Adresse formDTOToEntity(AdresseRequest a);
    AdresseRequest formEntityToDTO(Adresse a);



}
