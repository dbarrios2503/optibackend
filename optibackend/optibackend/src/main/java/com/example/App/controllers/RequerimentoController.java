/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.controllers;

import com.example.App.entities.Estado;
import com.example.App.entities.Requerimento;
import com.example.App.services.EstadoService;
import com.example.App.services.RequerimentoService;
import java.net.URI;
import java.util.List;
import java.util.Optional;
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
@RequestMapping("/api/requerimentos")
public class RequerimentoController {
    private final RequerimentoService requerimentoService;
    private final EstadoService estadoService;
    

    @Autowired
    public RequerimentoController(RequerimentoService requerimentoService, EstadoService estadoService) {
        this.requerimentoService = requerimentoService;
        this.estadoService = estadoService;
    }

    // Endpoint para obtener todos los requerimentos
    @GetMapping
    private ResponseEntity<List<Requerimento>> obtenerTodosLosRequerimentos() {
        List<Requerimento> requerimentos = requerimentoService.obtenerTodosLosRequerimentos();
        return new ResponseEntity<>(requerimentos, HttpStatus.OK);
    }

    // Endpoint para obtener un requerimento por su ID
    @GetMapping("/{id}")
    private ResponseEntity<Requerimento> obtenerRequerimentoPorId(@PathVariable int id) {
        return requerimentoService.obtenerRequerimentoPorId(id)
                .map(requerimento -> new ResponseEntity<>(requerimento, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para guardar un nuevo requerimento
    @PostMapping
    private ResponseEntity<Requerimento> guardarRequerimento(@RequestBody Requerimento requerimento) {
        // Obtener el estado por su ID
        Optional<Estado> estadoOptional = estadoService.obtenerEstadoPorId(requerimento.getEstado().getId_estado());

        if (estadoOptional.isPresent()) {
            requerimento.setEstado(estadoOptional.get());

            Requerimento nuevoRequerimento = requerimentoService.guardarRequerimento(requerimento);

            try {
                return ResponseEntity.created(new URI("/api/requerimentos/" + nuevoRequerimento.getId_requerimeinto())).body(nuevoRequerimento);
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); // Manejar el caso donde el estado no existe
        }
    }

    // Endpoint para actualizar un requerimento existente
    @PutMapping("/{id}")
    private ResponseEntity<Requerimento> actualizarRequerimento(@PathVariable int id, @RequestBody Requerimento requerimento) {
        Requerimento requerimentoActualizado = requerimentoService.actualizarRequerimento(id, requerimento);
        return new ResponseEntity<>(requerimentoActualizado, HttpStatus.OK);
    }

    // Endpoint para eliminar un requerimento por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarRequerimentoPorId(@PathVariable int id) {
        requerimentoService.eliminarRequerimentoPorId(id);
        return ResponseEntity.ok().build();
    }
}
