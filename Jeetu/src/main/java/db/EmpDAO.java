package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Employee;

public class EmpDAO {

	public static void insert(Employee emp) {
		Connection con = DbConnection.getConnection();

		try {

			String insert = "INSERT INTO emp VALUE(?,?,?)";

			PreparedStatement ps = con.prepareStatement(insert);

			ps.setString(1, emp.getName());
			ps.setInt(2, emp.getAge());
			ps.setFloat(3, emp.getSalary());

			ps.executeUpdate();

			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static List<Employee> getAllEmps() {

		Connection con = DbConnection.getConnection();

		List<Employee> allEmp = new ArrayList<Employee>();

		try {

			String select = "SELECT * FROM emp";

			PreparedStatement ps = con.prepareStatement(select);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee();

				emp.setAge(rs.getInt("age"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getFloat("salary"));

				allEmp.add(emp);

			}

			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return allEmp;
	}

}
