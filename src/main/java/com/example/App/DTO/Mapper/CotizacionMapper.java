package com.example.App.DTO.mapper;

import com.example.App.DTO.CotizacionDTO;
import com.example.App.entities.Cotizacion;
import lombok.Data;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Data
@Mapper
public class CotizacionMapper {

    CotizacionMapper INSTANCE = Mappers.getMapper(CotizacionMapper.class);

    public static CotizacionDTO convertToDTO(Cotizacion cotizacion) {
        CotizacionDTO CotizacionDTO = new CotizacionDTO();
        CotizacionDTO.setId_cotizacion(cotizacion.getId_cotizacion());
        CotizacionDTO.setTitulo(cotizacion.getTitulo());

        return CotizacionDTO;
    }

    public static Cotizacion convertToDTO(CotizacionDTO cotizacionDTO) {
        Cotizacion cotizacion = new Cotizacion();
        cotizacion.setId_cotizacion(cotizacionDTO.getId_cotizacion());
        cotizacion.setTitulo(cotizacionDTO.getTitulo());

        return cotizacion;
    }

}
