package com.gerenciausuarios.gerenciausu.controller;

import com.gerenciausuarios.gerenciausu.dto.DepartamentoDTO;
import com.gerenciausuarios.gerenciausu.interfaces.IDepartamento;
import com.gerenciausuarios.gerenciausu.service.DepartamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/departamentos")
@CrossOrigin(origins = "*")
public class DepartamentoController implements IDepartamento {

    private DepartamentoService service;
    DepartamentoController(DepartamentoService DepartamentoService) { this.service = DepartamentoService; }


    @GetMapping
    public List<DepartamentoDTO> FindAll() {
        return service.FindAll();
    }

    @GetMapping(path = {"/{id}"})
    public DepartamentoDTO findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    public void create(@RequestBody DepartamentoDTO departamentoDTO) {
        service.create(departamentoDTO);
    }

    @PutMapping
    public DepartamentoDTO update(@RequestBody DepartamentoDTO departamentoDTO) {
        return service.update(departamentoDTO);
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
