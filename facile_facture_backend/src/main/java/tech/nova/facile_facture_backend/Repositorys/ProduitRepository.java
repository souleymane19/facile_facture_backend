package tech.nova.facile_facture_backend.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.nova.facile_facture_backend.Models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
