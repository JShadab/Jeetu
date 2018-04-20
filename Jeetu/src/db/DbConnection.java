package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection() {

		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/empDB", "root", "root");

		} catch (Exception e) {

			e.printStackTrace();
		}

		return connection;
	}

}
