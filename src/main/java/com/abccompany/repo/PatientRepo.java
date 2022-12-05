package com.abccompany.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abccompany.Entity.PatientDetails;
@Repository
public interface PatientRepo extends CrudRepository<PatientDetails, Integer> {
	

}
