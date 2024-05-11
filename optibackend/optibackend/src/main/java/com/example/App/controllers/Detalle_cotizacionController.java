/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.controllers;

import com.example.App.entities.Detalle_cotizacion;
import com.example.App.services.Detalle_cotizacionService;
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
@RequestMapping("api/detalle_cotizacion")
public class Detalle_cotizacionController {
    private final Detalle_cotizacionService detalle_cotizacionService;
    
    @Autowired
    private Detalle_cotizacionController(Detalle_cotizacionService detalle_cotizacionService){
        this.detalle_cotizacionService=detalle_cotizacionService;
    }
    
    // Endpoint para obtener todos los obtenerTodosLosDetalle_cotizacion
    @GetMapping
    private ResponseEntity<List<Detalle_cotizacion>> obtenerTodosLosDetalle_cotizacion() {
        List<Detalle_cotizacion> Detalle_cotizacion = detalle_cotizacionService.obtenerTodosLosDetalle_cotizacion();
        return new ResponseEntity<>(Detalle_cotizacion, HttpStatus.OK);
    }

    // Endpoint para obtener obtenerDetalle_cotizacionPorCodigo
    @GetMapping("/{id_cotizaion}")
    private ResponseEntity<Detalle_cotizacion> obtenerDetalle_cotizacionPorCodigo(@PathVariable int id_cotizaion) {
        return detalle_cotizacionService.obtenerDetalle_cotizacionPorCodigo(id_cotizaion)
                .map(detalle_cotizacion -> new ResponseEntity<>(detalle_cotizacion, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping
    private ResponseEntity<Detalle_cotizacion> guardar (@RequestBody Detalle_cotizacion detalle_cotizacion){
        Detalle_cotizacion temporal = detalle_cotizacionService.create(detalle_cotizacion);
        
        try {
            return ResponseEntity.created(new URI("api/detalle_cotizacion/" + temporal.getId_cotizaion())).body(temporal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    @PutMapping("/{id_cotizaion}")
    private ResponseEntity<Detalle_cotizacion> actualizarDetalle_cotizacion(@PathVariable int id_cotizaion, @RequestBody Detalle_cotizacion detalle_cotizacion) {
        Detalle_cotizacion detalle_cotizacionActualizado = detalle_cotizacionService.actualizarDetalle_cotizacion(id_cotizaion, detalle_cotizacion);
        return new ResponseEntity<>(detalle_cotizacionActualizado, HttpStatus.OK);
    }

    // Endpoint para eliminar un cliente por su código
    @DeleteMapping("/{id_cotizaion}")
    public ResponseEntity<Void> eliminarDetallePorCodigo(@PathVariable int id_cotizaion) {
        detalle_cotizacionService.deleteByCodigo(id_cotizaion);
        return ResponseEntity.ok().build();
    
    }
}
