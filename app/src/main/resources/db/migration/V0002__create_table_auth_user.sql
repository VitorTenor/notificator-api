-- TABLE USERS AUTHENTICATION

CREATE TABLE IF NOT EXISTS authentication_user (
    id UUID DEFAULT uuid_generate_v4 () NOT NULL,
    username VARCHAR(255) NOT NULL,
    password VARCHAR(60) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    login VARCHAR(255) UNIQUE NOT NULL,
    enabled BOOLEAN NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    role VARCHAR(255) NOT NULL,
    PRIMARY KEY (id, email, login)
);
