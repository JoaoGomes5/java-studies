# Notes


# SQL

	- We can use alias on select and form statements
		example:
		
		select 
			s.name as Destrito, 
		    	c.name as Cidade, 
		    	region as Região
		from states s, cities c
		where s.id = c.state_id
		
## JOIN 
	- Inner Join 
![Inner](https://i.imgur.com/a3CpAOe.png)

	- Left Join
![Left](https://i.imgur.com/EF4MCh8.png)

	- Right Join
![Right](https://i.imgur.com/321ggbv.png)

	- Full Join
![Full](https://i.imgur.com/jTeHBxN.png)



