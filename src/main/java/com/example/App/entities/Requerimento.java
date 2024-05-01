package com.example.App.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Requerimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_requerimeinto;
    private String titulo;
    private String descripcion;
    private int state;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_creacion;
    private String comentaio_rector;
    private String comentario_logistico;
    private String comentario_compra;
    private int opcion_elegida;
    private int id_usuario;
    private String tipo_requerimineto;

}
