/*Questions
1.In the movie table, the movie length is shown in the length column.
How many movies are longer than the average movie length?

2.How many movies have the highest rental_rate in the movie table?

3.In the film table, list the films with the lowest rental rate and the lowest replacement cost.

4.In the payment table, list the customers who make the most purchases.*/

--Answer 1
SELECT COUNT(*) FROM film
WHERE length >
(
	SELECT AVG(length) FROM film
);

--Answer 2
SELECT COUNT(*) FROM film
WHERE rental_rate = 
(
	SELECT MAX(rental_rate) FROM film
);

--Answer 3
SELECT * FROM film
WHERE rental_rate =
(
	SELECT MIN(rental_rate) FROM film
)
AND
replacement_cost =
(
	SELECT MIN(replacement_cost) FROM film
);

--Answer 4
SELECT payment.customer_id,customer.first_name, customer.last_name, COUNT(payment.customer_id) FROM customer
INNER JOIN payment ON payment.customer_id = customer.customer_id
GROUP BY payment.customer_id, customer.first_name, customer.last_name
ORDER BY COUNT(payment.customer_id) DESC;

