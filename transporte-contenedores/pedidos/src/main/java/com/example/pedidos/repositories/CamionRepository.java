package com.example.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pedidos.models.Camion;

public interface CamionRepository extends JpaRepository<Camion,Long>{

}
