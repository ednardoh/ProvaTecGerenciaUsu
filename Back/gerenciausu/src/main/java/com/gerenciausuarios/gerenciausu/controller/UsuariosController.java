package com.gerenciausuarios.gerenciausu.controller;

import com.gerenciausuarios.gerenciausu.dto.UsuariosDTO;
import com.gerenciausuarios.gerenciausu.interfaces.IUsuarios;
import com.gerenciausuarios.gerenciausu.service.UsuariosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuarios")
@CrossOrigin(origins = "*")
public class UsuariosController implements IUsuarios {

    private UsuariosService service;
    UsuariosController(UsuariosService usuariosService) { this.service = usuariosService; }

    @GetMapping
    public List<UsuariosDTO> FindAll() {
        return service.FindAll();
    }

    @GetMapping(path = {"/{id}"})
    public UsuariosDTO findById(@PathVariable Long id) {
        return service.findById(id);
    }


    @PostMapping
    public void create(@RequestBody UsuariosDTO usuariosDTO) {
        service.create(usuariosDTO);
    }

    @PutMapping
    public UsuariosDTO update(@RequestBody UsuariosDTO usuariosDTO) {
        return service.update(usuariosDTO);
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
