<%@ page import="com.example.jspservletsessionexercise.Employee" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ackat
  Date: 06/12/2022
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Employee Management</title>
</head>
<body>
<h1>Welcome <%=session.getAttribute("name")%>!</h1>
<h2>List of employees</h2>
<%int index=1; %>
<%
  ArrayList<Employee> emps = new ArrayList<>();
  for (Employee e:
          Employee.employees(emps)) {%>
<table border="1">
  <tr>
    <td><%=index%></td>
    <td><%=e.getName()%></td>
    <td><%=e.getAge()%></td>
    <td><%=e.getSalary()%></td>
  </tr>
</table>
<% index++; %>
<%}  %>
<% session.getServletContext().setAttribute("employees", emps); %>

<a href="OldestEmployeeServlet">Find the oldest employee!</a> <br>
<a href="HighestSalaryServlet">Find the employee with highest salary!</a>


<% if(request.getAttribute("employeeservlet") != null){
  Employee e = (Employee) request.getAttribute("employeeservlet"); %>
<% session.getServletContext().setAttribute("oldestFive",e);%>

<% if (request.getAttribute("message") != null) { %>
<h2><%= request.getAttribute("message")%>
</h2>
<% } %>

<table border="1">
  <tr>
    <td><%=e.getName()%></td>
    <td><%=e.getAge()%></td>
    <td><%=e.getSalary()%></td>
    <td><a href="FivePercentServlet?name=<%=request.getParameter("name")%>">Give 5% bonus!</a></td>
  </tr>
</table>
<% }%>

<% if(request.getAttribute("highestemployee") != null){
  Employee e1 = (Employee) request.getAttribute("highestemployee"); %>
<% session.getServletContext().setAttribute("highestEmp",e1);%>

<% if (request.getAttribute("messagehighest") != null) { %>
<h2><%= request.getAttribute("messagehighest")%>
</h2>
<% } %>

<table border="1">
  <tr>
    <td><%=e1.getName()%></td>
    <td><%=e1.getAge()%></td>
    <td><%=e1.getSalary()%></td>
    <td><a href="XMLSaveServlet?name=<%=e1%>">Save to a file!</a></td>
  </tr>
</table>
<% }%>

<%if(request.getAttribute("saved")!=null) {%>
<%String msg=(String)request.getAttribute("saved");%>
<h2><%=msg%></h2>
<% } %>

</body>
</html>
