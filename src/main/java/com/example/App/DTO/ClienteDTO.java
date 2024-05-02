package com.example.App.DTO;

import java.util.Date;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private Integer codigo;
    private String nombres;
    private String apellidos;
    private String cedula;
    private Integer edad;
    private String telefono;
    private Date fecha_nacimiento;

}
