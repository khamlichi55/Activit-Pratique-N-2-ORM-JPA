package tp.hopital_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tp.hopital_jpa.entities.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Integer> {
    Medecin findByNom(String nom);
}
