CREATE FUNCTION Betterplacethanposition() 
RETURNS TRIGGER AS $$ 
BEGIN
IF NEW.RACEPOSITION  < NEW.grid THEN 
UPDATE f1_driver --ston pinaka fi_driver
SET POINTS=POINTS+5 --anebazo ana pente tous vathmous
WHERE code = NEW.drivercode; -- opoy o kodikos yparxon odigou= me new driver.kodiko
end if ;
return null ; 
end ; 
$$ language plpgsql;

CREATE TRIGGER BetterPlace
AFTER INSERT ON f1_results
FOR EACH ROW 
EXECUTE PROCEDURE Betterplacethanposition();
--test trigger after insert row
insert into f1_results (Drivercode, circuitcode, racedate, raceposition, grid) values
('D2', 'CI1', date('2015/3/6'), 3, 13);