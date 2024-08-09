CREATE TABLE muscle_group (
    id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE exercise_muscle_group (
    exercise_id UUID NOT NULL,
    muscle_group_id UUID NOT NULL,
    PRIMARY KEY (exercise_id, muscle_group_id),
    FOREIGN KEY (exercise_id) REFERENCES exercises(id) ON DELETE CASCADE,
    FOREIGN KEY (muscle_group_id) REFERENCES muscle_group(id) ON DELETE CASCADE
);
