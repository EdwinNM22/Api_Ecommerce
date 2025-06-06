

-- 2. Insertar usuarios
INSERT INTO usuario (nombre, email, password, celular, rol, edad) VALUES
('Juan Pérez', 'juan@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70112233', 'USER', 11),
('Ana López', 'ana@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '71223344', 'USER', 32),
('Kevin Alvarenga', 'kevin@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '71223344', 'ADMIN',12),
('Mario Castalleda', 'mario@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '71223344', 'USER',32),
('Carlos Méndez', 'carlos@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70001122', 'USER', 25),
('Lucía Rodríguez', 'lucia@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70112234', 'USER', 22),
('Pedro Martínez', 'pedro@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70113355', 'ADMIN', 35),
('Elena Gómez', 'elena@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70114466', 'USER', 28),
('Ricardo Díaz', 'ricardo@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70115577', 'USER', 31),
('María Hernández', 'maria@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70116688', 'USER', 24),
('Jorge Ruiz', 'jorge@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70117799', 'ADMIN', 30),
('Sandra Mejía', 'sandra@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70118800', 'USER', 27),
('Andrés Morales', 'andres@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70119911', 'USER', 26),
('Paola Castillo', 'paola@example.com', '$2a$10$ccDlhlXyntzOH/qzFsPjOOGEcOYXurNUE0PtYiTihtTGvS7lSY/ry', '70120022', 'USER', 23);


-- 3. Insertar categorías
INSERT INTO Categoria (nombre) VALUES
('Electrónica'),
('Ropa');

-- 4. Insertar productos
-- Insertar productos
INSERT INTO Producto (nombre, precio, stock) VALUES
('Laptop', 750.00, 10),
('Camiseta', 15.99, 50),
('Televisor 50"', 430.00, 5),
('Zapatos de cuero', 60.00, 20),
('Arroz 5kg', 8.50, 100),
('Muñeca interactiva', 25.00, 30),
('Libro de Ciencia', 12.75, 40),
('Vestido de noche', 80.00, 15),
('Taladro eléctrico', 55.90, 12),
('Pan dulce', 1.50, 200),
('Smartphone', 300.00, 8),
('Short deportivo', 18.00, 35),
('Alimento para perro 10kg', 22.00, 25),
('Bebida energética', 2.00, 60);


-- 5. Insertar tiendas
-- Insertar tiendas
INSERT INTO Tienda (nombre, direccion, idUsuario) VALUES
('Tech Store', 'Av. Siempre Viva 123', 1),
('Fashion Point', 'Calle Falsa 456', 2),
('ElectroWorld', 'Boulevard Central 789', 3),
('Zapatería Elegante', 'Calle Real 321', 4),
('Super Abarrotes', 'Avenida Comercio 555', 5),
('Juguetería Mágica', 'Calle Alegría 101', 6),
('Librería Central', 'Av. Universidad 202', 7),
('La Boutique Rosa', 'Paseo del Sol 303', 8),
('Ferretería El Tornillo', 'Calle Industria 404', 9),
('Delicias Panadería', 'Avenida Pan 505', 10),
('Celulares y Más', 'Calle Tecnología 606', 11),
('Ropa Deportiva Fit', 'Boulevard Fitness 707', 12),
('Veterinaria Amigos Peludos', 'Av. Mascotas 808', 13),
('La Tiendita Express', 'Calle Rápida 909', 14);

-- 6. Insertar pedidos
INSERT INTO Pedido (fecha, estado, IdUsuario, idTienda) VALUES
('2024-04-10', 'En proceso', 2, 1),
('2024-04-11', 'Completado', 2, 2);

-- 7. Insertar detalles
INSERT INTO Detalle (cantidad, precioUnitario, idPedido, idProducto) VALUES
(1, 750.00, 1, 1),
(2, 15.99, 2, 2);

-- 8. Insertar facturas
INSERT INTO Factura (fechaEmision, total, idPedido, IdUsuario) VALUES
('2024-04-10', 750.00, 1, 2),
('2024-04-11', 31.98, 2, 2);
