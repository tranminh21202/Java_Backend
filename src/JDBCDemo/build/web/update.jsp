<%-- 
    Document   : update
    Created on : Oct 18, 2023, 11:22:30 AM
    Author     : Asus
--%>
<%@page import="model.Khachhang" %>
<%@page import="java.lang.ClassNotFoundException" %>
<%@page import="dao.KhachhangDAO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>Update Khach hang</h1>
        <% 
           Khachhang kh = (Khachhang) request.getAttribute("khachhang");
        %>
        <form action="updatekh" method="post">
            Enter Makh: <input type="text" name="mkh" value="<%= kh.getMakh()%>" /> <br/> 
            Enter Hoten: <input type="text" name="ht" value="<%= kh.getHoten()%>"/> <br/>
            Enter Ngaysinh: <input type="text" name="ns" value="<%= kh.getNgaysinh()%>"/> <br/>
            Enter Diachi: <input type="text" name="dc" value="<%= kh.getDiachi()%>"/> <br/>
            Enter Email: <input type="text" name="e"  value="<%= kh.getEmail()%>" /> <br/>
            Enter Dienthoai: <input type="text" name="dt"  value="<%= kh.getDienthoai()%>" /> <br/>
            <input type="submit" value="Update"/>
        </form>
            
    </body>
</html>
