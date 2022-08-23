--CEVAP 1
SELECT title,description FROM film;

--CEVAP 2
SELECT * FROM film
WHERE length > 60 AND length < 75;

--CEVAP 3
SELECT * FROM film
WHERE rental_rate = 0.99 AND replacement_cost = 12.99 OR replacement_cost = 28.99;

--CEVAP 4
SELECT last_name FROM customer
WHERE first_name = 'Mary';

--CEVAP 5
SELECT * FROM film
WHERE NOT length > 50 AND NOT (rental_rate = 2.99 OR rental_rate = 4.99);

