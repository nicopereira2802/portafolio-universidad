package com.example.logistica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.logistica.repositories.TarifaRepository;
import com.example.logistica.models.Tarifa;

@Service
public class TarifaService {
    
    @Autowired
    private TarifaRepository tarifaRepo;

    public List<Tarifa> obtenerTodos(){
        return tarifaRepo.findAll();
    }

    public Tarifa obtenerPorId(Long id){
        return tarifaRepo.findById(id).orElse(null);
    }

    public Tarifa crear(Tarifa tarifa){
        return tarifaRepo.save(tarifa);
    }

    public Tarifa actualizar(Long id, Tarifa tarifa){
        tarifa.setId(id);
        return tarifaRepo.save(tarifa);
    }

    public void eliminar(Long id){
        tarifaRepo.deleteById(id);
    }

}
