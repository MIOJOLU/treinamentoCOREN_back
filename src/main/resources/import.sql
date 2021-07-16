INSERT INTO cliente (id, nome) VALUES (0,'Eletrônicos Eletro');
INSERT INTO cliente (id, nome) VALUES (1,'Smart Compras');

INSERT INTO produto (id, nome, valor) VALUES (0,'Notebook', 2950.0);
INSERT INTO produto (id, nome, valor) VALUES (1,'Smartphone', 1800.0);
INSERT INTO produto (id, nome, valor) VALUES (2,'Tablet', 1100.0);

INSERT INTO venda (id, cliente_id, frete, total, cadastro) VALUES (1, 1, 15.0, 2965.0, sysdate());
INSERT INTO item (id,venda_id, produto_id, quantidade) VALUES (1,1,1,1);