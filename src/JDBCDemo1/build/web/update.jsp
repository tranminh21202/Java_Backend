<%-- 
    Document   : update
    Created on : 6 thg 11, 2023, 16:16:42
    Author     : minh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Category" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update a category!</h1>
        <%  if(request.getAttribute("cateupdate") != null){
                Category c = (Category) request.getAttribute("cateupdate");
        %>
        <form action="update" method="post">
            enter ID: <input type="number" readonly name="id" value="<%= c.getId()%>"/> <br/>
            enter name: <input type="text" name="name" value="<%= c.getName()%>"/> <br/>
            enter describe: <input type="text" name="describe" value="<%= c.getDescribe()%>"/> <br/>
            <input type="submit" value="Update"/>
        </form>
        <% 
        }
        %>
    </body>
</html>
