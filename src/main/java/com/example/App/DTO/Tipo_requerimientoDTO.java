/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.DTO;


public class Tipo_requerimientoDTO {
    

    private int id_tipo_requerimiento;
    private String Titulo;
    private String Descripcion;

    public Tipo_requerimientoDTO() {
    }

    public Tipo_requerimientoDTO(int id_tipo_requerimiento, String Titulo, String Descripcion) {
        this.id_tipo_requerimiento = id_tipo_requerimiento;
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
    }

    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getId_tipo_requerimiento() {
        return id_tipo_requerimiento;
    }

    public void setId_tipo_requerimiento(int id_tipo_requerimiento) {
        this.id_tipo_requerimiento = id_tipo_requerimiento;
    }
    
    
    
}
