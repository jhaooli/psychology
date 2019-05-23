<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>活动</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
    <!-- Google fonts - Roboto-->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,700">
    <!-- Bootstrap Select-->
    <link rel="stylesheet" href="vendor/bootstrap-select/css/bootstrap-select.min.css">
    <!-- owl carousel-->
    <link rel="stylesheet" href="vendor/owl.carousel/assets/owl.carousel.css">
    <link rel="stylesheet" href="vendor/owl.carousel/assets/owl.theme.default.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="css/style.default.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="css/custom.css">
    <!-- Favicon and apple touch icons-->
    <link rel="shortcut icon" href="img/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="img/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="57x57" href="img/apple-touch-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="72x72" href="img/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="img/apple-touch-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="img/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="img/apple-touch-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="img/apple-touch-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="img/apple-touch-icon-152x152.png">
    <!-- Tweaks for older IEs--><!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
</head>
<body>
<div id="all">
    <!-- Top bar-->
    <div class="top-bar">
        <div class="container">
            <div class="row d-flex align-items-center">
                <div class="col-md-6 d-md-block d-none">
                    <p>Contact us on GDOU</p>
                </div>
                <div class="col-md-6">
                    <div class="d-flex justify-content-md-end justify-content-between">
                        <ul class="list-inline contact-info d-block d-md-none">
                            <li class="list-inline-item"><a href="#"><i class="fa fa-phone"></i></a></li>
                            <li class="list-inline-item"><a href="#"><i class="fa fa-envelope"></i></a></li>
                        </ul>
                        <div class="login"><a href="#" data-toggle="modal" data-target="#login-modal" class="login-btn"><i class="fa fa-sign-in"></i><span class="d-none d-md-inline-block">Sign In</span></a><a href="customer-register11.html" class="signup-btn"><i class="fa fa-user"></i><span class="d-none d-md-inline-block">Sign Up</span></a></div>
                        <ul class="social-custom list-inline">
                            <li class="list-inline-item"><a href="#"><i class="fa fa-facebook"></i></a></li>
                            <li class="list-inline-item"><a href="#"><i class="fa fa-google-plus"></i></a></li>
                            <li class="list-inline-item"><a href="#"><i class="fa fa-twitter"></i></a></li>
                            <li class="list-inline-item"><a href="#"><i class="fa fa-envelope"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Top bar end-->
    <!-- Login Modal-->
    <div id="login-modal" tabindex="-1" role="dialog" aria-labelledby="login-modalLabel" aria-hidden="true" class="modal fade">
        <div role="document" class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 id="login-modalLabel" class="modal-title">Customer Login</h4>
                    <button type="button" data-dismiss="modal" aria-label="Close" class="close"><span aria-hidden="true">×</span></button>
                </div>
                <div class="modal-body">
                    <form action="/new/login" method="post">
                        <div class="form-group">
                            <input id="email_modal" name="usernamed" type="text" placeholder="username" class="form-control">
                        </div>
                        <div class="form-group">
                            <input id="password_modal" type="password" name="password" placeholder="password" class="form-control">
                        </div>
                        <p class="text-center">
                            <button class="btn btn-template-outlined" type="submit"><i class="fa fa-sign-in"></i> Log in</button>
                        </p>
                    </form>
                    <p class="text-center text-muted">Not registered yet?</p>
                    <p class="text-center text-muted"><a href="customer-register11.html"><strong>Register now</strong></a>! It is easy and done in 1 minute and gives you access to special discounts and much more!</p>
                </div>
            </div>
        </div>
    </div>
    <!-- Login modal end-->




    <!-- Navbar Start-->
    <header class="nav-holder make-sticky">
        <div id="navbar" role="navigation" class="navbar navbar-expand-lg">
            <div class="container"><a href="index11.html" class="navbar-brand home"><img src="img/logo.png" alt="Universal logo" class="d-none d-md-inline-block"><img src="img/logo-small.png" alt="Universal logo" class="d-inline-block d-md-none"><span class="sr-only">Universal - go to homepage</span></a>
                <button type="button" data-toggle="collapse" data-target="#navigation" class="navbar-toggler btn-template-outlined"><span class="sr-only">Toggle navigation</span><i class="fa fa-align-justify"></i></button>
                <div id="navigation" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav ml-auto">
                        <li class="nav-item dropdown active"><a href="javascript: void(0)" data-toggle="dropdown" class="dropdown-toggle">Home <b class="caret"></b></a>


                        </li>
                        <li class="nav-item dropdown menu-large"><a href="#" data-toggle="dropdown" class="dropdown-toggle">About<b class="caret"></b></a>


                        </li>
                    </ul>
                </div>
            </div>
        </div>

    </header>
    <!-- Navbar End-->
    <!-- ========== FULL WIDTH MEGAMENU ==================-->
    <div class="line"></div>
    <br>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <h2>
                    活动版块
                </h2>
                <div class="col-md-8 column">
                <p>
                    <small>
                    心理活动是大脑对客观世界反映的过程。心理活动与大脑的高级神经活动是脑内同一生理过程的不同方面：从兴奋与抑制相互作用而构成的生理过程看，是高级神经活动；从神经生理过程所产生的映象及所概括的事物的因果联系和意义看，属心理活动。笼统地讲，人的内心所进行的一切活动都属于心理活动，人们对周围世界的观察、注意感兴趣的事物、体会生活中的喜怒哀乐、克服困难完成一项工作或任务等等，这些都是人的心理活动。
                    </small>
                </p>
                <p>
                    <a class="btn" href="#">详情 »</a>
                </p>
                </div>
                <div class="line"></div>

                <div class="row">
                    <c:forEach items="${detailList}" var="item">
                    <div class="col-md-4">
                        <div class="thumbnail">
                            <img height="200rem" width="300rem" alt="活动" src="img/${item.id}.png" />
                            <div class="caption">
                                <h3>
                                    ${item.title}
                                </h3>
                                <p>
                                    ${item.content}
                                </p>
                                <p>
                                    <a class="btn btn-primary" href="#">活动详情</a> <a class="btn" href="#">报名参与</a>
                                </p>
                            </div>
                        </div>
                    </div>
                    </c:forEach>

                </div>

            </div>
        </div>
    </div>
                    </div>









    <!-- Javascript files-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper.js/umd/popper.min.js"> </script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="vendor/jquery.cookie/jquery.cookie.js"> </script>
    <script src="vendor/waypoints/lib/jquery.waypoints.min.js"> </script>
    <script src="vendor/jquery.counterup/jquery.counterup.min.js"> </script>
    <script src="vendor/owl.carousel/owl.carousel.min.js"></script>
    <script src="vendor/owl.carousel2.thumbs/owl.carousel2.thumbs.min.js"></script>
    <script src="js/jquery.parallax-1.1.3.js"></script>
    <script src="vendor/bootstrap-select/js/bootstrap-select.min.js"></script>
    <script src="vendor/jquery.scrollto/jquery.scrollTo.min.js"></script>
    <script src="js/front.js"></script>

</body>
</html>
