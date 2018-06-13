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
                            <%--<h3><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">信息</font></font></h3>--%>
                                <div class="module-body">
                                    <div class="profile-head media">
                                        <a href="#" class="media-avatar pull-left">
                                            <img src="images/user.png">
                                        </a>
                                        <div class="media-body">
                                            <h4><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">
                                                ${user.name} </font></font>
                                            </h4>
                                            <div class="profile-details muted">
                                                <a href="#" class="btn"><i class="icon-star shaded"></i><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">${user.department}</font></font></a>
                                                <a href="#" class="btn"><i class="icon-star shaded"></i><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">${user.position} </font></font></a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="profile-tab nav nav-tabs"></div>
                                    <div class="profile-tab-content tab-content">
                                        <div class="tab-pane fade active in" id="activity">
                                            <div class="stream-list">



                                                <c:forEach items="${massageList}" var="itemmassage" >
                                                    <div class="media stream">
                                                        <a href="#" class="media-avatar medium pull-left">
                                                            <img src="images/user.png">
                                                            <h4 class="stream-author"><font style="vertical-align: inherit;margin-left: 20px"><font style="vertical-align: inherit;">
                                                                    ${itemmassage.user.name} </font></font>
                                                            </h4>
                                                        </a>
                                                        <div class="media-body">
                                                            <div class="stream-headline">
                                                                <div class="stream-text"><font style="vertical-align: inherit;">
                                                                    <h4>
                                                                            ${itemmassage.name}
                                                                    </h4>
                                                                        ${itemmassage.text}
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </c:forEach>



                                                <br>
                                            </div>
                                        </div>
                                    </div>
                                </div>
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

</body>
</html>
