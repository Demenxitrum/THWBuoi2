<%--
  Created by IntelliJ IDEA.
  User: huyvh
  Date: 3/28/2024
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container d-flex justify-content-center mt-5">
    <div class="d-flex justify-content-center mt-5 rounded-3 border"
         style="width: 400px; height: 350px;border-radius: 1px;">
        <form class="mt-5" action="/FormLogin_war_exploded/login/check" method="post">
            <h4>Trang Đăng Nhập </h4>
            <div>
                <label class="form-label">username</label>
                <input class="form-control"  type="text" ng-model="id" name="ten">
            </div>
            <div class="mt-2">
                <label class="form-label">password</label>
                <input class="form-control" type="text" ng-model="pass" name="pass">
            </div>
            <div class="d-flex justify-content-center mt-3">
                <button class="btn btn-light bg-danger">Đăng Nhập</button>
            </div>
            <di>
                <h4 style="color: red">${message}</h4>
            </di>

        </form>
    </div>
</div>
</body>
</html>
