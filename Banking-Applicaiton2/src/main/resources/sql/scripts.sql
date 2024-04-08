create database securitylearning;

use securitylecreate database securitylearning;

use securitylearning;

CREATE TABLE users (
                       username VARCHAR(50) NOT NULL PRIMARY KEY,
                       password VARCHAR(500) NOT NULL,
                       enabled BOOLEAN NOT NULL
);

CREATE TABLE authorities (
                             username VARCHAR(50) NOT NULL,
                             authority VARCHAR(50) NOT NULL,
                             CONSTRAINT fk_authorities_users FOREIGN KEY(username) REFERENCES users(username)
);

CREATE UNIQUE INDEX ix_auth_username ON authorities (LOWER(username), LOWER(authority));

INSERT INTO users (username, password, enabled) VALUES
                                                    ('manish', 'manish', true),
                                                    ('amit', 'amit', true),
                                                    ('anand', 'anand', false);

INSERT INTO authorities (username, authority) VALUES
                                                  ('manish', 'ROLE_ADMIN'),
                                                  ('amit', 'ROLE_USER'),
                                                  ('anand', 'ROLE_USER');

select * from users;
select * from authorities;arning;

CREATE TABLE users (
                       username VARCHAR(50) NOT NULL PRIMARY KEY,
                       password VARCHAR(500) NOT NULL,
                       enabled BOOLEAN NOT NULL
);

CREATE TABLE authorities (
                             username VARCHAR(50) NOT NULL,
                             authority VARCHAR(50) NOT NULL,
                             CONSTRAINT fk_authorities_users FOREIGN KEY(username) REFERENCES users(username)
);

CREATE UNIQUE INDEX ix_auth_username ON authorities (LOWER(username), LOWER(authority));

INSERT INTO users (username, password, enabled) VALUES
                                                    ('manish', 'manish', true),
                                                    ('amit', 'amit', true),
                                                    ('anand', 'anand', false);

INSERT INTO authorities (username, authority) VALUES
                                                  ('manish', 'ROLE_ADMIN'),
                                                  ('amit', 'ROLE_USER'),
                                                  ('anand', 'ROLE_USER');

select * from users;
select * from authorities;




CREATE TABLE customers (
                           id BIGINT NOT NULL PRIMARY KEY,
                           email VARCHAR(50) NOT NULL,
                           password VARCHAR(500) NOT NULL,
                           role VARCHAR(50) NOT NULL
);


INSERT INTO customers (id, email, password, role) VALUES
                                                      (1, 'john@gmail.com', 'password123', 'admin'),
                                                      (2, 'alice@gmail.com', 'password456', 'user'),
                                                      (3, 'bob@gmail.com', 'password789', 'user');
