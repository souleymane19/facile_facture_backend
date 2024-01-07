package tech.nova.facile_facture_backend.Dto;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;
import tech.nova.facile_facture_backend.Models.Produit;
import tech.nova.facile_facture_backend.Models.Utilisateur;

import java.math.BigDecimal;

@Data
@Builder
public class ProduitDto <T> {
    private Integer id;
    private String nom;
    private String description;
    private BigDecimal prix;
    private Integer utilisateur_id;

    private final ProduitDto fromEntity(Produit produit){
        return ProduitDto.builder()
                .id(produit.getId())
                .nom(produit.getNom())
                .description(produit.getDescription())
                .prix(produit.getPrix())
                .utilisateur_id(produit.getUtilisateur().getId()).build();
    }

    private final Produit toEntity(ProduitDto produit){
        return Produit.builder()
                .id(produit.getId())
                .nom(produit.getNom())
                .description(produit.getDescription())
                .utilisateur(Utilisateur.builder()
                        .id(produit.getUtilisateur_id())
                        .build())
                .build();
    }
}
