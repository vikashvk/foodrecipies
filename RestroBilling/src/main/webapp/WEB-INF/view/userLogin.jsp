<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<f:form method="POST" action="userVerification" modelAttribute="user"> 
USER LOGIN PAGE:
<br>
		<br>

USERNAME:
<f:input path="userName" />
		<f:errors path="userName" />
		<br> 
PASSWORD:
<f:input type="password" path="password" />
		<f:errors path="password" />
		<br>
		<input type="submit" value="login" />
	</f:form>


</body>
</html>