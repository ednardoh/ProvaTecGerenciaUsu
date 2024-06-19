package com.gerenciausuarios.gerenciausu.model.exception;

import com.gerenciausuarios.gerenciausu.framework.globalExceptionHandling.NotFoundException;

public class DepartamentoNaoEncontradoException extends NotFoundException {
    public DepartamentoNaoEncontradoException(String Departamento) {
        super("001", String.format("Departamento %s não encontrado", Departamento));
    }
}
