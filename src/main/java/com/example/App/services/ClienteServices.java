package com.example.App.services;

import com.example.App.DTO.ClienteDTO;
import com.example.App.entities.Cliente;
import com.example.App.repositories.ClienteRepository;

import java.util.List;
import java.util.stream.Collectors;

import com.example.App.services.converters.ClienteConverter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository clienteRepository ;
    
       public ClienteDTO getClienteDTO(Long id) {
         return ClienteConverter.convertToDTO(clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado")));
    }
       @GetMapping("/add")
    public List<ClienteDTO> getAllCliente() {
        List<Cliente> products = clienteRepository.findAll();
        return products.stream()
                .map(ClienteConverter::convertToDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    public ClienteDTO createCliente(ClienteDTO clienteDTO) {
        Cliente cliente = ClienteConverter.convertToEntity(clienteDTO);
        cliente = clienteRepository.save(cliente);
        return ClienteConverter.convertToDTO(cliente);
    }

    @Transactional
    public ClienteDTO updateCliente(Long id, Cliente clienteDTO) {
        Cliente existingcliente= clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        existingcliente.setCodigo(clienteDTO.getCodigo());
        existingcliente.setNombres(clienteDTO.getNombres());
        existingcliente.setApellidos(clienteDTO.getApellidos());
        existingcliente.setCedula(clienteDTO.getCedula());
        existingcliente.setEdad(clienteDTO.getEdad());
        existingcliente.setTelefono(clienteDTO.getTelefono());
        existingcliente.setFecha_nacimiento(clienteDTO.getFecha_nacimiento());

        existingcliente = clienteRepository.save(existingcliente);

        return ClienteConverter.convertToDTO(existingcliente);
    }

    @Transactional
    public void deletecliente(Long id) {
        Cliente existingcliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        clienteRepository.delete(existingcliente);
    }


}
