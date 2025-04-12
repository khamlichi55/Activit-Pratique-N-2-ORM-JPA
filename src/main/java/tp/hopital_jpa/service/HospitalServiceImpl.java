package tp.hopital_jpa.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import tp.hopital_jpa.entities.Consultation;
import tp.hopital_jpa.entities.Medecin;
import tp.hopital_jpa.entities.Patient;
import tp.hopital_jpa.entities.RendezVous;
import tp.hopital_jpa.repositories.ConsultationRepository;
import tp.hopital_jpa.repositories.MedecinRepository;
import tp.hopital_jpa.repositories.PatientRepository;
import tp.hopital_jpa.repositories.RendezVousRepository;

@Service @Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private ConsultationRepository consultationRepository;
    private RendezVousRepository rendezVousRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, ConsultationRepository consultationRepository, RendezVousRepository rendezVousRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.consultationRepository = consultationRepository;
        this.rendezVousRepository = rendezVousRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRendezVous(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }

}
