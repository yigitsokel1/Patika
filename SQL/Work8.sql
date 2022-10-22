/*QUESTIONS
1.Create a table in your test database with employee name column 
information id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100).

2.Add 50 pieces of data to the employee table we created using the 'Mockaroo' service.

3.Do 5 UPDATE operations that will update the other columns according to each of the columns.

4.Do 5 DELETE operations that will delete the relevant row according to each of the columns.
*/

--Answer 1
CREATE TABLE  employee(
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
);

--Answer 2
insert into employee (name, birthday, email) values ('Lewiss', '1926-06-04', 'lcrowd0@netvibes.com');
insert into employee (name, birthday, email) values ('Kay', '1912-10-01', 'kcondie1@china.com.cn');
insert into employee (name, birthday, email) values ('Tim', '1906-03-26', null);
insert into employee (name, birthday, email) values ('Hogan', '1902-09-20', 'hcherry3@soundcloud.com');
insert into employee (name, birthday, email) values ('Margarete', '1991-09-08', 'mdrysdale4@cnbc.com');
insert into employee (name, birthday, email) values ('Richard', '1944-02-05', 'rgarrioch5@dailymail.co.uk');
insert into employee (name, birthday, email) values ('Saloma', '1929-03-04', 'smeatyard6@omniture.com');
insert into employee (name, birthday, email) values ('Izak', '1953-12-03', 'ifassam7@cdc.gov');
insert into employee (name, birthday, email) values ('Prudy', '1921-11-12', 'pmcilory8@hc360.com');
insert into employee (name, birthday, email) values ('Holli', '1920-09-09', 'hgoodspeed9@yelp.com');
insert into employee (name, birthday, email) values ('Gerrie', '1915-03-25', 'gbarsbya@squarespace.com');
insert into employee (name, birthday, email) values ('Patty', '1984-08-08', 'pnairyb@pen.io');
insert into employee (name, birthday, email) values ('Pepi', '1975-10-31', 'pmachargc@sciencedirect.com');
insert into employee (name, birthday, email) values ('Kassandra', '1962-08-05', 'kramlotd@mlb.com');
insert into employee (name, birthday, email) values ('Abagail', '1920-06-19', 'amacdaide@jalbum.net');
insert into employee (name, birthday, email) values ('Caren', '1943-03-15', null);
insert into employee (name, birthday, email) values ('Sammy', '1910-05-09', 'sneillansg@marriott.com');
insert into employee (name, birthday, email) values ('Ralina', '1931-01-15', 'rnotoh@joomla.org');
insert into employee (name, birthday, email) values ('Laurette', '1950-11-13', 'lstrakeri@bloglines.com');
insert into employee (name, birthday, email) values ('Winslow', '1965-12-28', 'wtaplinj@cpanel.net');
insert into employee (name, birthday, email) values ('Northrup', '1995-03-28', 'nbowhayk@blogspot.com');
insert into employee (name, birthday, email) values ('Obediah', '1956-11-29', 'oheindrickl@slashdot.org');
insert into employee (name, birthday, email) values ('Wyndham', '1906-12-09', 'wdolmanm@hubpages.com');
insert into employee (name, birthday, email) values ('Edsel', '1980-05-16', 'ebyn@jugem.jp');
insert into employee (name, birthday, email) values ('Lars', '1936-10-28', 'ltorrijoso@google.co.jp');
insert into employee (name, birthday, email) values ('Clive', '1968-11-18', 'cpenleyp@dion.ne.jp');
insert into employee (name, birthday, email) values ('Hailey', '1920-12-04', 'hgleadhellq@chicagotribune.com');
insert into employee (name, birthday, email) values ('Arv', '1946-09-13', 'amundwellr@ow.ly');
insert into employee (name, birthday, email) values ('Travers', '1967-03-08', null);
insert into employee (name, birthday, email) values ('Umberto', '1981-04-16', 'uniesst@infoseek.co.jp');
insert into employee (name, birthday, email) values ('Ivan', null, 'ivanyu@flavors.me');
insert into employee (name, birthday, email) values ('Aili', '1948-09-11', 'amarov@ameblo.jp');
insert into employee (name, birthday, email) values ('Judas', null, 'jjancaw@mtv.com');
insert into employee (name, birthday, email) values ('Cindelyn', '1927-11-23', 'cmenauteaux@prweb.com');
insert into employee (name, birthday, email) values ('Desiri', '1906-07-11', 'dhouldeyy@opera.com');
insert into employee (name, birthday, email) values ('Benji', '1934-05-06', 'bgiffautz@lulu.com');
insert into employee (name, birthday, email) values ('Fairleigh', '1904-06-28', null);
insert into employee (name, birthday, email) values ('Melisse', '1907-07-26', 'manthoin11@paypal.com');
insert into employee (name, birthday, email) values ('Danica', '1957-04-11', 'djeannequin12@home.pl');
insert into employee (name, birthday, email) values ('Beau', '1923-12-08', 'btroy13@wix.com');
insert into employee (name, birthday, email) values ('Whitaker', '1960-09-28', 'wfalkner14@arstechnica.com');
insert into employee (name, birthday, email) values ('Lynelle', '1904-08-22', 'lrive15@seattletimes.com');
insert into employee (name, birthday, email) values ('Riannon', '1906-06-23', 'rassante16@bluehost.com');
insert into employee (name, birthday, email) values ('Gus', '1949-08-25', 'gwordsley17@ft.com');
insert into employee (name, birthday, email) values ('Tybi', '1961-02-18', 'thand18@sfgate.com');
insert into employee (name, birthday, email) values ('Tobit', '1992-05-07', 'tdowdam19@irs.gov');
insert into employee (name, birthday, email) values ('Coriss', '1995-09-05', null);
insert into employee (name, birthday, email) values ('Filmer', '1936-04-28', 'fdunbobin1b@discuz.net');
insert into employee (name, birthday, email) values ('Beatriz', '1949-05-16', 'bathowe1c@ebay.com');
insert into employee (name, birthday, email) values ('Alison', null, 'asimenet1d@gnu.org');

--Answer 3
UPDATE employee
SET
	name = 'Yigit'
WHERE id = 1
RETURNING *;

UPDATE employee
SET
	name = 'Mail is invalid'
WHERE email LIKE 'a%'
RETURNING *;

UPDATE employee
SET
	birthday = '2020-01-01'
WHERE email LIKE 'c%'
RETURNING *;

UPDATE employee
SET
	email = 'beginner@hotmail.com'
WHERE birthday < '1950-01-01'
RETURNING *;

UPDATE employee
SET
	name = 'Ali'
WHERE name ILIKE 's%'
RETURNING *;

--Answer 4
DELETE FROM employee
WHERE name LIKE 'M%'
RETURNING *;

DELETE FROM employee
WHERE birthday < '1940-01-01';

DELETE FROM employee
WHERE email LIKE 'beg%';

DELETE FROM employee
WHERE name = 'Richard';

DELETE FROM employee
WHERE id = 45