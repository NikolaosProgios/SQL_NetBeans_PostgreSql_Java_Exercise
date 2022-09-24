CREATE FUNCTION PutPoints() 
RETURNS TRIGGER AS $$
BEGIN
CASE 
	WHEN NEW.raceposition = 1 THEN UPDATE f1_driver
				SET points=points + 25
				WHERE code = NEW.drivercode;
	WHEN NEW.raceposition = 2 THEN UPDATE f1_driver
				SET points=points + 18
				WHERE code = NEW.drivercode;
	WHEN NEW.raceposition = 3 THEN UPDATE f1_driver
				SET points=points + 15
				WHERE code = NEW.drivercode;
	WHEN NEW.raceposition = 4 THEN UPDATE f1_driver
				SET points=points + 12
				WHERE code = NEW.drivercode;
	WHEN NEW.raceposition = 5 THEN UPDATE f1_driver
				SET points=points + 10
				WHERE code = NEW.drivercode;
	WHEN NEW.raceposition = 6 THEN UPDATE f1_driver
				SET points=points + 8
				WHERE code = NEW.drivercode;
	WHEN NEW.raceposition = 7 THEN UPDATE f1_driver
				SET points=points + 6
				WHERE code = NEW.drivercode;
	WHEN NEW.raceposition = 8 THEN UPDATE f1_driver
				SET points=points + 4
				WHERE code = NEW.drivercode;
	WHEN NEW.raceposition = 9 THEN UPDATE f1_driver
				SET points=points + 2
				WHERE code = NEW.drivercode;
	WHEN NEW.raceposition = 10 THEN UPDATE f1_driver
				SET points=points + 1
				WHERE code = NEW.drivercode;
END CASE;
RETURN NULL;
END;
$$ LANGUAGE plpgsql;


CREATE TRIGGER raceposition
AFTER INSERT ON f1_results
FOR EACH ROW
EXECUTE PROCEDURE PutPoints();

insert into f1_results (Drivercode, circuitcode, racedate, raceposition, grid) values
('D1', 'CI1', date('2019/3/6'), 1, 13);

