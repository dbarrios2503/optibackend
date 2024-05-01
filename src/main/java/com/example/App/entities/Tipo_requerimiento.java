package com.example.App.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tipo_requerimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_requerimiento;
    private String Titulo;
    private String Descripcion;

}
