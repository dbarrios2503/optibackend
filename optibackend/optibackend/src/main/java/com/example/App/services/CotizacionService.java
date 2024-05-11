/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.services;


import com.example.App.repositories.CotizacionRepository;
import com.example.app.entities.Cotizacion;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class CotizacionService {
    
    private final CotizacionRepository cotizacionRepository;
    
    @Autowired
    public CotizacionService(CotizacionRepository cotizacionRepository) {
        this.cotizacionRepository = cotizacionRepository;
    }
    // Metodo para buscar todas las cotizaciones
    public List<Cotizacion> obtenerTodosLasCotizaciones() {
        return cotizacionRepository.findAll();
    }
    
    // Metodo para buscar una cotizacion por su id
    public Optional<Cotizacion> obtenerCotizacionPorCodigo(int id_cotizacion) {
        return cotizacionRepository.findById(id_cotizacion);
    }
    
    //crea la cotizacion
    public Cotizacion create(Cotizacion cotizacion) {
        return cotizacionRepository.save(cotizacion);
    }
    
    // Metodo para guardar una nueva cotizacion
    public Cotizacion guardarCotizacion(Cotizacion cotizacion) {
        return cotizacionRepository.save(cotizacion);
    }
    
    // Metodo para actualizar un cliente existente
    public Cotizacion actualizarCotizacion(int id_cotizacion, Cotizacion cotizacion) {
        cotizacion.setId_cotizacion(id_cotizacion); // Asegurar que el codigo del cliente coincida con el proporcionado
        return cotizacionRepository.save(cotizacion);
    }
    
    public void deleteByCodigo(int id_cotizacion) {
        cotizacionRepository.deleteById(id_cotizacion);
    }
    
    
}
