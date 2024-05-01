package com.example.App.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;
    private String nombres;
    private String apellidos;
    @Column(unique = true, length = 13, nullable = false)
    private String cedula;
    private Integer edad;
    private String telefono;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_nacimiento;

}



