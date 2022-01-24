package org.sid.springmvc.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
//import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.sid.springmvc.entities.Patient;

import org.sid.springmvc.dao.PatientRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	public Page<Patient> findByNameContains(String mc,Pageable pageable);

}
