package com.register.usecase;

import com.register.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {

    String createPatient(Patient patient);

    List<Patient> findAllPatient();

    Patient findPatientById(Integer id);

}
