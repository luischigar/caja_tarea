package ec.edu.espam.api.caja.repository;

import ec.edu.espam.api.caja.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
