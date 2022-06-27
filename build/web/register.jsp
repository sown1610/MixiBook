<%-- 
    Document   : register
    Created on : Mar 2, 2022, 3:22:46 PM
    Author     : Sown
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="author" content="Muhamad Nauval Azhar">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <meta name="description" content="This is a login page template based on Bootstrap 5">
        <title>MixiBook - Đăng ký</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    </head>

    <body>
        <section class="h-100">
            <div class="container h-100">
                <div class="row justify-content-sm-center h-100">
                    <div class="col-xxl-4 col-xl-5 col-lg-5 col-md-7 col-sm-9">
                        <div class="text-center my-5">
                            <a href="home"><img src="img/logo.png" alt="logo" width="200"></a>
                        </div>
                        <div class="card shadow-lg">
                            <div class="card-body p-5">
                                
                                <h1 class="fs-4 card-title fw-bold mb-4">Đăng ký</h1>
                                <form action="register" method="POST" class="needs-validation">
                                    <div class="mb-3">
                                        <label class="mb-2 text-muted" for="fullname">Họ và tên</label>
                                        <input id="name" type="text" class="form-control" name="fullname" value="" required autofocus>
                                    </div>

                                    <div class="mb-3">
                                        <label class="mb-2 text-muted" for="email">E-Mail</label>
                                        <input id="email" type="email" class="form-control" name="email" value="" required>
                                    </div>
                                    <div class="mb-3">
                                        <label class="mb-2 text-muted" for="phone">Số điện thoại</label>
                                        <input id="email" type="tel" class="form-control" name="phone" value="" required>
                                    </div>
                                    <div class="mb-3">
                                        <label class="mb-2 text-muted" for="user">Tên tài khoản</label>
                                        <input id="name" type="text" class="form-control" name="user" required autofocus>
                                    </div>

                                    <div class="mb-3">
                                        <label class="mb-2 text-muted" for="pass">Mật khẩu</label>
                                        <input id="password" type="password" class="form-control" name="pass" required>
                                    </div>
                                    <div class="mb-3">
                                        <label class="mb-2 text-muted" for="repass">Nhập lại mật khẩu</label>
                                        <input id="password" type="password" class="form-control" name="repass" required>
                                    </div>
                                    <!--                                    <p class="form-text text-muted mb-3">
                                                                            By registering you agree with our terms and condition.
                                                                        </p>-->

                                    <div class="align-items-center d-flex">
                                        <button type="submit" class="btn btn-primary ms-auto">
                                            Đăng ký	
                                        </button>
                                    </div>
                                </form>
                            </div>
                            
                                <div class="card-footer py-3 border-0 text-center" style="color: red; font-weight: bold;">
                                    <label  class="">${e}</label>
                                </div>
                           
                            
                            <div class="card-footer py-3 border-0">
                                <div class="text-center">
                                    Đã có tài khoản? <a href="login" class="text-dark">Đăng nhập</a>
                                </div>
                            </div>
                        </div>
                        <div class="text-center mt-5 text-muted">
                            MixiBook &copy; CỬA HÀNG TRUYỆN TRANH
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <script src="js/login.js"></script>
    </body>
</html>
