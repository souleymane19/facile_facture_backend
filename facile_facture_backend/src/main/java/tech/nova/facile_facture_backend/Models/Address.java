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
public class Address extends AbstractEntity {
    /* id (Clé primaire)
    rue
    ville
    code postal
    client (relation ManyToOne avec Client) */
    private String rue;
    private String ville;
    private String codePostal;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
