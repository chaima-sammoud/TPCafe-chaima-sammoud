package org.example.tpcafechaimasammoud.Services;

import org.example.tpcafechaimasammoud.entite.Promotion;

import java.util.List;

public interface IPromotionService {
    Promotion addPromotion(Promotion promotion);
    List<Promotion> savePromotions(List<Promotion> promotions);
    Promotion selectPromotionByIdWithGet(long id);
    Promotion selectPromotionByIdWithOrElse(long id);
    List<Promotion> selectAllPromotions();
    void deletePromotion(Promotion promotion);
    void deleteAllPromotions();
    void deletePromotionById(long id);
    long countingPromotions();
    boolean verifPromotionById(long id);
}