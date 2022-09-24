--1
CREATE OR REPLACE FUNCTION raise_weight(integer,varchar(30))--2Parametrous
returns void as $$ --return tipota
update ATHLETE --change tou (from)athlete to weight
set weight=weight+$1 --$1 first parametr=integer
where surname=$2;
$$ LANGUAGE SQL ;

--2
select raise_weight(5,'Zakari')
--check 
select *
from ATHLETE
where surname='Zakari'

--3

CREATE TABLE final(
	code integer NOT NULL PRIMARY KEY,
	performance float 
);

CREATE OR REPLACE FUNCTION sport_final(varchar(30),varchar(30))
--onoma_athlete=$1 
--gender_athlete=$2
returns  SETOF final as $$ 
-- SETOF final --epistrefei parapano apo 1 pragmata(p.x.Table-final) 
	SELECT p.athlete , p.performance
	from participates p inner join  games g on p.game = g.code 
		inner join sport s on g.sport =s.code 
	where s.gender=$2 and g.level='Final' and s.name=$1 ;
$$ LANGUAGE SQL ;

--4
select *
from sport_final('100m','Male');

--5
select *
from sport_final('100m','Male')
where performance= ( select min( performance )
		from  sport_final('100m','Male') );

	--2os
	select min( participates.performance )
	from sport_final('100m','Male'), participates  ;

--6
select *
from sport_final('Javelin', 'Female')
where performance = (select MAX(performance)
			from sport_final('Javelin', 'Female') ) ;


--7

CREATE OR REPLACE FUNCTION champion(varchar(30),varchar(30))
returns integer as $$ --epistrefo integer
DECLARE champ INTEGER ; -- dilosi metablitis champ oti einai ineger
BEGIN
	IF ( $1 = '100m') THEN 		
		select CODE
		INTO champ
		from sport_final($1,$2)  
		where performance= ( select min( performance )
				     from sport_final($1, $2) ) ;
	elsif($1='Javelin') THEN 
		select code
		into champ
		from sport_final('Javelin', 'Female')
		where performance = (select MAX(performance)
				     from sport_final($1, $2) ) ;
	end if ;
	return champ ; 
END ; 
$$ LANGUAGE plpgsql  ; 


--8 
select champion('100m','Male') ;

--9
select champion('Javelin','Female') ;
