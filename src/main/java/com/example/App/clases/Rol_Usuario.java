/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.clases;

import java.io.Serial;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author PC
 */

@Entity
public class Rol_Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_rol_usuario;
    private String rol;
    private String descripcion;

    public Rol_Usuario() {
    }

    public Rol_Usuario(Long id_rol_usuario, String rol, String descripcion) {
        this.id_rol_usuario = id_rol_usuario;
        this.rol = rol;
        this.descripcion = descripcion;
    }
    
    @OneToMany(mappedBy = "rolUsuario") // Nombre del atributo en la clase Usuario que mapea esta relación
    private List<Usuario> usuarios; // Lista de usuarios con este rol


    /**
     * @return the id_rol_usuario
     */
    public Long getId_rol_usuario() {
        return id_rol_usuario;
    }

    /**
     * @param id_rol_usuario the id_rol_usuario to set
     */
    public void setId_rol_usuario(Long id_rol_usuario) {
        this.id_rol_usuario = id_rol_usuario;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
