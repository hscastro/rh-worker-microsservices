INSERT INTO tb_user(name, email, password) VALUES ('Emanuela','emanuela@gmail.com','$2a$10$OLl/VIb94F6xgw4.ixBotuOiGNpGKOlH/wsRr6ReL6y/TC/ZT1SG2');
INSERT INTO tb_user(name, email, password) VALUES ('Halyson','halysonsc@gmail.com','$2a$10$OLl/VIb94F6xgw4.ixBotuOiGNpGKOlH/wsRr6ReL6y/TC/ZT1SG2');

INSERT INTO tb_roles(role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_roles(role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role(user_id, role_id) VALUES (1,1);
INSERT INTO tb_user_role(user_id, role_id) VALUES (2,1);
INSERT INTO tb_user_role(user_id, role_id) VALUES (2,2);
