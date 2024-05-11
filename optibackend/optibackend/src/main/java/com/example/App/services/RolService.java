/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.services;

import com.example.App.entities.Rol;
import com.example.App.repositories.RolRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class RolService {
    private final RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    // Método para obtener todos los roles
    public List<Rol> obtenerTodosLosRoles() {
        return rolRepository.findAll();
    }

    // Método para obtener un rol por su ID
    public Optional<Rol> obtenerRolPorId(int id) {
        return rolRepository.findById(id);
    }
    
    // Método para guardar un nuevo rol
    public Rol guardarRol(Rol rol) {
        return rolRepository.save(rol);
    }

    // Método para actualizar un rol existente
    public Rol actualizarRol(int id, Rol rol) {
        rol.setId_rol(id); // Asegurar que el ID del rol coincida con el proporcionado
        return rolRepository.save(rol);
    }

    // Método para eliminar un rol por su ID
    public void eliminarRolPorId(int id) {
        rolRepository.deleteById(id);
    }
}
