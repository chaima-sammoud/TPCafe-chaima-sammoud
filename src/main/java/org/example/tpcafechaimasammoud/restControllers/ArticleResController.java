package org.example.tpcafechaimasammoud.restControllers;

import lombok.AllArgsConstructor;
import org.example.tpcafechaimasammoud.Services.IArticleService;
import org.example.tpcafechaimasammoud.entite.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
