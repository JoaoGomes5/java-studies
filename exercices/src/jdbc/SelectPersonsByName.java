package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectPersonsByName {

	public static void main(String[] args) throws SQLException {

		Scanner in = new Scanner(System.in);

		Connection connection = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM persons WHERE name like ?";

		System.out.print("Informe o valor pra pesquisa: ");
		String valor = in.nextLine();

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, "%" + valor + "%");
		ResultSet resultado = stmt.executeQuery();

		List<Person> persons = new ArrayList<>();

		while (resultado.next()) {
			int code = resultado.getInt("code");
			String name = resultado.getString("name");
			persons.add(new Person(code, name));
		}

		for (Person p : persons) {
			System.out.println(p.getCode() + " ==> " + p.getName());
		}

		stmt.close();
		connection.close();
		in.close();
	}
}
