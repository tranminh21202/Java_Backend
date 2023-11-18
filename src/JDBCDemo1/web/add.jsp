<%-- 
    Document   : add
    Created on : 6 thg 11, 2023, 00:51:01
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
        <h1>Add new a category!</h1>
        <%
        if(request.getAttribute("error") != null){
        %>
        <h3 style="color: red"><%= request.getAttribute("error")%></h3>
        <%
        }
        %>
        <form action="add">
            enter ID: <input type="number" name="id"/> <br/>
            enter name: <input type="text" name="name"/> <br/>
            enter describe: <input type="text" name="describe"/> <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
