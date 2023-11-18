<%-- 
    Document   : add
    Created on : Nov 3, 2023, 2:28:19 PM
    Author     : lap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                /*border: 1px solid #000;*/
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
        <h1>Them nha cung cap moi</h1>
        <div class="main">
            <div class="container">
                <form action="insert" method="post">
                    <label>Ma Nha CC</label>
                    <input type="text" name="ma"/>
                    <br/>
                    <label>Ten Nha CC</label>
                    <input type="text" name="name" />
                    <br/>
                    <label>Dia chi Nha CC</label>
                    <input type="text" name="address"/>
                    <br/>
                    <label>Dien thoai CC</label>
                    <input type="text" name="phone" />
                    <br/>
                    <input type="submit" value="ADD"/>
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
