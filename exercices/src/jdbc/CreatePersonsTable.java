package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatePersonsTable {
	
	
	public static void main(String[] args) throws SQLException {
		
		
		Connection connection = ConnectionFactory.getConnection();
		
		String query = "CREATE TABLE IF NOT EXISTS persons ("
						+ "code INT AUTO_INCREMENT PRIMARY KEY,"
						+ "name VARCHAR(80) NOT NULL"
						+ ")";
		
		Statement stmt = connection.createStatement();
		stmt.execute(query);
		
		System.out.println("Table created!!");
		connection.close();
	}
}
