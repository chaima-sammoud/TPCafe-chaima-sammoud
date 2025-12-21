package org.example.tpcafechaimasammoud.Mapper;

import org.mapstruct.Mapper;
import org.example.tpcafechaimasammoud.dto.carteFidelite.CarteFideliteRequest;
import org.example.tpcafechaimasammoud.dto.carteFidelite.CarteFideliteResponse;
import org.example.tpcafechaimasammoud.entite.*;
import java.util.List;

@Mapper(componentModel = "spring")

public interface CarteFideliteMapper {

        CarteFidelite fromDTOToEntity(CarteFideliteRequest c);
        CarteFideliteResponse fromEntityToDTO(CarteFidelite c);

        List<CarteFidelite> fromListDTOToListEntity(List<CarteFideliteRequest> c);
        List<CarteFideliteResponse> fromListEntityToDTO(List<CarteFidelite> c);
}
