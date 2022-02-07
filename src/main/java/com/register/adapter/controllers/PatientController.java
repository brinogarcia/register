package com.register.adapter.controllers;

import com.register.model.Patient;
import com.register.usecase.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/systemofdiet")
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> getAllPatients(){
        List<Patient> list = service.findAllPatient();
        return ResponseEntity.ok().body(list);

    }

    @GetMapping("/patients/{id_patient}")
    public ResponseEntity<Patient> getPatientsById(@PathVariable Integer id_patient){
        Patient patient = service.findPatientById(id_patient);
        return ResponseEntity.ok().body(patient);

    } 

    @PostMapping("/patient")
    public ResponseEntity createPatient(@RequestBody Patient patient){
        String response = service.createPatient(patient);
        return  ResponseEntity.ok(response);
    }

    @DeleteMapping("/patients/{id_patient}")
    public ResponseEntity<Boolean> deletePAtient(@PathVariable Integer id_patient){
        return ResponseEntity.ok(service.deletePatient(id_patient));
    }
}
