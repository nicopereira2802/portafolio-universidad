package com.example.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.logistica.models.Tarifa;

@Repository
public interface TarifaRepository extends JpaRepository<Tarifa,Long>{
    
}
