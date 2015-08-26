-- name: select-all-users
SELECT * FROM users;


-- name: insert-user!
INSERT INTO users (name, date_of_birth) VALUES (?,?);
