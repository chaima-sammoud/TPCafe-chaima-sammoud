package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.IArticleService;
import org.example.tpcafechaimasammoud.dto.article.ArticleRequest;
import org.example.tpcafechaimasammoud.dto.article.ArticleResponse;
import org.springframework.web.bind.annotation.*;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseRequest;
import org.example.tpcafechaimasammoud.dto.adresse.AdresseResponse;
import org.springframework.stereotype.Service;
import org.example.tpcafechaimasammoud.dto.*;
import org.example.tpcafechaimasammoud.entite.*;
import org.example.tpcafechaimasammoud.Mapper.*;
import org.example.tpcafechaimasammoud.repositeries.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("article")
public class ArticleRestController {
    IArticleService service;

    @PostMapping("saveArticleDTO")
    public ArticleResponse saveArticleDTO(@RequestBody ArticleRequest a){
        return service.saveArticleDTO(a);
    }

    @PostMapping("saveListArticlesDTO")
    public List<ArticleResponse> saveListArticlesDTO(@RequestBody List<ArticleRequest> a){
        return service.saveListArticlesDTO(a);
    }

    @GetMapping("getArticleByIdDTO/{id}")
    public ArticleResponse getArticleByIdDTO(@PathVariable("id") long id){
        return service.getArticleByIdDTO(id);
    }

    @GetMapping("getAllArticlesDTO")
    public List<ArticleResponse> getAllArticlesDTO(){
        return service.getAllArticlesDTO();
    }

    @PostMapping("ajouterArticleEtPromotionsCascade")
    public void ajouterArticleEtPromotionsCascade(@RequestBody Article article){
        service.ajouterArticleEtPromotionsCascade(article);
    }

    @DeleteMapping("supprimerArticleEtPromotionsCascade")
    public void supprimerArticleEtPromotionsCascade(@RequestBody Article article){
        service.supprimerArticleEtPromotionsCascade(article);
    }

}
