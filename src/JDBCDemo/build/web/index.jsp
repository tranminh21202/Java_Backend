<%-- 
    Document   : index
    Created on : Oct 18, 2023, 11:20:32 AM
    Author     : Asus
--%>
<%@page import="model.Khachhang" %>
<%@page import="java.lang.ClassNotFoundException" %>
<%@page import="dao.KhachhangDAO" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            form{
                display: inline;
            }
        </style>

    </head>
    <body>
        <table>
            <tr>
                <th>Ma KH</th>
                <th>Ho ten</th>
                <th>Ngay sinh</th>
                <th>Dia chi</th>
                <th>Email</th>
                 <th>Dien thoai</th>
                <th>Options</th>
            </tr>
            <% 
               List<Khachhang> list = (List<Khachhang>) request.getAttribute("data");
               for(Khachhang i:list){
            %>
            <tr>
                <td><%= i.getMakh()%></td>
                <td><%= i.getHoten()%></td>
                <td><%= i.getNgaysinh()%></td>
                <td><%= i.getDiachi()%></td>
                <td><%= i.getEmail()%></td>
                <td><%= i.getDienthoai()%></td>
                <td>
                    <form action="updatekh" method="get">
                        <input type="hidden" name="mkh" value="<%= i.getMakh() %>">
                        <input type="submit" value="Update">
                    </form>&nbsp;
                    <form action="deletekh" method="post">
                        <input type="hidden" name="mkh" value="<%= i.getMakh() %>">
                        <input type="submit" value="Delete">
                    </form>
                </td>
            </tr>

            <% 
                }
            %>
        </table>
        <!--        <a href="add.jsp">Add Student</a> <br/><br/><br/>-->
        <br/><br/>
        <form action="add.jsp" >
            <input type="submit" value="Add">
        </form>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <form action="showqtstudent" method="get">
            <input type="submit" value="Find">
        </form>
    </body>
</html>
