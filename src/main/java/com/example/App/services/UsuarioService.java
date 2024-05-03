package com.example.App.services;

import com.example.App.DTO.UsuarioDTO;
import com.example.App.entities.Usuario;
import com.example.App.repositories.UsuarioRepository;
import com.example.App.services.converters.UsuarioConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    public List<UsuarioDTO> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();

        return usuarios.stream().map(usuario -> UsuarioConverter.usuarioToDTO(usuario)).collect(Collectors.toList());
    }

    public UsuarioDTO getUsuarioById(Long id) {
        Usuario usuario = usuarioRepository.findById(id).orElse(new Usuario());
        return UsuarioConverter.usuarioToDTO(usuario);
    }

    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioConverter.DTOToUsuario(usuarioDTO);
        usuario = usuarioRepository.save(usuario);
        return UsuarioConverter.usuarioToDTO(usuario);
    }

    public UsuarioDTO updateUsuario(Long id, UsuarioDTO usuarioDTO) {
        Usuario existingUsuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
//ESTA MALO 
        existingUsuario.setNombre(usuarioDTO.getNombre());
        existingUsuario.setApellido(usuarioDTO.getApellido());
        existingUsuario.setPassword(usuarioDTO.getPassword());
        existingUsuario.setUser_name(usuarioDTO.getUser_name());
        existingUsuario.setTrabajo(usuarioDTO.getTrabajo());
        existingUsuario.setEmail(usuarioDTO.getEmail());
        existingUsuario.setDepartamento(usuarioDTO.getDepartamento());

        existingUsuario = usuarioRepository.save(existingUsuario);
//ESTA MALO 
        return UsuarioConverter.usuarioToDTO(existingUsuario);
    }

    public void deleteUsuario(Long id) {
        Usuario existingUsuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuarioRepository.delete(existingUsuario);
    }
}

