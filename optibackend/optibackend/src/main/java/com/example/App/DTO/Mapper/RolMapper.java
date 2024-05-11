/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.DTO.Mapper;

import com.example.shared.mapper.EntityToDto;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.Mapper;
import com.example.App.DTO.Rol_Usuariodto;
import com.example.App.entities.Rol;
@Mapper(componentModel = ComponentModel.SPRING)
public interface RolMapper extends EntityToDto<Rol, Rol_Usuariodto> {
}
