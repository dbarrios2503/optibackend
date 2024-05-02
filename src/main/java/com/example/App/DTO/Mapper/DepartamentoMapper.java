/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.DTO.Mapper;


import com.example.App.DTO.DepartamentoDTO;
import com.example.App.entities.Departamento;
import org.mapstruct.factory.Mappers;



public class DepartamentoMapper {
        DepartamentoMapper INSTANCE = Mappers.getMapper(DepartamentoMapper.class);
    
    public static DepartamentoDTO convertToDTO(Departamento departamento){
        DepartamentoDTO DepartamentoDTO = new DepartamentoDTO();
        DepartamentoDTO.setId_departamento(departamento.getId_Departamento());
        DepartamentoDTO.setTitulo(departamento.getDescripcion());
        DepartamentoDTO.setDescripcion(departamento.getDescripcion());
        
       
        return DepartamentoDTO;
    }
  public static Departamento convertToDTO(DepartamentoDTO departanemntoDTO) {
        Departamento departamento = new Departamento();
        departamento.setId_Departamento(departanemntoDTO.getId_departamento());
        departamento.setTitulo(departanemntoDTO.getTitulo());
        departamento.setDescripcion(departanemntoDTO.getDescripcion());
        return departamento;
 }
    
}
