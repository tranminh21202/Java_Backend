<%-- 
    Document   : list
    Created on : 5 thg 11, 2023, 22:03:00
    Author     : minh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Category" %>
<%@page import="java.lang.*" %>
<%@page import="java.util.*" %>
<%@page import="dal.CategoryDAO" %>
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
                <th>ID</th>
                <th>Name</th>
                <th>Describe</th>
                <th>Action</th>
            </tr>
            <%
                List<Category> list = (List<Category>) request.getAttribute("data");
                for(Category i : list){
            %>
            <tr>
                <td><%= i.getId()%></td>
                <td><%= i.getName()%></td>
                <td><%= i.getDescribe()%></td>
                <td>
                    <a href="update?id=<%= i.getId() %>">Update</a>&nbsp; &nbsp; &nbsp; &nbsp;
                    <a href="#" onclick="doDelete('<%= i.getId()%>')">Delete</a>
                </td>
            </tr>
            <%
                }
            %>
        </table>
    </center>
    </body>
</html>
