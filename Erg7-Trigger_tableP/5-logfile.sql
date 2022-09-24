--5
CREATE OR REPLACE FUNCTION createlog() 
RETURNS TRIGGER AS $$
BEGIN
IF (TG_OP = 'DELETE') THEN --TG_OP metabliti poy krata tin teleytaia timi poy tis exei dothei 
INSERT INTO f1_results_log_file SELECT 'Delete',now(),OLD.drivercode,
				OLD.circuitcode,OLD.racedate,OLD.grid;
RETURN OLD;
ELSIF (TG_OP = 'UPDATE') THEN
INSERT INTO f1_results_log_file SELECT 'Update',now(),NEW.drivercode,
				NEW.circuitcode,NEW.racedate,NEW.grid;
RETURN NEW;
ELSIF (TG_OP = 'INSERT') THEN
INSERT INTO f1_results_log_file SELECT 'Insert',now(),NEW.drivercode,
				NEW.circuitcode,NEW.racedate,NEW.grid;
RETURN NEW;
END IF;
RETURN NULL;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER keeplog
AFTER INSERT OR UPDATE OR DELETE ON f1_results
FOR EACH ROW EXECUTE PROCEDURE createlog();

--7

--insert
insert into f1_results  values ('D1', 'CI1', date('2015/3/6'), 3, 13);
insert into f1_results  values ('D1', 'CI1', date('2016/3/6'), 3, 13);
--update
UPDATE f1_results SET grid = 2 WHERE drivercode = 'D2';
--delete
DELETE from f1_results Where drivercode = 'D3';


