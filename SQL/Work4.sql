/*Questions
1.Sort the different values in the replacement cost column in the film table.

2.How many different data are there in the replacement_cost column in the movie table?

3.How many of the movie titles in the movie table start with the character T and
at the same time the rating is equal to 'G'?

4.How many of the country names (country) in the country table consist of 5 characters?

5.How many of the city names in the city table end with the character 'R' or r?*/

--Answer1 
SELECT DISTINCT replacement_cost FROM film;

--Answer 2
SELECT COUNT(DISTINCT replacement_cost) FROM film;

--Answer 3
SELECT COUNT(*) FROM film
WHERE title LIKE 'T%' AND rating = 'G';

--Answer 4
SELECT COUNT(*) FROM country
WHERE country LIKE '_____';

--Answer 5
SELECT COUNT(*) FROM city
WHERE city ~~* '%R';

