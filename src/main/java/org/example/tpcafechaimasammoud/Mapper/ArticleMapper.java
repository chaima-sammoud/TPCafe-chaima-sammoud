package org.example.tpcafechaimasammoud.Mapper;

import org.mapstruct.Mapper;
import org.example.tpcafechaimasammoud.dto.article.ArticleRequest;
import org.example.tpcafechaimasammoud.dto.article.ArticleResponse;
import org.example.tpcafechaimasammoud.entite.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    Article fromDTOToEntity(ArticleRequest a);
    ArticleResponse fromEntityToDTO(Article a);

    List<Article> fromListDTOToListEntity(List<ArticleRequest> a);
    List<ArticleResponse> fromListEntityToListDTO(List<Article> a);
}
