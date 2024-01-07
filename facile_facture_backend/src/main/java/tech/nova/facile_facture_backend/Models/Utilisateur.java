package tech.nova.facile_facture_backend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Utilisateur extends AbstractEntity {
    /* id (Clé primaire)
    nom d'utilisateur
    mot de passe (assurez-vous de stocker des hachages sécurisés)
    rôle (admin, utilisateur, etc.) */
    private String nom;
    private String motDePasse;

    @ManyToOne
    @JoinColumn(name = "client_id")  // Assurez-vous d'ajuster le nom de la colonne selon votre modèle de base de données
    private Client client;

    // Un utilisateur peut avoir plusieurs produits
    @OneToMany(mappedBy = "utilisateur")
    private List<Produit> produits;

    // Un utilisateur peut avoir plusieurs factures
    @OneToMany(mappedBy = "utilisateur")
    private List<Facture> factures;
}
