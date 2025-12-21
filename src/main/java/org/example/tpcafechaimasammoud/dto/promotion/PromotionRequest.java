package org.example.tpcafechaimasammoud.dto.promotion;

import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.tpcafemontassarsouli.entities.Article;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PromotionRequest {
    String pourcentagePromo;
    LocalDate dateDebutPromo;
    LocalDate dateFinPromo;
    List<Article> article;
}
