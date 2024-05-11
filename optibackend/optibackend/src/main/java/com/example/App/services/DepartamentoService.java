/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.services;

import com.example.App.entities.Departamento;
import com.example.App.repositories.DepartamentoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class DepartamentoService {
    DepartamentoRepository departamentoRepository;
    
    @Autowired
    public DepartamentoService(DepartamentoRepository departamentoRepository ){
        this.departamentoRepository=departamentoRepository;
    }
    
    // Metodo para obtener todos los departamentos
    public List<Departamento> obtenerTodosLosDepartamentos() {
        return departamentoRepository.findAll();
    }
    
    // Metodo para buscar un departamento por su codigo
    public Optional<Departamento> obtenerDepartamentoPorCodigo(Long id_Departamento) {
        return departamentoRepository.findById(id_Departamento);
    }
    
    public Departamento create(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }
    
    // Metodo para guardar un nuevo departamentos
    public Departamento guardarDepartamento(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }
    
    // Metodo para actualizar un cliente existente
    public Departamento actualizarDepartamento(Long id_Departamento, Departamento departamento) {
        departamento.setId_Departamento(id_Departamento); // Asegurar que el codigo del cliente coincida con el proporcionado
        return departamentoRepository.save(departamento);
    }
    public void deleteByCodigo(Long id_Departamento) {
        departamentoRepository.deleteById(id_Departamento);
    }
    
}
