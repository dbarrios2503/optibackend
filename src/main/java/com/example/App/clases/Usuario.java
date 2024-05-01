/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.clases;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author PC
 */

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// creara por si sola la PK
    @Column(unique = true, length = 13) //Los valores en esta columna deben ser unicosen toda la tabla
    private Long id_Usuario;
    private String nombre;
    private String apellido;
    private String trabajo;
    @Column(unique = true, length = 150) //Los valores en esta columna deben ser unicosen toda la tabla
    private String email;
    @Column(unique = true, length = 13)//Los valores en esta columna deben ser unicosen toda la tabla
    private String user_name;
    private String password;
    
    @ManyToOne
    @JoinColumn(name = "id_Departamento")
    private Departamento departamento;
    
    @ManyToOne
    @JoinColumn(name = "id_rol_usuario")
    private Rol_Usuario rolUsuario;
    
    
    
    public Usuario() {
    }

    public Usuario(Long id_Usuario, String nombre, String apellido, String trabajo, String email, String user_name, String password, Long id_rol_usuario, Long id_Departamento) {
        this.id_Usuario = id_Usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.trabajo = trabajo;
        this.email = email;
        this.user_name = user_name;
        this.password = password;
    }
    
    /**
     * @return the id_Usuario
     */
    public Long getId_Usuario() {
        return id_Usuario;
    }

    /**
     * @param id_Usuario the id_Usuario to set
     */
    public void setId_Usuario(Long id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the trabajo
     */
    public String getTrabajo() {
        return trabajo;
    }

    /**
     * @param trabajo the trabajo to set
     */
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the usar_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param usar_name the usar_name to set
     */
    public void setUsar_name(String usar_name) {
        this.user_name = usar_name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

   
}
