/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.DTO;

import com.example.App.entities.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private int id_Usuario;
    private String nombre;
    private String apellido;
    private String trabajo;
    private String email;
    private String user_name;
    private String password;
    private Departamento departamento;
    private Rol rolUsuario;
    
}
