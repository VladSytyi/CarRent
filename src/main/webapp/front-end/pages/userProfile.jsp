<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>
    <title>Title</title>
    <style type="text/css">
        .auto-image{
            width: 300px;
            height: 200px;
        }
    </style>
</head>
<body>
    <h1>User : ${username}</h1>

    <div class="container">
        <div class="row">

            <div class="col-6">
                <h2>All autos</h2>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Description</th>
                            <th>View</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${autos}" var="auto">
                            <tr>
                                <th>${auto.autoTitle}</th>
                                <th>${auto.description}</th>
                                <th><img class ="auto-image" src="${auto.imageLink}"/></th>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="col-6">

            </div>
        </div>
    </div>
    <form method="get" action="/rest">
        <input type="hidden" name="Command" value="Logout">
        <input type="submit" class="btn btn-default" value="Logout" name="Logout"/>
    </form>
</body>
</html>