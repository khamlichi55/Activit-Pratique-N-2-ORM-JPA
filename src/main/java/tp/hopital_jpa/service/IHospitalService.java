package tp.hopital_jpa.service;

import tp.hopital_jpa.entities.Consultation;
import tp.hopital_jpa.entities.Medecin;
import tp.hopital_jpa.entities.Patient;
import tp.hopital_jpa.entities.RendezVous;

import java.awt.geom.PathIterator;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin saveMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);

}
