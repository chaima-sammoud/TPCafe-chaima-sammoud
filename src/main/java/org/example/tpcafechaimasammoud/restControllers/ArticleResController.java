package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.IArticleService;
import org.example.tpcafechaimasammoud.entite.Article;
import org.example.tpcafechaimasammoud.entite.Promotion;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//ou bien @component ou birn @controller + @ResponseBody
@AllArgsConstructor
@RequestMapping("article")

public class ArticleResController {
    IArticleService service;
    @GetMapping
    public List<Article> findAll() {
        return service.selectAllArticles();
    }

    @PostMapping("/affecterPromotionAArticle")
    public void affecterPromotionAArticle(@RequestBody  Promotion p ,@RequestParam Long idArticle)
    {
        service.affecterPromotionAArticle( p ,  idArticle);
    }
}
