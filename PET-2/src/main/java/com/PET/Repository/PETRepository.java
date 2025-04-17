package com.PET.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PET.Entities.PET;

public interface PETRepository extends JpaRepository<PET, Long> {

}
