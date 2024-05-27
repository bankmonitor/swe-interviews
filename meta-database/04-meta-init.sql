DELETE FROM customer;
DELETE FROM fieldhistory;

-- Insert a customer.

INSERT INTO customer (id) VALUES (1);
INSERT INTO fieldhistory 
(object_type, object_id,field_name, field_value_int, field_value_str) VALUES 
('CUSTOMER', 1, 'first_name', NULL, 'John'),
('CUSTOMER', 1, 'last_name', NULL, 'Doe');


-- Insert another customer.
INSERT INTO customer (id) VALUES (2);
INSERT INTO fieldhistory 
(object_type, object_id,field_name, field_value_int, field_value_str) VALUES 
('CUSTOMER', 2, 'first_name', NULL, 'Jessy'),
('CUSTOMER', 2, 'last_name', NULL, 'Madison');


-- Update a customer.
INSERT INTO fieldhistory 
(object_type, object_id,field_name, field_value_int, field_value_str) VALUES 
('CUSTOMER', 2, 'age', 32, NULL);


-- Update again the customer.
INSERT INTO fieldhistory 
(object_type, object_id,field_name, field_value_int, field_value_str) VALUES 
('CUSTOMER', 2, 'age', 35, NULL);
