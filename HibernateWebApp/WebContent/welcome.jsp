<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%@ include file="header.html" %>

<c:set var="uname" value="${param.username }" scope="session"></c:set>
<c:url var="productUrlEnc" value="product.jsp" ></c:url>

<%--EXPRESSION SCRIPT --%>

<p>Dear ${param.username} Welcome to online shopping of zensar</p>
<p>Your session timeout is: ${pageContext.session.maxInactiveInterval} seconds</p>
<p>To View & purchase product <a href="${ productUrlEnc}">click here</a> </p>

<%-- <ol>
	<li><%=request.getParameter("book1") %></li>
	<li><%=request.getParameter("book2") %></li>
</ol>

<ol>
	<li>${param.book3}</li>
	<li>${param.book4}</li>
</ol>
 --%>
 
<%@ include file="footer.html" %>
</body>
</html>