package com.register.usecase.impl;

import com.register.adapter.repositories.PatientRepository;
import com.register.adapter.repositories.entity.PatientEntity;
import com.register.model.Patient;
import com.register.usecase.PatientService;
import net.bytebuddy.implementation.bytecode.Throw;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    private String message;

    @Override
    public String createPatient(Patient patient) {
        PatientEntity entity = modelMapper.map(patient, PatientEntity.class);

        try {
            repository.save(entity);
            message = "sucesso";
        }catch (Exception e){
            message = "Falha na transação " + e;
        }

        return message;
    }

    @Override
    public List<Patient> findAllPatient() {
        List<Patient> listModel =  new ArrayList<>();
        try{
            List<PatientEntity> listPatient = repository.findAll();
            for (PatientEntity e: listPatient) {
                Patient model = modelMapper.map(e, Patient.class);
                listModel.add(model);
            }
        }catch (Exception e) {

        }

        return listModel;
    }

    @Override
    public Patient findPatientById(Integer id) {

        try{
            Optional<PatientEntity> entity = repository.findById(id);
            Patient model = modelMapper.map(entity.get(), Patient.class);
            return model;
        }catch (Exception e) {
            throw e;
        }


    }
}
