SELECT NAME FROM CITY WHERE COUNTRYCODE = 'USA' AND POPULATION>120000;

SELECT * FROM CITY;

SELECT * FROM CITY WHERE ID = 1661

SELECT * FROM CITY WHERE COUNTRYCODE = 'JPN' ;

SELECT NAME FROM CITY WHERE COUNTRYCODE = 'JPN' ;

SELECT DISTINCT(CITY)  FROM STATION  WHERE MOD(ID,2) = 0 ;

/*
Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.
The STATION table is described as follows:
*/
SELECT (SELECT COUNT(CITY) FROM STATION) - (SELECT COUNT(DISTINCT(CITY)) FROM STATION) FROM DUAL

/*Weather Observation Station 5
Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.
The STATION table is described as follows:
*/
SELECT * FROM (SELECT CITY,LENGTH(CITY) FROM STATION WHERE LENGTH(CITY)=(SELECT MIN(LENGTH(CITY)) FROM STATION ) ORDER BY CITY) WHERE ROWNUM=1; 
SELECT * FROM (SELECT CITY,LENGTH(CITY) FROM STATION WHERE LENGTH(CITY)=(SELECT MAX(LENGTH(CITY)) FROM STATION ) ORDER BY CITY) WHERE ROWNUM=1;

/*Weather Observation Station 6
uery the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
*/

SELECT DISTINCT(CITY) FROM STATION WHERE SUBSTR(CITY,1,1) IN ('A','E','I','O','U');
/*Weather Observation Station 7
Query the list of CITY names ending with vowels (a, e, i, o, u) from STATION. Your result cannot contain duplicates.
*/

SELECT DISTINCT(CITY) FROM STATION WHERE SUBSTR(CITY,LENGTH(CITY)) IN ('a','e','i','o','u');

/*Weather Observation Station 8
Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.
*/

SELECT DISTINCT(CITY) FROM STATION WHERE SUBSTR(CITY,1,1) IN ('A','E','I','O','U') AND SUBSTR(CITY,LENGTH(CITY)) IN ('a','e','i','o','u');

/*Weather Observation Station 9
Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.
*/
SELECT DISTINCT(CITY) FROM STATION WHERE SUBSTR(CITY,1,1) NOT IN ('A','E','I','O','U');

/*Weather Observation Station 10
Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.
*/
SELECT DISTINCT(CITY) FROM STATION WHERE SUBSTR(CITY,LENGTH(CITY)) NOT IN ('a','e','i','o','u');

/*Weather Observation Station 11
Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.
*/
SELECT DISTINCT(CITY) FROM STATION WHERE SUBSTR(CITY,1,1) NOT IN ('A','E','I','O','U') OR SUBSTR(CITY,LENGTH(CITY)) NOT IN ('a','e','i','o','u');

/*Weather Observation Station 12
Query the list of CITY names from STATION that either do not start with vowels and do not end with vowels. Your result cannot contain duplicates.
*/
SELECT DISTINCT(CITY) FROM STATION WHERE SUBSTR(CITY,1,1) NOT IN ('A','E','I','O','U') AND SUBSTR(CITY,LENGTH(CITY)) NOT IN ('a','e','i','o','u');

/*Higher Than 75 Marks
Query the Name of any student in STUDENTS who scored higher than  Marks. Order your output by the last three characters of each name. If two or more students both have names ending in the same last three characters (i.e.: Bobby, Robby, etc.), secondary sort them by ascending ID.
*/
SELECT NAME FROM STUDENTS WHERE MARKS>75 ORDER BY SUBSTR(NAME,LENGTH(NAME)-2) ASC,ID ASC;SELECT COUNT(NAME) FROM CITY WHERE POPULATION>100000;

SELECT SUM(POPULATION) FROM CITY WHERE DISTRICT='California';

SELECT AVG(POPULATION) FROM CITY WHERE DISTRICT='California';

SELECT ROUND(AVG(POPULATION),0) FROM CITY;

SELECT MAX(POPULATION) - MIN(POPULATION) FROM CITY; 

(SELECT AVG(MISCALCULATED) FROM (SELECT TO_NUMBER(REPLACE(TO_CHAR(SALARY),'0','')) AS MISCALCULATED FROM EMPLOYEES));

/*The Blunder

*/
(SELECT CEIL(AVG(SALARY) - AVG(TO_NUMBER(REPLACE(TO_CHAR(SALARY),'0','')))) FROM EMPLOYEES);

/* TOP EARNERS*/
SELECT MAX(SALARY*MONTHS),count(*) AS EARNINGS FROM EMPLOYEE WHERE SALARY*MONTHS =(SELECT  MAX(SALARY*MONTHS) FROM EMPLOYEE);

/*Weather Observation Station 2*/



SELECT ROUND(SUM(LAT_N),4)  FROM STATION  WHERE  LAT_N > 38.7880 AND LAT_N < 137.2345;

SELECT ROUND(MAX(LAT_N),4)  FROM STATION  WHERE LAT_N < 137.2345;

SELECT ROUND(LONG_W,4)  FROM STATION  WHERE LAT_N = (SELECT MAX(LAT_N) FROM STATION WHERE LAT_N<137.2345);

SELECT ROUND(LONG_W,4) FROM STATION WHERE LAT_N=(SELECT MIN(LAT_N) FROM STATION WHERE LAT_N>38.7780);

SELECT ROUND((MAX(LAT_N ) - MIN(LAT_N))+(MAX(LONG_W  ) - MIN(LONG_W )),4) FROM STATION;


SELECT ROUND(SQRT(POWER((MAX(LAT_N ) - MIN(LAT_N)),2)+ POWER((MAX(LONG_W  ) - MIN(LONG_W )),2)),4) FROM STATION;

SELECT NAME ||'('||SUBSTR(OCCUPATION,1,1)||')' FROM OCCUPATIONS ORDER BY NAME;
/* THE PADS */
SELECT 'There are a total of '||COUNT(OCCUPATION)||' '||LOWER(OCCUPATION)||'s.' FROM OCCUPATIONS GROUP BY OCCUPATION ORDER BY  COUNT(OCCUPATION) ASC,OCCUPATION ASC;

/* BASIC JOIN*/
SELECT SUM(A.POPULATION) FROM CITY A  JOIN COUNTRY B ON A.COUNTRYCODE = B.CODE AND B.CONTINENT = 'Asia';

SELECT A.NAME FROM CITY A JOIN COUNTRY B ON A.COUNTRYCODE = B.CODE AND B.CONTINENT = 'Africa';

SELECT B.CONTINENT,FLOOR(AVG(A.POPULATION)) FROM CITY A JOIN COUNTRY B ON A.COUNTRYCODE=B.CODE GROUP BY B.CONTINENT;

/*Type of Triangle*/
SELECT 
CASE WHEN A=B AND B=C THEN 'Equilateral'
WHEN A+B<=C OR A+C<=B OR B+C<=A THEN 'Not A Triangle'
WHEN A=B OR B=C OR A=C THEN 'Isosceles'
WHEN A!=B AND B!=C AND A!=C THEN 'Scalene' 
END FROM TRIANGLES ;

SELECT REPEAT('* ', @NUMBER := @NUMBER + 1) FROM information_schema.tables, (SELECT @NUMBER:=0) t LIMIT 20;

/*Binary Nodes*/
SELECT N,
CASE WHEN P IS NULL THEN 'Root'
WHEN (SELECT COUNT(*) FROM BST WHERE P=B.N)>0 THEN 'Inner'
ELSE 'Leaf'
END
FROM BST B ORDER BY N;

/*THE REPORT */
SELECT 
CASE
WHEN A.GRADE>=8 THEN B.NAME
ELSE NULL
END,
A.GRADE,B.MARKS FROM GRADES A,STUDENTS B
WHERE B.MARKS BETWEEN A.MIN_MARK AND A.MAX_MARK
ORDER BY A.GRADE DESC,B.NAME ;