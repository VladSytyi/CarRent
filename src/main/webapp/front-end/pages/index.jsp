<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../css/styles.css"/>
    <title>Auto service</title>
    <style>
        #inner-container{
            width: 100% !important;
            height: 500px !important;
            margin-top: 2%;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row">
                <div class="col-8">
                    <h1 id="logo-text">Auto Rent</h1>
                </div>
                <div class="col-3">
                    <form id="login-form" action="/rest" method="post">
                        <input type="hidden" value="Login" name="Command"/>
                        <div class="form-group">
                            <label>Login</label>
                            <input type="text" class="form-control" name="username"  placeholder="Login">
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" class="form-control" name="password" placeholder="Password">
                        </div>
                        <input type="submit" class="btn btn-default" value="Sign in" name="Sign in"/>
                        <a href="/front-end/pages/register.jsp" class="btn btn-link">Sign up</a>
                    </form>
                </div>
                <div id="inner-container" class="col-12">
                    <img src="https://a.d-cd.net/9e8a90es-960.jpg" style="margin-left: 2%"/>
                </div>
            </div>
        <div>
        </div>
        </div>
    </div>
    <footer>
        <p>&copy; 2017 Auto-rent.com</p>
    </footer>
</body>
</html>