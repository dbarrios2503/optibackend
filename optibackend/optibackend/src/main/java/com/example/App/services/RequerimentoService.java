/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.services;

import com.example.App.entities.Requerimento;
import com.example.App.repositories.RequerimentoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class RequerimentoService {
    private final RequerimentoRepository requerimentoRepository;

    @Autowired
    public RequerimentoService(RequerimentoRepository requerimentoRepository) {
        this.requerimentoRepository = requerimentoRepository;
    }

    // Método para obtener todos los requerimientos
    public List<Requerimento> obtenerTodosLosRequerimentos() {
        return requerimentoRepository.findAll();
    }

    // Método para obtener un requerimiento por su ID
    public Optional<Requerimento> obtenerRequerimentoPorId(int id) {
        return requerimentoRepository.findById(id);
    }
    
    // Método para guardar un nuevo requerimiento
    public Requerimento guardarRequerimento(Requerimento requerimento) {
        return requerimentoRepository.save(requerimento);
    }

    // Método para actualizar un requerimiento existente
    public Requerimento actualizarRequerimento(int id, Requerimento requerimento) {
        requerimento.setId_requerimeinto(id); // Asegurar que el ID del requerimiento coincida con el proporcionado
        return requerimentoRepository.save(requerimento);
    }

    // Método para eliminar un requerimiento por su ID
    public void eliminarRequerimentoPorId(int id) {
        requerimentoRepository.deleteById(id);
    }
}
