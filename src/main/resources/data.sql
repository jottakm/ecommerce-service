-- Default categories --
INSERT IGNORE INTO categories (id, name, description) VALUES ('4563eb53-8a93-4c2d-9415-27c6a010fda1', 'TRAVEL', 'Mochillas para viajar');
INSERT IGNORE INTO categories (id, name, description) VALUES ('171503f8-d472-412c-ba79-e545fc019b02', 'SCHOOL', 'Mochillas para la escuela');
INSERT IGNORE INTO categories (id, name, description) VALUES ('918bafdf-8cb4-4812-b195-3af53c835aff', 'SPORT', 'Mochillas deportivas');
INSERT IGNORE INTO categories (id, name, description) VALUES ('6e8d7398-bb18-458d-9ded-86bd6d4ad587', 'WORK', 'Mochillas para el trabajo');

-- Default roles --
INSERT IGNORE INTO roles (id, name, description) VALUES ('a1b6d042-1be4-4907-9814-daf110a473f9', 'USER', 'Role user');
INSERT IGNORE INTO roles (id, name, description) VALUES ('94dcfd3f-2367-4ab4-bd81-4b6764513dc5', 'ADMIN', 'Role admin');

-- Default users --
INSERT IGNORE INTO users (id, first_name, last_name, email, password, address, role_id) VALUES ('019f1459-2ba9-4e50-8790-b77f2dbe3edb', 'Juan', 'Perez', 'admin@gmail.com', '12345', 'La Paz', '94dcfd3f-2367-4ab4-bd81-4b6764513dc5');
INSERT IGNORE INTO users (id, first_name, last_name, email, password, address, role_id) VALUES ('7c083cd5-3919-4c23-a136-fac659b23c96', 'Ana', 'Perez', 'user@gmail.com', '12345', 'El Alto', 'a1b6d042-1be4-4907-9814-daf110a473f9');

-- Default Products --
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('a0448696-54ac-4d15-b954-ba73c6d86755', 'Product A', 'Description del producto A','https://image.png',59.99,130,true,'4563eb53-8a93-4c2d-9415-27c6a010fda1');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('a0448696-54ac-4d15-b954-ba73c6d86755', 'Product A', 'Description del producto A','https://image.png',59.99,130,true,'4563eb53-8a93-4c2d-9415-27c6a010fda1');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('c04344326-54ac-4d15-b954-ba73c6d86755', 'Mouse', 'Mouse para Equipo de Computación A','https://image.png',59.99,130,true,'7563eb53-8a93-4c2d-9415-27c6a010fda1');
--INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('a0448696-54ac-4d15-b954-ba73c6d86755', 'Mochila Venus', 'IVAN SUXO CHOQUE ','https://image.png',55.85,250,true,'4563eb53-8a93-4c2d-9415-27c6a010fda1',25.5,20,true,’6e8d7398-bb18-458d-9ded-86bd6d4ad587’);
--INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES (2f486bb5-5c15-4e5c-9655-961d53d2fe0a', 'Pegasus', 'Elvis Acarapi Mamani','https://image.png',59.99,130,true,'918bafdf-8cb4-4812-b195-3af53c835aff');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('8a4b7c3d-2e3b-4a96-b488-f55e2020cb1c', 'Mochila Nike', 'Miguel Copa Torrez','https://image.png',350.49,250,true,'918bafdf-8cb4-4812-b195-3af53c835aff');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('28b665ea-b833-449c-8ef3-79160e2d3f52', 'Mochila JanSport', 'Omar Torrez Peñaloza','https://image.png',499.99,1000,true,'6e8d7398-bb18-458d-9ded-86bd6d4ad587');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('4480a440-0d31-4f29-9b5f-21b1faec6b05', 'Product Z', 'Rene Gudmundsson','https://image.png',59.99,130,true,'171503f8-d472-412c-ba79-e545fc019b02');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('5c8b58f3-0d26-4c82-8b70-8514f77f9939', 'Product X', 'Rene Gudmundsson','https://image.png',59.99,130,true,'918bafdf-8cb4-4812-b195-3af53c835aff');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('1330bd70-818c-4f86-a18a-30df844442cf', 'Product Y', 'Rene Gudmundsson','https://image.png',59.99,130,true,'6e8d7398-bb18-458d-9ded-86bd6d4ad587');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('1de37dbc-c246-47b0-90f9-7a2cd306d957', 'Product Z', 'Jorge Ocampo Cerezo','https://image.png',100.0,20,true,'171503f8-d472-412c-ba79-e545fc019b02');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('37f31174-eedb-45f5-acb6-dd0f6bf54fea', 'Mochila de cuero', 'Gonzalo Meruvia R.','https://image.png',980.00,8,true,'4563eb53-8a93-4c2d-9415-27c6a010fda1');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('e904a31e-ff78-4640-a46c-68044831def4', 'Mochila de viaje color amarillo', 'Gonzalo Meruvia R.','https://image.png',560.00,3,true,'4563eb53-8a93-4c2d-9415-27c6a010fda1');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('8528443d-b1d0-4619-adc0-18fb5a56d383', 'Mochila con ruedas', 'Gonzalo Meruvia R.','https://image.png',350.00,2,true,'171503f8-d472-412c-ba79-e545fc019b02');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('0554c8e1-3b92-4117-baf0-cd1024c554d4', 'Riñonera Nike', 'victor zurita merida A','https://image.png',23.4,130,true,'4563eb53-8a93-4c2d-9415-27c6a010fda1');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('5c8762ba-e728-4d91-8dcf-760475c942a9', 'Lapicero pilot', 'victor zurita merida A','https://image.png',5.20,130,true,'171503f8-d472-412c-ba79-e545fc019b02');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('315ca05e-0e82-4629-b223-c7920e265f27', 'Mochila de senderismo', 'Ramiro Velasco','https://image.png',59.99,10,true,'918bafdf-8cb4-4812-b195-3af53c835aff');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('dfbc0565-e565-4302-8e71-a5291e9fe644', 'Product U', 'Rene Gudmundsson','https://image.png',59.99,130,true,'918bafdf-8cb4-4812-b195-3af53c835aff');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('12ec01a4-0217-4960-9f66-d791006764e3', 'Product V', 'Rene Gudmundsson','https://image.png',59.99,130,true,'171503f8-d472-412c-ba79-e545fc019b02');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('22813855-6ae1-4889-a197-6792ccb4fae5', 'Product W', 'Rene Gudmundsson','https://image.png',59.99,130,true,'918bafdf-8cb4-4812-b195-3af53c835aff');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('2d877d08-b640-4a40-baba-1ca59d15e132', 'Product H', 'Rene Gudmundsson','https://image.png',59.99,130,true,'6e8d7398-bb18-458d-9ded-86bd6d4ad587');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('55ef44df-4962-45e3-9e52-69c2912ca77f', 'Product Q', 'Rene Gudmundsson','https://image.png',59.99,130,true,'171503f8-d472-412c-ba79-e545fc019b02');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('f76f6f78-3e5b-4485-8951-27adc0b2c802', 'Product R', 'Rene Gudmundsson','https://image.png',59.99,130,true,'4563eb53-8a93-4c2d-9415-27c6a010fda1');
INSERT IGNORE INTO products (id, name, description, image_url, price, stock, active, category_id) VALUES ('86b9d991-8850-430e-843e-2aee35cc0e84', 'Mochila para laptop 17"', 'Juan Carlos Plaza Mendez','https://image.png',70.00,130,true,'6e8d7398-bb18-458d-9ded-86bd6d4ad587');
