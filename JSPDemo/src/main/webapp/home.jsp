<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page errorPage="error.jsp"  %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
<%
String username=(String)session.getAttribute("username");
out.print("Welcome to the home page : " + username);

%>
--%>

<%-- 
<%
String username=(String)pageContext.getAttribute("username",PageContext.SESSION_SCOPE);
out.print("Welcome to the home page : " + username);

%>
--%>

<%
int x=100/0;


%>


</body>
</html>