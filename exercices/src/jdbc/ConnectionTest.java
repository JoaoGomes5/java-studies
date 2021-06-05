package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	
	
	public static void main(String[] args) throws SQLException {
		
		
		final String url = "jdbc:mysql://localhost?verifyServerCerificate=false&useSSL=true";
		final String user = "root";
		final String password = "mysql";
		
		
		Connection connection = DriverManager
									.getConnection(url, user, password);
		
		System.out.println("Connected successfully!!!");
		connection.close();
		
	}
}
