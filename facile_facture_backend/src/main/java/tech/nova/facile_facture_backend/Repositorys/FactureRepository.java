package tech.nova.facile_facture_backend.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.nova.facile_facture_backend.Models.Facture;

public interface FactureRepository extends JpaRepository<Facture, Long> {}

