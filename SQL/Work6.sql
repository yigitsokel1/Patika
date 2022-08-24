/*Questions
1.What is the average of the values in the rental_rate column in the movie table?

2.How many of the movies in the movie table start with the character 'C'?

3.Among the movies in the movie table, 
how many minutes is the longest (length) movie with a rental_rate equal to 0.99?

4.How many different replacement_cost values are there for the movies in the movie table
that are longer than 150 minutes?
*/

--Answer 1
SELECT ROUND(AVG(rental_rate),3) FROM film;

--Answer 2
SELECT COUNT(*) FROM film
WHERE title LIKE 'C%';

--Answer 3
SELECT MAX(length) FROM film
WHERE rental_rate = 0.99;

--Answer 4
SELECT COUNT(DISTINCT replacement_cost) FROM film
WHERE length > 150;



