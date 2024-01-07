package tech.nova.facile_facture_backend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class Client extends AbstractEntity {
    /* id (Clé primaire)
    nom
    email
    téléphone
    adresses (relation OneToMany avec Adresse)   */
    private String nom;
    private String telephone;

    @OneToMany(mappedBy = "client")
    private List<Address> addresses;

    @OneToMany(mappedBy = "client")
    private List<Utilisateur> utilisateurs;
}
