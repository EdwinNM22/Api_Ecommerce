-- 1. Insertar roles
INSERT INTO Rol (nombre) VALUES 
('Administrador'),
('Cliente');

-- 2. Insertar usuarios
INSERT INTO Usuario (nombre, correo, password, Celular, idRol) VALUES 
('Juan Pérez', 'juan@example.com', '123456', '70112233', 1),
('Ana López', 'ana@example.com', 'abcdef', '71223344', 2);

-- 3. Insertar categorías
INSERT INTO Categoria (nombre) VALUES 
('Electrónica'),
('Ropa');

-- 4. Insertar productos
INSERT INTO Producto (nombre, precio, stock, idCategoria) VALUES 
('Laptop', 750.00, 10, 1),
('Camiseta', 15.99, 50, 2);

-- 5. Insertar tiendas
INSERT INTO Tienda (nombre, direccion, idUsuario) VALUES 
('Tech Store', 'Av. Siempre Viva 123', 1),
('Fashion Point', 'Calle Falsa 456', 1);

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
