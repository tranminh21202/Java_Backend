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
        <h1>Add new!</h1>
        <%
        if(request.getAttribute("error") != null){
        %>
        <h3 style="color: red"><%= request.getAttribute("error")%></h3>
        <%
        }
        %>
        <form action="add">
            enter Makh: <input type="text" name="Makh"/> <br/>
            enter Hoten: <input type="text" name="Hoten"/> <br/>
            enter Ngaysinh: <input type="text" name="Ngaysinh"/> <br/>
            enter Diachi: <input type="text" name="Diachi"/> <br/>
            enter Email: <input type="text" name="Email"/> <br/>
            enter Dienthoai: <input type="text" name="Dienthoai"/> <br/>
            <input type="submit" value="Save"/>
        </form>
    </body>
</html>
