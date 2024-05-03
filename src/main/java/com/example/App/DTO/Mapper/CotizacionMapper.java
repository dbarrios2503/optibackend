package com.example.App.DTO.mapper;

import com.example.app.entities.Cotizacion;
import com.example.app.dto.CotizacionDTO;
import com.example.shared.mapper.EntityToDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants.ComponentModel;

@Mapper(componentModel = ComponentModel.SPRING)
public interface CotizacionMapper extends EntityToDto<Cotizacion, CotizacionDTO> {

}
