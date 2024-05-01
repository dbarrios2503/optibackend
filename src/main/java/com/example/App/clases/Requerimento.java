/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.clases;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;


 
    @Entity
@Table
public class Requerimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_requerimeinto ;
    private String titulo ;
    private String descripcion;
    private int state;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_creacion ;
    private String comentaio_rector ;
    private String comentario_logistico;
    private String comentario_compra ;
    private int opcion_elegida;
    private int id_usuario;
    private String tipo_requerimineto;

    
    public Requerimento() {
    }

    
    public Requerimento(int id_requerimeinto, String titulo, String descripcion, int state, Date fecha_creacion, String comentaio_rector, String comentario_logistico, String comentario_compra, int opcion_elegida, int id_usuario, String tipo_requerimineto) {
        this.id_requerimeinto = id_requerimeinto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.state = state;
        this.fecha_creacion = fecha_creacion;
        this.comentaio_rector = comentaio_rector;
        this.comentario_logistico = comentario_logistico;
        this.comentario_compra = comentario_compra;
        this.opcion_elegida = opcion_elegida;
        this.id_usuario = id_usuario;
        this.tipo_requerimineto = tipo_requerimineto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getComentaio_rector() {
        return comentaio_rector;
    }

    public void setComentaio_rector(String comentaio_rector) {
        this.comentaio_rector = comentaio_rector;
    }

    public String getComentario_logistico() {
        return comentario_logistico;
    }

    public void setComentario_logistico(String comentario_logistico) {
        this.comentario_logistico = comentario_logistico;
    }

    public String getComentario_compra() {
        return comentario_compra;
    }

    public void setComentario_compra(String comentario_compra) {
        this.comentario_compra = comentario_compra;
    }

    public int getOpcion_elegida() {
        return opcion_elegida;
    }

    public void setOpcion_elegida(int opcion_elegida) {
        this.opcion_elegida = opcion_elegida;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
   /**
     * @return the id_requerimeinto
     */
    public int getId_requerimeinto() {
        return id_requerimeinto;
    }

    /**
     * @param id_requerimeinto the id_requerimeinto to set
     */
    public void setId_requerimeinto(int id_requerimeinto) {
        this.id_requerimeinto = id_requerimeinto;
    }

    /**
     * @param id_tipo_requerimento the id_tipo_requerimento to set
     */
    public void setId_tipo_requerimento(int id_tipo_requerimento) {
    }

    public String getTipo_requerimineto() {
        return tipo_requerimineto;
    }

    public void setTipo_requerimineto(String tipo_requerimineto) {
        this.tipo_requerimineto = tipo_requerimineto;
    }

  
    
    

    

    

    
}
