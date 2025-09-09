-- data.sql
USE papeleria;

-- Inserciones en categorias
INSERT INTO categorias (nombre, descripcion, activo)
VALUES
  ('Papelería general', 'Útiles escolares y de oficina (lápices, cuadernos, reglas, etc.)', 1),
  ('Material de arte', 'Pinceles, pinturas, papeles especiales y accesorios para dibujo', 1);

-- Inserciones en productos
-- Asegúrate de ajustar categoria_id si cambian los IDs tras inserciones previas
INSERT INTO productos (nombre, sku, precio, stock, categoria_id, activo)
VALUES
  ('Cuaderno colegial 100 hojas', 'CUAD-100H', 35.50, 120, 1, 1),
  ('Set de acuarelas 12 colores', 'ACU-SET12', 120.00, 50, 2, 1);

-- Opcional: verificación rápida
SELECT p.id, p.nombre, p.sku, p.precio, p.stock, c.nombre AS categoria
FROM productos p
JOIN categorias c ON p.categoria_id = c.id;
