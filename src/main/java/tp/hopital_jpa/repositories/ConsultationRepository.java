package tp.hopital_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.hopital_jpa.entities.Consultation;

public interface ConsultationRepository extends JpaRepository<Consultation, Integer> {
}
