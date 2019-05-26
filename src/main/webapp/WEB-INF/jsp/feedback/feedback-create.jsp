<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>反馈</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="houtai/vendor/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <!-- Google fonts - Popppins for copy-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:300,400,800">
    <!-- orion icons-->
    <link rel="stylesheet" href="houtai/css/orionicons.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="houtai/css/style.default.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="houtai/css/custom.css">
    <!-- Favicon-->
    <link rel="shortcut icon" href="houtai/img/favicon.png?3">
    <!-- Tweaks for older IEs--><!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<body>

<!-- navbar-->
<header class="header">
    <nav class="navbar navbar-expand-lg px-4 py-2 bg-white shadow"><a href="#" class="sidebar-toggler text-gray-500 mr-4 mr-lg-5 lead"><i class="fas fa-align-left"></i></a><a href="index.html" class="navbar-brand font-weight-bold text-uppercase text-base">心理预约</a>
        <ul class="ml-auto d-flex align-items-center list-unstyled mb-0">
            <li class="nav-item">
                <form id="searchForm" class="ml-auto d-none d-lg-block">
                    <div class="form-group position-relative mb-0">
                        <button type="submit" style="top: -3px; left: 0;" class="position-absolute bg-white border-0 p-0"><i class="o-search-magnify-1 text-gray text-lg"></i></button>
                        <input type="search" placeholder="Search ..." class="form-control form-control-sm border-0 no-shadow pl-4">
                    </div>
                </form>
            </li>
            <li class="nav-item dropdown mr-3"><a id="notifications" href="http://example.com" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="nav-link dropdown-toggle text-gray-400 px-1"><i class="fa fa-bell"></i><span class="notification-icon"></span></a>
                <div aria-labelledby="notifications" class="dropdown-menu"><a href="#" class="dropdown-item">
                    <div class="d-flex align-items-center">
                        <div class="icon icon-sm bg-violet text-white"><i class="fab fa-twitter"></i></div>
                        <div class="text ml-2">
                            <p class="mb-0">You have 2 followers</p>
                        </div>
                    </div></a><a href="#" class="dropdown-item">
                    <div class="d-flex align-items-center">
                        <div class="icon icon-sm bg-green text-white"><i class="fas fa-envelope"></i></div>
                        <div class="text ml-2">
                            <p class="mb-0">You have 6 new messages</p>
                        </div>
                    </div></a><a href="#" class="dropdown-item">
                    <div class="d-flex align-items-center">
                        <div class="icon icon-sm bg-blue text-white"><i class="fas fa-upload"></i></div>
                        <div class="text ml-2">
                            <p class="mb-0">Server rebooted</p>
                        </div>
                    </div></a><a href="#" class="dropdown-item">
                    <div class="d-flex align-items-center">
                        <div class="icon icon-sm bg-violet text-white"><i class="fab fa-twitter"></i></div>
                        <div class="text ml-2">
                            <p class="mb-0">You have 2 followers</p>
                        </div>
                    </div></a>
                    <div class="dropdown-divider"></div><a href="#" class="dropdown-item text-center"><small class="font-weight-bold headings-font-family text-uppercase">View all notifications</small></a>
                </div>
            </li>
            <li class="nav-item dropdown ml-auto"><a id="userInfo" href="http://example.com" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" class="nav-link dropdown-toggle"><img src="/houtai/img/avatar-6.jpg" alt="Jason Doe" style="max-width: 2.5rem;" class="img-fluid rounded-circle shadow"></a>
                <div aria-labelledby="userInfo" class="dropdown-menu"><a href="#" class="dropdown-item"><strong class="d-block text-uppercase headings-font-family">Mark Stephen</strong><small>Web Developer</small></a>
                    <div class="dropdown-divider"></div><a href="#" class="dropdown-item">Settings</a><a href="#" class="dropdown-item">Activity log       </a>
                    <div class="dropdown-divider"></div><a href="login.html" class="dropdown-item">Logout</a>
                </div>
            </li>
        </ul>
    </nav>
</header>
<br>

<div class="container text-center">
    <!--
    <div class="row">
        <div class="col-lg-3 col-md-6">
            <div class="box-simple">
                <div class="icon-outlined"></div>
                <a class="btn btn-lg btn-primary btn-shadow"
                   href="/reservation" target="_blank" role="button" >
                    <h3 class="h4">心理服务预约</h3>
                </a>

            </div>
        </div>
        <div class="col-lg-3 col-md-6">
            <div class="box-simple">
                <div class="icon-outlined"></div>

                <a class="btn btn-lg btn-primary btn-shadow"
                   href="/reservation/update" target="_blank" role="button" >
                    <h3 class="h4">修改预约</h3>
                </a>

            </div>
        </div>
        <div class="col-lg-3 col-md-6">
            <div class="box-simple">
                <div class="icon-outlined"></div>

                <a class="btn btn-lg btn-primary btn-shadow"
                   href="/reservation-delete" target="_blank" role="button" >
                    <h3 class="h4">取消预约</h3>
                </a>

            </div>
        </div>
        <div class="col-lg-3 col-md-6">
            <div class="box-simple">
                <div class="icon-outlined"></div>

                <a class="btn btn-lg btn-primary btn-shadow"
                   href="/reservation/selections" target="_blank" role="button" >
                    <h3 class="h4">查询预约</h3>
                </a>

            </div>

        </div>

    </div>
    -->

    <br>







    <div class="d-flex align-items-stretch">




        <!-- 预约表 -->
        <div class="page-holder w-100 d-flex flex-wrap">
            <div class="col-lg-12 mb-5">
                <div class="card">
                    <div class="card-header">
                        <h3 class="h6 text-uppercase mb-0">心理咨询反馈</h3>
                    </div>
                    <div class="card-body">
                        <form class="form-horizontal" action="/feedback/insertFeedback" method="post">


                            <div class="form-group row">
                                <label class="col-md-3 form-control-label">反馈</label>
                                <div class="col-md-9">
                                    <input  type="text" class="form-control" name="feedbacks"><small class="form-text text-muted ml-3">给咨询者的简单反馈。</small>
                                </div>
                            </div>
                            <div class="line"></div>
                            <!--
                            <div class="form-group row">
                                <label class="col-md-3 form-control-label">请选择你的预约日期</label>
                                <div class="col-md-9">
                                    <input type="date" name="date" class="form-control">
                                </div>
                            </div>
                            -->
                            <div class="line"></div>












                            <div class="form-group row">
                                <label class="col-md-3 form-control-label">请选择咨询者<br><small class="text-primary"></small></label>
                                <div class="col-md-9">

                                    <c:forEach items="${detailList}" var="item">

                                    <div class="custom-control custom-radio custom-control-inline">
                                        <input id="customRadioInline1${item.id}" type="radio"  name="studentName" class="custom-control-input" value="${item.studentName}">
                                        <input name="studentId" value="${item.studentId}" style="display: none">
                                        <label for="customRadioInline1${item.id}"  class="custom-control-label">${item.studentName} </label>
                                        <br>
                                        <label>预约时间 ${item.date}</label>
                                    </div>
                                        <br>
                                    </c:forEach>

                                </div>
                            </div>
                            <div class="line"></div>




                            <div class="form-group row">
                                <div class="col-md-9 ml-auto">
                                    <button type="submit" class="btn btn-secondary">取消</button>
                                    <button type="submit" class="btn btn-primary">提交</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>














            <!--footer -->

            <footer class="footer bg-white shadow align-self-end py-3 px-xl-5 w-100">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-6 text-center text-md-left text-primary">
                            <p class="mb-2 mb-md-0">GDOU 313 &copy; 2018-2020</p>
                        </div>

                    </div>
                </div>
            </footer>
        </div>





    </div>


</div>




    <!-- JavaScript files-->
    <script src="houtai/vendor/jquery/jquery.min.js"></script>
    <script src="houtai/vendor/popper.js/umd/popper.min.js"> </script>
    <script src="houtai/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="houtai/vendor/jquery.cookie/jquery.cookie.js"> </script>
    <script src="houtai/vendor/chart.js/Chart.min.js"></script>
    <script src="houtai/js/js.cookie.min.js"></script>
    <script src="houtai/js/front.js"></script>
</body>
</html>