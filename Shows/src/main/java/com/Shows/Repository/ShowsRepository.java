package com.Shows.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shows.Entities.Shows;

public interface ShowsRepository extends JpaRepository<Shows, Long> {

}
