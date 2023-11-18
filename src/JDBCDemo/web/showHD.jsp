<%-- 
    Document   : showQT
    Created on : Oct 18, 2023, 11:24:56 AM
    Author     : Asus
--%>
<%@page import="model.Khachhang" %>
<%@page import="model.Nhanvien" %>
<%@page import="model.Dondathang" %>
<%@page import="java.lang.ClassNotFoundException" %>
<%@page import="dao.KhachhangDAO" %>
<%@page import="dao.DondathangDAO" %>
<%@page import="dao.NhanvienDAO" %>
<%@ page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Diemthi</title>
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
        </style>
    </head>
    <body>
        <h1>Hoa don </h1>
        <table>
            <tr>
                <th>Ma kh</th>
                <th>Hoten</th>
                <th>Dia chi</th>
                <th>Ten hang</th>
                <th>so luong</th>
                <th>ma nhan vien</th>
            </tr>
            <% 
               List<Diemthi> diem = (List<Diemthi>) request.getAttribute("data");
               for(Diemthi i:diem){
               float diemcao = i.getDiemlan1();
               if (i.getDiemlan2() > diemcao){
               diemcao = i.getDiemlan2();
                }
               if(diemcao >= 8.5){
               Student stu = new StudentDAO().getStudentByID(i.getMasv());
                
            %>
            <tr>
                <td><%= stu.getMasv()%></td>
                <td><%= stu.getHoten()%></td>
                <td><%= stu.getNgaysinh()%></td>
                <td> Tri tue nhan tao</td>
                <td><%= diemcao%></td>
            </tr>

            <% 
                }
                }
            %>
        </table>
    </body>
</html>
