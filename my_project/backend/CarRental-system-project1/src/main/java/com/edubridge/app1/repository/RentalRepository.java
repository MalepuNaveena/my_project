package com.edubridge.app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.app1.model.Rentals;

@Repository
public interface RentalRepository extends JpaRepository<Rentals, Integer>{

}
