create database Employee;
show databases;
use Employee;
create table Emp_Deatils(p_id int primary key auto_increment, name varchar(50), DOB date, mobile varchar(10), email varchar(50), aadhar varchar(12), pan varchar(10));
create table Contact_Deatils(id int primary key auto_increment,p_id int references Emp_Deatils(p_id),  mobile2 varchar(10), email2 varchar(50));
create table Emp_Communication(id int primary key auto_increment,p_id int references Emp_Deatils(p_id),  address1 varchar(255), address2 varchar(255));
create table Emp_register(id int primary key auto_increment,p_id int references Emp_Deatils(p_id), DOJ date, dpt varchar(50), post varchar(30));
create table Emp_department(id int primary key auto_increment,p_id int references Emp_Deatils(p_id), d_name varchar(30), loaction varchar(100));
insert into Emp_Deatils values(null,'preeti','2004-06-25','9307480559','priti@gmail.com','234567891234','PRJ8032432');
insert into Contact_Deatils values(null,1,'1234567890','asdfgg@gmail.com');
insert into Emp_Communication values(null,1,'adsdase asewe aferw','asewew yutrygb ghyttry');
insert into Emp_register values(null,1,'2010-06-11','Web designer','designer');
insert into Emp_department values(null,1,'software','mumbai');
create table Emp_payroll(id int primary key auto_increment, p_id int references Emp_Deatils(p_id),post varchar(30),salary int(7),emp_name varchar(30));
insert into Emp_payroll values(null,1,'Web designer',500000,'preeti');
select * from Emp_Deatils as p JOIN Contact_Deatils as c ON p.p_id=c.id JOIN Emp_Communication as m ON p.p_id=m.id JOIN Emp_register as r ON p.p_id=r.id JOIN  Emp_department as d ON p.p_id=d.id JOIN Emp_payroll as q ON p.p_id=q.id
drop table Emp_payroll;
drop table Emp_Communication;
drop table Emp_Deatils;
drop table Emp_register;
drop table Emp_department;
drop table Contact_Deatils;



