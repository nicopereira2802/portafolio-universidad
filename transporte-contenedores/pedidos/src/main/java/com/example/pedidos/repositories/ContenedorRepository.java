package com.example.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pedidos.models.Contenedor;

public interface ContenedorRepository extends JpaRepository<Contenedor,Long>{
    
}
