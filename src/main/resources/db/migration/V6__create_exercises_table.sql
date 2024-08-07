CREATE TABLE exercises (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    muscle_group VARCHAR(255),
    equipment_id UUID,
    FOREIGN KEY (equipment_id) REFERENCES equipment(id) ON DELETE SET NULL
);
