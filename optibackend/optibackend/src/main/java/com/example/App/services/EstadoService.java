/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.services;

import com.example.App.entities.Estado;
import com.example.App.repositories.EstadoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class EstadoService {
    private final EstadoRepository estadoRepository;

    @Autowired
    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    // Método para obtener todos los estados
    public List<Estado> obtenerTodosLosEstados() {
        return estadoRepository.findAll();
    }

    // Método para buscar un estado por su ID
    public Optional<Estado> obtenerEstadoPorId(int id_estado) {
        return estadoRepository.findById(id_estado);
    }
    
    // Método para guardar un nuevo estado
    public Estado guardarEstado(Estado estado) {
        return estadoRepository.save(estado);
    }

    // Método para actualizar un estado existente
    public Estado actualizarEstado(int id_estado, Estado estado) {
        estado.setId_estado(id_estado); // Asegurar que el ID del estado coincida con el proporcionado
        return estadoRepository.save(estado);
    }

    // Método para eliminar un estado por su ID
    public void eliminarEstadoPorId(int id_estado) {
        estadoRepository.deleteById(id_estado);
    }
}
