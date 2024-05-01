/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.Service;

import com.example.App.DTO.ClienteDTO;
import com.example.App.entities.Cliente;

/**
 *
 * @author Daniel BC 2
 */
class ClienteConverter {

    static ClienteDTO convertToDTO(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static Cliente convertToEntity(ClienteDTO clienteDTO) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    // Ejemplo de uso de los métodos de conversión
Cliente cliente = new Cliente();
// Configura los valores de producto
// Configura los valores de producto

// Convierte la entidad a DTO
ClienteDTO productDTO = ClienteConverter.convertToDTO(cliente);
// Convierte el DTO a entidad

}

