package tech.nova.facile_facture_backend.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tech.nova.facile_facture_backend.Models.Utilisateur;

public interface  UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
