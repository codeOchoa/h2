INSERT INTO clients (id, name, lastname, docnumber);
VALUES
(98465123, 'Pablo', 'Ochoa', '42598416');

INSERT INTO products (id, description, code, stock, price);
VALUES
(90000001, 'High conversion rate & high efficiency', 'SFCP0001', 99, 399);

INSERT INTO invoice (id, client_id, created_at, total);
VALUES
(48752690, 98465123, '2025-02-11 23:14:00', 399);

INSERT INTO invoice_details (invoice_id, invoice_detail_id, amount, product_id, price);
VALUES
(48752690, 41231698, 2, 90000001, 798);
