package com.example.pedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.pedidos.services.EstadoService;

import com.example.pedidos.models.Estado;

public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<Estado> listar(){
        return estadoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Estado listarPorId(@PathVariable Long id){
        return estadoService.obtenerPorId(id);
    }

    @PostMapping
    public Estado crear(@RequestBody Estado estado){
        return estadoService.crear(estado);
    }

    @PutMapping("/{id}")
    public Estado actualizar(@PathVariable Long id, @RequestBody Estado estado){
        estado.setId(id);
        return estadoService.actualizar(id, estado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        estadoService.eliminar(id);
    }
}
