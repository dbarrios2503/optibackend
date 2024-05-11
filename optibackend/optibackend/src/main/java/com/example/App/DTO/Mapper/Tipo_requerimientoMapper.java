/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.DTO.Mapper;
import com.example.App.DTO.Tipo_requerimientodto;
import com.example.App.entities.Tipo_requerimiento;
import com.example.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;


@Mapper(componentModel = ComponentModel.SPRING)
public interface Tipo_requerimientoMapper extends EntityToDto<Tipo_requerimiento, Tipo_requerimientodto> {
}
