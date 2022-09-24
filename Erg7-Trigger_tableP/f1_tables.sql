create table f1_driver(
code varchar(5) not null primary key,
name varchar(10),
surname varchar(20),
dateofbirth date,
debut integer,
countryoforigin varchar(20),
points integer);

create table f1_manufacturer (
code varchar(5) not null primary key,
name varchar(30),
country varchar(30),
engine varchar(20),
tires varchar(20),
debut integer,
points integer);

create table f1_circuit (
code varchar(5) not null primary key,
name varchar(40),
country varchar(30),
racedistance integer,
Laps integer);

create table f1_results (
drivercode varchar(5) not null references f1_driver on delete cascade on update cascade,
circuitcode varchar(5) not null references f1_circuit on delete cascade on update cascade,
racedate date,
raceposition integer,
grid integer,
primary key (drivercode, circuitcode,  racedate));

create table f1_contract (
f1manu_code varchar(5) not null references f1_manufacturer on delete cascade on update cascade,
drivercode varchar(5) not null references f1_driver on delete cascade on update cascade,
contractyear integer,
carnumber integer,
primary key(f1manu_code, drivercode, contractyear));
