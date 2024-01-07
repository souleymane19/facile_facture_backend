package tech.nova.facile_facture_backend.Dto;

import lombok.Builder;
import lombok.Data;
import tech.nova.facile_facture_backend.Models.Produit;
import tech.nova.facile_facture_backend.Models.ProduitFacture;

@Data
@Builder
public class ProduitFactureDto <T> {
    private Integer id;
    private Integer produit_id;
    private Integer facture_id;
    private Integer quantite;

    private final ProduitFactureDto  fromEntity(ProduitFacture produitFacture){
        return ProduitFactureDto.builder()
                .id(produitFacture.getId())
                .produit_id(produitFacture.getProduit().getId())
                .facture_id(produitFacture.getProduit().getId())
                .quantite(produitFacture.getQuantité())
                .build();
    }

    private final ProduitFacture toEntity(ProduitFactureDto produitFacture) {
        return ProduitFacture.builder()
                .id(produitFacture.getId())
                .produit(Produit.builder()
                        .id(produitFacture.getProduit_id())
                        .id((produitFacture.getFacture_id()))
                        .build())
                .quantité(produitFacture.getQuantite())
                .build();

    }
}
