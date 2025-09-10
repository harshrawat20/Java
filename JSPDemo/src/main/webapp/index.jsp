<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
  <jsp:useBean id="c" class="com.tutedude.MyCube_Bean"/>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- Forward action tag and param tag  
<jsp:forward page="home.jsp">
<jsp:param value="Tutedude" name="username"/>

</jsp:forward>
--%> 
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

<%-- Java use Bean  
<%
out.println("The cube of 7 ="+c.cube(7));

%>
--%> 
<%-- JSP include directive  
<%@ include file="footer.jsp" %> <br/>
--%> 


<%-- Form to demonstrate expression language  --%>
<form action="home.jsp">
Company:<input type="text" name="cName"/>
<input type="submit" value="submit">
</form>


</body>
</html>