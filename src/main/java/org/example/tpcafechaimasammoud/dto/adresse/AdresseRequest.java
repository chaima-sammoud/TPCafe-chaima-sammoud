package org.example.tpcafechaimasammoud.dto.adresse;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdresseRequest {
    String rue;
    String ville;
    String code_postal;

}

