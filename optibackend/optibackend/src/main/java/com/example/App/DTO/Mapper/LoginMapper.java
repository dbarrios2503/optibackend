/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.App.DTO.Mapper;

import com.example.App.DTO.Logindto;
import com.example.App.entities.Login;
import com.example.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

/**
 *
 * @author Daniel BC 2
 */
@Mapper(componentModel = ComponentModel.SPRING)
public interface LoginMapper extends EntityToDto<Login , Logindto> {

} 
