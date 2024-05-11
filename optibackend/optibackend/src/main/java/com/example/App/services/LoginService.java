/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.App.services;

import com.example.App.entities.Usuario;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class LoginService {
    @Autowired
    private UsuarioService usuarioService;

    public boolean authenticate(String username, String password) {
        Optional<Usuario> userOptional = usuarioService.findByUserName(username);
        
        if (userOptional.isPresent()) {
            Usuario usuario = userOptional.get();
            return usuario.getPassword().equals(password);
        }
        
        return false;
    }
}