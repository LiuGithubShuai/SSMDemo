<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>用户列表</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>

    <div class="container">
        <div class="row">
            <div class="col-md-12">

                <h3>用户列表</h3>

                <c:if test="${not empty message}">
                    <div class="alert alert-success">${message}</div>
                </c:if>

                <a href="/user/add" class="btn btn-primary">添加</a>

                <table class="table">
                    <tr>
                        <th>姓名</th>
                        <th>#</th>
                    </tr>
                    <c:forEach var="user" items="${userList}">
                        <tr>
                            <td>${user.username}</td>
                            <td>
                                <a href="/user/${user.id}/del">删除</a>
                                <a href="/user/${user.id}/edit">编辑</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>



            </div>
        </div>
    </div>

    </body>

</html>