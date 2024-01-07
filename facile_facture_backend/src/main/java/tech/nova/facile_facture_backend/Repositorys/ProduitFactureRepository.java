package tech.nova.facile_facture_backend.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.nova.facile_facture_backend.Models.Produit;
import tech.nova.facile_facture_backend.Models.ProduitFacture;

public interface ProduitFactureRepository extends JpaRepository<ProduitFacture, Integer> {
}
