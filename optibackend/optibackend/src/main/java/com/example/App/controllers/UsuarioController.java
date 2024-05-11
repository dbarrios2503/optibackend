package com.example.App.controllers;

import com.example.App.entities.Departamento;
import com.example.App.entities.Rol;
import com.example.App.entities.Usuario;
import com.example.App.services.DepartamentoService;
import com.example.App.services.RolService;
import com.example.App.services.UsuarioService;
import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/usuario/")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private RolService rolService; // Inyectar RolService

    @Autowired
    private DepartamentoService departamentoService; // Inyectar DepartamentoService

    @PostMapping
    private ResponseEntity<Usuario> guardar (@RequestBody Usuario usuario){
        // Obtener el departamento por su ID
        Optional<Departamento> departamentoOptional = departamentoService.obtenerDepartamentoPorCodigo(usuario.getDepartamento().getId_Departamento());
        // Obtener el rol por su ID
        Optional<Rol> rolOptional = rolService.obtenerRolPorId(usuario.getRolUsuario().getId_rol());

        if (departamentoOptional.isPresent() && rolOptional.isPresent()) {
            usuario.setDepartamento(departamentoOptional.get());
            usuario.setRolUsuario(rolOptional.get());

            Usuario temporal = usuarioService.create(usuario);

            try {
                return ResponseEntity.created(new URI("api/usuario/" + temporal.getId_Usuario())).body(temporal);
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build(); // Manejar el caso donde el departamento o el rol no existen
        }
    }

    
    @GetMapping
    private ResponseEntity<List<Usuario>> listartodoslosusuarios (){
        return ResponseEntity.ok(usuarioService.getAllUsuarios());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarsusuario(@PathVariable Long id) {
        usuarioService.deleteById(id);
        return ResponseEntity.ok().build();
}
    
    @GetMapping (value="{Id_Usuario}")
    private ResponseEntity<Optional<Usuario>> listarporId (@PathVariable ("Id_Usuario") long Id_Usuario){
        return ResponseEntity.ok(usuarioService.findByid_Usuario(Id_Usuario)); 
        
    }
    
    @PutMapping("/{id}")
    private ResponseEntity<Usuario> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        Usuario usuarioActualizado = usuarioService.actualizarUsuario(id, usuario);
        return new ResponseEntity<>(usuarioActualizado, HttpStatus.OK);
    }
    
    

}