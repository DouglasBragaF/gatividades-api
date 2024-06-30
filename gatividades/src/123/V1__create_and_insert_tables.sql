-- Criação da tabela usuario
CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    id_setor INT NOT NULL,
    isGerente BOOLEAN NOT NULL
);

-- Inserir exemplos de dados na tabela usuario
INSERT INTO usuario (nome, email, id_setor, isGerente) VALUES 
('João Silva', 'joao.silva@example.com', 1, FALSE),
('Maria Oliveira', 'maria.oliveira@example.com', 2, TRUE),
('Carlos Souza', 'carlos.souza@example.com', 3, FALSE),
('Ana Pereira', 'ana.pereira@example.com', 4, TRUE),
('Lucas Fernandes', 'lucas.fernandes@example.com', 5, FALSE);

-- Criação da tabela clientes
CREATE TABLE clientes (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    cnpj VARCHAR(18) NOT NULL,
    contato VARCHAR(255) NOT NULL
);

-- Criação da tabela atividades
CREATE TABLE atividades (
    id SERIAL PRIMARY KEY,
    data DATE NOT NULL,
    hora_inicio TIME NOT NULL,
    hora_fim TIME NOT NULL,
    projeto VARCHAR(255) NOT NULL,
    id_cliente INT NOT NULL,
    atividade VARCHAR(255) NOT NULL,
    observacao TEXT NOT NULL,
    CONSTRAINT fk_cliente FOREIGN KEY (id_cliente) REFERENCES clientes(id)
);
