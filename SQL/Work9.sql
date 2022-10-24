/*Questions
1.Write the INNER JOIN query where we can see the city and country names in the city table
and the country table together.

2.Write the INNER JOIN query where we can see the customer table and the payment_id in the payment table
and the first_name and last_name names in the customer table together.

3.Write the INNER JOIN query where we can see the customer table and the rental_id in the rental table 
and the first_name and last_name names in the customer table together.*/

--Answer 1
SELECT city, country FROM city
INNER JOIN country ON city.country_id = country.country_id;

--Answer 2
SELECT payment_id, first_name, last_name FROM payment
INNER JOIN customer ON payment.customer_id = customer.customer_id;

--Answer 3
SELECT rental_id, first_name, last_name FROM rental
INNER JOIN customer ON rental.customer_id = customer.customer_id;

