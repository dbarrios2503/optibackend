package com.example.App.DTO;

import com.example.App.entities.*;
import java.util.List;
import jakarta.persistence.OneToMany;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rol_Usuariodto {
   
    private Long id_rol_usuario;
    private String rol;
    private String descripcion;
    
  
}
