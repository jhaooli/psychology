
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Home</title>
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
                        <!-- 已登录 不需要登录注册按钮了
                        <div class="login"><a href="#" data-toggle="modal" data-target="#login-modal" class="login-btn"><i class="fa fa-sign-in"></i><span class="d-none d-md-inline-block">Sign In</span></a><a href="customer-register11.html" class="signup-btn"><i class="fa fa-user"></i><span class="d-none d-md-inline-block">Sign Up</span></a></div>
                        -->
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
            <div class="container"><a href="#" class="navbar-brand home"><img src="img/logo.png" alt="Universal logo" class="d-none d-md-inline-block"><img src="img/logo-small.png" alt="Universal logo" class="d-inline-block d-md-none"><span class="sr-only">Universal - go to homepage</span></a>
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




    <section style="background: url('img/photogrid.jpg') center center repeat; background-size: cover;" class="bar background-white relative-positioned">
        <div class="container">
            <!-- Carousel Start-->
            <div class="home-carousel">
                <div class="dark-mask mask-primary"></div>
                <div class="container">
                    <div class="homepage owl-carousel">
                        <div class="item">
                            <div class="row">
                                <div class="col-md-5 text-right">
                                    <p><img src="img/logo.png" alt="" class="ml-auto"></p>
                                    <h1>国内专业心理服务平台</h1>
                                    <p>严选Top1%的心理咨询师<br>只提供高质量的心理服务</p>
                                </div>
                                <div class="col-md-7"><img src="img/template-homepage.png" alt="" class="img-fluid"></div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="row">
                                <div class="col-md-7 text-center"><img src="img/template-mac.png" alt="" class="img-fluid"></div>
                                <div class="col-md-5">
                                    <h2>心理咨询</h2>
                                    <ul class="list-unstyled">
                                        <li>有关心理咨询</li>
                                        <li>你需要知道的都在这里</li>

                                    </ul>
                                </div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="row">
                                <div class="col-md-5 text-right">
                                    <h1>心理服务</h1>
                                    <ul class="list-unstyled">
                                        <li>针对 情绪压力</li>
                                        <li>亲密关系/性心理</li>
                                        <li>亲子教育/个人成长 等不同领域</li>
                                        <li>提供个人化专业定制服务</li>
                                    </ul>
                                </div>
                                <div class="col-md-7"><img src="img/template-easy-customize.png" alt="" class="img-fluid"></div>
                            </div>
                        </div>
                        <div class="item">
                            <div class="row">
                                <div class="col-md-7"><img src="img/template-easy-code.png" alt="" class="img-fluid"></div>
                                <div class="col-md-5">
                                    <h1>有关心理学的一切</h1>
                                    <ul class="list-unstyled">
                                        <li>不仅仅是心理咨询</li>
                                        <li>你可以在这里找到多样性的心理健康服务</li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Carousel End-->
        </div>
    </section>


    <section class="bar background-white">
        <div class="container text-center">
            <div class="row">
                <div class="col-lg-4 col-md-6">
                    <div class="box-simple">
                        <div class="icon-outlined"><a href="/reservation"><i class="fa fa-desktop"></i></a></div>
                        <h3 class="h4">心理服务预约</h3>
                        <p>Multiple ways to make an appointment. Suitable for your psychological counseling</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="box-simple">
                        <div class="icon-outlined"><a href="#"><i class="fa fa-print"></i></a></div>
                        <h3 class="h4">心理服务反馈</h3>
                        <p>The content reaction, also known as interpretation or explanation, means that the consultant comprehensively sorts out the main words and thoughts of the help-seeker and then feeds back to the help-seeker.</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="box-simple">
                        <div class="icon-outlined"><a href="#"><i class="fa fa-globe"></i></a></div>
                        <h3 class="h4">心理文章</h3>
                        <p>Psychological processes are not only manifested in the physical activities of human beings, but also in the activities of human interaction. Communication activities are the process of contact, information exchange and mutual understanding between people, that is, the process of interaction between people.</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-md-6">
                    <div class="box-simple">
                        <div class="icon-outlined"><a href="#"><i class="fa fa-lightbulb-o"></i></a></div>
                        <h3 class="h4">个人中心</h3>
                        <p>By filling in detailed personal information, you can find more people who share your interests, and at the same time, let more people pay attention to you.</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="box-simple">
                        <div class="icon-outlined"><a href="/activity/selection"><i class="fa fa-envelope-o"></i></a></div>
                        <h3 class="h4">最新活动</h3>
                        <p>Bringing together various activities, when netizens enter the website, they can find their own activities according to their own needs. The activity supermarkets on the network can initiate activities or participate in activities on such websites. Various activities are in inside</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-6">
                    <div class="box-simple">
                        <div class="icon-outlined"><a href="#"><i class="fa fa-user"></i></a></div>
                        <h3 class="h4">管理员入口</h3>
                        <p>Entrance to a person who performs management functions, directs or coordinates others to complete specific tasks in the organization</p>
                    </div>
                </div>
            </div>
        </div>
    </section>




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

