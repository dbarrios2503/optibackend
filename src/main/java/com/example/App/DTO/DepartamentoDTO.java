/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.DTO;


import com.example.App.entities.*;
import java.util.List;



import javax.persistence.OneToMany;


public class DepartamentoDTO {

  
    private Long id_Departamento;
    private String titulo;
    private String descripcion;

    // Constructor vacío
    public DepartamentoDTO() {}

    // Constructor con parámetros
    public DepartamentoDTO(Long id_Departamento, String titulo, String descripcion) {
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
