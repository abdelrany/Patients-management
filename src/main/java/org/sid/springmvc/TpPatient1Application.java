package org.sid.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Date;

import org.sid.springmvc.dao.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.sid.springmvc.entities.Patient;

@SpringBootApplication
public class TpPatient1Application implements CommandLineRunner{
	@Autowired //Injection des dépenadances
	private PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(TpPatient1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null,"Ali",new Date(),false));
		patientRepository.save(new Patient(null,"reda",new Date(),true));
		patientRepository.save(new Patient(null,"yassmine",new Date(),true));
		patientRepository.save(new Patient(null,"abdel",new Date(),false));
		patientRepository.save(new Patient(null,"yahy",new Date(),false));
		patientRepository.save(new Patient(null,"amal",new Date(),true));
		patientRepository.save(new Patient(null,"kamal",new Date(),true));
		patientRepository.save(new Patient(null,"rachid",new Date(),false));
		patientRepository.save(new Patient(null,"hafid",new Date(),false));
		patientRepository.save(new Patient(null,"fahd",new Date(),true));
		patientRepository.save(new Patient(null,"sara",new Date(),true));
		patientRepository.save(new Patient(null,"oussama",new Date(),false));
		
		
		patientRepository.findAll().forEach(p->{
			System.out.println(p.getName());
		});
	}

}