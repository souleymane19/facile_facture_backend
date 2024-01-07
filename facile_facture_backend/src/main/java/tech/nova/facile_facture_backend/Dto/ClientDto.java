package tech.nova.facile_facture_backend.Dto;

import lombok.Builder;
import lombok.Data;
import tech.nova.facile_facture_backend.Models.Client;

@Data
@Builder
public class ClientDto <T> {
    private Integer id;
    private String nom;
    private String telephone;

    private ClientDto fromEntity(Client client){
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .telephone(client.getTelephone())
                .build();

    }
}
