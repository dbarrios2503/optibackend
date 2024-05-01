/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.DTO;

import com.example.App.clases.*;


public class UsuarioDTO {
    private int id_Usuario;
    private String nombre;
    private String apellido;
    private String trabajo;
    private String email;
    private String user_name;
    private String password;
    private Departamento departamento;
    private Rol_Usuario rolUsuario;
    
    
    
    public UsuarioDTO() {
    }

    public UsuarioDTO(int id_Usuario, String nombre, String apellido, String trabajo, String email, String user_name, String password, Long id_rol_usuario, Long id_Departamento) {
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
    public int getId_Usuario() {
        return id_Usuario;
    }

    /**
     * @param id_Usuario the id_Usuario to set
     */
    public void setId_Usuario(int id_Usuario) {
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
