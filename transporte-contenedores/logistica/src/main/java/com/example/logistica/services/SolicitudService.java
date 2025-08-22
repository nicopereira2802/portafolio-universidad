package com.example.logistica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.logistica.repositories.SolicitudRepository;
import com.example.logistica.models.Solicitud;

@Service
public class SolicitudService {
    
    @Autowired
    private SolicitudRepository solicitudRepo;

    public List<Solicitud> obtenerTodos(){
        return solicitudRepo.findAll();
    }

    public Solicitud obtenerPorId(Long id){
        return solicitudRepo.findById(id).orElse(null);
    }

    public Solicitud crear(Solicitud solicitud){
        return solicitudRepo.save(solicitud);
    }

    public Solicitud actualizar(Long id,Solicitud solicitud){
        solicitud.setId(id);
        return solicitudRepo.save(solicitud);
    }

    public void eliminar(Long id){
        solicitudRepo.deleteById(id);
    }

}
