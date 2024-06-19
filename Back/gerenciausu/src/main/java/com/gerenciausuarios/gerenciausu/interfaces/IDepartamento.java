package com.gerenciausuarios.gerenciausu.interfaces;

import com.gerenciausuarios.gerenciausu.dto.DepartamentoDTO;
import com.gerenciausuarios.gerenciausu.model.Departamento;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IDepartamento {

    public List<DepartamentoDTO> FindAll();
    public DepartamentoDTO findById(@PathVariable long id);
    public void create(@RequestBody DepartamentoDTO departamentoDTO);
    public DepartamentoDTO update(@RequestBody DepartamentoDTO departamentoDTO);
    public ResponseEntity<Void> delete(@PathVariable("id") Long id);


}
