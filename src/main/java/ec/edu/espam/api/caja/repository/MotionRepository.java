package ec.edu.espam.api.caja.repository;

import ec.edu.espam.api.caja.domain.Motion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotionRepository extends JpaRepository<Motion,Long> {
}
