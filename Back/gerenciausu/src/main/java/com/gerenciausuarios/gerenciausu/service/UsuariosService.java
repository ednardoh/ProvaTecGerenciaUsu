package com.gerenciausuarios.gerenciausu.service;

import com.gerenciausuarios.gerenciausu.dto.UsuariosDTO;
import com.gerenciausuarios.gerenciausu.model.Usuarios;
import com.gerenciausuarios.gerenciausu.model.exception.UsuarioNaoEncontradoException;
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
        try {
            return new UsuariosDTO(usuariosRepository.findById(id).get());
        } catch (Exception e) {
            throw new UsuarioNaoEncontradoException(id.toString());
        }
    }

    public void create(UsuariosDTO usuariosDTO) {
        Usuarios usuarios = new Usuarios(usuariosDTO);
        usuariosRepository.save(usuarios);
    }

    public UsuariosDTO update(UsuariosDTO usuariosDTO) {
        try{
            Usuarios usuarios = new Usuarios(usuariosDTO);
            return new UsuariosDTO(usuariosRepository.save(usuarios));
        } catch(Exception e) {
            throw new UsuarioNaoEncontradoException(usuariosDTO.getId().toString());
        }
    }

    public void delete(Long id) {
        try{
            Usuarios usuarios = usuariosRepository.findById(id).get();
            usuariosRepository.delete(usuarios);
        } catch(Exception e) {
            throw new UsuarioNaoEncontradoException(id.toString());
        }
    }

}
