package org.example.tpcafechaimasammoud.entite;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "commande")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commande")
    private Long idCommande;

    @Column(name = "date_commande")
    private LocalDate dateCommande;

    @Column(name = "total_commande")
    private float totalCommande;

    @Column(name = "status_commande")
    @Enumerated(EnumType.STRING)
    private StatusCommande statusCommande; // ✔ CORRECTION ICI

    @ManyToOne
    @JoinColumn(name = "id_client", referencedColumnName = "id_client")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Client client;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Detail_Commande> detailCommandes = new ArrayList<>();
}
