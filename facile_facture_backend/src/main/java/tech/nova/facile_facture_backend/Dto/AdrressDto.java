package tech.nova.facile_facture_backend.Dto;

import lombok.Builder;
import lombok.Data;
import tech.nova.facile_facture_backend.Models.Address;
import tech.nova.facile_facture_backend.Models.Client;

@Data
@Builder
public class AdrressDto <T> {

    private Integer id;

    private String rue;
    private String ville;
    private String codePostal;
    private Integer Client_id;
    private final AdrressDto fromEntity(Address address){
        return AdrressDto.builder()
                .id(address.getId())
                .rue(address.getRue())
                .ville(address.getVille())
                .codePostal(address.getCodePostal())
                .Client_id(address.getClient().getId())
                .build();
    }

    private final Address toEntity(AdrressDto adrress){
        return Address.builder()
                .id(adrress.getId())
                .rue(adrress.getRue())
                .ville(adrress.getVille())
                .codePostal(adrress.getCodePostal())
                .client(Client.builder()
                        .id(adrress.getClient_id())
                        .build())
                .build();
    }
}
