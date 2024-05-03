package com.example.App.DTO;


import com.example.App.entities.*;
import java.util.List;
import jakarta.persistence.OneToMany;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartamentoDTO {

    private Long id_departamento;
    private String titulo;
    private String descripcion;
    
    @OneToMany(mappedBy = "departamento") // Nombre del atributo en la clase Usuario que mapea esta relación
    private List<Usuario> usuarios; // Lista de usuarios en este departamento

}
