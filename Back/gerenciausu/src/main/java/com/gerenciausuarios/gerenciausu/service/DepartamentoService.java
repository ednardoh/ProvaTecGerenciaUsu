package com.gerenciausuarios.gerenciausu.service;

import com.gerenciausuarios.gerenciausu.dto.DepartamentoDTO;
import com.gerenciausuarios.gerenciausu.model.Departamento;
import com.gerenciausuarios.gerenciausu.model.exception.DepartamentoNaoEncontradoException;
import com.gerenciausuarios.gerenciausu.model.exception.UsuarioNaoEncontradoException;
import com.gerenciausuarios.gerenciausu.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public List<DepartamentoDTO> FindAll() {
        List<Departamento> departamento = departamentoRepository.findAll();
        return departamento.stream().map(DepartamentoDTO::new).toList();
    }

    public DepartamentoDTO findById(Long id) {
        try{
            return new DepartamentoDTO(departamentoRepository.findById(id).get());
        }catch(Exception e){
            throw new DepartamentoNaoEncontradoException(id.toString());
        }
    }

    public void create(DepartamentoDTO departamentoDTO) {
        Departamento departamento = new Departamento(departamentoDTO);
        departamentoRepository.save(departamento);
    }

    public DepartamentoDTO update(DepartamentoDTO departamentoDTO) {
        try{
            Departamento departamento = new Departamento(departamentoDTO);
            return new DepartamentoDTO(departamentoRepository.save(departamento));
        }catch(Exception e) {
            throw new DepartamentoNaoEncontradoException(departamentoDTO.getId().toString());
        }
    }

    public void delete(Long id) {
        try{
          Departamento recurso = departamentoRepository.findById(id).get();
          departamentoRepository.delete(recurso);
        } catch (Exception e) {
            throw new DepartamentoNaoEncontradoException(id.toString());
        }
    }

}
