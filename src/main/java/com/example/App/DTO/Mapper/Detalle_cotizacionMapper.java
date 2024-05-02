/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.DTO.Mapper;

import com.example.App.DTO.Detalle_cotizacionDTO;
import com.example.App.entities.Detalle_cotizacion;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Daniel BC 2
 */
public class Detalle_cotizacionMapper {
    Detalle_cotizacion INSTANCE = Mappers.getMapper(Detalle_cotizacion.class);
    
    public static Detalle_cotizacionDTO convertToDTO(Detalle_cotizacionDTO detalle_cotizacioDTO) {
        Detalle_cotizacion DetalleDTO = new Detalle_cotizacion();
        DetalleDTO.setTitulo(detalle_cotizacioDTO.getDescripcion());
        DetalleDTO.setDescripcion(detalle_cotizacioDTO.getDescripcion());
        DetalleDTO.setId_cotizaion(detalle_cotizacioDTO.getId_cotizaion());
        DetalleDTO.setId_cotizacion2(detalle_cotizacioDTO.getId_cotizacion2());
     
        return detalle_cotizacioDTO;
    }
  public static Detalle_cotizacion convertToDTO(Detalle_cotizacion detalle_cotizacion) {
        Detalle_cotizacion Detalle = new Detalle_cotizacion();
       Detalle.setTitulo(detalle_cotizacion.getDescripcion());
        Detalle.setDescripcion(detalle_cotizacion.getDescripcion());
        Detalle.setId_cotizaion(detalle_cotizacion.getId_cotizaion());
        Detalle.setId_cotizacion2(detalle_cotizacion.getId_cotizacion2());
       
        return detalle_cotizacion;
 }
    
}
