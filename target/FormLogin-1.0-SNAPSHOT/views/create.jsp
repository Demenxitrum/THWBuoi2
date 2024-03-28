<%--
  Created by IntelliJ IDEA.
  User: huyvh
  Date: 3/28/2024
  Time: 10:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container mt-5 d-flex justify-content-center"
     style="width: 500px; height: 400px; background-color: rgb(152, 230, 199); border-radius: 30px;">
    <form method="POST" action="/FormLogin_war_exploded/Sach/add" class="mt-5">
        <table>
            <tr>
                <td><label>Tên Sách</label></td>
                <td><input type="text" name="TenSach"/></td>
            </tr>
            <tr>
                <td><label>Tác Giả </label></td>
                <td><input type="text" name="TacGia"/></td>
            </tr>
            <tr>
                <td><label>Năm Xuất Bản</label></td>
                <td><input type="date" name="NamSX"/></td>
            </tr>
        </table>
        <div class="d-flex justify-content-center mt-5">
            <button class="btn btn-light bg-success">Thêm</button>
        </div>

    </form>
</div>
</body>
</html>
