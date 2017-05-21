<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/21
  Time: 0:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <div class="row">
        <div class="md-col-12">
            <form method="post">

                <h3>修改帐号密码</h3>

                <input type="hidden" name="id" value="${user.id}">

                <div class="form-group">
                    <label>账号</label>
                    <input type="text" class="form-control" name="username" value="${user.username}">
                </div>

                <div class="form-group">
                    <label>密码(如果不修改请留空)</label>
                    <input type="password" class="form-control" name="password" value="">
                </div>

                <div class="form-group">
                    <button class="btn btn-success">保存</button>
                </div>


            </form>
        </div>
    </div>
</div>
</body>
</html>
