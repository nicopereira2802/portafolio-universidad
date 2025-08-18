package com.example.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pedidos.models.Deposito;

public interface DepositoRepository extends JpaRepository<Deposito,Long>{
    
}
