package com.example.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pedidos.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long>{
    
}
