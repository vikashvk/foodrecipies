<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>menu Information::</h1>
<table border=1>
<tr>
<td>Food id:</td>
<td>Food name:</td>
<td>unit price:</td>
<td>category:</td>
</tr>

<c:forEach var="k" items="${tlist}">
<tr>
<td>${k.foodId}</td>
<td>${k.foodName}</td>
<td>${k.unitPrice}</td>
<td>${k.category}</td>

</tr>
</c:forEach>
</table>
</body>
</html>