package com.example.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pedidos.models.Camion;
import com.example.pedidos.repositories.CamionRepository;

@Service
public class CamionService {
    
    @Autowired
    private CamionRepository camionRepo;

    public List<Camion> obtenerTodos(){
        return camionRepo.findAll();
    }

    public Camion obtenerPorId(Long id){
        return camionRepo.findById(id).orElse(null);
    }

    public Camion crear(Camion camion){
        return camionRepo.save(camion);
    }

    public Camion actualizar(Long id, Camion camion){
        camion.setId(id);
        return camionRepo.save(camion);
    }

    public void eliminar(Long id){
        camionRepo.deleteById(id);
    }
}
