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
	Enter Food Details:

	<f:form method="POST" action="added" modelAttribute="f">
Food ID 
<f:input path="foodId" />
		<br>
Food Name
<f:input path="foodName" />
		<br>

Food Category
<f:select path="category">
			<f:option value="veg" />
			<f:option value="non-veg" />
		</f:select>
		<br>

 Unit Price
<f:input path="unitPrice" />
		<br>

		<%--<b>Quantity </b>
		<br>
		<f:select path="qty">
			<f:option value="1" />
			<f:option value="2" />
			<f:option value="3" />
			<f:option value="4" />
		</f:select>--%>
		<br>
		<input type="submit" value="Add Food" />


	</f:form>

</body>
</html>