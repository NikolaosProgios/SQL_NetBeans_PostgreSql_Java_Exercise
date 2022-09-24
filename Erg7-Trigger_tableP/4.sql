--4
CREATE TABLE f1_results_log_file(
	operation char(1) not null,
	oper_time timestamp NOT NULL,
	drivercode varchar(5) NOT NULL,
	racedate date,
	grid integer,
	primary key(drivercode,racedate)
);
