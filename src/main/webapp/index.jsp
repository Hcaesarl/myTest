<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: malegod
  Date: 2018/6/4
  Time: 上午8:32
  To change this template use File | Settings | File Templates.
--%>
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
                               <i class="menu-icon icon-tasks"></i>
                               ${item.name}
                               
                           </a>
                       </li>
                   </c:forEach>
               </ul>
           </div>
           <div class="span9">
               <div class="content">
                   <div class="btn-controls">
                       <div class="btn-box-row row-fluid">
                           <a href="#" class="btn-box big span4">
                               <i class=" icon-random"></i>
                               <b>65%</b>
                               <p class="text-muted">Growth</p>
                           </a>
                           <a href="#" class="btn-box big span4">
                               <i class="icon-user"></i>
                               <b>${department.users.size()}</b>
                               <p class="text-muted">部门员工</p>
                           </a>
                           <a href="#" class="btn-box big span4">
                               <i class="icon-money"></i>
                               <b>15,152</b>
                               <p class="text-muted">Profit</p>
                           </a>
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
