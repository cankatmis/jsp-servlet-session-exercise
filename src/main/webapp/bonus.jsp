<%@ page import="com.example.jspservletsessionexercise.Employee" %><%--
  Created by IntelliJ IDEA.
  User: ackat
  Date: 06/12/2022
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bonus page</title>
</head>
<body>
<h1><%=session.getAttribute("name")%>, you gave 5% bonus to:</h1>
<h2>Oldest employee</h2>

<%Employee employee = (Employee)request.getAttribute("percentEmp");%>
<table border="1">
    <tr>
        <td>
            <%=employee.getName()%>
        </td>
        <td>
            <%=employee.getAge()%>
        </td>
        <td>
            <%=employee.getSalary()%>
        </td>
    </tr>
</table>

</body>
</html>
