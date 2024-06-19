CREATE TABLE usuarios
(
    id serial,
    id_departamento bigint NOT NULL,
    username character varying(100),
    senha character varying(30),
    email character varying(60),
    bloquear boolean,
    permissao_cadclientes boolean,
    permissao_cadproduto boolean,
    permissao_cadendereco boolean,
    permissao_pedido_venda boolean,
    permissao_pedido_compra boolean,
	FOREIGN KEY (id_departamento) REFERENCES departamento (id)
);