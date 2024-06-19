package com.gerenciausuarios.gerenciausu.model;

import com.gerenciausuarios.gerenciausu.dto.UsuariosDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@Entity
@Table(name = "usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_departamento") //departamento
    private Departamento departamentoEntity;

    @Column(name="username")
    private String UserName;
    @Column(name="senha")
    private String Senha;
    @Column(name="email")
    private String Email;
    @Column(name="bloquar")
    private Boolean Bloquear;
    @Column(name="permissao_cadclientes")
    private Boolean PermissaoCadClientes;
    @Column(name="permissao_cadproduto")
    private Boolean PermissaoCadProduto;
    @Column(name="permissao_cadendereco")
    private Boolean PermissaoCadEndereco;
    @Column(name="Permissao_pedido_venda")
    private Boolean PermissaoPedidoVenda;
    @Column(name="permissao_pedido_compra")
    private Boolean PermissaoPedidoCompra;

    public Usuarios(UsuariosDTO usuariosdto) {
        BeanUtils.copyProperties(usuariosdto,this);
        if (usuariosdto != null && usuariosdto.getDepartamentodto() != null) {
            //this.departamentoEntity = new Departamento(usuariosdto.getDepartamentodto());
        }
    }

    public Usuarios() {}

}
