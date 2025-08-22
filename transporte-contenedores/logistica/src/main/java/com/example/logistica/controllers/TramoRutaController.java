package com.example.logistica.controllers;

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

import com.example.logistica.services.TramoRutaService;
import com.example.logistica.models.TramoRuta;

@RestController
@RequestMapping("/logistica/tramosRutas")
public class TramoRutaController {
    
    @Autowired
    private TramoRutaService tramoRutaService;

    @GetMapping
    public List<TramoRuta> listar(){
        return tramoRutaService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public TramoRuta listarPorId(@PathVariable Long id){
        return tramoRutaService.obtenerPorId(id);
    }

    @PostMapping
    public TramoRuta crear(@RequestBody TramoRuta tramoRuta){
        return tramoRutaService.crear(tramoRuta);
    }

    @PutMapping("/{id}")
    public TramoRuta actualizar(@PathVariable Long id, @RequestBody TramoRuta tramoRuta){
        return tramoRutaService.actualizar(id, tramoRuta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
        tramoRutaService.eliminar(id);
    }
}
