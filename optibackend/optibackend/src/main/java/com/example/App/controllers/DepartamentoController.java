/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.controllers;

import com.example.App.entities.Departamento;
import com.example.App.services.DepartamentoService;
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
@RequestMapping("api/departamento")
public class DepartamentoController {
    private final DepartamentoService departamentoService;
    
    @Autowired
    public DepartamentoController(DepartamentoService departamentoService ){
        this.departamentoService = departamentoService;
    }
    
    // Endpoint para obtener todos los departamento
    @GetMapping
    private ResponseEntity<List<Departamento>> obtenerTodosLosDepartamentos() {
        List<Departamento> departamentos = departamentoService.obtenerTodosLosDepartamentos();
        return new ResponseEntity<>(departamentos, HttpStatus.OK);
    }
    
    // Endpoint para obtener un departamento por su código
    @GetMapping("/{id_Departamento}")
    private ResponseEntity<Departamento> obtenerDepartamentoPorCodigo(@PathVariable Long id_Departamento) {
        return departamentoService.obtenerDepartamentoPorCodigo(id_Departamento)
                .map(departamento -> new ResponseEntity<>(departamento, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
        // Endpoint para guardar un nuevo departamento
    @PostMapping
    private ResponseEntity<Departamento> guardar (@RequestBody Departamento departamento){
        Departamento temporal = departamentoService.create(departamento);
        
        try {
            return ResponseEntity.created(new URI("api/departamento/" + temporal.getId_Departamento())).body(temporal);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    // Endpoint para actualizar un cliente existente
    @PutMapping("/{id_Departamento}")
    private ResponseEntity<Departamento> actualizarDepartamento(@PathVariable Long id_Departamento, @RequestBody Departamento departamento) {
        Departamento departamentoActualizado = departamentoService.actualizarDepartamento(id_Departamento, departamento);
        return new ResponseEntity<>(departamentoActualizado, HttpStatus.OK);
    }

    // Endpoint para eliminar un cliente por su código
    @DeleteMapping("/{id_Departamento}")
    public ResponseEntity<Void> eliminarDepartamentoPorCodigo(@PathVariable Long id_Departamento) {
        departamentoService.deleteByCodigo(id_Departamento);
        return ResponseEntity.ok().build();
    
    }

    
    
}
