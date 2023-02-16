package com.smile.smile.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.smile.smile.models.Patient;
import com.smile.smile.repositories.PatientRepository;
import com.smile.smile.repositories.ProfileRepository;
import com.smile.smile.repositories.TreatmentRepository;

@Service
public class PatientService {
    private PatientRepository repository;
    private ProfileRepository profileRepository;
    private TreatmentRepository treatmentRepository;

    

    public PatientService(PatientRepository repository, ProfileRepository profileRepository,
            TreatmentRepository treatmentRepository) {
        this.repository = repository;
        this.profileRepository = profileRepository;
        this.treatmentRepository = treatmentRepository;
    }

    public List<Patient> getAll() {
        return repository.findAll();
    }

    public Patient getOne(String dni) {
        return repository.findByDni(dni);
    }
    
}
