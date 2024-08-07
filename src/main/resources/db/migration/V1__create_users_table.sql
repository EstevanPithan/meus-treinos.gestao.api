CREATE EXTENSION IF NOT EXISTS "PGCRYPTO";

CREATE TABLE users (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    type VARCHAR(50) CHECK (type IN ('Student', 'Instructor')) NOT NULL,
    date_of_birth DATE NOT NULL,
    registration_date DATE NOT NULL
);
