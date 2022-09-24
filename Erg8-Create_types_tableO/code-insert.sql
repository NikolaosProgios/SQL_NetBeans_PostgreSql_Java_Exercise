--a
create table Poli_Table of Poli_Type ;
--Αντικείμενα τύπου Poli_Type 
insert into Poli_Table (Onoma,Xora) values ('Thessaloniki', 'Ellada') ;
insert into Poli_Table (Onoma,Xora) values ('Athina', 'Ellada');
insert into Poli_Table (Onoma,Xora) values ('Florina', 'Ellada');
insert into Poli_Table (Onoma,Xora) values ('Larisa', 'Ellada');
insert into Poli_Table (Onoma,Xora) values ('Volos', 'Ellada');
insert into Poli_Table (Onoma,Xora) values ('Drama', 'Ellada');
insert into Poli_Table (Onoma,Xora) values ('Sofia', 'Boulgaria');

--b
create table Ypallilos_Table of Ypallilos_Type ;
--Αντικείμενα τύπου Ypallilos_Type 
insert into Ypallilos_Table values 
	('ΑΑ111111', 'Giannis', 'Parios', 'M', 35, 'Tsimiski 1', date'2004-1-16') ;
insert into Ypallilos_Table values 
	('ΒΒ222222', 'Giorgios', 'Karampelas', 'M', 40, 'Megalou Alexandrou 105', date'2000-10-10');
insert into Ypallilos_Table values 
	('CC333333', 'Maria', 'Iouliou', 'F', 25, 'Egnatias 10', date'2002-11-25');

--c
create table sinodos_Table of sinodos_type ;
--Αντικείμενα τύπου Synodos_Type 
insert into sinodos_Table values 
	('DD444444', 'Kostas', 'Papadopoulos', 'M', 55, 'Axaion 15', date'1975-3-25', 'A');
insert into sinodos_Table values 
	('EE555555', 'Giorgios', 'Georgiadis', 'M', 53, 'Serron 34', date'1976-4-11', 'A');
insert into sinodos_Table values 
	('FF666666', 'Sotiria', 'Bellou', 'F', 38, 'Gravias 5', date'1999-6-2', 'B');
insert into sinodos_Table values 
	('GG777777', 'Sofia', 'Iatrou', 'F', 41, 'Peramou 8', date'1977-6-2', 'B');

--g
create table odigos_Table of odigos_type ;
--Αντικείμενα τύπου Odigos_Type 
insert into odigos_Table values 
	('HH888888', 'Dimitris', 'Stamatiou', 'M', 40, 'Kilkis 20', date'1995-5-25', 'Epaggelmatiko', 1234567);
insert into odigos_Table values 
	('II999999', 'Katerina', 'Stauridou', 'F', 20, 'Papafi 201', date'2001-1-14', 'Erasitexniko', 3489762);
insert into odigos_Table values 
	('JJ101010', 'Anna', 'Papasotiriou', 'F', 32, 'Ermou 17', date'2003-11-1', 'Erasitexniko', 4443233);

--Pliroma_Table
declare
  odigos_ref REF odigos_type;
  synodos_ref REF synodos_type;
begin
  SELECT TREAT(REF(O) AS REF ODIGOS_TYPE) -- mono otan exei paidia o p.x. Ypallilos_table
		INTO odigos_ref FROM Ypallilos_table O WHERE O.Tautotita = 'HH888888';
  SELECT TREAT(REF(S) AS REF SYNODOS_TYPE) 
		INTO synodos_ref FROM Ypallilos_table S WHERE S.Tautotita = 'GG777777';
  --Αντικείμενα τύπου Pliroma_Type 
  INSERT INTO Pliroma_table values ('alpha', odigos_ref,synodos_ref);
end;



-- LEOFOREIO_TABLE
--Αντικείμενα τύπου Leoforeio_Type 
declare
    poli_ref REF poli_type;
    pliroma_ref REF pliroma_type;
begin
  SELECT REF(P) INTO poli_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO pliroma_ref FROM Pliroma_table P WHERE P.Onoma = 'alpha';
  INSERT INTO Leoforeio_table (Arithmos, edra, Hmer_kataskeuhs, Pliroma, Xiliometra) 
			VALUES  ('NHE1010', Poli_ref, date'2007-5-1', Pliroma_ref, 10000); 
end; 
/*
declare
    poli_ref REF poli_type;
    pliroma_ref REF pliroma_type;
begin
  SELECT REF(P) INTO poli_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO pliroma_ref FROM Pliroma_table P WHERE P.Onoma = 'beta';
  INSERT INTO Leoforeio_table (Arithmos, edra, Hmer_kataskeuhs, Pliroma, Xiliometra) VALUES  ('NEE9990', Poli_ref, date'2006-6-1', Pliroma_ref, 50000); 
end; 
declare
    poli_ref REF poli_type;
    pliroma_ref REF pliroma_type;
begin
  SELECT REF(P) INTO poli_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(P) INTO pliroma_ref FROM Pliroma_table P WHERE P.Onoma = 'gamma';
  INSERT INTO Leoforeio_table (Arithmos, edra, Hmer_kataskeuhs, Pliroma, Xiliometra) VALUES   ('YOI7867', Poli_ref, date'2005-2-1', Pliroma_ref, 100000); 
end; 

declare
    poli_ref REF poli_type;
    pliroma_ref REF pliroma_type;
begin
  SELECT REF(P) INTO poli_ref FROM Poli_table P WHERE P.Onoma = 'Florina';
  SELECT REF(P) INTO pliroma_ref FROM Pliroma_table P WHERE P.Onoma = 'delta';
  INSERT INTO Leoforeio_table (Arithmos, edra, Hmer_kataskeuhs, Pliroma, Xiliometra) VALUES 
  ('PAY4532', Poli_ref, date'2004-9-1', Pliroma_ref, 150000); 
end;
*/
-- DROMOLOGIO_TABLE
--Αντικείμενα τύπου Dromologio_Type 
declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
  SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (10, afetiria_ref, proorismos_ref, 'Deutera', TIME(10,0), leoforeio_ref, 50); 
end;
/*
declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
  SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (20, afetiria_ref, proorismos_ref, 'Triti', TIME(10,0), leoforeio_ref, 50); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
  SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (30,  afetiria_ref, proorismos_ref, 'Tetarti', TIME(10,0), leoforeio_ref, 50); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
  SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (40, afetiria_ref, proorismos_ref, 'Pempti', TIME(10,0), leoforeio_ref, 50); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
  SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (50, afetiria_ref, proorismos_ref, 'Paraskeui', TIME(10,0), leoforeio_ref, 50); 
end;


declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
  SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (60, afetiria_ref, proorismos_ref, 'Sabbato', TIME(10,0), leoforeio_ref, 50); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
  SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (70, afetiria_ref, proorismos_ref, 'Kuriaki', TIME(10,0), leoforeio_ref, 50); 
end;
*/

-- epistrofi

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
  SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (80, afetiria_ref, proorismos_ref, 'Deutera', TIME(20,0), leoforeio_ref, 50); 
end;
/*
declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
    SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (90, afetiria_ref, proorismos_ref, 'Triti', TIME(20,0), leoforeio_ref, 50); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
    SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (100,  afetiria_ref, proorismos_ref, 'Tetarti', TIME(20,0), leoforeio_ref, 50); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
    SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (110, afetiria_ref, proorismos_ref, 'Pemti', TIME(20,0), leoforeio_ref, 50); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
    SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (120, afetiria_ref, proorismos_ref, 'Paraskeui', TIME(20,0), leoforeio_ref, 50); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
    SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (130, afetiria_ref, proorismos_ref, 'Sabbato', TIME(20,0), leoforeio_ref, 50); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
   SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Athina';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NHE1010';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (140, afetiria_ref, proorismos_ref, 'Kuriaki', TIME(20,0), leoforeio_ref, 50); 
end;
*/
-- ALLA

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
   SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Florina';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Larisa';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NEE9990';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (210, afetiria_ref, proorismos_ref, 'Kuriaki', TIME(15,0), leoforeio_ref, 30); 
end;
/*
declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
   SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Larisa';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Florina';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'NEE9990';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (220, afetiria_ref, proorismos_ref, 'Deutera', TIME(8,0), leoforeio_ref, 30); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
   SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Larisa';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'YOI7867';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (310, afetiria_ref, proorismos_ref, 'Triti', TIME(8,0), leoforeio_ref, 10); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
   SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Larisa';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'YOI7867';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (320, afetiria_ref, proorismos_ref, 'Triti', TIME(12,0), leoforeio_ref, 10); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
   SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Larisa';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'YOI7867';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (330, afetiria_ref, proorismos_ref, 'Tetarti', TIME(8,0), leoforeio_ref, 10); 
end;

declare
    afetiria_ref REF poli_type;
    proorismos_ref REF poli_type;
    leoforeio_ref REF leoforeio_type;
begin
   SELECT REF(P) INTO afetiria_ref FROM Poli_table P WHERE P.Onoma = 'Larisa';
  SELECT REF(P) INTO proorismos_ref FROM Poli_table P WHERE P.Onoma = 'Thessaloniki';
  SELECT REF(L) INTO leoforeio_ref FROM leoforeio_table L WHERE L.Arithmos = 'YOI7867';
  INSERT INTO Dromologio_table (Arithmos, Afetiria, Proorismos, Hmera_dromologiou, Ora_dromologiou, Leoforeio, Timi_Eisitiriou) VALUES 
  (340, afetiria_ref, proorismos_ref, 'Tetarti', TIME(12,0), leoforeio_ref, 10); 
end;
*/
