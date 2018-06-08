<%--
  Created by IntelliJ IDEA.
  User: malegod
  Date: 2018/6/8
  Time: 上午9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css">
    <link type="text/css" href="bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">
    <link type="text/css" href="css/theme.css" rel="stylesheet">
    <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
    <link type="text/css" href='http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600'
          rel='stylesheet'>

</head>
<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".navbar-inverse-collapse">
                <i class="icon-reorder shaded"></i></a><a class="brand" href="index.html">Edmin </a>
            <div class="nav-collapse collapse navbar-inverse-collapse">
                <ul class="nav pull-right">
                    <li class="nav-user dropdown"><a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        <img src="images/user.png" class="nav-avatar" />
                        <span class="username">${user.name}</span>
                        <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">个人信息</a></li>
                            <li><a href="#">登出</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.nav-collapse -->
        </div>
    </div>
    <!-- /navbar-inner -->
</div>
<!-- /navbar -->

<div class="wrapper">
    <div class="container">
        <div class="row">
            <div class="span3">
                <ul class="widget widget-menu unstyled">
                    <c:forEach items="${list}" var="item">
                        <li class="active">
                            <a href="/${item.ename}">
                                <i class="menu-icon icon-tasks"> </i>
                                    ${item.name}
                            </a>
                        </li>
                    </c:forEach>
                </ul>
            </div>
            <div class="span9">
                <div class="content">
                    <div class="module">
                        <div class="module-head">
                            <h3><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">添加信息</font></font></h3>
                        </div>
                        <div class="module-body">





                            <br>

                            <form class="form-horizontal row-fluid" action="/addmassage">
                                <input type="hidden" name="user.id" value="${user.id}">
                                <div class="control-group">
                                    <label class="control-label" for="projectName"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">标题</font></font></label>
                                    <div class="controls">
                                        <input type="text" id="projectName" placeholder="不超过20个字" class="span8" name="name">
                                    </div>
                                </div>

                                <div class="control-group">
                                    <label class="control-label" for="projectName"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">正文</font></font></label>
                                    <div class="controls">
                                        <textarea class="span8" id="massage_text" rows="5" placeholder="不超过500字" name="text" maxlength="500" style="height: 500px;resize: none"></textarea>
                                    </div>
                                </div>
                                <div class="control-group">
                                    <label class="control-label" for="projectName"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;"></font></font></label>
                                    <div class="controls">
                                        <div id="textlength">
                                            0/500字
                                        </div>
                                    </div>
                                </div>

                                <div class="control-group">
                                    <div class="controls">
                                        <button type="submit" class="btn btn-info"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">发布信息</font></font></button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </div>
</div>


<script src="scripts/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="scripts/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>
<script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="scripts/flot/jquery.flot.js" type="text/javascript"></script>
<script src="scripts/flot/jquery.flot.resize.js" type="text/javascript"></script>
<script src="scripts/datatables/jquery.dataTables.js" type="text/javascript"></script>
<script src="scripts/common.js" type="text/javascript"></script>
<script>
    $(function () {
        var text=document.getElementById("massage_text")
        text.addEventListener("keyup",function (ev) {
            $("#textlength").html($("#massage_text").val().length + "/500字");
        })
    })
</script>
</body>
</html>