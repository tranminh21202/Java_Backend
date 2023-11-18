<%-- 
    Document   : login
    Created on : 5 thg 11, 2023, 00:54:08
    Author     : minh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Form</h1>
        <% 
            if(request.getAttribute("error") != null){
                String er = (String) request.getAttribute("error");
        %>
        <h3 style="color: red"><%= er %></h3>
        <%
            }
        %>
        <form action="login" method="post">
            enter username: <input type="text" name="user"/> <br/>
            enter password: <input type="password" name="pass"/> <br/>
            <input type="submit" value="Login"/> <br/>
        </form>
    </body>
</html>
