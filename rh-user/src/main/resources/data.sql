INSERT INTO tb_user(name, email, password) VALUES ('Emanuela','emanuela@gmail.com','$2a$10$WW7Bqp/qAfcMIhhMnj7bGeByOBLPpCFTzdk5b4TUnFtkPPx8FystW');
INSERT INTO tb_user(name, email, password) VALUES ('Halyson','halysonsc@gmail.com','$2a$10$JIfo3Boy6OG8yl2b7YkQhu2ETPhPcgvO9CvKGa3vEvjapnViYNVPm');

INSERT INTO tb_roles(role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_roles(role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role(user_id, role_id) VALUES (1,1);
INSERT INTO tb_user_role(user_id, role_id) VALUES (2,1);
INSERT INTO tb_user_role(user_id, role_id) VALUES (2,2);
