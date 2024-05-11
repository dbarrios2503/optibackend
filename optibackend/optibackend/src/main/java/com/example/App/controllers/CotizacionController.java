/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.controllers;



import com.example.App.services.CotizacionService;
import com.example.app.entities.Cotizacion;
import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC
 */
@RestController
@RequestMapping("api/cotizacion")
public class CotizacionController {
    private final CotizacionService cotizacionService;
    
    @Autowired
    private CotizacionController(CotizacionService cotizacionService) {
        this.cotizacionService = cotizacionService;
    }
    
    // Endpoint para obtener todos las cotizaciones
    @GetMapping
    private ResponseEntity<List<Cotizacion>> obtenerTodosLasCotizaciones() {
        List<Cotizacion> cotizacion = cotizacionService.obtenerTodosLasCotizaciones();
        return new ResponseEntity<>(cotizacion, HttpStatus.OK);
    }
    
    // Endpoint para obtener un cliente por su código
    @GetMapping("/{id_cotizacion}")
    private ResponseEntity<Cotizacion> obtenerCotizacionPorCodigo(@PathVariable int id_cotizacion) {
        return cotizacionService.obtenerCotizacionPorCodigo(id_cotizacion)
                .map(cotizacion -> new ResponseEntity<>(cotizacion, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    private ResponseEntity<Cotizacion> guardar (@RequestBody Cotizacion cotizacion){
        Cotizacion temporal = cotizacionService.create(cotizacion);
        
        try {
            return ResponseEntity.created(new URI("api/cotizacion/" + temporal.getId_cotizacion())).body(temporal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    // Endpoint para actualizar un cliente existente
    @PutMapping("/{id_cotizacion}")
    private ResponseEntity<Cotizacion> actualizarCotizacion(@PathVariable int id_cotizacion, @RequestBody Cotizacion cotizacion) {
        Cotizacion cotizacionActualizado = cotizacionService.actualizarCotizacion(id_cotizacion, cotizacion);
        return new ResponseEntity<>(cotizacionActualizado, HttpStatus.OK);
    }
    // Endpoint para eliminar un cliente por su código
    @DeleteMapping("/{id_cotizacion}")
    public ResponseEntity<Void> eliminarCotizacionPorCodigo(@PathVariable int id_cotizacion) {
        cotizacionService.deleteByCodigo(id_cotizacion);
        return ResponseEntity.ok().build();
    
    }

    
}
