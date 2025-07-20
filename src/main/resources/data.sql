INSERT INTO patient (id, name, email, address, date_of_birth, registration_date)
SELECT '123e4567-e89b-12d3-a456-426614174001',
       'Jane Smith',
       'jane.smith@example.com',
       '456 Elm St, Shelbyville',
       '1990-09-23',
       '2023-12-01'
WHERE NOT EXISTS (
    SELECT 1 FROM patient WHERE id = '123e4567-e89b-12d3-a456-426614174001'
);