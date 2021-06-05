use learn;

create table if not exists companys (
	id int unsigned not null auto_increment,
    name varchar(255) not null,
    jp int unsigned,
    primary key (id),
    unique key (jp)
);
-- cities_companys
create table if not exists companys_units (
	company_id int unsigned not null,
    city_id int unsigned not null,
    headquarter tinyint not null,
    primary key (company_id, city_id)
)