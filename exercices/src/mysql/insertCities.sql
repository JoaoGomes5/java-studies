use learn;

insert into cities (name, area , state_id)
values ('Espinho', 500, 1);

insert into cities 
	(name, area , state_id)
values 
	('Paranhos', 900, 13);


insert into cities 
	(name, area , state_id)
values 
	('Toupeiras', 700.6, 
			(select id from states where initials = 'LI')
		);
        
insert into cities 
	(name, area , state_id)
values ('Mirandela', 700.6, 
			(select id from states where initials = 'BG')
);

insert into cities 
	(name, area , state_id)
values ('Cu de Judas', 1000, 
			(select id from states where initials = 'BR')
);