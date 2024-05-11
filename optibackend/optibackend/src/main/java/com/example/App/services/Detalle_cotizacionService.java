/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.services;

import com.example.App.entities.Detalle_cotizacion;
import com.example.App.repositories.Detalle_cotizacionRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class Detalle_cotizacionService {
    private final Detalle_cotizacionRepository detalle_cotizacionRepository;
    
    @Autowired
    private Detalle_cotizacionService(Detalle_cotizacionRepository detalle_cotizacionRepository){
        this.detalle_cotizacionRepository = detalle_cotizacionRepository;
    }
    
    // Metodo para obtener todos los clientes
    public List<Detalle_cotizacion> obtenerTodosLosDetalle_cotizacion() {
        return detalle_cotizacionRepository.findAll();
    }

    // Metodo para buscar un cliente por su codigo
    public Optional<Detalle_cotizacion> obtenerDetalle_cotizacionPorCodigo(int id_cotizaion) {
        return detalle_cotizacionRepository.findById(id_cotizaion);
    }
    
    public Detalle_cotizacion create(Detalle_cotizacion detalle_cotizacion) {
        return detalle_cotizacionRepository.save(detalle_cotizacion);
    }
    
    // Metodo para guardar un nuevo cliente
    public Detalle_cotizacion guardarDetalle_cotizacion(Detalle_cotizacion detalle_cotizacion) {
        return detalle_cotizacionRepository.save(detalle_cotizacion);
    }

    // Metodo para actualizar un cliente existente
    public Detalle_cotizacion actualizarDetalle_cotizacion(int id_cotizaion, Detalle_cotizacion detalle_cotizacion) {
        detalle_cotizacion.setId_cotizaion(id_cotizaion); // Asegurar que el codigo del cliente coincida con el proporcionado
        return detalle_cotizacionRepository.save(detalle_cotizacion);
    }

    public void deleteByCodigo(int id_cotizaion) {
        detalle_cotizacionRepository.deleteById(id_cotizaion);
    }
    
    
}
