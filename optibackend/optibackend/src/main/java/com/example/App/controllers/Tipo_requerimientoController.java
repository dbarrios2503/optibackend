/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.controllers;

/**
 *
 * @author PC
 */

import com.example.App.entities.Tipo_requerimiento;
import com.example.App.services.Tipo_requerimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipo-requerimientos")
public class Tipo_requerimientoController {
    private final Tipo_requerimientoService tipoRequerimientoService;

    @Autowired
    public Tipo_requerimientoController(Tipo_requerimientoService tipoRequerimientoService) {
        this.tipoRequerimientoService = tipoRequerimientoService;
    }

    // Endpoint para obtener todos los tipos de requerimiento
    @GetMapping
    public ResponseEntity<List<Tipo_requerimiento>> obtenerTodosLosTiposRequerimiento() {
        List<Tipo_requerimiento> tiposRequerimiento = tipoRequerimientoService.obtenerTodosLosTiposRequerimiento();
        return new ResponseEntity<>(tiposRequerimiento, HttpStatus.OK);
    }

    // Endpoint para obtener un tipo de requerimiento por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Tipo_requerimiento> obtenerTipoRequerimientoPorId(@PathVariable int id) {
        Optional<Tipo_requerimiento> tipoRequerimiento = tipoRequerimientoService.obtenerTipoRequerimientoPorId(id);
        return tipoRequerimiento.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para guardar un nuevo tipo de requerimiento
    @PostMapping
    public ResponseEntity<Tipo_requerimiento> guardarTipoRequerimiento(@RequestBody Tipo_requerimiento tipoRequerimiento) {
        Tipo_requerimiento nuevoTipoRequerimiento = tipoRequerimientoService.guardarTipoRequerimiento(tipoRequerimiento);
        try {
            return ResponseEntity.created(new URI("/api/tipo-requerimientos/" + nuevoTipoRequerimiento.getId_tipo_requerimiento())).body(nuevoTipoRequerimiento);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // Endpoint para actualizar un tipo de requerimiento existente
    @PutMapping("/{id}")
    public ResponseEntity<Tipo_requerimiento> actualizarTipoRequerimiento(@PathVariable int id, @RequestBody Tipo_requerimiento tipoRequerimiento) {
        Tipo_requerimiento tipoRequerimientoActualizado = tipoRequerimientoService.actualizarTipoRequerimiento(id, tipoRequerimiento);
        return new ResponseEntity<>(tipoRequerimientoActualizado, HttpStatus.OK);
    }

    // Endpoint para eliminar un tipo de requerimiento por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarTipoRequerimientoPorId(@PathVariable int id) {
        tipoRequerimientoService.eliminarTipoRequerimientoPorId(id);
        return ResponseEntity.ok().build();
    }
}
