package tech.nova.facile_facture_backend.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.nova.facile_facture_backend.Models.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
