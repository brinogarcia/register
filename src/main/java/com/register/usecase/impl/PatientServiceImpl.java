package com.register.usecase.impl;

import com.register.model.Patient;
import com.register.usecase.DataProvider;
import com.register.usecase.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private DataProvider dataProvider;

    private String message;

    @Override
    public String createPatient(Patient patient) {

        try {
            dataProvider.save(patient);
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
            listModel = dataProvider.findAll();


        }catch (Exception e) {

        }

        return listModel;
    }

    @Override
    public Patient findPatientById(Integer id) {

        try{
            Patient entity = dataProvider.findById(id);
            return entity;
        }catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Boolean deletePatient(Integer id){
        try {
            dataProvider.delete(id);
            return true;
        }catch (Exception e){
            return false;
        }


    }
}
