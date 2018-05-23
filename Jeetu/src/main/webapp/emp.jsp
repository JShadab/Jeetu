<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>All Employee Details</h1>


	<table>
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Salary</th>
		<tr>


			<c:forEach var="emp" items="${requestScope.allEmps }">

				<tr>

					<td>${emp.name }</td>

					<td>${emp.age }</td>

					<td>${emp.salary }</td>
				</tr>


			</c:forEach>
	</table>

</body>
</html>