-- Create table user

CREATE TABLE IF NOT EXISTS users (
    id UUID DEFAULT uuid_generate_v4 () NOT NULL,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    enabled BOOLEAN NOT NULL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL,
    PRIMARY KEY (id, email)
);
