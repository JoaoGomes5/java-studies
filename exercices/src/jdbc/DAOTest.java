package jdbc;

public class DAOTest {
	public static void main(String[] args) {
		
		
		DAO dao = new DAO();
		
		String query = "INSERT INTO persons (name) VALUES (?)";
		
		dao.insert(query, "Maria Antonieta");
		dao.insert(query, "Gustavo Reis");
		dao.insert(query, "Daniela Azevedo");
		dao.insert(query, "Diogo Silva");
		System.out.println(dao.insert(query, "Dara Alves"));
		
		dao.closeConnection();
		
	}
}
