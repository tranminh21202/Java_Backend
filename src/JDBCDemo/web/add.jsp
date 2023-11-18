<%-- 
    Document   : add
    Created on : Oct 18, 2023, 11:20:59 AM
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
        <h1>Add Khach hang</h1>
        <form action="addkh" method="post">
            Enter Ma KH: <input type="text" name="mkh" /> <br/>
            Enter Ho ten: <input type="text" name="ht" /> <br/>
            Enter Ngay sinh: <input type="text" name="ns" /> <br/>
            Enter Dia chi: <input type="text" name="dc" /> <br/>
            Enter Email: <input type="text" name="e" /> <br/>
            Enter Dien thoai: <input type="text" name="dt" /> <br/>
            <input type="submit" value="Submit"/>
            
        </form>
    </body>
</html>
