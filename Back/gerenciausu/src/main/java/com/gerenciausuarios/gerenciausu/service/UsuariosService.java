package com.gerenciausuarios.gerenciausu.service;

import com.gerenciausuarios.gerenciausu.dto.UsuariosDTO;
import com.gerenciausuarios.gerenciausu.model.Usuarios;
import com.gerenciausuarios.gerenciausu.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    private UsuariosRepository usuariosRepository;

    public List<UsuariosDTO> FindAll() {
        List<Usuarios> usuarios = usuariosRepository.findAll();
        return usuarios.stream().map(UsuariosDTO::new).toList();
    }

    public UsuariosDTO findById(Long id) {
        return new UsuariosDTO(usuariosRepository.findById(id).get());
    }

    public void create(UsuariosDTO usuariosDTO) {
        Usuarios usuarios = new Usuarios(usuariosDTO);
        usuariosRepository.save(usuarios);
    }

    public UsuariosDTO update(UsuariosDTO usuariosDTO) {
        Usuarios usuarios = new Usuarios(usuariosDTO);
        return new UsuariosDTO(usuariosRepository.save(usuarios));
    }

    public void delete(Long id) {
        Usuarios usuarios = usuariosRepository.findById(id).get();
        usuariosRepository.delete(usuarios);
    }

}
