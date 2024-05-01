/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.DTO.Mapper;

import com.example.App.DTO.ClienteDTO;
import com.example.App.clases.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
 

@Mapper
public class ClienteMapper {
    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);
    
    public static ClienteDTO convertToDTO(Cliente cliente) {
        ClienteDTO ClienteDTO = new ClienteDTO();
        ClienteDTO.setCodigo(cliente.getCodigo());
        ClienteDTO.setNombres(cliente.getNombres());
        ClienteDTO.setApellidos(cliente.getApellidos());
        ClienteDTO.setCedula(cliente.getCedula());
        ClienteDTO.setEdad(cliente.getEdad());
        ClienteDTO.setTelefono(cliente.getTelefono());
        ClienteDTO.setFecha_nacimiento(cliente.getFecha_nacimiento());

        return ClienteDTO;
    }
  public static Cliente convertToDTO(ClienteDTO clienteDTO) {
        Cliente Cliente = new Cliente();
        Cliente.setCodigo(clienteDTO.getCodigo());
        Cliente.setNombres(clienteDTO.getNombres());
        Cliente.setApellidos(clienteDTO.getApellidos());
        Cliente.setCedula(clienteDTO.getCedula());
        Cliente.setEdad(clienteDTO.getEdad());
        Cliente.setTelefono(clienteDTO.getTelefono());
        Cliente.setFecha_nacimiento(clienteDTO.getFecha_nacimiento());
        
        return Cliente;
 }
 
}

