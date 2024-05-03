package com.example.App.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Requerimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_requerimeinto;
    private String titulo;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_estado")
    private Estado estado;
    private LocalDateTime fecha_creacion;
    private String comentaio_rector;
    private String comentario_logistico;
    private String comentario_compra;
    private int opcion_elegida;
    private int id_usuario;
    private String tipo_requerimineto;

}
