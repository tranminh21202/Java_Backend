<%-- 
    Document   : list
    Created on : 5 thg 11, 2023, 22:03:00
    Author     : minh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Khachhang" %>
<%@page import="java.lang.*" %>
<%@page import="java.util.*" %>
<%@page import="dal.KhachhangDAO" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function doDelete(id) {
                if(confirm("Do you want to delete khachhang with id =" + id)){
                    window.location = "delete?id=" + id;
                }
            }           
        </script>
        <style>
            table tr th{
                border: 1px solid black;
                width: 100px;
                height: 50px;
                text-align: center;
            }
            td{
                border: 1px solid black;
                width: 100px;
                height: 50px;
                text-align: center;
            }
            a{
                display: inline;
            }
        </style>
    </head>
    <body>
    <center>
        <h1>List of Khachhang</h1>
        <table border="lpx" width="40%" >
            <tr>
                <th>Makh</th>
                <th>Hoten</th>
                <th>Dienthoai</th>
                <th>Matk</th>
                <th>Action</th>
            </tr>
            <%
                List<Khachhang> list = (List<Khachhang>) request.getAttribute("data");
                for(Khachhang i : list){
            %>
            <tr>
                <td><%= i.getMakh()%></td>
                <td><%= i.getHoten()%></td>
                <td><%= i.getDienthoai()%></td>
                <td><%= i.getMatk()%></td>
                <td>
                    <a href="update?id=<%= i.getMakh() %>">Update</a>&nbsp; &nbsp;
                    <a href="#" onclick="doDelete('<%= i.getMakh()%>')">Delete</a>
                </td>
            </tr>
            <%
                }
            %>
        </table><br/>
        <h3><a href="add.jsp">Add new</a></h3>
    </center>
    </body>
</html>
