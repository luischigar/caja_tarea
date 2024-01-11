package ec.edu.espam.api.caja.repository;

import ec.edu.espam.api.caja.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
