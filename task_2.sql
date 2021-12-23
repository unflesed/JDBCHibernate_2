create database present;

use present;

create table candies(
id int auto_increment not null,
weight int,
sugar int,
taste varchar(30),
filling varchar(30),
primary key(id)
);

Insert Into candies(weight, sugar, taste, filling) 
values (12, 45, 'chocolate', 'chocolate'),
		(33, 56, 'fruit', 'juice'),
		(32, 89, 'chocolate', 'chocolate'),
		(56, 67, 'fruit', 'juice'),
		(34, 65, 'chocolate', 'chocolate'),
		(56, 88, 'fruit', 'juice');