package com.gerenciausuarios.gerenciausu.repository;

import com.gerenciausuarios.gerenciausu.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {}
