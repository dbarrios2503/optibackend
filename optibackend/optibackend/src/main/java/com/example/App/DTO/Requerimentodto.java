package com.example.App.DTO;

import java.time.LocalDateTime;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Requerimentodto {
    
    private String titulo ;
    private String descripcion;
    private Estadodto estado;
    private LocalDateTime fecha_creacion ;
    private String comentaio_rector ;
    private String comentario_logistico;
    private String comentario_compra ;
    private int opcion_elegida;
    private Usuariodto usuario;
    private String tipo_requerimineto;
    
}
