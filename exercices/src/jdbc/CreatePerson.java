package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CreatePerson {
	public static void main(String[] args) throws SQLException {
		
		Scanner in = new Scanner(System.in);
		Connection connection = ConnectionFactory.getConnection();
		
		System.out.println("Introduza o nome: ");
		String name = in.nextLine();
		
		
		String query = "INSERT INTO persons (name) VALUES (?)";
		
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setString(1, name);
		
		
		stmt.execute();
		
		System.out.println("Person created!!");
		in.close();
	}
}
