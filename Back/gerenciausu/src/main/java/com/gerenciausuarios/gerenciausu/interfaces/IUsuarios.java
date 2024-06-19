package com.gerenciausuarios.gerenciausu.interfaces;

import com.gerenciausuarios.gerenciausu.dto.UsuariosDTO;
import com.gerenciausuarios.gerenciausu.model.Usuarios;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IUsuarios {

    public List<UsuariosDTO> FindAll();
    public UsuariosDTO findById(@PathVariable long id);
    public void create(@RequestBody UsuariosDTO usuariosDTO);
    public UsuariosDTO update(@RequestBody UsuariosDTO usuariosDTO);
    public ResponseEntity<Void> delete(@PathVariable("id") Long id);

}
