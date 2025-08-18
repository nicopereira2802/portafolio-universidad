package com.example.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pedidos.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
