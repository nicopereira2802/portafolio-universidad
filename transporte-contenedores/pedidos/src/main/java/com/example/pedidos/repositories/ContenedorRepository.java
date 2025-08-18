package com.example.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pedidos.models.Contenedor;

@Repository
public interface ContenedorRepository extends JpaRepository<Contenedor,Long>{
    
}
