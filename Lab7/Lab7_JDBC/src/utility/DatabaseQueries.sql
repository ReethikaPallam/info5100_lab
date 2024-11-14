show databases

CREATE DATABASE medicaldb;
use medicaldb;

create table patient (id int PRIMARY KEY auto_increment, 
fname varchar(100), lname varchar(100), age int,
email varchar(100), message varchar(100),
gender varchar(10), patient_type varchar(50)); 

insert into patient(fname, lname, age, email, message, gender, patient_type) values ("Reethika","P","25","reethika@gmail.com",
"WalkIN","Female","WalkIN Appointment");

delete from patient where id=1;

select * from patient;