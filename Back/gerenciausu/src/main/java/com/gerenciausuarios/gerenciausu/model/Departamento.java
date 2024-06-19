package com.gerenciausuarios.gerenciausu.model;

import com.gerenciausuarios.gerenciausu.dto.DepartamentoDTO;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.BeanUtils;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="departamento")
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    public Departamento(DepartamentoDTO departamentodto) {
        BeanUtils.copyProperties(departamentodto, this);
    }

}
