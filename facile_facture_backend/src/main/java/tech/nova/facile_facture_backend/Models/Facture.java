package tech.nova.facile_facture_backend.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Facture extends AbstractEntity {


    // Autres champs facture

    @ManyToOne
    @JoinColumn(name = "client_id") // Spécifiez le type JDBC recommandé
    private Client client;

    @ManyToOne // Utilisez @ManyToOne car c'est une relation many-to-one
    @JoinColumn(name = "utilisateur_id") // Spécifiez le nom de la colonne de clé étrangère
    private Utilisateur utilisateur;

    @ManyToMany
    @JoinTable(
            name = "produitFacture",
            joinColumns = @JoinColumn(name = "facture_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private List<Produit> produits;
}
