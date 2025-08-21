package com.example.logistica.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contenedorId")
    private Long contenedorId;

    @Column(name = "ciudadOrigenId")
    private Long ciudadOrigenId;

    @Column(name = "depositoId")
    private Long depositoId;

    @Column(name = "camionId")
    private Long camionId;

    @Column(name = "costoEstimado")
    private double costoEstimado;

    @Column(name = "tiempoEstimadoHoras")
    private double tiempoEstimadoHoras;

    @OneToMany(mappedBy = "solicitud",cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<TramoRuta> tramosRutas;
}
