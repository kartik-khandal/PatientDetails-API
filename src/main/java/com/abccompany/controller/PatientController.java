package com.abccompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abccompany.Entity.PatientDetails;
import com.abccompany.repo.PatientRepo;



@RestController
public class PatientController {
	@Autowired
	private PatientRepo patRepo;
	
	@PostMapping("/save")
	public PatientDetails savePatientDetails(@RequestBody PatientDetails pat)
	{
		PatientDetails p1=patRepo.save(pat);
		return p1;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePatientDetails(@PathVariable Integer id){
		patRepo.deleteById(id);
			
}
	@GetMapping("/get/{id}")
	
	public PatientDetails findPatientDetails(@PathVariable Integer id) {
		return patRepo.findById(id).get();
	}
				

}

