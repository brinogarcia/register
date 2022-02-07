package com.register.usecase;


import com.register.model.Patient;

import java.util.List;


public interface DataProvider {

    void save(Patient patient);

    void delete(Integer id);

    List<Patient> findByName(String name);

    List<Patient> findAll();

    Patient findById(Integer id);


}
