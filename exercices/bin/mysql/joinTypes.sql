use learn;

select *
from cities c
inner join presidents p
on c.id = p.id;

select *
from cities c
left join presidents p
on c.id = p.id;

select *
from cities c
right join presidents p
on c.id = p.id;

-- select *
-- from cities c
-- full join presidents p
-- on c.id = p.id;

select *
from cities c
left join presidents p
on c.id = p.id
union
select *
from cities c
right join presidents p
on c.id = p.id;

