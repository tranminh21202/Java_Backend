<%-- 
    Document   : home
    Created on : 3 thg 11, 2023, 00:09:40
    Author     : minh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2 style="color: chocolate">
        <% 
            out.println("So Pi: " + Math.PI);
            double r = 2;
            DecimalFormat f = new DecimalFormat("##.##");
        %>
        </h2>
        <h2 style="color: grey">
            Dien tich: <%= f.format(Math.PI * r * r) %>
        </h2>
    </body>
</html>
