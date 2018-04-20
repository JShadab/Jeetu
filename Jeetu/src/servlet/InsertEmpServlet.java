package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Employee;
import db.EmpDAO;

public class InsertEmpServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// Getting values from HTMl page
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		float salary = Float.parseFloat(req.getParameter("salary"));

		// Creating employee bean
		Employee emp = new Employee();

		emp.setAge(age);
		emp.setName(name);
		emp.setSalary(salary);

		// Insert Employee in Database
		EmpDAO.insert(emp);

		// Get all Employees from Database
		List<Employee> allEmps = EmpDAO.getAllEmps();

		// Store all employee data in request.
		req.setAttribute("allEmps", allEmps);

		req.getRequestDispatcher("/emp.jsp").forward(req, resp);
	}

}
