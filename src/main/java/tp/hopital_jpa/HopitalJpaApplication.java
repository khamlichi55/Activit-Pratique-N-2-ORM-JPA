package tp.hopital_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tp.hopital_jpa.entities.*;
import tp.hopital_jpa.repositories.MedecinRepository;
import tp.hopital_jpa.repositories.PatientRepository;
import tp.hopital_jpa.repositories.RendezVousRepository;
import tp.hopital_jpa.service.IHospitalService;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HopitalJpaApplication  {

	public static void main(String[] args) {
		SpringApplication.run(HopitalJpaApplication.class, args);
	}
	@Bean
	CommandLineRunner start(IHospitalService hospitalService ,PatientRepository patientRepository ,MedecinRepository medecinRepository ,RendezVousRepository rendezVousRepository) {
		return args -> {
			//Patient
			Stream.of("Moha","hassan","nasser").forEach(name -> {
				Patient patient=new Patient();
				patient.setNom("Lask");
				patient.setPrenom(name);
				patient.setDateNaissance(new Date());
				patient.setMalade(true);
				hospitalService.savePatient(patient);});

			//Medecin
			Stream.of("Sami","hanan","youssef").forEach(name -> {
				Medecin medecin=new Medecin();
				medecin.setNom(name);
				medecin.setEmail(name +"@gmail.com");
				medecin.setSpecialite("Chirurgie");
				hospitalService.saveMedecin(medecin);});

			//Rendez_vous
			Patient patient=patientRepository.findById(1).orElse(null);
//			Patient patient1=patientRepository.findByNom("nasser");
			Medecin medecin1=medecinRepository.findById(1).orElse(null);
			RendezVous rendezVous=new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setMedecin(medecin1);
			rendezVous.setPatient(patient);
			rendezVous.setStatus(StatusRDV.PENDING);
			hospitalService.saveRendezVous(rendezVous);

			//Consultation
			RendezVous rendezVous1=rendezVousRepository.findById(1L).orElse(null);
			Consultation consultation=new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport de la consulation ");
			hospitalService.saveConsultation(consultation);





		};
	}

}
