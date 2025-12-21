package org.example.tpcafechaimasammoud.Services;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.entite.Article;
import org.example.tpcafechaimasammoud.entite.Promotion;
import org.example.tpcafechaimasammoud.repositeries.ArticleRepository;
import org.example.tpcafechaimasammoud.repositeries.PromotionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ArticleService implements IArticleService {
    ArticleRepository articleRepository;
    PromotionRepository promotionRepository;

    @Override
    public Article addArticle(Article article) {
        return articleRepository.save(article);
    }

    @Override
    public List<Article> saveArticles(List<Article> articles) {
        return articleRepository.saveAll(articles);
    }

    @Override
    public Article selectArticleByIdWithGet(long id) {
        return articleRepository.findById(id).get();
    }

    @Override
 public Article selectArticleByIdWithOrElse(long id) {
    Article fakeArticle = Article.builder()
        .nomArticle(" Article 1")
        .prixArticle(1000)
        .build();
    return articleRepository.findById(id).orElse(fakeArticle);
}

    @Override
    public List<Article> selectAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public void deleteArticle(Article article) {
        articleRepository.delete(article);
    }

    @Override
    public void deleteAllArticles() {
        articleRepository.deleteAll();
    }

    @Override
    public void deleteArticleById(long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public long countingArticles() {
        return articleRepository.count();
    }

    @Override
    public boolean verifArticleById(long id) {
        return articleRepository.existsById(id);
    }



        // 1- get larticle 2/article.getpromotion.add(promo 3/ artcilerepo.save(article)

    @Override
    public void affecterPromotionAArticle(Promotion p , long idArticle) {


        Article article = articleRepository.findById(idArticle).get();
        article.getPromotions().add(p);
        articleRepository.save(article);

    }
    //afficher les article en promo




    }