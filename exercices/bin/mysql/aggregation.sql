use learn;

select 
	region as 'Região',
	sum(population) as Total
from states
group by region;

select 
	sum(population) as Total
from states;


select 
	avg(population) as Total
from states


