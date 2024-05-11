/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.controllers;

import com.example.App.entities.Estado;
import com.example.App.services.EstadoService;
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
@RequestMapping("/api/estados")
public class EstadoController {
    private final EstadoService estadoService;

    @Autowired
    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    // Endpoint para obtener todos los estados
    @GetMapping
    private ResponseEntity<List<Estado>> obtenerTodosLosEstados() {
        List<Estado> estados = estadoService.obtenerTodosLosEstados();
        return new ResponseEntity<>(estados, HttpStatus.OK);
    }

    // Endpoint para obtener un estado por su ID
    @GetMapping("/{id_estado}")
    private ResponseEntity<Estado> obtenerEstadoPorId(@PathVariable int id_estado) {
        return estadoService.obtenerEstadoPorId(id_estado)
                .map(estado -> new ResponseEntity<>(estado, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para guardar un nuevo estado
    @PostMapping
    private ResponseEntity<Estado> guardarEstado(@RequestBody Estado estado) {
        Estado nuevoEstado = estadoService.guardarEstado(estado);
        
        try {
            return ResponseEntity.created(new URI("/api/estados/" + nuevoEstado.getId_estado())).body(nuevoEstado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // Endpoint para actualizar un estado existente
    @PutMapping("/{id_estado}")
    private ResponseEntity<Estado> actualizarEstado(@PathVariable int id_estado, @RequestBody Estado estado) {
        Estado estadoActualizado = estadoService.actualizarEstado(id_estado, estado);
        return new ResponseEntity<>(estadoActualizado, HttpStatus.OK);
    }

    // Endpoint para eliminar un estado por su ID
    @DeleteMapping("/{id_estado}")
    public ResponseEntity<Void> eliminarEstadoPorId(@PathVariable int id_estado) {
        estadoService.eliminarEstadoPorId(id_estado);
        return ResponseEntity.ok().build();
    }
}//comentario pa comprobar
