use learn;

select company.name , city.name
from companys company, companys_units cu, cities city
where company.id = cu.company_id
and city.id = city_id
and headquarter
