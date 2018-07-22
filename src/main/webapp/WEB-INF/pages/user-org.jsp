<%@ page  language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" import="java.util.List" import="org.services.AllServiceOrg" %>
<body>
<h3>This was ORG User jsp</h3><br>

Glory to you, Nameless!<br><br>

<strong>Current Time is</strong>: <%=new Date() %><br><br>

<%
        AllServiceOrg allServiceOrg = (AllServiceOrg) request.getAttribute("allServiceOrg");
        response.getWriter().println("<br>Users:<br>");
        response.getWriter().println(allServiceOrg.getUserList() );
        response.getWriter().println("<br>Items:<br>");
        response.getWriter().println(allServiceOrg.getAllItems() );
        response.getWriter().println("<br>Vault location:<br>");
        response.getWriter().println(allServiceOrg.getLocation() );
%>

</body>
</html>