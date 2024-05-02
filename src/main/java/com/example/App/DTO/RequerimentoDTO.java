package com.example.App.DTO;

import java.time.LocalDateTime;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequerimentoDTO {
    
    private String titulo ;
    private String descripcion;
    private EstadoDTO estado;
    private LocalDateTime fecha_creacion ;
    private String comentaio_rector ;
    private String comentario_logistico;
    private String comentario_compra ;
    private int opcion_elegida;
    private UsuarioDTO usuario;
    private String tipo_requerimineto;
    
}
