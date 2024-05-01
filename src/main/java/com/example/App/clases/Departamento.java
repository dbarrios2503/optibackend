/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.clases;


import java.io.Serial;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author PC
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Departamento;
    private String titulo;
    private String descripcion;

    // Constructor vacío
    public Departamento() {}

    // Constructor con parámetros
    public Departamento(Long id_Departamento, String titulo, String descripcion) {
        this.id_Departamento = id_Departamento;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }
    
    @OneToMany(mappedBy = "departamento") // Nombre del atributo en la clase Usuario que mapea esta relación
    private List<Usuario> usuarios; // Lista de usuarios en este departamento

    // Getters y setters
    public Long getId_departamento() {
        return id_Departamento;
    }

    public void setId_departamento(Long id_departamento) {
        this.id_Departamento = id_departamento;
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
}
