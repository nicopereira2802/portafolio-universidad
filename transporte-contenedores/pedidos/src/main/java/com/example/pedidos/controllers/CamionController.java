package com.example.pedidos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pedidos.models.Camion;
import com.example.pedidos.services.CamionService;

@RestController
@RequestMapping("/pedidos/camiones")
public class CamionController {
    
    @Autowired
    private CamionService camionService;

    @GetMapping
    public List<Camion> listar(){
        return camionService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Camion listarPorId(@PathVariable Long id){
        return camionService.obtenerPorId(id);
    }

    @PostMapping
    public Camion crear(@RequestBody Camion camion){
        return camionService.crear(camion);
    }

    @PutMapping("/{id}")
    public Camion actualizar(@PathVariable Long id,@RequestBody Camion camion){
        return camionService.actualizar(id, camion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        camionService.eliminar(id);
    }


}
