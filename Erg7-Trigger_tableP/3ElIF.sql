CREATE FUNCTION katataksi() RETURNS TRIGGER AS $$ 
BEGIN
IF NEW.RACEPOSITION  =1 THEN 
UPDATE f1_driver
SET POINTS=POINTS+25
WHERE code = NEW.drivercode;

ELSIF NEW.RACEPOSITION = 2 THEN 
UPDATE f1_driver
SET POINTS=POINTS+18
WHERE code = NEW.drivercode;

ELSIF NEW.RACEPOSITION = 3 THEN 
UPDATE f1_driver
SET POINTS=POINTS+15
WHERE code = NEW.drivercode;

ELSIF NEW.RACEPOSITION = 4 THEN 
UPDATE f1_driver
SET POINTS=POINTS+12
WHERE code = NEW.drivercode;

ELSIF NEW.RACEPOSITION = 5 THEN 
UPDATE f1_driver
SET POINTS=POINTS+10
WHERE code = NEW.drivercode;

ELSIF NEW.RACEPOSITION = 6 THEN 
UPDATE f1_driver
SET POINTS=POINTS+8
WHERE code = NEW.drivercode;


ELSIF NEW.RACEPOSITION = 7 THEN 
UPDATE f1_driver
SET POINTS=POINTS+6
WHERE code = NEW.drivercode;

ELSIF NEW.RACEPOSITION = 8 THEN 
UPDATE f1_driver
SET POINTS=POINTS+4
WHERE code = NEW.drivercode;

ELSIF NEW.RACEPOSITION = 9 THEN 
UPDATE f1_driver
SET POINTS=POINTS+2
WHERE code = NEW.drivercode;

ELSIF NEW.RACEPOSITION = 10 THEN 
UPDATE f1_driver
SET POINTS=POINTS+1
WHERE code = NEW.drivercode;
end if ;

return null ; 
end ; 
$$ language plpgsql;


CREATE TRIGGER katataksi2
AFTER INSERT ON f1_results
FOR EACH ROW 
EXECUTE PROCEDURE katataksi();

insert into f1_results (Drivercode, circuitcode, racedate, raceposition, grid) values
('D2', 'CI1', date('2019/3/6'), 2, 1);