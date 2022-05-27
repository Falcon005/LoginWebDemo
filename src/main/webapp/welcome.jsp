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
    <title>WelcomePage</title>
</head>
<body>
    <%
        response.setHeader("Cache-control","no-cache,no-store,must-revalidate");
        if(session.getAttribute("username")==null){
            response.sendRedirect("login.jsp");
        }
    %>
    Welcome ${username}
    <br>
    <a href="videos.jsp">Videos here</a>

    <form action="Logout">
        <input type="submit" value="Logout">
    </form>
</body>
</html>
