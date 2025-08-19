package com.example.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pedidos.repositories.ContenedorRepository;

import com.example.pedidos.models.Contenedor;

@Service
public class ContenedorService {
    
    @Autowired
    private ContenedorRepository contenedorRepo;

    public List<Contenedor> obtenerTodos(){
        return contenedorRepo.findAll();
    }

    public Contenedor obtenerPorId(Long id){
        return contenedorRepo.findById(id).orElse(null);
    }

    public Contenedor crear(Contenedor contenedor){
        return contenedorRepo.save(contenedor);
    }

    public Contenedor actualizar(Long id,Contenedor contenedor){
        contenedor.setId(id);
        return contenedorRepo.save(contenedor);
    }

    public void eliminar(Long id){
        contenedorRepo.deleteById(id);
    }

}
