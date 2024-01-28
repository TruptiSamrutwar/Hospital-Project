<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border: 1px solid white;
  border-collapse: collapse;
}
th, td {
  background-color: buttonface;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:olive;">

<%@page import="java.sql.*" %>
<h1 align="center" style="background-color: white;"><b>Employee Details</b></h1>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Ahankara@24");

String s="select * from employee";

PreparedStatement ps=conn.prepareStatement(s);
ResultSet rs=ps.executeQuery();
%>

<table  align="center" border="" style="width: 70% ; height:70%;">
<tread class="tread-dark">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Contact</th>
<th>Date of birth</th>
<th>Gender</th>
<th>Email Address</th>
</tr>
</tread>
<tbody>
<%
while(rs.next())
{%>
<tr>
<td><% out.println(rs.getString(1)); %></td>
<td><%	out.println(rs.getString(2)); %></td>
<td><%	out.println(rs.getLong(3)); %></td>
<td><%	out.println(rs.getString(4)); %></td>
<td><% out.println(rs.getString(5)); %></td>
<td><% out.println(rs.getString(6)); %></td>
<td><% out.println(rs.getString(7)); %></td>
</tr>
<% }
%>
</tbody>
</table>
</body>
</html>