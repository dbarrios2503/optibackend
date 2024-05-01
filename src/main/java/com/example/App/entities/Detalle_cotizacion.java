package com.example.App.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@AllArgsConstructor
@Data
@NoArgsConstructor
public class Detalle_cotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cotizaion;
    private String titulo;
    private String descripcion;
    private String id_cotizacion2;
}
