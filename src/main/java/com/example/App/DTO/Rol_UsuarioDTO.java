package com.example.App.DTO;

import com.example.App.entities.*;
import java.util.List;
import javax.persistence.OneToMany;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rol_UsuarioDTO {
   
    private Long id_rol_usuario;
    private String rol;
    private String descripcion;
    
    @OneToMany(mappedBy = "rolUsuario") // Nombre del atributo en la clase Usuario que mapea esta relación
    private List<Usuario> usuarios; // Lista de usuarios con este rol

}
