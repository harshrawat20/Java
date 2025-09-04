-- Database Script
-- These two dashes represent the comments in mysql

create database employees_database; -- create a database

use employees_database;   -- use the employees_database; 

show databases;

select database();    -- select employees_database; 

create table employees_tbl(
id INT auto_increment primary key,
name varchar(20),
dept varchar(10),
salary int(10)
);

show tables;  -- show tables in the database

INSERT INTO employees_tbl (name, dept, salary)
VALUES 
('Michael', 'Sales', 5500),
('Cassandra', 'Technology', 7000),
('Samuel', 'Technology', 7000),
('John', 'Marketing', 9500),
('Beth', 'Technology', 6500),
('Peter', 'HR', 5000),
('Romeo', 'Legal', 5400);

describe employees_tbl;
select * from employees_tbl;





