use learn;

insert into presidents 
	(name, city_id)
values    
	('Dara Alves', 
		(select id from cities where name = 'Paranhos')
	);
    
insert into presidents 
	(name, city_id)
values    
	('João Gomes', 1);
    
insert into presidents 
	(name, city_id)
values    
	('Gustavo Reis', 3),
    ('Magano Dias', 4);
    
insert into presidents 
	(name, city_id)
values    
	('Cristiano Maganinho', null);

insert into presidents 
	(name, city_id)
values    
	('Raquel Neves', null);