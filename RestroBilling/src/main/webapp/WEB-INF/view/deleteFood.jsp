<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Delete Operation:</h1>

<f:form action="deleted" method="POST" modelAttribute="m">
Enter Food Id:
<f:input path="foodId"/>
<input value="delete" type="submit"/>
<%-- 


<f:form>
<table border=1>
<tr>
<td>Food Name</td>
<td>Food id</td>
<td>Category</td>
<td>Unit Price</td>
</tr>
<tr>
<h1>Food Information</h1>
<td><c:out  value="${key}"></c:out></td>
<td><c:out  value="${key1}"></c:out></td>
<td><c:out value="${key2}"></c:out></td>
<td><c:out value="${key3}"></c:out></td>

</tr>

</table>



</f:form> --%>
</f:form>








</body>
</html>