<%-- 
    Document   : login
    Created on : Feb 28, 2022, 3:20:34 PM
    Author     : Sown
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="author" content="Muhamad Nauval Azhar">
        <meta name="viewport" content="width=device-width,initial-scale=1">
        <meta name="description" content="This is a login page template based on Bootstrap 5">
        <title>MixiBook - Đổi mật khẩu</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
    </head>

    <body>
        <section class="h-100">
            <div class="container h-100">
                <div class="row justify-content-sm-center h-100">
                    <div class="col-xxl-4 col-xl-5 col-lg-5 col-md-7 col-sm-9">
                        <div class="text-center my-5">
                            <a href="home"><img src="img/logo.png" alt="logo" width="300"></a>
                        </div>
                        <div class="card shadow-lg">
                            <div class="card-body p-5">

                                <h1 class="fs-4 card-title fw-bold mb-4">Đổi mật khẩu</h1>
                                <form action="changepass" method="POST" class="needs-validation"  autocomplete="off">
                                    <input id="email" type="text" class="form-control" name="user" value="${sessionScope.account.user}" hidden required>
                                    <input class="form-control" name="passcheck" value="${sessionScope.account.pass}" hidden required>
                                    <div class="mb-3">
                                        <div class="mb-2 w-100">
                                            <label class="text-muted" for="oldpass">Mật khẩu cũ</label>

                                        </div>
                                        <input id="password" type="password" class="form-control" name="oldpass" required>
                                        <div class="invalid-feedback">
                                            Vui lòng nhập mật khẩu
                                        </div>
                                    </div>
                                    <div class="mb-3">
                                        <div class="mb-2 w-100">
                                            <label class="text-muted" for="newpass">Mật khẩu mới</label>

                                        </div>
                                        <input id="password" type="password" class="form-control" name="newpass" required>
                                        <div class="invalid-feedback">
                                            Vui lòng nhập mật khẩu
                                        </div>
                                    </div>
                                    <div class="mb-3">
                                        <div class="mb-2 w-100">
                                            <label class="text-muted" for="renewpass">Nhập lại mật khẩu mới</label>

                                        </div>
                                        <input id="password" type="password" class="form-control" name="renewpass" required>
                                        <div class="invalid-feedback">
                                            Vui lòng nhập mật khẩu
                                        </div>
                                    </div>
                                    <div class="d-flex align-items-center">
                                        <div class="form-check">

                                            <label for="remember" class="form-check-label"></label>
                                        </div>
                                        <button type="submit" class="btn btn-primary ms-auto" >
                                            Đổi mật khẩu
                                        </button>

                                    </div>

                                </form>

                            </div>

                            <div class="card-footer py-3 border-0">

                                <div class="text-center" style="color: red">${requestScope.error}</div>
                                <div class="text-center">

                                    <a href="home" class="text-dark">Về trang chủ</a>
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
</html>
