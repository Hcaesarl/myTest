<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: malegod
  Date: 2018/6/5
  Time: 下午4:09
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
                                <i class="menu-icon icon-tasks"> </i>
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

                            <div class="module">
                                <div class="module-body table">
                                    <table cellpadding="0" cellspacing="0" border="0" class="datatable-1 table table-bordered table-striped	 display" width="100%">
                                        <thead>
                                        <tr>
                                            <th>员工编号</th>
                                            <th>员工姓名</th>
                                            <th>所在部门</th>
                                            <th>岗位职责</th>
                                            <th>联系电话</th>
                                            <th>操作</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${reviewUserList}" var="itemUser" varStatus="status">
                                                <c:if test="${status.index%2==0}">
                                                    <tr class="odd gradeX">
                                                        <form action="/changetype">
                                                        <td>${itemUser.num}</td>
                                                        <td>${itemUser.name}<input type="hidden" name="id" value="${itemUser.id}"></td>
                                                        <td>${itemUser.department}</td>
                                                        <td class="center">${itemUser.position}</td>
                                                        <td class="center">${itemUser.tel}</td>
                                                        <td class="center"><button class="btn btn-success" type="submit">通过</button></td>
                                                        </form>
                                                    </tr>
                                                </c:if>
                                                <c:if test="${status.index%2==1}">
                                                    <tr class="even gradeC">
                                                        <form action="/changetype">
                                                        <td>${itemUser.num}</td>
                                                        <td>${itemUser.name}<input type="hidden" name="id" value="${itemUser.id}"></td>
                                                        <td>${itemUser.department}</td>
                                                        <td class="center">${itemUser.position}</td>
                                                        <td class="center">${itemUser.tel}</td>
                                                        <td class="center"><button class="btn btn-success" type="submit">通过</button></td>
                                                        </form>
                                                    </tr>
                                                </c:if>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div><!--/.module-->


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