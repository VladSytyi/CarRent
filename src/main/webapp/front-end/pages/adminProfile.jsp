<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>
    <title>Title</title>
</head>
<body>
<h1>Admin ${username}</h1>
    <div class="container">
        <div class="row">
            <div class="col-6">
                <h2>Users</h2>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Username</th>
                            <th>Password</th>
                            <th>Role</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${users}" var="user">
                            <tr>
                                <th>${user.userId}</th>
                                <th>${user.username}</th>
                                <th>${user.password}</th>
                                <th>${user.role}</th>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="col-6">

            </div>
        </div>
        <form method="get" action="/rest">
            <input type="hidden" name="Command" value="Logout">
            <input type="submit" class="btn btn-default" value="Logout" name="Logout"/>
        </form>
    </div>
</body>
</html>