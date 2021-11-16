package com.register.adapter.repositories;

import com.register.adapter.repositories.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<PatientEntity, Long> {

    List<PatientEntity> findByName(String name);

    Optional<PatientEntity> findById(Integer id);
}
