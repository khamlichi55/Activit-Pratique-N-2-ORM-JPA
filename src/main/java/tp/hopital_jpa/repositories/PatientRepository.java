package tp.hopital_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.hopital_jpa.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    Patient findByNom(String name);
}
