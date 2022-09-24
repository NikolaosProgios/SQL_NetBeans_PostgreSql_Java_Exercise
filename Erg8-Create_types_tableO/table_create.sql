--1
CREATE OR  REPLACE TYPE Poli_type AS OBJECT 
  (Onoma VARCHAR(20),
   Xora varchar(20) );
--2  
CREATE OR  REPLACE TYPE Ypallilos_type AS OBJECT 
    (Tautotita VARCHAR(10),
      Onoma varchar(20),
      Eponumo varchar(30),
      Fulo varchar(1),
      Hlikia integer,
      diefthinsi varchar(40),
      Hmer_proslipsis Date )
      not final ; --
	  --- not final mis kai tha kanoume paidia
--3    
create OR  REPLACE  type odigos_type under Ypallilos_type --under ipoclass , odigos paidi toy ypallilo
      ( Typos varchar(30),
        Arithmos integer);
--4        
create or REPLACE type sinodos_type under Ypallilos_type
    (vathmos varchar(20)) ;
--5
create or REPLACE type pliroma_type as object 
( Onoma varchar(10),
  odigos ref odigos_type,
  Synodos ref sinodos_type);
  
--6
create or REPLACE type leofori_type as object 
( arkiklo varchar(8),
  edra ref Poli_type, 
  Hmer_kataskeuhs date,
  Pliroma ref pliroma_type,
  xiliometra integer ) ;

--7
create or REPLACE type TIMES as object 
( hour INTEGER ,
    minutes integer );

create or REPLACE type DROMOLOGIO_TYPE as object 
  (  Arithmos integer ,
    Afeteria ref Poli_type,
    proorismos ref Poli_type,
    Hmera varchar(10),
    ora_drom ref Times , 
    leoforio ref leofori_type,
    timi integer );