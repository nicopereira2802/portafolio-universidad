package com.example.logistica.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.logistica.models.Solicitud;

public interface SolicitudRepository extends JpaRepository<Long,Solicitud>{
    
}
