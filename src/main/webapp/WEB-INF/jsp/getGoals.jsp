<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Goal repor</title>
</head>
<body>
	
	<table>
		
		<tr>
			<th>ID</th><th>Minutes</th>
		</tr>
		<c:forEach items="${ goals }" var="goal">
			<tr>
				<td>${goal.id}</td>
				<td>${goal.minutes}</td>
				<td>
				
					<table>
					
						<tr>
							<th>Exercide id</th><th>exercise minutes</th><th>exercise activity</th>
						</tr>
						<c:forEach items="${goal.exercises}" var="exercise">
							<tr>
								<td>${exercise.id}</td>
								<td>${exercise.minutes }</td>
								<td>${exercise.activity }</td>
							</tr>
							
						</c:forEach>
					
					</table>
				
				</td>
			</tr>
		</c:forEach>
		
	</table>
	
	
	
</body>
</html>