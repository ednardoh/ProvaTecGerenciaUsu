package com.gerenciausuarios.gerenciausu.dto;

import com.gerenciausuarios.gerenciausu.model.Departamento;
import com.gerenciausuarios.gerenciausu.model.Usuarios;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
public class UsuariosDTO {
    private Long id;
    private Departamento departamentodto;
    private String UserName;
    private String Senha;
    private String Email;
    private Boolean Bloquear;
    private Boolean PermissaoCadClientes;
    private Boolean PermissaoCadProduto;
    private Boolean PermissaoCadEndereco;
    private Boolean PermissaoPedidoVenda;
    private Boolean PermissaoPedidoCompra;

    public UsuariosDTO(Usuarios usuariosentity) {
        BeanUtils.copyProperties(usuariosentity,this);
        if (usuariosentity != null && usuariosentity.getDepartamentoEntity() != null ) {
            //this.departamentodto = new UsuariosDTO(usuariosentity.getDepartamentoEntity());
        }
    }

    public UsuariosDTO() {}

}
