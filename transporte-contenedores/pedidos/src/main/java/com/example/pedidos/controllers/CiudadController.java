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

import com.example.pedidos.services.CiudadService;
import com.example.pedidos.models.Ciudad;

@RestController
@RequestMapping("/pedidos/ciudades")
public class CiudadController {
    
    @Autowired
    private CiudadService ciudadService;

    @GetMapping
    public List<Ciudad> listar(){
        return ciudadService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Ciudad listarPorId(@PathVariable Long id){
        return ciudadService.obtenerPorId(id);
    }

    @PostMapping
    public Ciudad crear(@RequestBody Ciudad ciudad){
        return ciudadService.crear(ciudad);
    }

    @PutMapping("/{id}")
    public Ciudad actualizar(@PathVariable Long id,@RequestBody Ciudad ciudad){
        return ciudadService.actualizar(id, ciudad);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        ciudadService.eliminar(id);
    }


}
