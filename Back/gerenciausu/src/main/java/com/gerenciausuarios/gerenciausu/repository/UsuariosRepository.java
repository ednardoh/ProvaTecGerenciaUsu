package com.gerenciausuarios.gerenciausu.repository;

import com.gerenciausuarios.gerenciausu.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {}
