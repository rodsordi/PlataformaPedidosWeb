CREATE schema if not exists galerinha;

drop table if exists galerinha.Pedido_Produto;
drop table if exists galerinha.Pedido;
drop table if exists galerinha.Produto;
drop table if exists galerinha.Usuario;

create table if not exists galerinha.Usuario (
    id int AUTO_INCREMENT,
    nome varchar(50) not null,
    dt_nasc date not null,
    email varchar(50) not null unique,
    senha varchar(6) not null,
    dthr_criacao datetime not null,
    dthr_ultimo_acesso datetime,
    PRIMARY KEY (id)
);

create table if not exists galerinha.Pedido (
    id int AUTO_INCREMENT,
    valor decimal(5,2) not null,
    dthr_criacao datetime not null,
	id_usuario int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (id_usuario) REFERENCES galerinha.Usuario(id)
);

create table if not exists galerinha.Produto (
    id int AUTO_INCREMENT,
    nome varchar(50) not null,
    qtd_estoque int not null,
    valor decimal(5,2) not null,
    PRIMARY KEY (id)
);

create table if not exists galerinha.Pedido_Produto (
    id int AUTO_INCREMENT,
    id_pedido int not null,
    id_produto int not null,
    qtd_produto int not null,
    PRIMARY KEY (id),
    FOREIGN KEY (id_pedido) REFERENCES galerinha.Pedido(id),
    FOREIGN KEY (id_produto) REFERENCES galerinha.Produto(id)
);