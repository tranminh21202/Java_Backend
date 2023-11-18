<%-- 
    Document   : list.jsp
    Created on : 4 thg 11, 2023, 23:54:21
    Author     : minh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="model.Student" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>List of Students</h1>
        <table border = "lpx">
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>DOB</th>
                <th>GENDER</th>
            </tr>
            <%
                List<Student> list = (List<Student>) request.getAttribute("data");
                for(Student i:list){
            %>
            <tr>
                <td><%= i.getId()%></td>
                <td><%= i.getName() %></td>
                <td><%= i.getDob()%></td>
                <td>
                    <img <%= (i.isGender() ? "src='images/male.png'" : "src='images/female.png'") %> width="40px" height="40px"/>
                </td>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
