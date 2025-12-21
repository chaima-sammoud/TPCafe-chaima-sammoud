package org.example.tpcafechaimasammoud.Mapper;

import org.mapstruct.Mapper;
import org.example.tpcafechaimasammoud.dto.promotion.PromotionRequest;
import org.example.tpcafechaimasammoud.dto.promotion.PromotionResponse;
import org.example.tpcafechaimasammoud.entite.Detail_Commande;
import org.example.tpcafechaimasammoud.entite.Promotion;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PromotionMapper {
    Promotion fromDTOToEntity(PromotionRequest p);
    PromotionResponse fromEntityToDTO(Promotion p);

    List<Promotion> fromListDTOToListEntity(List<PromotionRequest> p);
    List<PromotionResponse> fromListEntityToDTO(List<Promotion> p);
}

