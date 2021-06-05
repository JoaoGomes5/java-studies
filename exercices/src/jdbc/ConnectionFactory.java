package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	
	public static Connection getConnection() {
		
		try {
			final String url = "jdbc:mysql://localhost/learn_jdbc?verifyServerCerificate=false&useSSL=true";
			final String user = "root";
			final String password = "mysql";
			
			
			return DriverManager.getConnection(url, user, password);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		
	}
}
