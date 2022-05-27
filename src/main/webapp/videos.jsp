<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 027 27.05.22
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Videos</title>
</head>
<body>
    <%
        response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
        if(session.getAttribute("username")==null){
            response.sendRedirect("login.jsp");
        }
    %>
    <iframe width="560" height="315" src="https://www.youtube.com/embed/OuBUUkQfBYM" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>
