package com.example.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.logistica.models.TramoRuta;

@Repository
public interface TramoRutaRepository extends JpaRepository<TramoRuta,Long>{
    
}
