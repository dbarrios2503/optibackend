/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.Service;

import com.example.App.DTO.ClienteDTO;
import com.example.App.entities.Cliente;
import com.example.App.repositories.ClienteRepository;

import java.util.List;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Daniel BC 2
 */
public class ClienteServices {
    @Autowired
 
    private ClienteRepository clienteRepository ;
    
       public ClienteDTO getClienteDTO(Long id) {
        // Recupera la entidad del repositorio
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        // Convierte la entidad a DTO y devuelve
         return ClienteConverter.convertToDTO(cliente );
    }
       @GetMapping("/add")
// Método para obtener todos los productos y devolver una lista de DTOs
    public List<ClienteDTO> getAllCliente() {
        // Recupera todas las entidades del repositorio
        List<Cliente> products = clienteRepository.findAll();
        // Convierte las entidades a DTOs y devuelve
        return products.stream()
                .map(ClienteConverter::convertToDTO)
                .collect(Collectors.toList());
    }

    // Método para crear un nuevo producto a partir de un DTO
    @Transactional
    public ClienteDTO createCliente(ClienteDTO clienteDTO) {
        // Convierte el DTO a entidad
        Cliente cliente = ClienteConverter.convertToEntity(clienteDTO);
        // Guarda la entidad en la base de datos
        cliente = clienteRepository.save(cliente);
        // Convierte la entidad guardada a DTO y devuelve
        return ClienteConverter.convertToDTO(cliente);
    }

    // Método para actualizar un producto existente a partir de un DTO
    @Transactional
    public ClienteDTO updateCliente(Long id, Cliente clienteDTO) {
        // Verifica si el producto existe
        Cliente existingcliente= clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        // Actualiza los campos del producto existente con los del DTO
        existingcliente.setCodigo(clienteDTO.getCodigo());
        existingcliente.setNombres(clienteDTO.getNombres());
        existingcliente.setApellidos(clienteDTO.getApellidos());
        existingcliente.setCedula(clienteDTO.getCedula());
        existingcliente.setEdad(clienteDTO.getEdad());
        existingcliente.setTelefono(clienteDTO.getTelefono());
        existingcliente.setFecha_nacimiento(clienteDTO.getFecha_nacimiento());
        // Puedes actualizar otros campos según sea necesario

        // Guarda la entidad actualizada en la base de datos
        existingcliente = clienteRepository.save(existingcliente);

        // Convierte la entidad actualizada a DTO y devuelve
        return ClienteConverter.convertToDTO(existingcliente);
    }

    // Método para eliminar un producto por ID
    @Transactional
    public void deletecliente(Long id) {
        // Verifica si el producto existe
        Cliente existingcliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        // Elimina el producto del repositorio
        clienteRepository.delete(existingcliente);
    }


}
