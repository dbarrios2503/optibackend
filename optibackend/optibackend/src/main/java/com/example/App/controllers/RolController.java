/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.controllers;

import com.example.App.entities.Rol;
import com.example.App.services.RolService;
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
@RequestMapping("/api/roles")
public class RolController {
    private final RolService rolService;

    @Autowired
    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    // Endpoint para obtener todos los roles
    @GetMapping
    private ResponseEntity<List<Rol>> obtenerTodosLosRoles() {
        List<Rol> roles = rolService.obtenerTodosLosRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    // Endpoint para obtener un rol por su ID
    @GetMapping("/{id}")
    private ResponseEntity<Rol> obtenerRolPorId(@PathVariable int id) {
        return rolService.obtenerRolPorId(id)
                .map(rol -> new ResponseEntity<>(rol, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Endpoint para guardar un nuevo rol
    @PostMapping
    private ResponseEntity<Rol> guardarRol(@RequestBody Rol rol) {
        Rol nuevoRol = rolService.guardarRol(rol);
        
        try {
            return ResponseEntity.created(new URI("/api/roles/" + nuevoRol.getId_rol())).body(nuevoRol);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // Endpoint para actualizar un rol existente
    @PutMapping("/{id}")
    private ResponseEntity<Rol> actualizarRol(@PathVariable int id, @RequestBody Rol rol) {
        Rol rolActualizado = rolService.actualizarRol(id, rol);
        return new ResponseEntity<>(rolActualizado, HttpStatus.OK);
    }

    // Endpoint para eliminar un rol por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarRolPorId(@PathVariable int id) {
        rolService.eliminarRolPorId(id);
        return ResponseEntity.ok().build();
    }
}
