package com.register.adapter.repositories;

import com.register.adapter.repositories.entity.PatientEntity;
import com.register.model.Patient;
import com.register.usecase.DataProvider;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class DataProviderImpl implements DataProvider {
    @Autowired
    private PatientRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void save(Patient patient) {
        repository.save(modelMapper.map(patient, PatientEntity.class));
    }

    @Override
    public void delete(Integer id) {
        Optional<PatientEntity> entity = repository.findById(id);
        repository.delete(entity.get());
    }

    @Override
    public List<Patient> findByName(String name) {
        List<Patient> listModel = new ArrayList<>();
        repository.findByName(name).forEach(patientEntity -> {
        listModel.add(modelMapper.map(patientEntity, Patient.class));
        });
        return (listModel);
    }

    @Override
    public List<Patient> findAll() {
        List<Patient> listModel = new ArrayList<>();
        repository.findAll().forEach(patientEntity -> {
            listModel.add(modelMapper.map(patientEntity, Patient.class));
        });
        return listModel ;
    }

    @Override
    public Patient findById(Integer id) {
        return modelMapper.map(repository.findById(id).get(), Patient.class);
    }
}
