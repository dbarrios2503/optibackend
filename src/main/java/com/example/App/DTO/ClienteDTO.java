package com.example.App.DTO;

import java.util.Date;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private String nombres;
    private String apellidos;
    private String cedula;
    private int edad;
    private String telefono;
    private Date fecha_nacimiento;

}
