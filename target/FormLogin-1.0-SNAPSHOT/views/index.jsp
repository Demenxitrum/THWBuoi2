<%--
  Created by IntelliJ IDEA.
  User: huyvh
  Date: 3/13/2024
  Time: 1:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="jakarta.tags.core" prefix="c" %>
<html>
<head>
    <title>Mau sac</title>
    <%--    link boostrap 5 --%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container mt-5">
    <div class="d-flex justify-content-end">
        <button class="btn btn-light bg-success"><a href="/FormLogin_war_exploded/Sach/create" style="text-decoration: none; color: black;">Thêm</a></button>
    </div>
    <table class="table">
        <thead>
        <th>ID</th>
        <th>ten Sach</th>
        <th>Ten tac Gia</th>
        <th>Nam Xuat ban</th>
        </thead>
        <tbody>
        <c:forEach items="${ds}" var="ms">
            <tr>
                <td>${ms.ID}</td>
                <td>${ms.tenSach}</td>
                <td>${ms.tacGia}</td>
                <td>${ms.namXuatBan}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
