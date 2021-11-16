package com.register.infra.mapper.impl;

import com.register.adapter.repositories.entity.PatientEntity;
import com.register.infra.mapper.PatientMapper;
import com.register.model.Patient;
import org.modelmapper.ModelMapper;

public class PatientMapperImpl{


    public PatientEntity mapperToEntity(Patient patient) {
        PatientEntity entity = new PatientEntity();
        entity.setAddress(patient.getAddress());
        entity.setBirthDate(patient.getBirthDate());
        entity.setName(patient.getName());
        entity.setEmail(patient.getEmail());
        entity.setPhone(patient.getPhone());
        entity.setProfession(patient.getProfession());
        entity.setMaritalStatus(patient.getMaritalStatus());
        return entity;
    }


    public Patient mapperToModel(PatientEntity patientEntity) {
       Patient model = new Patient();
       model.setAddress(patientEntity.getAddress());
       model.setBirthDate(patientEntity.getBirthDate());
       model.setEmail(patientEntity.getEmail());
       model.setName(patientEntity.getName());
       model.setProfession(patientEntity.getProfession());
       model.setPhone(patientEntity.getPhone());
       model.setPhone(patientEntity.getPhone());
       return model;
    }
}
