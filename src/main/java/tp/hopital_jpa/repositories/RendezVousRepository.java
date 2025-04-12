package tp.hopital_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.hopital_jpa.entities.RendezVous;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {
}
