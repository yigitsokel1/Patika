/*QUESTIONS
1.List the country names in the country column of the country table, 
starting with the 'A' character and ending with the 'a' character.

2.List the country names in the country column of the country table,
consisting of at least 6 characters and ending with the 'n' character.

3.In the title column of the movie table, 
list the movie names containing at least 4 'T' characters, regardless of upper or lower case letters.

4.From the data in all the columns in the movie table, sort the data that starts with the title 'C' character,
has a length greater than 90 and a rental_rate of 2.99.*/

--Answer 1
SELECT * FROM country
WHERE country LIKE 'A%a';

--Answer 2
SELECT * FROM country
WHERE country ~~ '_____%n';

--Answer 3
SELECT title FROM film
WHERE title ~~* '%t%t%t%t%';

--Answer 4
SELECT * FROM film
WHERE title LIKE 'C%' AND length > 90 AND rental_rate IN(2.99);
