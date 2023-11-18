<%-- 
    Document   : update
    Created on : 6 thg 11, 2023, 16:16:42
    Author     : minh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Sinhvien" %>
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
                Sinhvien c = (Sinhvien) request.getAttribute("cateupdate");
        %>
        <form action="update" method="post">
            enter Masv: <input type="text" readonly name="Masv" value="<%= c.getMasv()%>"/> <br/>
            enter Hoten: <input type="text" name="Hoten" value="<%= c.getHoten()%>"/> <br/>
            enter Ngaysinh: <input type="text" name="Ngaysinh" value="<%= c.getNgaysinh()%>"/> <br/>
            enter Gioitinh: <input type="text" name="Gioitinh" value="<%= c.getGioitinh()%>"/> <br/>
            enter Malop: <input type="text" name="Malop" value="<%= c.getMalop()%>"/> <br/>
            <input type="submit" value="Update"/>
        </form>
        <% 
        }
        %>
    </body>
</html>
