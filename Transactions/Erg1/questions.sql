--1.τα ονόματα και τις ηλικίες όλων των ναυτικών.
select sname , age
from sailors ;

--2. όλα τα στοιχεία των ναυτικών με κλιμάκιο (rating) μεγαλύτερο του 7.
select *
from sailors 
where rating >7  ;

--3. τα ονόματα των ναυτικών που έχουν κάνει κράτηση στη βάρκα με κωδικό 103.
select DISTINCT s.sname
from RESERVES  r inner join sailors s  on  (s.sid=r.sid)
where r.bid=103;

--4. τους κωδικούς των ναυτικών που έχουν κάνει κράτηση σε κόκκινη βάρκα.
SELECT s.sid
from SAILORS s inner join RESERVES r on (s.sid=r.sid)
  inner join boats b on (b.bid=r.bid)
where b.color='red' ; 

--5. τα ονόματα των ναυτικών που έχουν κάνει κράτηση σε κόκκινη βάρκα.
SELECT s.sname
from SAILORS s inner join RESERVES r on (s.sid=r.sid)
  inner join boats b on (b.bid=r.bid)
where b.color='red' ; 

--6. οι ηλικίες των ναυτικών των οποίων τα ονόματα αρχίζουν με το γράμμα Β και 
--τελειώνουν με το γράμμα b και έχουν μήκος τουλάχιστον 3 χαρακτήρων.
SELECT s.age
from SAILORS s 
where s.sname LIKE 'B_%b' ; 

--7. Εμφανίστε τα ονόματα των ναυτικών που έχουν κάνει κράτηση και 
--σε κόκκινη και σε πράσινη βάρκα (με 2 διαφορετικούς τρόπους).
--i)	
SELECT DISTINCT S.sname
	FROM ((((Sailors S INNER JOIN Reserves R1 ON S.sid = R1.sid) INNER JOIN Boats B1 ON R1.BID = B1.BID) 
            INNER JOIN Reserves R2 ON S.SID = R2.SID) INNER JOIN Boats B2 ON R2.BID = B2.BID)
	WHERE  B1.color = 'red' AND B2.color = 'green';

--ii)	
SELECT DISTINCT S.sid, S.sname
FROM (Sailors S INNER JOIN Reserves R ON S.sid = R.sid) INNER JOIN BOATS B ON R.bid = B.bid
WHERE B.color='red'
	INTERSECT
SELECT DISTINCT S.sid, S.sname
FROM (Sailors S INNER JOIN Reserves R ON S.sid = R.sid) INNER JOIN BOATS B ON R.bid = B.bid
WHERE B.color = 'green';


--8. Εμφανίστε τα ονόματα των ναυτικών που έχουν κάνει κράτηση σε κόκκινη, αλλά όχι σε πράσινη βάρκα
SELECT DISTINCT S.sid, S.sname
FROM (Sailors S INNER JOIN Reserves R ON S.sid = R.sid) INNER JOIN BOATS B ON R.bid = B.bid
WHERE B.color='red'
	MINUS
SELECT DISTINCT S.sid, S.sname
FROM (Sailors S INNER JOIN Reserves R ON S.sid = R.sid) INNER JOIN BOATS B ON R.bid = B.bid
WHERE B.color = 'green';


--9. Εμφανίστε τα ονόματα των ναυτικών που δεν έχουν κάνει κράτηση σε πράσινη βάρκα (με εμφωλευμένο query).
SELECT S.sname
FROM Sailors S
WHERE S.sid NOT IN (SELECT R.sid
			    FROM Reserves R
			    WHERE R.bid IN (SELECT B.bid
						FROM Boats B
						WHERE B.color = 'green'));
--10. Εμφανίστε τα ονόματα των ναυτικών που δεν έχουν κάνει κράτηση σε πράσινη βάρκα (με εμφωλευμένο query και exists).

SELECT S.sname
FROM Sailors S
WHERE NOT EXISTS (SELECT *
	    FROM (Reserves R INNER JOIN Boats B ON R.bid = B.bid) 
	    WHERE  S.sid = R.sid AND B.color = 'green');