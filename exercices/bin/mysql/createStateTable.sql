-- Creating table states
use learn;
create table states (
  	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  	name VARCHAR(45) NOT NULL,
  	initials VARCHAR(4) NOT NULL,
 	region ENUM("Norte", "Centro", "Sul") NOT NULL,
    	-- SQL SERVER CHECK (mycol IN('Useful', 'Useless', 'Unknown'))
	population DECIMAL(5,2) NOT NULL,
	PRIMARY KEY (id),
	UNIQUE KEY (name),
	UNIQUE KEY (initials)
 );
 
 
  
  