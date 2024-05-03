package com.example.App.services.converters;

import com.example.App.DTO.UsuarioDTO;
import com.example.App.entities.Usuario;

public class UsuarioConverter {
    public static UsuarioDTO usuarioToDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setApellido(usuario.getApellido());
        usuarioDTO.setTrabajo(usuario.getTrabajo());
        usuarioDTO.setEmail(usuario.getEmail());
        usuarioDTO.setPassword(usuario.getPassword());
        usuarioDTO.setUser_name(usuario.getUser_name());
        usuarioDTO.setDepartamento(usuario.getDepartamento());
        return usuarioDTO;
    }
    public static Usuario DTOToUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido(usuarioDTO.getApellido());
        usuario.setTrabajo(usuarioDTO.getTrabajo());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setPassword(usuarioDTO.getPassword());
        usuario.setUser_name(usuarioDTO.getUser_name());
        usuario.setDepartamento(usuarioDTO.getDepartamento());
        return usuario;
    }
}
