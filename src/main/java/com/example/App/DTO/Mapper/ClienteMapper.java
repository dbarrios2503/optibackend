package com.example.App.DTO.mapper;

import com.example.app.dto.ClienteDTO;
import com.example.App.entities.Cliente;
import com.example.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = ComponentModel.SPRING)
public interface ClienteMapper extends EntityToDto<Cliente, ClienteDTO>{
    
}
