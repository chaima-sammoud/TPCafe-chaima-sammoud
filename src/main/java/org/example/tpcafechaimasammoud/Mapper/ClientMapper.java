package org.example.tpcafechaimasammoud.Mapper;


import org.mapstruct.Mapper;
import org.example.tpcafechaimasammoud.dto.client.ClientRequest;
import org.example.tpcafechaimasammoud.dto.client.ClientResponse;
import org.example.tpcafechaimasammoud.entite.*;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    Client fromDTOToEntity(ClientRequest c);
    ClientResponse fromEntityToDTO(Client c);

    List<Client> fromListDTOToListEntity(List<ClientRequest> c);
    List<ClientResponse> fromListEntityToDTO(List<Client> c);
}