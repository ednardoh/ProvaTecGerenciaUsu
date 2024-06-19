package com.gerenciausuarios.gerenciausu.model.exception;

import com.gerenciausuarios.gerenciausu.framework.globalExceptionHandling.NotFoundException;

public class UsuarioNaoEncontradoException extends NotFoundException {
    public UsuarioNaoEncontradoException(String usuario) {
        super("001", String.format("Usuário %s não encontrado", usuario));
    }
}
