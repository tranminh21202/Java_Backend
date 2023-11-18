<%-- 
    Document   : update
    Created on : Nov 3, 2023, 3:11:05 PM
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
                border: 1px solid #000;
                background: antiquewhite;
                color: #000;
            }

        </style>
    </head>
    <body>
        <h1>Cap nhat nha cung cap</h1>
        <div class="main">
            <div class="container">
                <c:set var="it" value="${requestScope.nhaCC}" />
                <form action="update" method="post">
                    <label>Ma Nha CC</label>
                    <input type="text" name="ma" value="${it.maNhaCC}"/>
                    <br/>
                    <label>Ten Nha CC</label>
                    <input type="text" name="name" value="${it.tenNhaCC}"/>
                    <br/>
                    <label>Dia chi Nha CC</label>
                    <input type="text" name="address" value="${it.diaChi}"/>
                    <br/>
                    <label>Dien thoai CC</label>
                    <input type="text" name="phone" value="${it.dienThoai}"/>
                    <br/>
                    <input type="submit" value="UPDATE"/>
                </form>
                <ul class="main__btn">
                    <li>
                        <a href="<%=request.getContextPath()%>">Back to List</a>
                    </li>
                </ul>
            </div>
        </div>
    </body>
</html>
