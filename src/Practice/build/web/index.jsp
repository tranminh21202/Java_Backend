<%-- 
    Document   : index
    Created on : Nov 3, 2023, 2:06:32 PM
    Author     : lap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <style>
            * {
                box-sizing: border-box;
            }

            body {
                padding: 0;
                margin: 0;
            }

            a {
                text-decoration: none;
            }

            h1 {
                text-align: center;
            }

            .container {
                max-width: 1140px;
                margin: 0 auto;
            }

            table {
                border-collapse: collapse;
                margin: 0 auto;
                width: 100%;
                font-size: 18px;
            }

            th, td {
                border: 1px solid #000;
            }

            .main__btn {
                margin: 0;
                padding: 0;
                list-style: none;
                display: flex;
                justify-content: space-between;
                margin-top: 20px;
            }

            .main__btn li a {
                display: block;
                padding: 15px 30px;
                font-size: 24px;
            }

        </style>
    </head>
    <body>
        <h1>Danh sach nha cung cap</h1>

        <div class="main">
            <div class="container">
                <div class="main__table">
                    <table>
                        <tr>
                            <th>Ma NhaCC</th>
                            <th>Ten NhaCC</th>
                            <th>Dia chi</th>
                            <th>Dien Thoai</th>
                            <th>Action</th>
                        </tr>
                        <c:forEach var="item" items="${requestScope.data}">
                            <tr>
                                <td><c:out value="${item.maNhaCC}" /></td>
                                <td><c:out value="${item.tenNhaCC}" /></td>
                                <td><c:out value="${item.diaChi}" /></td>
                                <td><c:out value="${item.dienThoai}" /></td>
                                <td>
                                    <a href="edit?id=${item.maNhaCC}">Update</a>
                                    &nbsp; &nbsp; &nbsp;
                                    <a href="delete?id=${item.maNhaCC}" onclick="if (!(confirm('Are you sure to delete this student?')))
                                            return false">
                                        Delete
                                    </a>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
                <ul class="main__btn">
                    <c:url var="contextPathUrl" value="/" />
                    <li>
                        <a href="<%=request.getContextPath()%>/new">ADD</a>
                    </li>
<!--                    <li>
                        <a href="<%=request.getContextPath()%>/viewDHT2.jsp">VIEW</a>
                    </li>-->
                </ul>
                <button id="show"  style="width: 100px;margin-left: 50%">Display</button>
                <script type="text/javascript">
                    document.getElementById("show").addEventListener("click", function () {
                        window.location.href = "showsl";
                    });
                </script>
            </div>
        </div>
    </body>
</html>
