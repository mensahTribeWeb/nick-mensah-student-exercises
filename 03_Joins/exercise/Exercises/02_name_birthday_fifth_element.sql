-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)

SELECT person_name, birthday
FROM person AS p
JOIN movie_actor ON p.person_id = movie_actor.actor_id
JOIN movie ON movie.movie_id = movie_actor.movie_id
WHERE title = 'The Fifth Element';
