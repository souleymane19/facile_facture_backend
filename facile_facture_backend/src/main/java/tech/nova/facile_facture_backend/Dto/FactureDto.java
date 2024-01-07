package tech.nova.facile_facture_backend.Dto;

import lombok.Builder;
import lombok.Data;
import tech.nova.facile_facture_backend.Models.Client;
import tech.nova.facile_facture_backend.Models.Facture;
import tech.nova.facile_facture_backend.Models.Utilisateur;

@Data
@Builder
public class FactureDto<T> {


    private Integer client_Id;
    private Integer utilisateur_id;

    private FactureDto fromEntity(Facture facture){
        return FactureDto.builder()
                .client_Id(facture.getClient().getId())
                .utilisateur_id(facture.getUtilisateur().getId())
                .build();

    }

    private Facture toEntity(FactureDto facture){
        return Facture.builder()
                .client(Client.builder()
                        .id(facture.getClient_Id())
                        .id(facture.getUtilisateur_id())
                        .build())
                .build();
    }

}
