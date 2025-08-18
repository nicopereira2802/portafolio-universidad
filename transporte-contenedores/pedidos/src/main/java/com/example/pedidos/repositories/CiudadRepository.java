package com.example.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pedidos.models.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad,Long>{
    
}
