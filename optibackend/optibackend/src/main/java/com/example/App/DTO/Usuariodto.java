package com.example.App.DTO;

import com.example.App.entities.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuariodto {
    private String nombre;
    private String apellido;
    private String password;
    private String user_name;
    private String trabajo;
    private String email;
   
}
