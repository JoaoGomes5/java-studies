use learn;

select 
	s.name as Destrito, 
    c.name as Cidade, 
    region as Região
from states s, cities c
where s.id = c.state_id;

select 
	s.name as Destrito, 
    c.name as Cidade, 
    region as Região
from states s
inner join cities c 
	on s.id = c.state_id