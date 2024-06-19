package com.gerenciausuarios.gerenciausu.dto;

import com.gerenciausuarios.gerenciausu.model.Departamento;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class DepartamentoDTO {
    private Long id;
    private String descricao;

    public DepartamentoDTO(Departamento departamento) {
        BeanUtils.copyProperties(departamento,this);
    }

}
