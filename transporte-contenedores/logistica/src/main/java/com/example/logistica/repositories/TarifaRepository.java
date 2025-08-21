package com.example.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.logistica.models.Tarifa;

public interface TarifaRepository extends JpaRepository<Long,Tarifa>{
    
}
