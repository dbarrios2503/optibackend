package com.example.App.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Rol rolUsuario;
}
