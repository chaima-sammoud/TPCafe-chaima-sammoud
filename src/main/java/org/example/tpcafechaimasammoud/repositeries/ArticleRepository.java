package org.example.tpcafechaimasammoud.repositeries;

import org.example.tpcafechaimasammoud.entite.Adresse;
import org.example.tpcafechaimasammoud.entite.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}
