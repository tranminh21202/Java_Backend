<%-- 
    Document   : list
    Created on : 5 thg 11, 2023, 22:03:00
    Author     : minh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Sinhvien" %>
<%@page import="java.lang.*" %>
<%@page import="java.util.*" %>
<%@page import="dal.SinhvienDAO" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function doDelete(id) {
                if(confirm("Do you want to delete category with id =" + id)){
                    window.location = "delete?id=" + id;
                }
            }           
        </script>
    </head>
    <body>
    <center>
        <h1>List of Categories</h1>
        <h3><a href="add.jsp">Add new</a></h3>
        <table border="lpx" width="40%" >
            <tr>
                <th>Masv</th>
                <th>Hoten</th>
                <th>Ngaysinh</th>
                <th>Gioitinh</th>
                <th>Malop</th>
                <th>Action</th>
            </tr>
            <%
                List<Sinhvien> list = (List<Sinhvien>) request.getAttribute("data");
                for(Sinhvien i : list){
            %>
            <tr>
                <td><%= i.getMasv()%></td>
                <td><%= i.getHoten()%></td>
                <td><%= i.getNgaysinh()%></td>
                <td><%= i.getGioitinh()%></td>
                <td><%= i.getMalop()%></td>
                <td>
                    <a href="update?id=<%= i.getMasv() %>">Update</a>&nbsp; &nbsp; &nbsp; &nbsp;
                    <a href="#" onclick="doDelete('<%= i.getMasv()%>')">Delete</a>
                </td>
            </tr>
            <%
                }
            %>
        </table>
    </center>
    </body>
</html>
