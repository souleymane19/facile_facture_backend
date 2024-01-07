package tech.nova.facile_facture_backend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProduitFacture extends AbstractEntity {
    /*
     * id (Clé primaire)
     * facture (relation ManyToOne avec Facture)
     * produit (relation ManyToOne avec Produit)
     * quantité
     * prix unitaire (peut être copié depuis le Produit ou stocké directement ici)
     */

    @ManyToOne
    @JoinColumn(name = "facture_id")
    private Facture facture;

    @ManyToOne
    @JoinColumn(name = "produit_id")  // Correction du nom de la colonne
    private Produit produit;

    private Integer quantité;
}
