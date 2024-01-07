package tech.nova.facile_facture_backend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit extends AbstractEntity {
    /* id (Clé primaire)
    nom
    description
    prix */

    private String nom;
    private String description;
    private BigDecimal prix;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id") // Spécifiez le nom de la colonne de clé étrangère
    private Utilisateur utilisateur;
}
