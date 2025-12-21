package org.example.tpcafechaimasammoud.Services;
import org.example.tpcafechaimasammoud.entite.Article;
import org.example.tpcafechaimasammoud.entite.Promotion;

import java.util.List;

public interface IArticleService {
    Article addArticle(Article article);
    List<Article>   saveArticles(List<Article> articles);
    Article selectArticleByIdWithGet(long id);
    Article selectArticleByIdWithOrElse(long id);
    List<Article> selectAllArticles();
    void deleteArticle(Article article);
    void deleteAllArticles();
    void deleteArticleById(long id);
    long countingArticles();
    boolean verifArticleById(long id);



    void affecterPromotionAArticle(Promotion p , long idArticle);
}
