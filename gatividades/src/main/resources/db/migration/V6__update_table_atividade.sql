-- This script assumes the previous migrations have run and are correct.
ALTER TABLE atividades
ADD CONSTRAINT fk_cliente
FOREIGN KEY (id_cliente)
REFERENCES clientes (id);

ALTER TABLE atividades
ADD CONSTRAINT fk_usuario
FOREIGN KEY (usuario_id)
REFERENCES usuarios (id);
