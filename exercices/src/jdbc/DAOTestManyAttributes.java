package jdbc;

public class DAOTestManyAttributes {
	public static void main(String[] args) {
		
		
		DAO dao = new DAO();
		
		String query = "INSERT INTO persons (name, code) VALUES (?,?)";
		
		System.out.println(dao.insert(query, "Daniel Santos", 30));
		System.out.println(dao.insert(query, "Fernado Rocha", 31));
		System.out.println(dao.insert(query, "Carla Neves", 32));
		System.out.println(dao.insert(query, "Joana Dias", 33));
		
		dao.closeConnection();
		
	}
}
