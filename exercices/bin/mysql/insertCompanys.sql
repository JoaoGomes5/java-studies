use learn;
insert into companys 
	(name, jp)
values
	('Nestle', 678543217),
    ('Continente', 967219123),
    ('Lidl', 876254361);
    
insert into companys 
	(name, jp)
values
	('Blip', 098123128);

insert into companys 
	(name, jp)
values
	('Blip', 087612654);

desc companys;

alter table companys
modify jp varchar(9);


select * from companys;
select * from cities;

insert into companys_units 
	(company_id , city_id, headquarter)
values
	(1,1,1),
    (1,2,0),
    (2,1,0),
    (2,2,1)