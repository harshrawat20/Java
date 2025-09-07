<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- JSP include directive  --%> 
<%@ include file="header.jsp" %> <br/>

<%-- JSP page directive  --%> 
 <a href="home.jsp">Home</a> 
<%-- Declaration tag syntax --%>
<%! int num=10; %> 

<%-- Scriptlet tag syntax --%>
<% out.print("Welcome to tutedude. Our number was:"+ num); %>

<%-- Expression tag syntax --%>
<%= "Hello Everyone, this is an expression tag" %>


<form action="welcome">
Username:<input type="text" name="username"/>
<input type="submit" value="submit">
</form>

<%-- JSP include directive  --%> 
<%@ include file="footer.jsp" %> <br/>

</body>
</html>