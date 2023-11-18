<%-- 
    Document   : tron
    Created on : 3 thg 11, 2023, 18:12:16
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
        <h1>Bài 1</h1>
        <form action="tinh" method="post">
            enter radious: <input type="text" name="r"/> <br/>
            <input type="submit" value="Submit"/>
        </form>
        <% 
            if(request.getAttribute("dt") != null){
                String s = (String)request.getAttribute("dt");
        %>
        <h2>Dien tich la: <%= s %>!</h2> 
        <%
            }
        %>
    </body>
</html>
