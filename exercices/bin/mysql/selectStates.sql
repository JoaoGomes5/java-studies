use learn;

select *
from states;

select initials as 'Sigla', name as 'Nome do Destrito' from learn.states;

select initials as 'Sigla', name as 'Nome do Destrito' 
from learn.states
where region = 'Norte';

select *
from states
where population >= 0.5
order by population ;




