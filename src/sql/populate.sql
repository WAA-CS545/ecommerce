INSERT INTO CREDENTIALS(username,password,enabled) VALUES ('guest','$2a$06$hbXPAiaqNc8p8hKIzW8.mexShs9fTc/syLZiwoUHVrRNQJ48sU3mC', TRUE);
INSERT INTO CREDENTIALS(username,password,enabled) VALUES ('admin','$2a$06$KoOnHC1Q1eAoAiTe/c7qN.TiNhNaRU/JS0.RRMEHg6ax.gg5S.uDi', TRUE);
INSERT INTO CREDENTIALS(username,password,enabled) VALUES ('admin1','$2a$06$KoOnHC1Q1eAoAiTe/c7qN.TiNhNaRU/JS0.RRMEHg6ax.gg5S.uDi', TRUE);


INSERT INTO Authority (username, authority) VALUES ('guest', 'ROLE_USER');
INSERT INTO Authority (username, authority) VALUES ('admin', 'ROLE_ADMIN');
INSERT INTO Authority (username, authority) VALUES ('admin', 'ROLE_USER');
INSERT INTO Authority (username, authority) VALUES ('admin1', 'ROLE_ADMIN');

INSERT INTO USERS (firstname,lastname,email,rank,userid,IS_ADMIN,version) VALUES ('Curious','George','aloaiza@mum.edu',1,'admin',1,1);
INSERT INTO USERS (firstname,lastname,email,rank,userid,IS_ADMIN,version) VALUES ('Admin1','Admin1','admin1@mum.edu',2,'admin1',1,1);
INSERT INTO USERS (firstname,lastname,email,rank,userid,IS_ADMIN,version) VALUES ('Allen','Rench','allen@rench.com',3,'guest',0,1);
