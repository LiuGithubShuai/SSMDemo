<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/20
  Time: 23:48
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
            <form action="" method="post">

                <h3>添加新用户</h3>

                <div class="form-group">
                    <label>账号</label>
                    <input type="text" name="username" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>密码</label>
                    <input type="password" name="password" class="form-control"/>
                </div>
                <div class="form-group">
                    <button btn primary-btn>添加</button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
