/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.clases;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Detalle_cotizacion {
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cotizaion;
    private String titulo ;
    private String descripcion;
    private String id_cotizacion2;

    public Detalle_cotizacion() {
    }

    public Detalle_cotizacion(int id_cotizaion, String titulo, String descripcion, String id_cotizacion2) {
        this.id_cotizaion = id_cotizaion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.id_cotizacion2 = id_cotizacion2;
    }

    public int getId_cotizaion() {
        return id_cotizaion;
    }

    public void setId_cotizaion(int id_cotizaion) {
        this.id_cotizaion = id_cotizaion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getId_cotizacion2() {
        return id_cotizacion2;
    }

    public void setId_cotizacion2(String id_cotizacion2) {
        this.id_cotizacion2 = id_cotizacion2;
    }
    
    
    
}
