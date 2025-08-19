package com.example.pedidos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pedidos.repositories.ClienteRepository;
import com.example.pedidos.models.Cliente;


@Service
public class ClienteService {
    
    @Autowired
    private ClienteRepository clienteRepo;

    public List<Cliente> obtenerTodos(){
        return clienteRepo.findAll();
    }

    public Cliente obtenerPorId(Long id){
        return clienteRepo.findById(id).orElse(null);
    }

    public Cliente crear(Cliente cliente){
        return clienteRepo.save(cliente);
    }

    public Cliente actualizar(Long id, Cliente cliente){
        cliente.setId(id);
        return clienteRepo.save(cliente);
    }

    public void eliminar(Long id){
        clienteRepo.deleteById(id);
    }

}
