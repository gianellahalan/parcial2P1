-- SQL - insert data into the users table --

 INSERT IGNORE INTO table_client (reference, first_name, last_name, email, phone_number, adress, is_active, created_at, updated_at)
 VALUES
 ('17335260-8b65-11ed-a1eb-0242ac120002','Leandro', 'Paredes', 'leaparedes@gmail.com', '298521545', 'Av. San Martin 16', true, NOW(), NOW()),
 ('173354c2-8b65-11ed-a1eb-0242ac120002','Alexis', 'MacAllister', 'alemacca@gmail.com', '264758595', 'Belgrano 288', true, NOW(), NOW()),
 ('17334fcc-8b65-11ed-a1eb-0242ac120002','Lisandro', 'Martinez', 'lichamtz@gmail.com', '2966351245', 'Juan Manuel de Rosas 5', true, NOW(), NOW()),
 ('17335396-8b65-11ed-a1eb-0242ac120002','Lionel', 'Messi', 'leomessi@gmail.com', '246957856', '9 de Julio 1269', true, NOW(), NOW());
