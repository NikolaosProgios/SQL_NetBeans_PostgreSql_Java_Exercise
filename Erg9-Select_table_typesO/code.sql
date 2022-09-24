--1
Select y.onoma , y.eponumo , Value (Y)
from Ypallilos_table y  ;
--2
Select y.onoma , y.eponumo , Value (y)
from Ypallilos_table y  
where Value(y) IS OF (ONLY Ypallilos_Type) ;

--3
Select y.onoma , y.eponumo , Value (y)
from Ypallilos_table y  
where Value(y) IS OF (Synodos_Type) ;

--4
Select distinct  d.afetiria.onoma, d.proorismos.onoma, 
    d.Leoforeio.pliroma.odigos.onoma,
    d.Leoforeio.pliroma.synodos.onoma
from dromologio_table  d  ; 

--5
Select DISTINCT d.Afetiria.Onoma, d.Proorismos.Onoma, 
		d.Leoforeio.Pliroma.Odigos.Onoma,
		d.Leoforeio.Pliroma.Synodos.Onoma, 
		d.Hmera_dromologiou 
From Dromologio_table d 
where d.Hmera_dromologiou = 'Kuriaki' and d.ora_dromologiou.hour > 12;

--6

select d.Afetiria.onoma , count(*)
from dromologio_table  d 
group by d.Afetiria.onoma ; 

--7
select d.Afetiria.onoma , count(*) --as fores
from dromologio_table  d 
group by d.Afetiria.onoma         
Having count(*)> 5;  -- fores>5 -- den doulebei 

--8
select Y.onoma , Y.EPONUMO , VALUE(Y)
from YPALLILOS_TABLE  Y 
where Y.EPONUMO like 'P%';
--'P%' P to first letter kai ta alla osa kai oti nane

--9

select Y.onoma , Y.EPONUMO , 
    TREAT (Value(y) as Synodos_type).Vathmos, 
	--treat(if) to y einai typou synodos , print vathmotoy
    TREAT (Value(y) as Odigos_type).Typos,    
	--treat(if) to y einai typou odigos , print ton typos
    value(y)
from YPALLILOS_TABLE  Y 
where Y.EPONUMO like 'P%';

--10

select Y.onoma , Y.EPONUMO
from YPALLILOS_TABLE  Y 
where TREAT (Value(y) as Synodos_type).Vathmos='A' 
	--if to y einai typou synodos , print Y.onoma , Y.EPONUMO
UNION --or
select Y.onoma , Y.EPONUMO
from YPALLILOS_TABLE  Y 
where TREAT (Value(y) as Odigos_type).Typos='Erasitexniko';
	--if to y einai typou odigos , print to Y.onoma , Y.EPONUMO


--11

select Y.onoma , Y.EPONUMO , 
    TREAT (Value(y) as Synodos_type).Vathmos, --if to y einai typou synodos , print vathmotoy
    TREAT (Value(y) as Odigos_type).Typos,    --if to y einai typou odigos , print ton typos
    value(y)
from YPALLILOS_TABLE  Y 
where TREAT (Value(y) as Synodos_type).Vathmos='A'  OR
      TREAT (Value(y) as Odigos_type).Typos='Erasitexniko';