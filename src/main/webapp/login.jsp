<%--
  Created by IntelliJ IDEA.
  User: malegod
  Date: 2018/6/3
  Time: 下午11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>通信项目管理系统-登录</title>
    <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css">
    <link type="text/css" href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link type="text/css" href="css/theme.css" rel="stylesheet">
    <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
    <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600' rel='stylesheet'>
</head>
<body>

<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".navbar-inverse-collapse">
                <i class="icon-reorder shaded"></i>
            </a>

            <a class="brand" href="index.html">
                通信项目管理系统
            </a>

        </div>
    </div><!-- /navbar-inner -->
</div><!-- /navbar -->

<div class="wrapper">
    <div class="container">
        <div class="row">
            <div class="module module-login span4 offset4">
                <form class="form-vertical" action="/login" method="post">
                    <div class="module-head">
                        <h3>登录</h3>
                    </div>
                    <div class="module-body">
                        <div class="control-group">
                            <div class="controls row-fluid">
                                <input class="span12" type="text" id="inputEmail" placeholder="用户名" name="num">
                            </div>
                        </div>
                        <div class="control-group">
                            <div class="controls row-fluid">
                                <input class="span12" type="password" id="inputPassword" placeholder="密码" name="password">
                            </div>
                        </div>
                    </div>
                    <div class="module-foot">
                        <div class="control-group">
                            <div class="controls clearfix">
                                <button type="submit" class="btn btn-primary pull-right">登录</button>
                                <label class="checkbox">
                                    <input type="checkbox"> 记住我
                                </label>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div><!--/.wrapper-->

<div class="footer">
    <div class="container">
        <b class="copyright">&copy; 2014 Edmin - EGrappler.com </b> 保留所有权利。
    </div>
</div>
<script src="scripts/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="scripts/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
<script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>