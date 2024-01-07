package tech.nova.facile_facture_backend.Dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import tech.nova.facile_facture_backend.Models.Client;
import tech.nova.facile_facture_backend.Models.Utilisateur;

@Data
@Builder
public class UtilisateurDto {
    private Integer Id;
    private String nom;
    private String motDePasse;
    private Integer client_Id;

    private UtilisateurDto fromEntity(Utilisateur utilisateur){
        return UtilisateurDto.builder()
                .Id(utilisateur.getId()).nom(utilisateur.getNom())
                .nom(utilisateur.getNom())
                .motDePasse(utilisateur.getMotDePasse())
                .client_Id(utilisateur.getClient().getId())
                .build();

    }

    private Utilisateur toEntity(UtilisateurDto utilisateur){
        return Utilisateur.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .motDePasse(utilisateur.getMotDePasse())
                .client(Client.builder()
                        .id(utilisateur.getClient_Id()).build())
                .build();
    }
}
