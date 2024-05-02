package com.example.App.DTO;


import java.util.Date;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequerimentoDTO {
    
    private int id_requerimeinto ;
    private String titulo ;
    private String descripcion;
    private int state;
    private Date fecha_creacion ;
    private String comentaio_rector ;
    private String comentario_logistico;
    private String comentario_compra ;
    private int opcion_elegida;
    private int id_usuario;
    private String tipo_requerimineto;
    
}
