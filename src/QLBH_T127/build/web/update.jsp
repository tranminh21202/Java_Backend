<%-- 
    Document   : update
    Created on : 6 thg 11, 2023, 16:16:42
    Author     : minh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Khachhang" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update Khachhang!</h1>
        <%  if(request.getAttribute("cateupdate") != null){
                Khachhang c = (Khachhang) request.getAttribute("cateupdate");
        %>
        <form action="update" method="post">
            enter Makh: <input type="text" readonly name="Makh" value="<%= c.getMakh()%>"/> <br/>
            enter Hoten: <input type="text" name="Hoten" value="<%= c.getHoten()%>"/> <br/>
            enter Dienthoai: <input type="text" name="Dienthoai" value="<%= c.getDienthoai()%>"/> <br/>
            enter Matk: <input type="text" name="Matk" value="<%= c.getMatk()%>"/> <br/>
            <input type="submit" value="Update"/>
        </form>
        <% 
        }
        %>
    </body>
</html>
