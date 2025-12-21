package org.example.tpcafechaimasammoud.Services;


import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.dto.article.ArticleRequest;
import org.example.tpcafechaimasammoud.dto.article.ArticleResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;

import java.util.List;

public interface IArticleService {
    Article addArticle(Article a);
    ArticleResponse saveArticleDTO(ArticleRequest a);

    List<Article> saveArticle(List<Article> articles);
    List<ArticleResponse> saveListArticlesDTO(List<ArticleRequest> a);

    Article selectArticleByIdWithGet(long id);
    ArticleResponse getArticleByIdDTO(long id);

    Article selectArticleByIdWithOrElse(long id);

    List<Article> selectAllArticle();
    List<ArticleResponse> getAllArticlesDTO();

    void deleteArticle(Article a);
    void deleteAllArticle();
    void deleteArticleById(long id);
    long countingArticle();
    boolean verifArticleById(long id);

    void ajouterArticleEtPromotionsCascade(Article article);
    void supprimerArticleEtPromotionsCascade(Article article);

    List<Article> getArticlesEnPromotion();
}
