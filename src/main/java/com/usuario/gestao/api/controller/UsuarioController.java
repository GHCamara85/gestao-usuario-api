package com.usuario.gestao.api.controller;

import com.usuario.gestao.api.model.UsuarioModel;
import com.usuario.gestao.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    public UsuarioModel createUser(@RequestBody UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }
    @GetMapping
    public List<UsuarioModel> findAll(){
     return usuarioRepository.findAll();
    }

}
