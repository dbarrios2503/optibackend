/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.services;

/**
 *
 * @author PC
 */
import com.example.App.entities.Tipo_requerimiento;
import com.example.App.repositories.TiporequerimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class Tipo_requerimientoService {
    private final TiporequerimientoRepository tipoRequerimientoRepository;

    @Autowired
    public Tipo_requerimientoService(TiporequerimientoRepository tipoRequerimientoRepository) {
        this.tipoRequerimientoRepository = tipoRequerimientoRepository;
    }

    // Método para obtener todos los tipos de requerimiento
    public List<Tipo_requerimiento> obtenerTodosLosTiposRequerimiento() {
        return tipoRequerimientoRepository.findAll();
    }

    // Método para obtener un tipo de requerimiento por su ID
    public Optional<Tipo_requerimiento> obtenerTipoRequerimientoPorId(int id) {
        return tipoRequerimientoRepository.findById(id);
    }
    
    // Método para guardar un nuevo tipo de requerimiento
    public Tipo_requerimiento guardarTipoRequerimiento(Tipo_requerimiento tipoRequerimiento) {
        return tipoRequerimientoRepository.save(tipoRequerimiento);
    }

    // Método para actualizar un tipo de requerimiento existente
    public Tipo_requerimiento actualizarTipoRequerimiento(int id, Tipo_requerimiento tipoRequerimiento) {
        tipoRequerimiento.setId_tipo_requerimiento(id); // Asegurar que el ID del tipo de requerimiento coincida con el proporcionado
        return tipoRequerimientoRepository.save(tipoRequerimiento);
    }

    // Método para eliminar un tipo de requerimiento por su ID
    public void eliminarTipoRequerimientoPorId(int id) {
        tipoRequerimientoRepository.deleteById(id);
    }
}
