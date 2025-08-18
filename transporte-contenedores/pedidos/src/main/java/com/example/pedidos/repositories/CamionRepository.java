package com.example.pedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pedidos.models.Camion;

@Repository
public interface CamionRepository extends JpaRepository<Camion,Long>{

}
