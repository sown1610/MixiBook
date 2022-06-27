<%-- 
    Document   : carts
    Created on : Mar 5, 2022, 5:17:33 PM
    Author     : Sown
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!DOCTYPE html>
<!--[if IE 9 ]> <html lang="vi" class="ie9 loading-site no-js"> <![endif]-->
<!--[if IE 8 ]> <html lang="vi" class="ie8 loading-site no-js"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!--><html lang="vi" class="loading-site no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />

        <link rel="profile" href="https://gmpg.org/xfn/11" />
        <link rel="pingback" href="" />
        <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
        <script>(function (html) {
                html.className = html.className.replace(/\bno-js\b/, 'js')
            })(document.documentElement);</script>
        <meta name='robots' content='noindex, follow' />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
        <!-- This site is optimized with the Yoast SEO plugin v18.1 - https://yoast.com/wordpress/plugins/seo/ -->
        <title>MixiBook - Giỏ hàng</title>
        <meta property="og:locale" content="vi_VN" />
        <meta property="og:type" content="article" />
        <meta property="og:title" content="Cart - MixiShop" />

        <meta property="og:site_name" content="MixiShop" />
        <meta property="article:publisher" content="https://www.facebook.com/MixiShop-182674912385853/" />
        <meta property="article:modified_time" content="2019-07-15T04:55:23+00:00" />
        <meta name="twitter:card" content="summary_large_image" />
        <script type="application/ld+json" class="yoast-schema-graph">{"@context":"https://schema.org","@graph":[{"@type":"Organization","@id":"https://shop.mixigaming.com/#organization","name":"Mixishop","url":"https://shop.mixigaming.com/","sameAs":["https://www.facebook.com/MixiShop-182674912385853/"],"logo":{"@type":"ImageObject","@id":"https://shop.mixigaming.com/#logo","inLanguage":"vi","url":"https://shop.mixigaming.com/wp-content/uploads/2019/06/logo-mixi-tét.png","contentUrl":"https://shop.mixigaming.com/wp-content/uploads/2019/06/logo-mixi-tét.png","width":2018,"height":1207,"caption":"Mixishop"},"image":{"@id":"https://shop.mixigaming.com/#logo"}},{"@type":"WebSite","@id":"https://shop.mixigaming.com/#website","url":"https://shop.mixigaming.com/","name":"Mixishop","description":"MixiShop","publisher":{"@id":"https://shop.mixigaming.com/#organization"},"potentialAction":[{"@type":"SearchAction","target":{"@type":"EntryPoint","urlTemplate":"https://shop.mixigaming.com/?s={search_term_string}"},"query-input":"required name=search_term_string"}],"inLanguage":"vi"},{"@type":"WebPage","@id":"carts#webpage","url":"carts","name":"Cart - MixiShop","isPartOf":{"@id":"https://shop.mixigaming.com/#website"},"datePublished":"2015-11-19T10:40:52+00:00","dateModified":"2019-07-15T04:55:23+00:00","breadcrumb":{"@id":"carts#breadcrumb"},"inLanguage":"vi","potentialAction":[{"@type":"ReadAction","target":["carts"]}]},{"@type":"BreadcrumbList","@id":"carts#breadcrumb","itemListElement":[{"@type":"ListItem","position":1,"name":"Trang chủ","item":"https://shop.mixigaming.com/"},{"@type":"ListItem","position":2,"name":"Cart"}]}]}</script>
        <!-- / Yoast SEO plugin. -->

        <script data-require="jquery@3.1.1" data-semver="3.1.1" src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <link rel="stylesheet" href="style.css" />
        <script src="script.js"></script>
        <link rel='dns-prefetch' href='//fonts.googleapis.com' />
        <link rel='dns-prefetch' href='//s.w.org' />
        <link rel="alternate" type="application/rss+xml" title="Dòng thông tin MixiShop &raquo;" href="https://shop.mixigaming.com/feed/" />
        <link rel="alternate" type="application/rss+xml" title="Dòng phản hồi MixiShop &raquo;" href="https://shop.mixigaming.com/comments/feed/" />
        <script type="text/javascript">
            window._wpemojiSettings = {"baseUrl": "https:\/\/s.w.org\/images\/core\/emoji\/13.1.0\/72x72\/", "ext": ".png", "svgUrl": "https:\/\/s.w.org\/images\/core\/emoji\/13.1.0\/svg\/", "svgExt": ".svg", "source": {"concatemoji": "https:\/\/shop.mixigaming.com\/wp-includes\/js\/wp-emoji-release.min.js"}};
            /*! This file is auto-generated */
            !function (e, a, t) {
                var n, r, o, i = a.createElement("canvas"), p = i.getContext && i.getContext("2d");
                function s(e, t) {
                    var a = String.fromCharCode;
                    p.clearRect(0, 0, i.width, i.height), p.fillText(a.apply(this, e), 0, 0);
                    e = i.toDataURL();
                    return p.clearRect(0, 0, i.width, i.height), p.fillText(a.apply(this, t), 0, 0), e === i.toDataURL()
                }
                function c(e) {
                    var t = a.createElement("script");
                    t.src = e, t.defer = t.type = "text/javascript", a.getElementsByTagName("head")[0].appendChild(t)
                }
                for (o = Array("flag", "emoji"), t.supports = {everything:!0, everythingExceptFlag:!0}, r = 0; r < o.length; r++)
                    t.supports[o[r]] = function (e) {
                        if (!p || !p.fillText)
                            return!1;
                        switch (p.textBaseline = "top", p.font = "600 32px Arial", e) {
                            case"flag":
                                return s([127987, 65039, 8205, 9895, 65039], [127987, 65039, 8203, 9895, 65039]) ? !1 : !s([55356, 56826, 55356, 56819], [55356, 56826, 8203, 55356, 56819]) && !s([55356, 57332, 56128, 56423, 56128, 56418, 56128, 56421, 56128, 56430, 56128, 56423, 56128, 56447], [55356, 57332, 8203, 56128, 56423, 8203, 56128, 56418, 8203, 56128, 56421, 8203, 56128, 56430, 8203, 56128, 56423, 8203, 56128, 56447]);
                            case"emoji":
                                return!s([10084, 65039, 8205, 55357, 56613], [10084, 65039, 8203, 55357, 56613])
                        }
                        return!1
                    }(o[r]), t.supports.everything = t.supports.everything && t.supports[o[r]], "flag" !== o[r] && (t.supports.everythingExceptFlag = t.supports.everythingExceptFlag && t.supports[o[r]]);
                t.supports.everythingExceptFlag = t.supports.everythingExceptFlag && !t.supports.flag, t.DOMReady = !1, t.readyCallback = function () {
                    t.DOMReady = !0
                }, t.supports.everything || (n = function () {
                    t.readyCallback()
                }, a.addEventListener ? (a.addEventListener("DOMContentLoaded", n, !1), e.addEventListener("load", n, !1)) : (e.attachEvent("onload", n), a.attachEvent("onreadystatechange", function () {
                    "complete" === a.readyState && t.readyCallback()
                })), (n = t.source || {}).concatemoji ? c(n.concatemoji) : n.wpemoji && n.twemoji && (c(n.twemoji), c(n.wpemoji)))
            }(window, document, window._wpemojiSettings);
        </script>
        <style type="text/css">
            img.wp-smiley,
            img.emoji {
                display: inline !important;
                border: none !important;
                box-shadow: none !important;
                height: 1em !important;
                width: 1em !important;
                margin: 0 0.07em !important;
                vertical-align: -0.1em !important;
                background: none !important;
                padding: 0 !important;
            }
        </style>
        <link rel='stylesheet' id='sbi_styles-css'  href='https://shop.mixigaming.com/wp-content/plugins/instagram-feed/css/sbi-styles.min.css' type='text/css' media='all' />
        <link rel='stylesheet' id='wp-block-library-css'  href='https://shop.mixigaming.com/wp-includes/css/dist/block-library/style.min.css' type='text/css' media='all' />
        <link rel='stylesheet' id='wc-blocks-vendors-style-css'  href='https://shop.mixigaming.com/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/wc-blocks-vendors-style.css' type='text/css' media='all' />
        <link rel='stylesheet' id='wc-blocks-style-css'  href='https://shop.mixigaming.com/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/wc-blocks-style.css' type='text/css' media='all' />
        <style id='global-styles-inline-css' type='text/css'>
        </style>
        <link rel='stylesheet' id='dwas_styles-css'  href='https://shop.mixigaming.com/wp-content/plugins/woo-vietnam-checkout/assets/css/devvn_dwas_style.css' type='text/css' media='all' />
        <link rel='stylesheet' id='select2-css'  href='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/css/select2.css' type='text/css' media='all' />
        <style id='woocommerce-inline-inline-css' type='text/css'>
            .woocommerce form .form-row .required { visibility: visible; }
        </style>
        <link rel='stylesheet' id='flatsome-icons-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/fl-icons.css' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-main-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/flatsome.css' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-shop-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/flatsome-shop.css' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-style-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome-child/style.css' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-googlefonts-css'  href='//fonts.googleapis.com/css?family=Montserrat%3Aregular%2Cregular%2Cregular%2C700%2Cregular&#038;display=swap' type='text/css' media='all' />
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/jquery.min.js' id='jquery-core-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/jquery-migrate.min.js' id='jquery-migrate-js'></script>
        <script type='text/javascript' id='zxcvbn-async-js-extra'>
            /* <![CDATA[ */
            var _zxcvbnSettings = {"src": "https:\/\/shop.mixigaming.com\/wp-includes\/js\/zxcvbn.min.js"};
            /* ]]> */
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/zxcvbn-async.min.js' id='zxcvbn-async-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/wp-extra/js/copy.js' id='donotcopy-js'></script>
        <link rel="https://api.w.org/" href="https://shop.mixigaming.com/wp-json/" /><link rel="alternate" type="application/json" href="https://shop.mixigaming.com/wp-json/wp/v2/pages/54" /><link rel="EditURI" type="application/rsd+xml" title="RSD" href="https://shop.mixigaming.com/xmlrpc.php?rsd" />
        <link rel="wlwmanifest" type="application/wlwmanifest+xml" href="https://shop.mixigaming.com/wp-includes/wlwmanifest.xml" /> 
        <link rel='shortlink' href='https://shop.mixigaming.com/?p=54' />
        <link rel="alternate" type="application/json+oembed" href="https://shop.mixigaming.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fshop.mixigaming.com%2Fcart%2F" />
        <link rel="alternate" type="text/xml+oembed" href="https://shop.mixigaming.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fshop.mixigaming.com%2Fcart%2F&#038;format=xml" />
        <!--[if IE]><link rel="stylesheet" type="text/css" href="https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/ie-fallback.css"><script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.1/html5shiv.js"></script><script>var head = document.getElementsByTagName('head')[0],style = document.createElement('style');style.type = 'text/css';style.styleSheet.cssText = ':before,:after{content:none !important';head.appendChild(style);setTimeout(function(){head.removeChild(style);}, 0);</script><script src="https://shop.mixigaming.com/wp-content/themes/flatsome/assets/libs/ie-flexibility.js"></script><![endif]--><!-- Global site tag (gtag.js) - Google Analytics -->
        <script async src="https://www.googletagmanager.com/gtag/js?id=UA-129718705-2"></script>
        <script>
            window.dataLayer = window.dataLayer || [];
            function gtag() {
                dataLayer.push(arguments);
            }
            gtag('js', new Date());
            gtag('config', 'UA-129718705-2');
        </script>
        <noscript><style>.woocommerce-product-gallery{ opacity: 1 !important; }</style></noscript>
        <link rel="icon" href="https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-32x32.png" sizes="32x32" />
        <link rel="icon" href="https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-192x192.png" sizes="192x192" />
        <link rel="apple-touch-icon" href="https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-180x180.png" />
        <meta name="msapplication-TileImage" content="https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-270x270.png" />
        <style id="custom-css" type="text/css">:root {--primary-color: #0a4da8;}.full-width .ubermenu-nav, .container, .row{max-width: 1310px}.row.row-collapse{max-width: 1280px}.row.row-small{max-width: 1302.5px}.row.row-large{max-width: 1340px}.sticky-add-to-cart--active, #wrapper,#main,#main.dark{background-color: #f0f0f0}.header-main{height: 100px}#logo img{max-height: 100px}#logo{width:151px;}#logo img{padding:4px 0;}.header-bottom{min-height: 50px}.header-top{min-height: 30px}.transparent .header-main{height: 30px}.transparent #logo img{max-height: 30px}.has-transparent + .page-title:first-of-type,.has-transparent + #main > .page-title,.has-transparent + #main > div > .page-title,.has-transparent + #main .page-header-wrapper:first-of-type .page-title{padding-top: 30px;}.header.show-on-scroll,.stuck .header-main{height:70px!important}.stuck #logo img{max-height: 70px!important}.search-form{ width: 75%;}.header-bg-color, .header-wrapper {background-color: rgba(255,255,255,0.9)}.header-bottom {background-color: #ffffff}.header-main .nav > li > a{line-height: 16px }.header-bottom-nav > li > a{line-height: 30px }@media (max-width: 549px) {.header-main{height: 70px}#logo img{max-height: 70px}}/* Color */.accordion-title.active, .has-icon-bg .icon .icon-inner,.logo a, .primary.is-underline, .primary.is-link, .badge-outline .badge-inner, .nav-outline > li.active> a,.nav-outline >li.active > a, .cart-icon strong,[data-color='primary'], .is-outline.primary{color: #0a4da8;}/* Color !important */[data-text-color="primary"]{color: #0a4da8!important;}/* Background Color */[data-text-bg="primary"]{background-color: #0a4da8;}/* Background */.scroll-to-bullets a,.featured-title, .label-new.menu-item > a:after, .nav-pagination > li > .current,.nav-pagination > li > span:hover,.nav-pagination > li > a:hover,.has-hover:hover .badge-outline .badge-inner,button[type="submit"], .button.wc-forward:not(.checkout):not(.checkout-button), .button.submit-button, .button.primary:not(.is-outline),.featured-table .title,.is-outline:hover, .has-icon:hover .icon-label,.nav-dropdown-bold .nav-column li > a:hover, .nav-dropdown.nav-dropdown-bold > li > a:hover, .nav-dropdown-bold.dark .nav-column li > a:hover, .nav-dropdown.nav-dropdown-bold.dark > li > a:hover, .is-outline:hover, .tagcloud a:hover,.grid-tools a, input[type='submit']:not(.is-form), .box-badge:hover .box-text, input.button.alt,.nav-box > li > a:hover,.nav-box > li.active > a,.nav-pills > li.active > a ,.current-dropdown .cart-icon strong, .cart-icon:hover strong, .nav-line-bottom > li > a:before, .nav-line-grow > li > a:before, .nav-line > li > a:before,.banner, .header-top, .slider-nav-circle .flickity-prev-next-button:hover svg, .slider-nav-circle .flickity-prev-next-button:hover .arrow, .primary.is-outline:hover, .button.primary:not(.is-outline), input[type='submit'].primary, input[type='submit'].primary, input[type='reset'].button, input[type='button'].primary, .badge-inner{background-color: #0a4da8;}/* Border */.nav-vertical.nav-tabs > li.active > a,.scroll-to-bullets a.active,.nav-pagination > li > .current,.nav-pagination > li > span:hover,.nav-pagination > li > a:hover,.has-hover:hover .badge-outline .badge-inner,.accordion-title.active,.featured-table,.is-outline:hover, .tagcloud a:hover,blockquote, .has-border, .cart-icon strong:after,.cart-icon strong,.blockUI:before, .processing:before,.loading-spin, .slider-nav-circle .flickity-prev-next-button:hover svg, .slider-nav-circle .flickity-prev-next-button:hover .arrow, .primary.is-outline:hover{border-color: #0a4da8}.nav-tabs > li.active > a{border-top-color: #0a4da8}.widget_shopping_cart_content .blockUI.blockOverlay:before { border-left-color: #0a4da8 }.woocommerce-checkout-review-order .blockUI.blockOverlay:before { border-left-color: #0a4da8 }/* Fill */.slider .flickity-prev-next-button:hover svg,.slider .flickity-prev-next-button:hover .arrow{fill: #0a4da8;}body{font-size: 100%;}@media screen and (max-width: 549px){body{font-size: 100%;}}body{font-family:"Montserrat", sans-serif}body{font-weight: 0}body{color: #000000}.nav > li > a {font-family:"Montserrat", sans-serif;}.mobile-sidebar-levels-2 .nav > li > ul > li > a {font-family:"Montserrat", sans-serif;}.nav > li > a {font-weight: 700;}.mobile-sidebar-levels-2 .nav > li > ul > li > a {font-weight: 700;}h1,h2,h3,h4,h5,h6,.heading-font, .off-canvas-center .nav-sidebar.nav-vertical > li > a{font-family: "Montserrat", sans-serif;}h1,h2,h3,h4,h5,h6,.heading-font,.banner h1,.banner h2{font-weight: 0;}h1,h2,h3,h4,h5,h6,.heading-font{color: #000000;}.alt-font{font-family: "Montserrat", sans-serif;}.alt-font{font-weight: 0!important;}.header:not(.transparent) .header-nav-main.nav > li > a:hover,.header:not(.transparent) .header-nav-main.nav > li.active > a,.header:not(.transparent) .header-nav-main.nav > li.current > a,.header:not(.transparent) .header-nav-main.nav > li > a.active,.header:not(.transparent) .header-nav-main.nav > li > a.current{color: #0a4da8;}.header-nav-main.nav-line-bottom > li > a:before,.header-nav-main.nav-line-grow > li > a:before,.header-nav-main.nav-line > li > a:before,.header-nav-main.nav-box > li > a:hover,.header-nav-main.nav-box > li.active > a,.header-nav-main.nav-pills > li > a:hover,.header-nav-main.nav-pills > li.active > a{color:#FFF!important;background-color: #0a4da8;}a{color: #0a4da8;}a:hover{color: #8224e3;}.tagcloud a:hover{border-color: #8224e3;background-color: #8224e3;}@media screen and (min-width: 550px){.products .box-vertical .box-image{min-width: 300px!important;width: 300px!important;}}.header-main .social-icons,.header-main .cart-icon strong,.header-main .menu-title,.header-main .header-button > .button.is-outline,.header-main .nav > li > a > i:not(.icon-angle-down){color: #000000!important;}.header-main .header-button > .button.is-outline,.header-main .cart-icon strong:after,.header-main .cart-icon strong{border-color: #000000!important;}.header-main .header-button > .button:not(.is-outline){background-color: #000000!important;}.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover,.header-main .header-button > .button:hover i,.header-main .header-button > .button:hover span{color:#FFF!important;}.header-main .menu-title:hover,.header-main .social-icons a:hover,.header-main .header-button > .button.is-outline:hover,.header-main .nav > li > a:hover > i:not(.icon-angle-down){color: #000000!important;}.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover{background-color: #000000!important;}.header-main .current-dropdown .cart-icon strong:after,.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover{border-color: #000000!important;}.footer-2{background-color: rgba(22,22,22,0.9)}.absolute-footer, html{background-color: #fafafa}.page-title-small + main .product-container > .row{padding-top:0;}.label-new.menu-item > a:after{content:"New";}.label-hot.menu-item > a:after{content:"Hot";}.label-sale.menu-item > a:after{content:"Sale";}.label-popular.menu-item > a:after{content:"Popular";}</style></head>

    <body data-rsssl=1 class="page-template-default page page-id-54 theme-flatsome woocommerce-cart woocommerce-page woocommerce-no-js header-shadow lightbox nav-dropdown-has-arrow nav-dropdown-has-shadow nav-dropdown-has-border">


        <a class="skip-link screen-reader-text" href="#main">Skip to content</a>

        <div id="wrapper">

            <div class="page-loader fixed fill z-top-3 ">
                <div class="page-loader-inner x50 y50 md-y50 md-x50 lg-y50 lg-x50 absolute">
                    <div class="page-loader-logo" style="padding-bottom: 30px;">
                        <!-- Header logo -->
                        <a href="home" title="MixiBook" rel="home">
                            <img width="600" src="img/logo fpt new.png" class="header_logo header-logo" /></a>
                    </div>
                    <div class="page-loader-spin"><div class="loading-spin"></div></div>
                </div>
                <style>
                    .page-loader{opacity: 0; transition: opacity .3s; transition-delay: .3s;
                                 background-color: #fff;
                    }
                    .loading-site .page-loader{opacity: .98;}
                    .page-loader-logo{max-width: px; animation: pageLoadZoom 1.3s ease-out; -webkit-animation: pageLoadZoom 1.3s ease-out;}
                    .page-loader-spin{animation: pageLoadZoomSpin 1.3s ease-out;}
                    .page-loader-spin .loading-spin{width: 40px; height: 40px; }
                    @keyframes pageLoadZoom {
                        0%   {opacity:0; transform: translateY(30px);}
                        100% {opacity:1; transform: translateY(0);}
                    }
                    @keyframes pageLoadZoomSpin {
                        0%   {opacity:0; transform: translateY(60px);}
                        100% {opacity:1; transform: translateY(0);}
                    }
                </style>
            </div>

            <header id="header" class="header has-sticky sticky-jump">
                <div class="header-wrapper">
                    <div id="masthead" class="header-main ">
                        <div class="header-inner flex-row container logo-left medium-logo-center" role="navigation">

                            <!-- Logo -->
                            <div id="logo" class="flex-col logo">
                                <!-- Header logo -->
                                <a href="home" title="MixiBook" rel="home">
                                    <img width="300" src="img/logo.png" class="header_logo header-logo" alt="MixiBook"/></a>
                            </div>

                            <!-- Mobile Left Elements -->
                            <div class="flex-col show-for-medium flex-left">
                                <ul class="mobile-nav nav nav-left ">
                                    <li class="nav-icon has-icon">
                                        <a href="#" data-open="#main-menu" data-pos="left" data-bg="main-menu-overlay" data-color="" class="is-small" aria-label="Menu" aria-controls="main-menu" aria-expanded="false">

                                            <i class="icon-menu" ></i>
                                        </a>
                                    </li>            </ul>
                            </div>

                            <!-- Left Elements -->
                            <div class="flex-col hide-for-medium flex-left
                                 flex-grow">
                                <ul class="header-nav header-nav-main nav nav-left  nav-line-bottom nav-spacing-xlarge nav-uppercase" >
                                    <li class="header-search header-search-lightbox has-icon">
                                        <a href="#search-lightbox" aria-label="Tìm kiếm" data-open="#search-lightbox" data-focus="input.search-field"
                                           class="is-small">
                                            <i class="fa fa-search" style="font-size:16px;"></i></a>

                                        <div id="search-lightbox" class="mfp-hide dark text-center">
                                            <div class="searchform-wrapper ux-search-box relative form-flat is-large">
                                                <form action="search" >
                                                    <div class="flex-row relative">
                                                        <div class="flex-col flex-grow">
                                                            <label class="screen-reader-text" for="woocommerce-product-search-field-0">Tìm kiếm:</label>
                                                            <input type="search" id="woocommerce-product-search-field-0" class="search-field mb-0" placeholder="Tìm kiếm&hellip;"name="keyword" />

                                                        </div>
                                                        <div class="flex-col">
                                                            <button type="submit" value="Tìm kiếm" class="ux-search-submit submit-button secondary button icon mb-0" aria-label="Submit">
                                                                <i class="fa fa-search" ></i>			</button>
                                                        </div>
                                                    </div>

                                                </form>
                                            </div>	</div>
                                    </li>
                                    <li id="menu-item-19969" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-89 current_page_item menu-item-19969 active menu-item-design-default"><a href="home" aria-current="page" class="nav-top-link">Home</a></li>
                                    <li id="menu-item-19975" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-19975 menu-item-design-full-width menu-item-has-block has-dropdown nav-dropdown-toggle">
                                        <a class="nav-top-link">Danh mục sản phẩm &nbsp<i class="fas fa-angle-down"></i></a>
                                        <div class="sub-menu nav-dropdown">	<section class="section" id="section_1210283286">
                                                <div class="bg section-bg fill bg-fill bg-loaded bg-loaded" >





                                                </div>

                                                <div class="section-content relative">


                                                    <div class="row row-collapse"  id="row-1588371424">


                                                        <div id="col-1042897076" class="col medium-12 small-12 large-3"  >
                                                            <div class="col-inner"  >



                                                                <div id="text-1019243891" class="text">

                                                                    <h3><span data-text-color="primary">Danh mục sản phẩm &nbsp</span></h3>
                                                                    <div id="gtx-trans" style="position: absolute; left: -38px; top: 47.1562px;">
                                                                        <div class="gtx-trans-icon"></div>
                                                                    </div>

                                                                    <style>
                                                                        #text-1019243891 {
                                                                            font-size: 1rem;
                                                                        }
                                                                    </style>
                                                                </div>

                                                                <div id="gap-539643135" class="gap-element clearfix" style="display:block; height:auto;">

                                                                    <style>
                                                                        #gap-539643135 {
                                                                            padding-top: 10px;
                                                                        }
                                                                    </style>
                                                                </div>


                                                                <div class="ux-menu stack stack-col justify-start">


                                                                    <c:forEach items="${listGenre}" var="g">
                                                                        <div class="ux-menu-link flex menu-item label-hot">
                                                                            <a class="ux-menu-link__link flex" href="genre?genreID=${g.genreID}"  >
                                                                                <i class="ux-menu-link__icon text-center fad fas fa-angle-right" ></i>			<span class="ux-menu-link__text">
                                                                                    ${g.genreName}		</span>
                                                                            </a>
                                                                        </div>
                                                                    </c:forEach>





                                                                </div>

                                                                <div id="gap-1822212215" class="gap-element clearfix" style="display:block; height:auto;">

                                                                    <style>
                                                                        #gap-1822212215 {
                                                                            padding-top: 20px;
                                                                        }
                                                                    </style>
                                                                </div>


                                                                <a href="product" target="_self" class="button primary is-outline is-small"  style="border-radius:9px;">
                                                                    <span>Xem tất cả</span>
                                                                </a>


                                                            </div>

                                                            <style>
                                                                #col-1042897076 > .col-inner {
                                                                    padding: 0px 15px 0px 15px;
                                                                }
                                                                @media (min-width:850px) {
                                                                    #col-1042897076 > .col-inner {
                                                                        padding: 0 0px 0px 0px;
                                                                    }
                                                                }
                                                            </style>
                                                        </div>



                                                        <div id="col-1586640504" class="col medium-12 small-12 large-9"  >
                                                            <div class="col-inner"  >



                                                                <div class="row"  id="row-1224889174">


                                                                    <div id="col-473248023" class="col medium-4 small-12 large-4"  >
                                                                        <div class="col-inner"  >



                                                                            <div class="box has-hover   has-hover box-text-bottom" >

                                                                                <div class="box-image" >
                                                                                    <div class="image-zoom image-cover" style="padding-top:75%;">
                                                                                        <img width="1656" height="2560" src="https://cf.shopee.vn/file/610a462c7882855cf817617427714a00" 
                                                                                             class="attachment-original size-original" alt="Nm D9485" loading="lazy" 
                                                                                             />											</div>
                                                                                </div>

                                                                                <div class="box-text text-left" >
                                                                                    <div class="box-text-inner">


                                                                                        <div id="gap-1724512713" class="gap-element clearfix" style="display:block; height:auto;">

                                                                                            <style>
                                                                                                #gap-1724512713 {
                                                                                                    padding-top: 15px;
                                                                                                }
                                                                                            </style>
                                                                                        </div>


                                                                                        <a href="product" target="_self" class="button primary is-link is-small"  style="padding:0 0px 0px 0px;">
                                                                                            <span>Xem thêm</span>
                                                                                            <i class="fas fa-caret-right" ></i></a>


                                                                                    </div>
                                                                                </div>
                                                                            </div>


                                                                        </div>
                                                                    </div>



                                                                    <div id="col-1843474777" class="col medium-4 small-12 large-4"  >
                                                                        <div class="col-inner"  >



                                                                            <div class="box has-hover   has-hover box-text-bottom" >

                                                                                <div class="box-image" >
                                                                                    <div class="image-zoom image-cover" style="padding-top:75%;">
                                                                                        <img width="2560" height="1707" src="https://www.themoviedb.org/t/p/original/a4vMwDgtOuvsijaeO5GNZGrbdRn.jpg" class="attachment-original size-original" />	
                                                                                    </div>
                                                                                </div>

                                                                                <div class="box-text text-left" >
                                                                                    <div class="box-text-inner">


                                                                                        <div id="gap-1789351991" class="gap-element clearfix" style="display:block; height:auto;">

                                                                                            <style>
                                                                                                #gap-1789351991 {
                                                                                                    padding-top: 15px;
                                                                                                }
                                                                                            </style>
                                                                                        </div>


                                                                                        <a href="product" target="_self" class="button primary is-link is-small"  style="padding:0 0px 0px 0px;">
                                                                                            <span>Xem thêm</span>
                                                                                            <i class="fas fa-caret-right" ></i></a>


                                                                                    </div>
                                                                                </div>
                                                                            </div>


                                                                        </div>
                                                                    </div>



                                                                    <div id="col-650280936" class="col medium-4 small-12 large-4"  >
                                                                        <div class="col-inner"  >



                                                                            <div class="box has-hover   has-hover box-text-bottom" >

                                                                                <div class="box-image" >
                                                                                    <div class="image-zoom image-cover" style="padding-top:75%;">
                                                                                        <img width="2560" height="1707" src="https://salt.tikicdn.com/ts/tmp/29/ae/ed/c8869212243ca891c8ef4e529a87ca57.jpg" class="attachment-original size-original" alt="2" loading="lazy" />							
                                                                                    </div>
                                                                                </div>

                                                                                <div class="box-text text-left" >
                                                                                    <div class="box-text-inner">


                                                                                        <div id="gap-370750606" class="gap-element clearfix" style="display:block; height:auto;">

                                                                                            <style>
                                                                                                #gap-370750606 {
                                                                                                    padding-top: 15px;
                                                                                                }
                                                                                            </style>
                                                                                        </div>


                                                                                        <a href="product" target="_self" class="button primary is-link is-small"  style="padding:0 0px 0px 0px;">
                                                                                            <span>Xem thêm</span>
                                                                                            <i class="fas fa-caret-right" ></i></a>


                                                                                    </div>
                                                                                </div>
                                                                            </div>


                                                                        </div>
                                                                    </div>



                                                                </div>

                                                            </div>

                                                            <style>
                                                                #col-1586640504 > .col-inner {
                                                                    padding: 0px 15px 0px 15px;
                                                                    margin: 10px 0px 0px 0px;
                                                                }
                                                                @media (min-width:850px) {
                                                                    #col-1586640504 > .col-inner {
                                                                        padding: 0 0px 0px 0px;
                                                                    }
                                                                }
                                                            </style>
                                                        </div>



                                                    </div>

                                                </div>


                                                <style>
                                                    #section_1210283286 {
                                                        padding-top: 30px;
                                                        padding-bottom: 30px;
                                                        background-color: rgb(245, 240, 234);
                                                    }
                                                </style>
                                            </section>
                                        </div></li>

                                    <style>
                                        /* Dropdown Button */
                                        .dropbtn {
                                            background-color: #04AA6D;
                                            color: white;
                                            padding: 16px;
                                            font-size: 16px;
                                            border: none;
                                        }

                                        /* The container <div> - needed to position the dropdown content */
                                        .dropdown {
                                            position: relative;
                                            display: inline-block;

                                            font-weight: 700;
                                            font-family: "Montserrat", sans-serif;
                                            font-size: 14px;

                                            text-transform: uppercase;
                                        }

                                        /* Dropdown Content (Hidden by Default) */
                                        .dropdown-content {
                                            display: none;
                                            position: absolute;
                                            background-color: #f1f1f1;
                                            min-width: 160px;
                                            box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                                            z-index: 1;
                                        }

                                        /* Links inside the dropdown */
                                        .dropdown-content a {
                                            color: black;
                                            padding: 12px 16px;
                                            text-decoration: none;
                                            display: block;
                                        }

                                        /* Change color of dropdown links on hover */
                                        .dropdown-content a:hover {background-color: #ddd;}

                                        /* Show the dropdown menu on hover */
                                        .dropdown:hover .dropdown-content {display: block;}

                                        /* Change the background color of the dropdown button when the dropdown content is shown */
                                        .dropdown:hover .dropbtn {background-color: #3e8e41;}
                                    </style>



                                </ul>
                            </div>

                            <!-- Right Elements -->
                            <div class="flex-col hide-for-medium flex-right">
                                <ul class="header-nav header-nav-main nav nav-right  nav-line-bottom nav-spacing-xlarge nav-uppercase">
                                    <li class="header-contact-wrapper">
                                        <ul id="header-contact" class="nav nav-divided nav-uppercase header-contact">



                                            <li class="">
                                                <a href="tel:036.345.1610"  title="036.345.1610">
                                                    <i class="fas fa-phone-alt" style="font-size:16px;"></i>			      <span>036.345.1610</span>
                                                </a>
                                            </li>
                                        </ul>
                                    </li>
                                    <li class="header-divider">

                                    </li>


                                    <!--                                    ------------------------------------------   ------------------------------------------   ------------------------------------------   -------------------------------------------->


                                    <li class="cart-item has-icon has-dropdown">

                                        <a href="carts" title="Giỏ hàng" class="header-cart-link is-small">


                                            <span class="header-cart-title">
                                                Giỏ hàng   /      <span class="cart-price"><span class="woocommerce-Price-amount amount"><bdi>${sessionScope.carts.size()}</bdi></span></span>
                                            </span>

                                            <i class="fas fa-shopping-cart"
                                               data-icon-label="0">
                                            </i>
                                        </a>

                                        <ul class="nav-dropdown nav-dropdown-bold" style="">
                                            <li class="html widget_shopping_cart">
                                                <div class="widget_shopping_cart_content">
                                                    <c:choose>
                                                        <c:when test="${sessionScope.carts.size()==null ||sessionScope.carts.size()==0}">
                                                            <p class="woocommerce-mini-cart__empty-message">Chưa có sản phẩm trong giỏ hàng.</p>
                                                        </c:when>
                                                        <c:otherwise>  
                                                            <c:forEach items="${carts}" var="c">
                                                                <ul class="woocommerce-mini-cart cart_list product_list_widget ">
                                                                    <li class="woocommerce-mini-cart-item mini_cart_item">
                                                                        <a href="delete-cart?productID=${c.value.product.bookID}" class="remove remove_from_cart_button" aria-label="Xóa sản phẩm này" data-product_id="32025" data-cart_item_key="65dbfb2fa8342f59bdf6e4f8547ad8d2" data-product_sku="">×
                                                                        </a>											
                                                                        <a href="product?productID=${c.value.product.bookID}" style="font-weight: bold">
                                                                            <img  src="img/comic/${c.value.product.img}" class="attachment-woocommerce_thumbnail size-woocommerce_thumbnail" alt="Apcitylogotrang" loading="lazy" >${c.value.product.bookName}						</a>
                                                                        <span class="quantity" style="font-weight: bold">${c.value.quantity} × <span class="woocommerce-Price-amount amount"><bdi>${c.value.product.price}00&nbsp;<span class="woocommerce-Price-currencySymbol">₫</span></bdi></span></span>				
                                                                    </li>

                                                                </ul>
                                                            </c:forEach>
                                                            <p class="woocommerce-mini-cart__total total">
                                                                <strong>Tổng số phụ:</strong> <span class="woocommerce-Price-amount amount"><bdi>${totalMoney}00&nbsp;<span class="woocommerce-Price-currencySymbol">₫</span></bdi></span>	</p>


                                                            <p class="woocommerce-mini-cart__buttons buttons"><a href="carts" class="button wc-forward">Xem giỏ hàng</a><a href="checkout" class="button checkout wc-forward">Thanh toán</a></p>
                                                        </c:otherwise>
                                                    </c:choose>
                                                </div>
                                            </li>
                                        </ul>

                                    </li>


                                    <!--                                    ------------------------------------------   ------------------------------------------   ------------------------------------------   -------------------------------------------->

                                    <li class="header-divider">

                                    </li>

                                    <li id="menu-item-19964" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-19964 menu-item-design-default">

                                        <c:choose>
                                            <c:when test="${sessionScope.account==null}">
                                                <a rel="nofollow" href="login" class="nav-top-link" style="color: #0a4da8">Đăng nhập</a>
                                            </c:when>
                                            <c:otherwise>
                                                <div class="dropdown" >
                                                    <div href="profile" class="dropdown " style="color: #0a4da8">Hí ${sessionScope.account.fullname} &nbsp<i class="fas fa-user-circle"></i></div>
                                                    <div class="dropdown-content">
                                                        <a href="#" data-bs-toggle="modal" data-bs-target="#myModal" >Sửa thông tin </a>
                                                        <a href="changepass" >Đổi mật khẩu</a>
                                                        <a href="logout" class="dropdown">Đăng xuất</a>
                                                    </div>
                                                </div>







                                            </c:otherwise>
                                        </c:choose>
                                    </li>
                                </ul>
                            </div>

                            <!-- Mobile Right Elements -->
                            <div class="flex-col show-for-medium flex-right">
                                <ul class="mobile-nav nav nav-right ">
                                    <li class="cart-item has-icon">

                                        <a href="carts" class="header-cart-link off-canvas-toggle nav-top-link is-small" data-open="#cart-popup" data-class="off-canvas-cart" title="Giỏ hàng" data-pos="right">

                                            <i class="fad fa-shopping-cart"
                                               data-icon-label="0">
                                            </i>
                                        </a>


                                        <!-- Cart Sidebar Popup -->
                                        <div id="cart-popup" class="mfp-hide widget_shopping_cart">
                                            <div class="cart-popup-inner inner-padding">
                                                <div class="cart-popup-title text-center">
                                                    <h4 class="uppercase">Giỏ hàng</h4>
                                                    <div class="is-divider"></div>
                                                </div>
                                                <div class="widget_shopping_cart_content">


                                                    <p class="woocommerce-mini-cart__empty-message">Chưa có sản phẩm trong giỏ hàng.</p>


                                                </div>
                                                <div class="cart-sidebar-content relative"></div>  </div>
                                        </div>

                                    </li>
                                </ul>
                            </div>

                        </div>

                    </div>
                    <div class="header-bg-container fill"><div class="header-bg-image fill"></div><div class="header-bg-color fill"></div></div>		</div>
            </header>


            <main id="main" class="">

                <c:choose>
                    <c:when test="${sessionScope.carts.size()==null ||sessionScope.carts.size()==0}">
                        <div style="margin-bottom: 250px;margin-top: 250px">
                            <h1 class="text-center"style="color: #0a4da8"> Giỏ hàng của bạn không có gì <br><br><a  class="button alt text-center" style=" background-color: #0a4da8" href="product">Dạo một vòng </a></h1>   
                        </div>
                    </c:when>
                    <c:otherwise>

                        <div class="checkout-page-title page-title">
                            <div class="page-title-inner flex-row medium-flex-wrap container">
                                <div class="flex-col flex-grow medium-text-center">
                                    <nav class="breadcrumbs flex-row flex-row-center heading-font checkout-breadcrumbs text-center strong h2 uppercase">
                                        <a href="carts" class="current">
                                            Giỏ hàng của bạn  	   	</a>
                                        <span class="divider hide-for-small"><i class="fas fa-caret-right"></i></span>
                                        <a href="" class=" no-click hide-for-small" >
                                            Thông tin thanh toán 	   </a>
                                        <span class="divider hide-for-small"><i class="fas fa-caret-right"></i></span>
                                        <a href="#" class="no-click hide-for-small">
                                            Hoàn tất giao dịch   	   </a>
                                    </nav>
                                </div>
                            </div>
                        </div>
                        <div class="cart-container container page-wrapper page-checkout">
                            <div class="woocommerce"><div class="woocommerce-notices-wrapper"></div><div class="woocommerce row row-large row-divided">
                                    <div class="col large-7 pb-0 ">


                                        <form  action="update-quantity" >
                                            <div class="cart-wrapper sm-touch-scroll">





                                                <table class="shop_table shop_table_responsive cart woocommerce-cart-form__contents" cellspacing="0">
                                                    <thead>
                                                        <tr>
                                                            <th class="product-name" colspan="3">Sản phẩm</th>
                                                            <th class="product-price">Giá</th>
                                                            <th class="product-quantity">Số lượng</th>
                                                            <th class="product-subtotal">Tạm tính</th>
                                                        </tr>
                                                    </thead>
                                                    <tbody>
                                                        <c:forEach items="${carts}" var="c">
                                                            <tr class="woocommerce-cart-form__cart-item cart_item">
                                                        <input type="hidden" name="productID" value="${c.value.product.bookID}"/>
                                                        <td class="product-remove">
                                                            <a href="delete-cart?productID=${c.value.product.bookID}" class="remove" aria-label="Xóa sản phẩm này" data-product_id="32025" data-product_sku="">&times;</a>						</td>

                                                        <td class="product-thumbnail">
                                                            <a href=""><img width="300" height="400" src="img/comic/${c.value.product.img}" class="attachment-woocommerce_thumbnail size-woocommerce_thumbnail" alt="Apcitylogotrang" loading="lazy" /></a>						</td>

                                                        <td class="product-name" data-title="Sản phẩm">
                                                            <a href="detail?productID=${c.value.product.bookID}" style="font-weight: bolder">${c.value.product.bookName}</a>
                                                            <p style="font-weight: bold; font-style: italic">Số lượng còn: ${c.value.product.quantity}</p>
                                                            <div class="show-for-small mobile-product-price">
                                                                <span class="mobile-product-price__qty">${c.value.quantity} x </span>
                                                                <span class="woocommerce-Price-amount amount"><bdi>${c.value.product.price}00&nbsp;<span class="woocommerce-Price-currencySymbol">&#8363;</span></bdi></span>							</div>
                                                        </td>

                                                        <td class="product-price" data-title="Giá">
                                                            <span class="woocommerce-Price-amount amount"><bdi>${c.value.product.price}00&nbsp;<span class="woocommerce-Price-currencySymbol">&#8363;</span></bdi></span>						</td>


                                                        <td >

                                                            <div class="quantity buttons_added">
                                                                <input type="button" value="-" class="minus" style="border-radius: 10px 0px 0px 10px; background-color: #0a4da8;color: white">
                                                                <input type="number" step="1" min="1" max="${c.value.product.quantity}" onchange="this.form.submit()" name="quantity" value="${c.value.quantity}" title="Qty" class="input-text qty text" >
                                                                <input type="button" value="+" class="plus" style="border-radius: 0px 10px 10px 0px; background-color: #0a4da8;color: white">
                                                            </div>


                                                        </td>


                                                        <td class="product-subtotal" data-title="Tạm tính">
                                                            <span class="woocommerce-Price-amount amount"><bdi>${c.value.product.price*c.value.quantity}00&nbsp;<span class="woocommerce-Price-currencySymbol">&#8363;</span></bdi></span>						</td>
                                                        </tr>
                                                    </c:forEach>

                                                    <tr>
                                                        <td colspan="6" class="actions clear">


                                                            <div class="continue-shopping pull-left text-left">
                                                                <a class="button-continue-shopping button primary is-outline"  href="product">
                                                                    &#8592;&nbsp;Tiếp tục xem sản phẩm	</a>
                                                            </div>



                                                        </td>
                                                    </tr>

                                                    </tbody>
                                                </table>

                                            </div>
                                        </form>
                                    </div>


                                    <div class="cart-collaterals large-5 col pb-0">

                                        <div class="cart-sidebar col-inner ">
                                            <div class="cart_totals calculated_shipping">

                                                <table cellspacing="0">
                                                    <thead>
                                                        <tr>
                                                            <th class="product-name" colspan="2" style="border-width:3px;">Cộng giỏ hàng</th>
                                                        </tr>
                                                    </thead>
                                                </table>

                                                <h2>Cộng giỏ hàng</h2>

                                                <table cellspacing="0" class="shop_table shop_table_responsive">


                                                    <tr class="order-total">
                                                        <th>Tổng</th>
                                                        <td data-title="Tổng"><strong><span class="woocommerce-Price-amount amount"><bdi>${totalMoney}00&nbsp;<span class="woocommerce-Price-currencySymbol">&#8363;</span></bdi></span></strong> </td>
                                                    </tr>


                                                </table>




                                                <div class="wc-proceed-to-checkout" >

                                                    <a href="checkout" class="checkout-button button alt wc-forward" style="background-color: #0a4da8">
                                                        Tiến hành thanh toán</a>
                                                </div>
                                            </div>

                                            <div class="cart-sidebar-content relative"></div>	</div>

                                    </div>
                                </div>

                                <div class="cart-footer-content after-cart-content relative"></div></div>
                        </div>
                    </c:otherwise>
                </c:choose>
            </main>

            <footer id="footer" class="footer-wrapper">

                <div class="is-divider divider clearfix" style="margin-top:0px;margin-bottom:0px;max-width:100%;height:1px;"></div>

                <section class="section" id="section_1622558052">
                    <div class="bg section-bg fill bg-fill bg-loaded bg-loaded" >





                    </div>

                    <div class="section-content relative">


                        <div class="row"  id="row-98647434">


                            <div id="col-1068653155" class="col medium-6 small-12 large-3 medium-col-first"  >
                                <div class="col-inner"  >



                                    <div id="gap-1891654759" class="gap-element clearfix" style="display:block; height:auto;">

                                        <style>
                                            #gap-1891654759 {
                                                padding-top: 30px;
                                            }
                                        </style>
                                    </div>


                                    <h5>Về chúng tôi</h5>
                                    <p><span style="font-size: 90%;">Website chính thức và duy nhất của MixiBook.</span></p>

                                </div>
                            </div>



                            <div id="col-1367170307" class="col medium-12 small-12 large-5"  >
                                <div class="col-inner"  >



                                    <div class="row row-small"  id="row-397936269">


                                        <div id="col-1821280017" class="col medium-6 small-12 large-6"  >
                                            <div class="col-inner"  >



                                                <div id="gap-393829027" class="gap-element clearfix" style="display:block; height:auto;">

                                                    <style>
                                                        #gap-393829027 {
                                                            padding-top: 30px;
                                                        }
                                                    </style>
                                                </div>


                                                <h5>Truyện nổi bật </h5>
                                                <ul>
                                                    <li><a href="detail?productID=1">Doraemon</a></li>
                                                    <li><a href="detail?productID=3">Dragon Ball</a></li>
                                                    <li><a href="detail?productID=2">Conan</a></li>
                                                    <li><a href="detail?productID=6">Tý Quậy</a></li>
                                                    <li><a href="detail?productID=5">Trạng Quỳnh</a></li>
                                                    <li><a href="detail?productID=7">Trạng Nguyên</a></li>
                                                </ul>
                                                <div id="gtx-trans" style="position: absolute; left: 22px; top: 180.906px;">
                                                    <div class="gtx-trans-icon"> </div>
                                                </div>

                                            </div>
                                        </div>



                                        <div id="col-1867412971" class="col medium-6 small-12 large-6"  >
                                            <div class="col-inner"  >



                                                <div id="gap-1024259630" class="gap-element clearfix" style="display:block; height:auto;">

                                                    <style>
                                                        #gap-1024259630 {
                                                            padding-top: 30px;
                                                        }
                                                    </style>
                                                </div>


                                                <h5>Danh mục sản phẩm</h5>
                                                <div class="ux-menu stack stack-col justify-start">


                                                    <c:forEach items="${listGenre}" var="g">
                                                        <div class="ux-menu-link flex menu-item label-hot">
                                                            <a class="ux-menu-link__link flex" style="color: #0a4da8" href="genre?genreID=${g.genreID}"  >
                                                                <i class="ux-menu-link__icon text-center fad fas fa-angle-right" ></i>			<span class="ux-menu-link__text">
                                                                    ${g.genreName}		</span>
                                                            </a>
                                                        </div>
                                                    </c:forEach>





                                                </div>


                                            </div>
                                        </div>



                                    </div>

                                </div>
                            </div>



                            <div id="col-357492779" class="col medium-6 small-12 large-4 medium-col-first"  >
                                <div class="col-inner"  >



                                    <div id="gap-1354649098" class="gap-element clearfix" style="display:block; height:auto;">

                                        <style>
                                            #gap-1354649098 {
                                                padding-top: 30px;
                                            }
                                        </style>
                                    </div>


                                    <h5>Hỗ trợ</h5>
                                    <p><span style="font-size: 90%;">Mọi thắc mắc và góp ý cần hỗ trợ xin vui lòng liên hệ Fanpage và Instagram</span></p>
                                    <div class="social-icons follow-icons" style="font-size:70%"><a href="https://www.facebook.com/Sown.1610" target="_blank" data-label="Facebook"  rel="noopener noreferrer nofollow" class="icon primary button circle facebook tooltip" title="Follow on Facebook"><i class="fab fa-facebook-f" ></i></a>
                                        <a href="https://www.instagram.com/sown.1610/" target="_blank" rel="noopener noreferrer nofollow" data-label="Instagram" class="icon primary button circle  instagram tooltip" title="Follow on Instagram"><i class="fab fa-instagram" ></i></a></div>


                                </div>
                            </div>



                        </div>

                    </div>


                    <style>
                        #section_1622558052 {
                            padding-top: 0px;
                            padding-bottom: 0px;
                            background-color: rgb(250, 250, 250);
                        }
                    </style>
                </section>

                <div class="text-center"><div class="is-divider divider clearfix" style="margin-top:0px;margin-bottom:0px;max-width:80%;height:1px;"></div></div>
                <div class="absolute-footer light medium-text-center small-text-center">
                    <div class="container clearfix">

                        <div class="footer-secondary pull-right">
                            <div class="footer-text inline-block small-block">
                                <a href="img/logo fpt new.png"  class="dmca-badge"> <img src ="img/logo fpt new.png"  width="250px" /></a>            </div>
                        </div>

                        <div class="footer-primary pull-left">
                            <div class="copyright-footer">
                                Copyright 2022 © <strong>MixiBook</strong>      </div>
                        </div>
                    </div>
                </div>
                <a href="#top" class="back-to-top button icon invert plain fixed bottom z-1 is-outline round hide-for-medium" id="top-link"><i class="fas fa-arrow-circle-up" ></i></a>

            </footer>

        </div>

        <div id="main-menu" class="mobile-sidebar no-scrollbar mfp-hide">
            <div class="sidebar-menu no-scrollbar ">
                <ul class="nav nav-sidebar nav-vertical nav-uppercase">
                    <li class="header-search-form search-form html relative has-icon">
                        <div class="header-search-form-wrapper">
                            <div class="searchform-wrapper ux-search-box relative form-flat is-normal"><form role="search" method="get" class="searchform" action="https://shop.mixigaming.com/">
                                    <div class="flex-row relative">
                                        <div class="flex-col flex-grow">
                                            <label class="screen-reader-text" for="woocommerce-product-search-field-1">Tìm kiếm:</label>
                                            <input type="search" id="woocommerce-product-search-field-1" class="search-field mb-0" placeholder="Tìm kiếm&hellip;" value="" name="s" />
                                            <input type="hidden" name="post_type" value="product" />
                                        </div>
                                        <div class="flex-col">
                                            <button type="submit" value="Tìm kiếm" class="ux-search-submit submit-button secondary button icon mb-0" aria-label="Submit">
                                                <i class="icon-search" ></i>			</button>
                                        </div>
                                    </div>
                                    <div class="live-search-results text-left z-top"></div>
                                </form>
                            </div>	</div>
                    </li><li id="menu-item-230" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-home menu-item-230"><a href="https://shop.mixigaming.com/">MixiShop</a></li>
                    <li id="menu-item-7117" class="label-hot menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-7117"><a href="https://shop.mixigaming.com/danh-muc/do-luu-niem-mixi/">ĐỒ LƯU NIỆM MIXI</a></li>
                    <li id="menu-item-20084" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-20084"><a>ÁO</a>
                        <ul class="sub-menu nav-sidebar-ul children">
                            <li id="menu-item-7119" class="label-new menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-7119"><a href="https://shop.mixigaming.com/danh-muc/ao-mixi/">ÁO MIXI</a></li>
                            <li id="menu-item-20085" class="label-popular menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-20085"><a href="https://shop.mixigaming.com/danh-muc/ao-ba-lo/">ÁO BA LỖ</a></li>
                            <li id="menu-item-7118" class="menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-7118"><a href="https://shop.mixigaming.com/danh-muc/ao-refund-gaming/">ÁO REFUND GAMING</a></li>
                            <li id="menu-item-7115" class="menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-7115"><a href="https://shop.mixigaming.com/danh-muc/ao-pubg/">ÁO PUBG</a></li>
                            <li id="menu-item-7116" class="menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-7116"><a href="https://shop.mixigaming.com/danh-muc/ao-csgo/">ÁO CSGO</a></li>
                        </ul>
                    </li>
                    <li id="menu-item-19966" class="menu-item menu-item-type-post_type menu-item-object-page menu-item-19966"><a rel="nofollow" href="https://shop.mixigaming.com/gioi-thieu/">Thông báo</a></li>
                    <li class="html header-social-icons ml-0">
                        <div class="social-icons follow-icons" ><a href="https://www.facebook.com/MixiShop-182674912385853/" target="_blank" data-label="Facebook"  rel="noopener noreferrer nofollow" class="icon primary button circle facebook tooltip" title="Follow on Facebook"><i class="icon-facebook" ></i></a><a href="https://www.instagram.com/mixi.shop/" target="_blank" rel="noopener noreferrer nofollow" data-label="Instagram" class="icon primary button circle  instagram tooltip" title="Follow on Instagram"><i class="icon-instagram" ></i></a></div></li>		</ul>
            </div>
        </div>
        <!-- Instagram Feed JS -->
        <script type="text/javascript">
            var sbiajaxurl = "https://shop.mixigaming.com/wp-admin/admin-ajax.php";
        </script>
        <div id="login-form-popup" class="lightbox-content mfp-hide">
            <div class="woocommerce-notices-wrapper"></div>
            <div class="account-container lightbox-inner">


                <div class="account-login-inner">

                    <h3 class="uppercase">Đăng nhập</h3>

                    <form class="woocommerce-form woocommerce-form-login login" method="post">


                        <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                            <label for="username">Tên tài khoản hoặc địa chỉ email&nbsp;<span class="required">*</span></label>
                            <input type="text" class="woocommerce-Input woocommerce-Input--text input-text" name="username" id="username" autocomplete="username" value="" />					</p>
                        <p class="woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide">
                            <label for="password">Mật khẩu&nbsp;<span class="required">*</span></label>
                            <input class="woocommerce-Input woocommerce-Input--text input-text" type="password" name="password" id="password" autocomplete="current-password" />
                        </p>


                        <p class="form-row">
                            <label class="woocommerce-form__label woocommerce-form__label-for-checkbox woocommerce-form-login__rememberme">
                                <input class="woocommerce-form__input woocommerce-form__input-checkbox" name="rememberme" type="checkbox" id="rememberme" value="forever" /> <span>Ghi nhớ mật khẩu</span>
                            </label>
                        </p>
                        <p class="woocommerce-LostPassword lost_password">
                            <a href="https://shop.mixigaming.com/my-account/quen-mat-khau/">Quên mật khẩu?</a>
                        </p>


                    </form>
                </div>


            </div>

        </div>

        <script type="text/javascript">
            (function () {
                var c = document.body.className;
                c = c.replace(/woocommerce-no-js/, 'woocommerce-js');
                document.body.className = c;
            })();
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/select2/select2.full.min.js' id='select2-js'></script>
        <script type='text/javascript' id='devvn_tinhthanhpho-js-extra'>
            /* <![CDATA[ */
            var vncheckout_array = {"admin_ajax": "https:\/\/shop.mixigaming.com\/wp-admin\/admin-ajax.php", "get_address": "https:\/\/shop.mixigaming.com\/wp-admin\/admin-ajax.php", "home_url": "https:\/\/shop.mixigaming.com", "formatNoMatches": "Kh\u00f4ng c\u00f3 gi\u00e1 tr\u1ecb", "phone_error": "S\u1ed1 \u0111i\u1ec7n tho\u1ea1i kh\u00f4ng \u0111\u00fang \u0111\u1ecbnh d\u1ea1ng", "loading_text": "\u0110ang ki\u1ec3m tra...", "loadaddress_error": "S\u1ed1 \u0111i\u1ec7n tho\u1ea1i kh\u00f4ng t\u1ed3n t\u1ea1i"};
            /* ]]> */
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woo-vietnam-checkout/assets/js/devvn_tinhthanh.js' id='devvn_tinhthanhpho-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/jquery-blockui/jquery.blockUI.min.js' id='jquery-blockui-js'></script>
        <script type='text/javascript' id='wc-add-to-cart-js-extra'>
            /* <![CDATA[ */
            var wc_add_to_cart_params = {"ajax_url": "\/wp-admin\/admin-ajax.php", "wc_ajax_url": "\/?wc-ajax=%%endpoint%%", "i18n_view_cart": "Xem gi\u1ecf h\u00e0ng", "cart_url": "https:\/\/shop.mixigaming.com\/cart\/", "is_cart": "1", "cart_redirect_after_add": "no"};
            /* ]]> */
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/add-to-cart.min.js' id='wc-add-to-cart-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/js-cookie/js.cookie.min.js' id='js-cookie-js'></script>
        <script type='text/javascript' id='woocommerce-js-extra'>
            /* <![CDATA[ */
            var woocommerce_params = {"ajax_url": "\/wp-admin\/admin-ajax.php", "wc_ajax_url": "\/?wc-ajax=%%endpoint%%"};
            /* ]]> */
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/woocommerce.min.js' id='woocommerce-js'></script>
        <script type='text/javascript' id='wc-country-select-js-extra'>
            /* <![CDATA[ */
            var wc_country_select_params = {"countries": "{\"AF\":[],\"AL\":{\"AL-01\":\"Berat\",\"AL-09\":\"Dib\\u00ebr\",\"AL-02\":\"Durr\\u00ebs\",\"AL-03\":\"Elbasan\",\"AL-04\":\"Fier\",\"AL-05\":\"Gjirokast\\u00ebr\",\"AL-06\":\"Kor\\u00e7\\u00eb\",\"AL-07\":\"Kuk\\u00ebs\",\"AL-08\":\"Lezh\\u00eb\",\"AL-10\":\"Shkod\\u00ebr\",\"AL-11\":\"Tirana\",\"AL-12\":\"Vlor\\u00eb\"},\"AO\":{\"BGO\":\"Bengo\",\"BLU\":\"Benguela\",\"BIE\":\"Bi\\u00e9\",\"CAB\":\"Cabinda\",\"CNN\":\"Cunene\",\"HUA\":\"Huambo\",\"HUI\":\"Hu\\u00edla\",\"CCU\":\"Kuando Kubango\",\"CNO\":\"Kwanza-Norte\",\"CUS\":\"Kwanza-Sul\",\"LUA\":\"Luanda\",\"LNO\":\"Lunda-Norte\",\"LSU\":\"Lunda-Sul\",\"MAL\":\"Malanje\",\"MOX\":\"Moxico\",\"NAM\":\"Namibe\",\"UIG\":\"U\\u00edge\",\"ZAI\":\"Zaire\"},\"AR\":{\"C\":\"Ciudad Aut\\u00f3noma de Buenos Aires\",\"B\":\"Buenos Aires\",\"K\":\"Catamarca\",\"H\":\"Chaco\",\"U\":\"Chubut\",\"X\":\"C\\u00f3rdoba\",\"W\":\"Corrientes\",\"E\":\"Entre R\\u00edos\",\"P\":\"Formosa\",\"Y\":\"Jujuy\",\"L\":\"La Pampa\",\"F\":\"La Rioja\",\"M\":\"Mendoza\",\"N\":\"Misiones\",\"Q\":\"Neuqu\\u00e9n\",\"R\":\"R\\u00edo Negro\",\"A\":\"Salta\",\"J\":\"San Juan\",\"D\":\"San Luis\",\"Z\":\"Santa Cruz\",\"S\":\"Santa Fe\",\"G\":\"Santiago del Estero\",\"V\":\"Tierra del Fuego\",\"T\":\"Tucum\\u00e1n\"},\"AT\":[],\"AU\":{\"ACT\":\"L\\u00e3nh th\\u1ed5 Th\\u1ee7 \\u0111\\u00f4 \\u00dac\",\"NSW\":\"New South Wales\",\"NT\":\" L\\u00e3nh th\\u1ed5 B\\u1eafc \\u00dac\",\"QLD\":\"Queensland\",\"SA\":\"Nam \\u00dac\",\"TAS\":\"Tasmania\",\"VIC\":\"Victoria\",\"WA\":\"Bang T\\u00e2y \\u00dac\"},\"AX\":[],\"BD\":{\"BD-05\":\"Bagerhat\",\"BD-01\":\"Bandarban\",\"BD-02\":\"Barguna\",\"BD-06\":\"Barishal\",\"BD-07\":\"Bhola\",\"BD-03\":\"Bogura\",\"BD-04\":\"Brahmanbaria\",\"BD-09\":\"Chandpur\",\"BD-10\":\"Chattogram\",\"BD-12\":\"Chuadanga\",\"BD-11\":\"Cox's Bazar\",\"BD-08\":\"Cumilla\",\"BD-13\":\"Dhaka\",\"BD-14\":\"Dinajpur\",\"BD-15\":\"Faridpur \",\"BD-16\":\"Feni\",\"BD-19\":\"Gaibandha\",\"BD-18\":\"Gazipur\",\"BD-17\":\"Gopalganj\",\"BD-20\":\"Habiganj\",\"BD-21\":\"Jamalpur\",\"BD-22\":\"Jashore\",\"BD-25\":\"Jhalokati\",\"BD-23\":\"Jhenaidah\",\"BD-24\":\"Joypurhat\",\"BD-29\":\"Khagrachhari\",\"BD-27\":\"Khulna\",\"BD-26\":\"Kishoreganj\",\"BD-28\":\"Kurigram\",\"BD-30\":\"Kushtia\",\"BD-31\":\"Lakshmipur\",\"BD-32\":\"Lalmonirhat\",\"BD-36\":\"Madaripur\",\"BD-37\":\"Magura\",\"BD-33\":\"Manikganj \",\"BD-39\":\"Meherpur\",\"BD-38\":\"Moulvibazar\",\"BD-35\":\"Munshiganj\",\"BD-34\":\"Mymensingh\",\"BD-48\":\"Naogaon\",\"BD-43\":\"Narail\",\"BD-40\":\"Narayanganj\",\"BD-42\":\"Narsingdi\",\"BD-44\":\"Natore\",\"BD-45\":\"Nawabganj\",\"BD-41\":\"Netrakona\",\"BD-46\":\"Nilphamari\",\"BD-47\":\"Noakhali\",\"BD-49\":\"Pabna\",\"BD-52\":\"Panchagarh\",\"BD-51\":\"Patuakhali\",\"BD-50\":\"Pirojpur\",\"BD-53\":\"Rajbari\",\"BD-54\":\"Rajshahi\",\"BD-56\":\"Rangamati\",\"BD-55\":\"Rangpur\",\"BD-58\":\"Satkhira\",\"BD-62\":\"Shariatpur\",\"BD-57\":\"Sherpur\",\"BD-59\":\"Sirajganj\",\"BD-61\":\"Sunamganj\",\"BD-60\":\"Sylhet\",\"BD-63\":\"Tangail\",\"BD-64\":\"Thakurgaon\"},\"BE\":[],\"BG\":{\"BG-01\":\"Blagoevgrad\",\"BG-02\":\"Burgas\",\"BG-08\":\"Dobrich\",\"BG-07\":\"Gabrovo\",\"BG-26\":\"Haskovo\",\"BG-09\":\"Kardzhali\",\"BG-10\":\"Kyustendil\",\"BG-11\":\"Lovech\",\"BG-12\":\"Montana\",\"BG-13\":\"Pazardzhik\",\"BG-14\":\"Pernik\",\"BG-15\":\"Pleven\",\"BG-16\":\"Plovdiv\",\"BG-17\":\"Razgrad\",\"BG-18\":\"Ruse\",\"BG-27\":\"Shumen\",\"BG-19\":\"Silistra\",\"BG-20\":\"Sliven\",\"BG-21\":\"Smolyan\",\"BG-23\":\"Sofia\",\"BG-22\":\"Sofia-Grad\",\"BG-24\":\"Stara Zagora\",\"BG-25\":\"Targovishte\",\"BG-03\":\"Varna\",\"BG-04\":\"Veliko Tarnovo\",\"BG-05\":\"Vidin\",\"BG-06\":\"Vratsa\",\"BG-28\":\"Yambol\"},\"BH\":[],\"BI\":[],\"BJ\":{\"AL\":\"Alibori\",\"AK\":\"Atakora\",\"AQ\":\"Atlantique\",\"BO\":\"Borgou\",\"CO\":\"Collines\",\"KO\":\"Kouffo\",\"DO\":\"Donga\",\"LI\":\"Littoral\",\"MO\":\"Mono\",\"OU\":\"Ou\\u00e9m\\u00e9\",\"PL\":\"Plateau\",\"ZO\":\"Zou\"},\"BO\":{\"BO-B\":\"Beni\",\"BO-H\":\"Chuquisaca\",\"BO-C\":\"Cochabamba\",\"BO-L\":\"La Paz\",\"BO-O\":\"Oruro\",\"BO-N\":\"Pando\",\"BO-P\":\"Potos\\u00ed\",\"BO-S\":\"Santa Cruz\",\"BO-T\":\"Tarija\"},\"BR\":{\"AC\":\"Acre\",\"AL\":\"Alagoas\",\"AP\":\"Amap\\u00e1\",\"AM\":\"Amazonas\",\"BA\":\"Bahia\",\"CE\":\"Cear\\u00e1\",\"DF\":\"Distrito Federal\",\"ES\":\"Esp\\u00edrito Santo\",\"GO\":\"Goi\\u00e1s\",\"MA\":\"Maranh\\u00e3o\",\"MT\":\"Mato Grosso\",\"MS\":\"Mato Grosso do Sul\",\"MG\":\"Minas Gerais\",\"PA\":\"Par\\u00e1\",\"PB\":\"Para\\u00edba\",\"PR\":\"Paran\\u00e1\",\"PE\":\"Pernambuco\",\"PI\":\"Piau\\u00ed\",\"RJ\":\"Rio de Janeiro\",\"RN\":\"Rio Grande do Norte\",\"RS\":\"Rio Grande do Sul\",\"RO\":\"Rond\\u00f4nia\",\"RR\":\"Roraima\",\"SC\":\"Santa Catarina\",\"SP\":\"S\\u00e3o Paulo\",\"SE\":\"Sergipe\",\"TO\":\"Tocantins\"},\"CA\":{\"AB\":\"Alberta\",\"BC\":\"British Columbia\",\"MB\":\"Manitoba\",\"NB\":\"New Brunswick\",\"NL\":\"Newfoundland and Labrador\",\"NT\":\"Northwest Territories\",\"NS\":\"Nova Scotia\",\"NU\":\"Nunavut\",\"ON\":\"Ontario\",\"PE\":\"\\u0110\\u1ea3o Ho\\u00e0ng t\\u1eed Edward\",\"QC\":\"Quebec\",\"SK\":\"Saskatchewan\",\"YT\":\"V\\u00f9ng Yukon\"},\"CH\":{\"AG\":\"Aargau\",\"AR\":\"Appenzell Ausserrhoden\",\"AI\":\"Appenzell Innerrhoden\",\"BL\":\"Basel-Landschaft\",\"BS\":\"Basel-Stadt\",\"BE\":\"Bern\",\"FR\":\"Fribourg\",\"GE\":\"Geneva\",\"GL\":\"Glarus\",\"GR\":\"Graub\\u00fcnden\",\"JU\":\"Jura\",\"LU\":\"Luzern\",\"NE\":\"Neuch\\u00e2tel\",\"NW\":\"Nidwalden\",\"OW\":\"Obwalden\",\"SH\":\"Schaffhausen\",\"SZ\":\"Schwyz\",\"SO\":\"Solothurn\",\"SG\":\"St. Gallen\",\"TG\":\"Thurgau\",\"TI\":\"Ticino\",\"UR\":\"Uri\",\"VS\":\"Valais\",\"VD\":\"Vaud\",\"ZG\":\"Zug\",\"ZH\":\"Z\\u00fcrich\"},\"CL\":{\"CL-AI\":\"Ais\\u00e9n del General Carlos Iba\\u00f1ez del Campo\",\"CL-AN\":\"Antofagasta\",\"CL-AP\":\"Arica y Parinacota\",\"CL-AR\":\"La Araucan\\u00eda\",\"CL-AT\":\"Atacama\",\"CL-BI\":\"Biob\\u00edo\",\"CL-CO\":\"Coquimbo\",\"CL-LI\":\"Libertador General Bernardo O'Higgins\",\"CL-LL\":\"Los Lagos\",\"CL-LR\":\"Los R\\u00edos\",\"CL-MA\":\"Magallanes\",\"CL-ML\":\"Maule\",\"CL-NB\":\"\\u00d1uble\",\"CL-RM\":\"Regi\\u00f3n Metropolitana de Santiago\",\"CL-TA\":\"Tarapac\\u00e1\",\"CL-VS\":\"Valpara\\u00edso\"},\"CN\":{\"CN1\":\"Yunnan \\\/ \\u4e91\\u5357\",\"CN2\":\"Beijing \\\/ \\u5317\\u4eac\",\"CN3\":\"Tianjin \\\/ \\u5929\\u6d25\",\"CN4\":\"Hebei \\\/ \\u6cb3\\u5317\",\"CN5\":\"Shanxi \\\/ \\u5c71\\u897f\",\"CN6\":\"Inner Mongolia \\\/ \\u5167\\u8499\\u53e4\",\"CN7\":\"Liaoning \\\/ \\u8fbd\\u5b81\",\"CN8\":\"Jilin \\\/ \\u5409\\u6797\",\"CN9\":\"Heilongjiang \\\/ \\u9ed1\\u9f99\\u6c5f\",\"CN10\":\"Shanghai \\\/ \\u4e0a\\u6d77\",\"CN11\":\"Jiangsu \\\/ \\u6c5f\\u82cf\",\"CN12\":\"Zhejiang \\\/ \\u6d59\\u6c5f\",\"CN13\":\"Anhui \\\/ \\u5b89\\u5fbd\",\"CN14\":\"Fujian \\\/ \\u798f\\u5efa\",\"CN15\":\"Jiangxi \\\/ \\u6c5f\\u897f\",\"CN16\":\"Shandong \\\/ \\u5c71\\u4e1c\",\"CN17\":\"Henan \\\/ \\u6cb3\\u5357\",\"CN18\":\"Hubei \\\/ \\u6e56\\u5317\",\"CN19\":\"Hunan \\\/ \\u6e56\\u5357\",\"CN20\":\"Guangdong \\\/ \\u5e7f\\u4e1c\",\"CN21\":\"Guangxi Zhuang \\\/ \\u5e7f\\u897f\\u58ee\\u65cf\",\"CN22\":\"Hainan \\\/ \\u6d77\\u5357\",\"CN23\":\"Chongqing \\\/ \\u91cd\\u5e86\",\"CN24\":\"Sichuan \\\/ \\u56db\\u5ddd\",\"CN25\":\"Guizhou \\\/ \\u8d35\\u5dde\",\"CN26\":\"Shaanxi \\\/ \\u9655\\u897f\",\"CN27\":\"Gansu \\\/ \\u7518\\u8083\",\"CN28\":\"Qinghai \\\/ \\u9752\\u6d77\",\"CN29\":\"Ningxia Hui \\\/ \\u5b81\\u590f\",\"CN30\":\"Macao \\\/ \\u6fb3\\u95e8\",\"CN31\":\"Tibet \\\/ \\u897f\\u85cf\",\"CN32\":\"Xinjiang \\\/ \\u65b0\\u7586\"},\"CO\":{\"CO-AMA\":\"Amazonas\",\"CO-ANT\":\"Antioquia\",\"CO-ARA\":\"Arauca\",\"CO-ATL\":\"Atl\\u00e1ntico\",\"CO-BOL\":\"Bol\\u00edvar\",\"CO-BOY\":\"Boyac\\u00e1\",\"CO-CAL\":\"Caldas\",\"CO-CAQ\":\"Caquet\\u00e1\",\"CO-CAS\":\"Casanare\",\"CO-CAU\":\"Cauca\",\"CO-CES\":\"Cesar\",\"CO-CHO\":\"Choc\\u00f3\",\"CO-COR\":\"C\\u00f3rdoba\",\"CO-CUN\":\"Cundinamarca\",\"CO-DC\":\"Capital District\",\"CO-GUA\":\"Guain\\u00eda\",\"CO-GUV\":\"Guaviare\",\"CO-HUI\":\"Huila\",\"CO-LAG\":\"La Guajira\",\"CO-MAG\":\"Magdalena\",\"CO-MET\":\"Meta\",\"CO-NAR\":\"Nari\\u00f1o\",\"CO-NSA\":\"Norte de Santander\",\"CO-PUT\":\"Putumayo\",\"CO-QUI\":\"Quind\\u00edo\",\"CO-RIS\":\"Risaralda\",\"CO-SAN\":\"Santander\",\"CO-SAP\":\"San Andr\\u00e9s & Providencia\",\"CO-SUC\":\"Sucre\",\"CO-TOL\":\"Tolima\",\"CO-VAC\":\"Valle del Cauca\",\"CO-VAU\":\"Vaup\\u00e9s\",\"CO-VID\":\"Vichada\"},\"CR\":{\"CR-A\":\"Alajuela\",\"CR-C\":\"Cartago\",\"CR-G\":\"Guanacaste\",\"CR-H\":\"Heredia\",\"CR-L\":\"Lim\\u00f3n\",\"CR-P\":\"Puntarenas\",\"CR-SJ\":\"San Jos\\u00e9\"},\"CZ\":[],\"DE\":[],\"DK\":[],\"DO\":{\"DO-01\":\"Distrito Nacional\",\"DO-02\":\"Azua\",\"DO-03\":\"Baoruco\",\"DO-04\":\"Barahona\",\"DO-33\":\"Cibao Nordeste\",\"DO-34\":\"Cibao Noroeste\",\"DO-35\":\"Cibao Norte\",\"DO-36\":\"Cibao Sur\",\"DO-05\":\"Dajab\\u00f3n\",\"DO-06\":\"Duarte\",\"DO-08\":\"El Seibo\",\"DO-37\":\"El Valle\",\"DO-07\":\"El\\u00edas Pi\\u00f1a\",\"DO-38\":\"Enriquillo\",\"DO-09\":\"Espaillat\",\"DO-30\":\"Hato Mayor\",\"DO-19\":\"Hermanas Mirabal\",\"DO-39\":\"Hig\\u00fcamo\",\"DO-10\":\"Independencia\",\"DO-11\":\"La Altagracia\",\"DO-12\":\"La Romana\",\"DO-13\":\"La Vega\",\"DO-14\":\"Mar\\u00eda Trinidad S\\u00e1nchez\",\"DO-28\":\"Monse\\u00f1or Nouel\",\"DO-15\":\"Monte Cristi\",\"DO-29\":\"Monte Plata\",\"DO-40\":\"Ozama\",\"DO-16\":\"Pedernales\",\"DO-17\":\"Peravia\",\"DO-18\":\"Puerto Plata\",\"DO-20\":\"Saman\\u00e1\",\"DO-21\":\"San Crist\\u00f3bal\",\"DO-31\":\"San Jos\\u00e9 de Ocoa\",\"DO-22\":\"San Juan\",\"DO-23\":\"San Pedro de Macor\\u00eds\",\"DO-24\":\"S\\u00e1nchez Ram\\u00edrez\",\"DO-25\":\"Santiago\",\"DO-26\":\"Santiago Rodr\\u00edguez\",\"DO-32\":\"Santo Domingo\",\"DO-41\":\"Valdesia\",\"DO-27\":\"Valverde\",\"DO-42\":\"Yuma\"},\"DZ\":{\"DZ-01\":\"Adrar\",\"DZ-02\":\"Chlef\",\"DZ-03\":\"Laghouat\",\"DZ-04\":\"Oum El Bouaghi\",\"DZ-05\":\"Batna\",\"DZ-06\":\"B\\u00e9ja\\u00efa\",\"DZ-07\":\"Biskra\",\"DZ-08\":\"B\\u00e9char\",\"DZ-09\":\"Blida\",\"DZ-10\":\"Bouira\",\"DZ-11\":\"Tamanghasset\",\"DZ-12\":\"T\\u00e9bessa\",\"DZ-13\":\"Tlemcen\",\"DZ-14\":\"Tiaret\",\"DZ-15\":\"Tizi Ouzou\",\"DZ-16\":\"Algiers\",\"DZ-17\":\"Djelfa\",\"DZ-18\":\"Jijel\",\"DZ-19\":\"S\\u00e9tif\",\"DZ-20\":\"Sa\\u00efda\",\"DZ-21\":\"Skikda\",\"DZ-22\":\"Sidi Bel Abb\\u00e8s\",\"DZ-23\":\"Annaba\",\"DZ-24\":\"Guelma\",\"DZ-25\":\"Constantine\",\"DZ-26\":\"M\\u00e9d\\u00e9a\",\"DZ-27\":\"Mostaganem\",\"DZ-28\":\"M\\u2019Sila\",\"DZ-29\":\"Mascara\",\"DZ-30\":\"Ouargla\",\"DZ-31\":\"Oran\",\"DZ-32\":\"El Bayadh\",\"DZ-33\":\"Illizi\",\"DZ-34\":\"Bordj Bou Arr\\u00e9ridj\",\"DZ-35\":\"Boumerd\\u00e8s\",\"DZ-36\":\"El Tarf\",\"DZ-37\":\"Tindouf\",\"DZ-38\":\"Tissemsilt\",\"DZ-39\":\"El Oued\",\"DZ-40\":\"Khenchela\",\"DZ-41\":\"Souk Ahras\",\"DZ-42\":\"Tipasa\",\"DZ-43\":\"Mila\",\"DZ-44\":\"A\\u00efn Defla\",\"DZ-45\":\"Naama\",\"DZ-46\":\"A\\u00efn T\\u00e9mouchent\",\"DZ-47\":\"Gharda\\u00efa\",\"DZ-48\":\"Relizane\"},\"EE\":[],\"EC\":{\"EC-A\":\"Azuay\",\"EC-B\":\"Bol\\u00edvar\",\"EC-F\":\"Ca\\u00f1ar\",\"EC-C\":\"Carchi\",\"EC-H\":\"Chimborazo\",\"EC-X\":\"Cotopaxi\",\"EC-O\":\"El Oro\",\"EC-E\":\"Esmeraldas\",\"EC-W\":\"Gal\\u00e1pagos\",\"EC-G\":\"Guayas\",\"EC-I\":\"Imbabura\",\"EC-L\":\"Loja\",\"EC-R\":\"Los R\\u00edos\",\"EC-M\":\"Manab\\u00ed\",\"EC-S\":\"Morona-Santiago\",\"EC-N\":\"Napo\",\"EC-D\":\"Orellana\",\"EC-Y\":\"Pastaza\",\"EC-P\":\"Pichincha\",\"EC-SE\":\"Santa Elena\",\"EC-SD\":\"Santo Domingo de los Ts\\u00e1chilas\",\"EC-U\":\"Sucumb\\u00edos\",\"EC-T\":\"Tungurahua\",\"EC-Z\":\"Zamora-Chinchipe\"},\"EG\":{\"EGALX\":\"Alexandria\",\"EGASN\":\"Aswan\",\"EGAST\":\"Asyut\",\"EGBA\":\"Red Sea\",\"EGBH\":\"Beheira\",\"EGBNS\":\"Beni Suef\",\"EGC\":\"Cairo\",\"EGDK\":\"Dakahlia\",\"EGDT\":\"Damietta\",\"EGFYM\":\"Faiyum\",\"EGGH\":\"Gharbia\",\"EGGZ\":\"Giza\",\"EGIS\":\"Ismailia\",\"EGJS\":\"South Sinai\",\"EGKB\":\"Qalyubia\",\"EGKFS\":\"Kafr el-Sheikh\",\"EGKN\":\"Qena\",\"EGLX\":\"Luxor\",\"EGMN\":\"Minya\",\"EGMNF\":\"Monufia\",\"EGMT\":\"Matrouh\",\"EGPTS\":\"Port Said\",\"EGSHG\":\"Sohag\",\"EGSHR\":\"Al Sharqia\",\"EGSIN\":\"North Sinai\",\"EGSUZ\":\"Suez\",\"EGWAD\":\"New Valley\"},\"ES\":{\"C\":\"A Coru\\u00f1a\",\"VI\":\"Araba\\\/\\u00c1lava\",\"AB\":\"Albacete\",\"A\":\"Alicante\",\"AL\":\"Almer\\u00eda\",\"O\":\"Asturias\",\"AV\":\"\\u00c1vila\",\"BA\":\"Badajoz\",\"PM\":\"Baleares\",\"B\":\"Barcelona\",\"BU\":\"Burgos\",\"CC\":\"C\\u00e1ceres\",\"CA\":\"C\\u00e1diz\",\"S\":\"Cantabria\",\"CS\":\"Castell\\u00f3n\",\"CE\":\"Ceuta\",\"CR\":\"Ciudad Real\",\"CO\":\"C\\u00f3rdoba\",\"CU\":\"Cuenca\",\"GI\":\"Girona\",\"GR\":\"Granada\",\"GU\":\"Guadalajara\",\"SS\":\"Gipuzkoa\",\"H\":\"Huelva\",\"HU\":\"Huesca\",\"J\":\"Ja\\u00e9n\",\"LO\":\"La Rioja\",\"GC\":\"Las Palmas\",\"LE\":\"Le\\u00f3n\",\"L\":\"Lleida\",\"LU\":\"Lugo\",\"M\":\"Madrid\",\"MA\":\"M\\u00e1laga\",\"ML\":\"Melilla\",\"MU\":\"Murcia\",\"NA\":\"Navarra\",\"OR\":\"Ourense\",\"P\":\"Palencia\",\"PO\":\"Pontevedra\",\"SA\":\"Salamanca\",\"TF\":\"Santa Cruz de Tenerife\",\"SG\":\"Segovia\",\"SE\":\"Sevilla\",\"SO\":\"Soria\",\"T\":\"Tarragona\",\"TE\":\"Teruel\",\"TO\":\"Toledo\",\"V\":\"Valencia\",\"VA\":\"Valladolid\",\"BI\":\"Biscay\",\"ZA\":\"Zamora\",\"Z\":\"Zaragoza\"},\"FI\":[],\"FR\":[],\"GF\":[],\"GH\":{\"AF\":\"Ahafo\",\"AH\":\"Ashanti\",\"BA\":\"Brong-Ahafo\",\"BO\":\"Bono\",\"BE\":\"Bono East\",\"CP\":\"Central\",\"EP\":\"Eastern\",\"AA\":\"Greater Accra\",\"NE\":\"North East\",\"NP\":\"Northern\",\"OT\":\"Oti\",\"SV\":\"Savannah\",\"UE\":\"Upper East\",\"UW\":\"Upper West\",\"TV\":\"Volta\",\"WP\":\"Western\",\"WN\":\"Western North\"},\"GP\":[],\"GR\":{\"I\":\"Attica\",\"A\":\"East Macedonia and Thrace\",\"B\":\"Central Macedonia\",\"C\":\"West Macedonia\",\"D\":\"Epirus\",\"E\":\"Thessaly\",\"F\":\"Ionian Islands\",\"G\":\"West Greece\",\"H\":\"Central Greece\",\"J\":\"Peloponnese\",\"K\":\"North Aegean\",\"L\":\"South Aegean\",\"M\":\"Crete\"},\"GT\":{\"GT-AV\":\"Alta Verapaz\",\"GT-BV\":\"Baja Verapaz\",\"GT-CM\":\"Chimaltenango\",\"GT-CQ\":\"Chiquimula\",\"GT-PR\":\"El Progreso\",\"GT-ES\":\"Escuintla\",\"GT-GU\":\"Guatemala\",\"GT-HU\":\"Huehuetenango\",\"GT-IZ\":\"Izabal\",\"GT-JA\":\"Jalapa\",\"GT-JU\":\"Jutiapa\",\"GT-PE\":\"Pet\\u00e9n\",\"GT-QZ\":\"Quetzaltenango\",\"GT-QC\":\"Quich\\u00e9\",\"GT-RE\":\"Retalhuleu\",\"GT-SA\":\"Sacatep\\u00e9quez\",\"GT-SM\":\"San Marcos\",\"GT-SR\":\"Santa Rosa\",\"GT-SO\":\"Solol\\u00e1\",\"GT-SU\":\"Suchitep\\u00e9quez\",\"GT-TO\":\"Totonicap\\u00e1n\",\"GT-ZA\":\"Zacapa\"},\"HK\":{\"HONG KONG\":\"\\u0110\\u1ea3o H\\u1ed3ng K\\u00f4ng\",\"KOWLOON\":\"C\\u1eedu Long\",\"NEW TERRITORIES\":\"T\\u00e2n Gi\\u1edbi\"},\"HN\":{\"HN-AT\":\"Atl\\u00e1ntida\",\"HN-IB\":\"Bay Islands\",\"HN-CH\":\"Choluteca\",\"HN-CL\":\"Col\\u00f3n\",\"HN-CM\":\"Comayagua\",\"HN-CP\":\"Cop\\u00e1n\",\"HN-CR\":\"Cort\\u00e9s\",\"HN-EP\":\"El Para\\u00edso\",\"HN-FM\":\"Francisco Moraz\\u00e1n\",\"HN-GD\":\"Gracias a Dios\",\"HN-IN\":\"Intibuc\\u00e1\",\"HN-LE\":\"Lempira\",\"HN-LP\":\"La Paz\",\"HN-OC\":\"Ocotepeque\",\"HN-OL\":\"Olancho\",\"HN-SB\":\"Santa B\\u00e1rbara\",\"HN-VA\":\"Valle\",\"HN-YO\":\"Yoro\"},\"HU\":{\"BK\":\"B\\u00e1cs-Kiskun\",\"BE\":\"B\\u00e9k\\u00e9s\",\"BA\":\"Baranya\",\"BZ\":\"Borsod-Aba\\u00faj-Zempl\\u00e9n\",\"BU\":\"Budapest\",\"CS\":\"Csongr\\u00e1d-Csan\\u00e1d\",\"FE\":\"Fej\\u00e9r\",\"GS\":\"Gy\\u0151r-Moson-Sopron\",\"HB\":\"Hajd\\u00fa-Bihar\",\"HE\":\"Heves\",\"JN\":\"J\\u00e1sz-Nagykun-Szolnok\",\"KE\":\"Kom\\u00e1rom-Esztergom\",\"NO\":\"N\\u00f3gr\\u00e1d\",\"PE\":\"Pest\",\"SO\":\"Somogy\",\"SZ\":\"Szabolcs-Szatm\\u00e1r-Bereg\",\"TO\":\"Tolna\",\"VA\":\"Vas\",\"VE\":\"Veszpr\\u00e9m\",\"ZA\":\"Zala\"},\"ID\":{\"AC\":\"Daerah Istimewa Aceh\",\"SU\":\"Sumatera Utara\",\"SB\":\"Sumatera Barat\",\"RI\":\"Riau\",\"KR\":\"Kepulauan Riau\",\"JA\":\"Jambi\",\"SS\":\"Sumatera Selatan\",\"BB\":\"Bangka Belitung\",\"BE\":\"Bengkulu\",\"LA\":\"Lampung\",\"JK\":\"DKI Jakarta\",\"JB\":\"Jawa Barat\",\"BT\":\"Banten\",\"JT\":\"Jawa Tengah\",\"JI\":\"Jawa Timur\",\"YO\":\"Daerah Istimewa Yogyakarta\",\"BA\":\"Bali\",\"NB\":\"Nusa Tenggara Barat\",\"NT\":\"Nusa Tenggara Timur\",\"KB\":\"Kalimantan Barat\",\"KT\":\"Kalimantan Tengah\",\"KI\":\"Kalimantan Timur\",\"KS\":\"Kalimantan Selatan\",\"KU\":\"Kalimantan Utara\",\"SA\":\"Sulawesi Utara\",\"ST\":\"Sulawesi Tengah\",\"SG\":\"Sulawesi Tenggara\",\"SR\":\"Sulawesi Barat\",\"SN\":\"Sulawesi Selatan\",\"GO\":\"Gorontalo\",\"MA\":\"Maluku\",\"MU\":\"Maluku Utara\",\"PA\":\"Papua\",\"PB\":\"Papua Barat\"},\"IE\":{\"CW\":\"Carlow\",\"CN\":\"Cavan\",\"CE\":\"Clare\",\"CO\":\"Cork\",\"DL\":\"Donegal\",\"D\":\"Dublin\",\"G\":\"Galway\",\"KY\":\"Kerry\",\"KE\":\"Kildare\",\"KK\":\"Kilkenny\",\"LS\":\"Laois\",\"LM\":\"Leitrim\",\"LK\":\"Limerick\",\"LD\":\"Longford\",\"LH\":\"Louth\",\"MO\":\"Mayo\",\"MH\":\"Meath\",\"MN\":\"Monaghan\",\"OY\":\"Offaly\",\"RN\":\"Roscommon\",\"SO\":\"Sligo\",\"TA\":\"Tipperary\",\"WD\":\"Waterford\",\"WH\":\"Westmeath\",\"WX\":\"Wexford\",\"WW\":\"Wicklow\"},\"IN\":{\"AP\":\"Andhra Pradesh\",\"AR\":\"Arunachal Pradesh\",\"AS\":\"Assam\",\"BR\":\"Bihar\",\"CT\":\"Chhattisgarh\",\"GA\":\"Goa\",\"GJ\":\"Gujarat\",\"HR\":\"Haryana\",\"HP\":\"Himachal Pradesh\",\"JK\":\"Jammu and Kashmir\",\"JH\":\"Jharkhand\",\"KA\":\"Karnataka\",\"KL\":\"Kerala\",\"LA\":\"Ladakh\",\"MP\":\"Madhya Pradesh\",\"MH\":\"Maharashtra\",\"MN\":\"Manipur\",\"ML\":\"Meghalaya\",\"MZ\":\"Mizoram\",\"NL\":\"Nagaland\",\"OR\":\"Odisha\",\"PB\":\"Punjab\",\"RJ\":\"Rajasthan\",\"SK\":\"Sikkim\",\"TN\":\"Tamil Nadu\",\"TS\":\"Telangana\",\"TR\":\"Tripura\",\"UK\":\"Uttarakhand\",\"UP\":\"Uttar Pradesh\",\"WB\":\"West Bengal\",\"AN\":\"Qu\\u1ea7n \\u0111\\u1ea3o Andaman v\\u00e0 Nicobar\",\"CH\":\"Chandigarh\",\"DN\":\"Dadra and Nagar Haveli\",\"DD\":\"Daman v\\u00e0 Diu\",\"DL\":\"Delhi\",\"LD\":\"Lakshadeep\",\"PY\":\"Pondicherry (Puducherry)\"},\"IR\":{\"KHZ\":\"Khuzestan (\\u062e\\u0648\\u0632\\u0633\\u062a\\u0627\\u0646)\",\"THR\":\"Tehran (\\u062a\\u0647\\u0631\\u0627\\u0646)\",\"ILM\":\"Ilaam (\\u0627\\u06cc\\u0644\\u0627\\u0645)\",\"BHR\":\"Bushehr (\\u0628\\u0648\\u0634\\u0647\\u0631)\",\"ADL\":\"Ardabil (\\u0627\\u0631\\u062f\\u0628\\u06cc\\u0644)\",\"ESF\":\"Isfahan (\\u0627\\u0635\\u0641\\u0647\\u0627\\u0646)\",\"YZD\":\"Yazd (\\u06cc\\u0632\\u062f)\",\"KRH\":\"Kermanshah (\\u06a9\\u0631\\u0645\\u0627\\u0646\\u0634\\u0627\\u0647)\",\"KRN\":\"Kerman (\\u06a9\\u0631\\u0645\\u0627\\u0646)\",\"HDN\":\"Hamadan (\\u0647\\u0645\\u062f\\u0627\\u0646)\",\"GZN\":\"Ghazvin (\\u0642\\u0632\\u0648\\u06cc\\u0646)\",\"ZJN\":\"Zanjan (\\u0632\\u0646\\u062c\\u0627\\u0646)\",\"LRS\":\"Luristan (\\u0644\\u0631\\u0633\\u062a\\u0627\\u0646)\",\"ABZ\":\"Alborz (\\u0627\\u0644\\u0628\\u0631\\u0632)\",\"EAZ\":\"\\u0110\\u00f4ng Azarbaijan (\\u0622\\u0630\\u0631\\u0628\\u0627\\u06cc\\u062c\\u0627\\u0646 \\u0634\\u0631\\u0642\\u06cc)\",\"WAZ\":\"T\\u00e2y Azarbaijan (\\u0622\\u0630\\u0631\\u0628\\u0627\\u06cc\\u062c\\u0627\\u0646 \\u063a\\u0631\\u0628\\u06cc)\",\"CHB\":\"Chaharmahal v\\u00e0 Bakhtiari (\\u0686\\u0647\\u0627\\u0631\\u0645\\u062d\\u0627\\u0644 \\u0648 \\u0628\\u062e\\u062a\\u06cc\\u0627\\u0631\\u06cc)\",\"SKH\":\"Nam Khorasan (\\u062e\\u0631\\u0627\\u0633\\u0627\\u0646 \\u062c\\u0646\\u0648\\u0628\\u06cc)\",\"RKH\":\"Razavi Khorasan (\\u062e\\u0631\\u0627\\u0633\\u0627\\u0646 \\u0631\\u0636\\u0648\\u06cc)\",\"NKH\":\"North Khorasan (\\u062e\\u0631\\u0627\\u0633\\u0627\\u0646 \\u062c\\u0646\\u0648\\u0628\\u06cc)\",\"SMN\":\"Semnan (\\u0633\\u0645\\u0646\\u0627\\u0646)\",\"FRS\":\"Fars (\\u0641\\u0627\\u0631\\u0633)\",\"QHM\":\"Qom (\\u0642\\u0645)\",\"KRD\":\"Kurdistan \\\/ \\u06a9\\u0631\\u062f\\u0633\\u062a\\u0627\\u0646)\",\"KBD\":\"Kohgiluyeh v\\u00e0 BoyerAhmad (\\u06a9\\u0647\\u06af\\u06cc\\u0644\\u0648\\u06cc\\u06cc\\u0647 \\u0648 \\u0628\\u0648\\u06cc\\u0631\\u0627\\u062d\\u0645\\u062f)\",\"GLS\":\"Golestan (\\u06af\\u0644\\u0633\\u062a\\u0627\\u0646)\",\"GIL\":\"Gilan (\\u06af\\u06cc\\u0644\\u0627\\u0646)\",\"MZN\":\"Mazandaran (\\u0645\\u0627\\u0632\\u0646\\u062f\\u0631\\u0627\\u0646)\",\"MKZ\":\"Markazi (\\u0645\\u0631\\u06a9\\u0632\\u06cc)\",\"HRZ\":\"Hormozgan (\\u0647\\u0631\\u0645\\u0632\\u06af\\u0627\\u0646)\",\"SBN\":\"Sistan v\\u00e0 Baluchestan (\\u0633\\u06cc\\u0633\\u062a\\u0627\\u0646 \\u0648 \\u0628\\u0644\\u0648\\u0686\\u0633\\u062a\\u0627\\u0646)\"},\"IS\":[],\"IT\":{\"AG\":\"Agrigento\",\"AL\":\"Alessandria\",\"AN\":\"Ancona\",\"AO\":\"Aosta\",\"AR\":\"Arezzo\",\"AP\":\"Ascoli Piceno\",\"AT\":\"Asti\",\"AV\":\"Avellino\",\"BA\":\"Bari\",\"BT\":\"Barletta-Andria-Trani\",\"BL\":\"Belluno\",\"BN\":\"Benevento\",\"BG\":\"Bergamo\",\"BI\":\"Biella\",\"BO\":\"Bologna\",\"BZ\":\"Bolzano\",\"BS\":\"Brescia\",\"BR\":\"Brindisi\",\"CA\":\"Cagliari\",\"CL\":\"Caltanissetta\",\"CB\":\"Campobasso\",\"CE\":\"Caserta\",\"CT\":\"Catania\",\"CZ\":\"Catanzaro\",\"CH\":\"Chieti\",\"CO\":\"Como\",\"CS\":\"Cosenza\",\"CR\":\"Cremona\",\"KR\":\"Crotone\",\"CN\":\"Cuneo\",\"EN\":\"Enna\",\"FM\":\"Fermo\",\"FE\":\"Ferrara\",\"FI\":\"Firenze\",\"FG\":\"Foggia\",\"FC\":\"Forl\\u00ec-Cesena\",\"FR\":\"Frosinone\",\"GE\":\"Genova\",\"GO\":\"Gorizia\",\"GR\":\"Grosseto\",\"IM\":\"Imperia\",\"IS\":\"Isernia\",\"SP\":\"La Spezia\",\"AQ\":\"L'Aquila\",\"LT\":\"Latina\",\"LE\":\"Lecce\",\"LC\":\"Lecco\",\"LI\":\"Livorno\",\"LO\":\"Lodi\",\"LU\":\"Lucca\",\"MC\":\"Macerata\",\"MN\":\"Mantova\",\"MS\":\"Massa-Carrara\",\"MT\":\"Matera\",\"ME\":\"Messina\",\"MI\":\"Milano\",\"MO\":\"Modena\",\"MB\":\"Monza e della Brianza\",\"NA\":\"Napoli\",\"NO\":\"Novara\",\"NU\":\"Nuoro\",\"OR\":\"Oristano\",\"PD\":\"Padova\",\"PA\":\"Palermo\",\"PR\":\"Parma\",\"PV\":\"Pavia\",\"PG\":\"Perugia\",\"PU\":\"Pesaro e Urbino\",\"PE\":\"Pescara\",\"PC\":\"Piacenza\",\"PI\":\"Pisa\",\"PT\":\"Pistoia\",\"PN\":\"Pordenone\",\"PZ\":\"Potenza\",\"PO\":\"Prato\",\"RG\":\"Ragusa\",\"RA\":\"Ravenna\",\"RC\":\"Reggio Calabria\",\"RE\":\"Reggio Emilia\",\"RI\":\"Rieti\",\"RN\":\"Rimini\",\"RM\":\"Roma\",\"RO\":\"Rovigo\",\"SA\":\"Salerno\",\"SS\":\"Sassari\",\"SV\":\"Savona\",\"SI\":\"Siena\",\"SR\":\"Siracusa\",\"SO\":\"Sondrio\",\"SU\":\"Sud Sardegna\",\"TA\":\"Taranto\",\"TE\":\"Teramo\",\"TR\":\"Terni\",\"TO\":\"Torino\",\"TP\":\"Trapani\",\"TN\":\"Trento\",\"TV\":\"Treviso\",\"TS\":\"Trieste\",\"UD\":\"Udine\",\"VA\":\"Varese\",\"VE\":\"Venezia\",\"VB\":\"Verbano-Cusio-Ossola\",\"VC\":\"Vercelli\",\"VR\":\"Verona\",\"VV\":\"Vibo Valentia\",\"VI\":\"Vicenza\",\"VT\":\"Viterbo\"},\"IL\":[],\"IM\":[],\"JM\":{\"JM-01\":\"Kingston\",\"JM-02\":\"Saint Andrew\",\"JM-03\":\"Saint Thomas\",\"JM-04\":\"Portland\",\"JM-05\":\"Saint Mary\",\"JM-06\":\"Saint Ann\",\"JM-07\":\"Trelawny\",\"JM-08\":\"Saint James\",\"JM-09\":\"Hanover\",\"JM-10\":\"Westmoreland\",\"JM-11\":\"Saint Elizabeth\",\"JM-12\":\"Manchester\",\"JM-13\":\"Clarendon\",\"JM-14\":\"Saint Catherine\"},\"JP\":{\"JP01\":\"Hokkaido\",\"JP02\":\"Aomori\",\"JP03\":\"Iwate\",\"JP04\":\"Miyagi\",\"JP05\":\"Akita\",\"JP06\":\"Yamagata\",\"JP07\":\"Fukushima\",\"JP08\":\"Ibaraki\",\"JP09\":\"Tochigi\",\"JP10\":\"Gunma\",\"JP11\":\"Saitama\",\"JP12\":\"Chiba\",\"JP13\":\"Tokyo\",\"JP14\":\"Kanagawa\",\"JP15\":\"Niigata\",\"JP16\":\"Toyama\",\"JP17\":\"Ishikawa\",\"JP18\":\"Fukui\",\"JP19\":\"Yamanashi\",\"JP20\":\"Nagano\",\"JP21\":\"Gifu\",\"JP22\":\"Shizuoka\",\"JP23\":\"Aichi\",\"JP24\":\"Mie\",\"JP25\":\"Shiga\",\"JP26\":\"Kyoto\",\"JP27\":\"Osaka\",\"JP28\":\"Hyogo\",\"JP29\":\"Nara\",\"JP30\":\"Wakayama\",\"JP31\":\"Tottori\",\"JP32\":\"Shimane\",\"JP33\":\"Okayama\",\"JP34\":\"Hiroshima\",\"JP35\":\"Yamaguchi\",\"JP36\":\"Tokushima\",\"JP37\":\"Kagawa\",\"JP38\":\"Ehime\",\"JP39\":\"Kochi\",\"JP40\":\"Fukuoka\",\"JP41\":\"Saga\",\"JP42\":\"Nagasaki\",\"JP43\":\"Kumamoto\",\"JP44\":\"Oita\",\"JP45\":\"Miyazaki\",\"JP46\":\"Kagoshima\",\"JP47\":\"Okinawa\"},\"KE\":{\"KE01\":\"Baringo\",\"KE02\":\"Bomet\",\"KE03\":\"Bungoma\",\"KE04\":\"Busia\",\"KE05\":\"Elgeyo-Marakwet\",\"KE06\":\"Embu\",\"KE07\":\"Garissa\",\"KE08\":\"Homa Bay\",\"KE09\":\"Isiolo\",\"KE10\":\"Kajiado\",\"KE11\":\"Kakamega\",\"KE12\":\"Kericho\",\"KE13\":\"Kiambu\",\"KE14\":\"Kilifi\",\"KE15\":\"Kirinyaga\",\"KE16\":\"Kisii\",\"KE17\":\"Kisumu\",\"KE18\":\"Kitui\",\"KE19\":\"Kwale\",\"KE20\":\"Laikipia\",\"KE21\":\"Lamu\",\"KE22\":\"Machakos\",\"KE23\":\"Makueni\",\"KE24\":\"Mandera\",\"KE25\":\"Marsabit\",\"KE26\":\"Meru\",\"KE27\":\"Migori\",\"KE28\":\"Mombasa\",\"KE29\":\"Murang\\u2019a\",\"KE30\":\"Nairobi County\",\"KE31\":\"Nakuru\",\"KE32\":\"Nandi\",\"KE33\":\"Narok\",\"KE34\":\"Nyamira\",\"KE35\":\"Nyandarua\",\"KE36\":\"Nyeri\",\"KE37\":\"Samburu\",\"KE38\":\"Siaya\",\"KE39\":\"Taita-Taveta\",\"KE40\":\"Tana River\",\"KE41\":\"Tharaka-Nithi\",\"KE42\":\"Trans Nzoia\",\"KE43\":\"Turkana\",\"KE44\":\"Uasin Gishu\",\"KE45\":\"Vihiga\",\"KE46\":\"Wajir\",\"KE47\":\"West Pokot\"},\"KR\":[],\"KW\":[],\"LA\":{\"AT\":\"Attapeu\",\"BK\":\"Bokeo\",\"BL\":\"Bolikhamsai\",\"CH\":\"Champasak\",\"HO\":\"Houaphanh\",\"KH\":\"Khammouane\",\"LM\":\"Luang Namtha\",\"LP\":\"Luang Prabang\",\"OU\":\"Oudomxay\",\"PH\":\"Phongsaly\",\"SL\":\"Salavan\",\"SV\":\"Savannakhet\",\"VI\":\"Vientiane Province\",\"VT\":\"Vientiane\",\"XA\":\"Sainyabuli\",\"XE\":\"Sekong\",\"XI\":\"Xiangkhouang\",\"XS\":\"Xaisomboun\"},\"LB\":[],\"LR\":{\"BM\":\"Bomi\",\"BN\":\"Bong\",\"GA\":\"Gbarpolu\",\"GB\":\"Grand Bassa\",\"GC\":\"Grand Cape Mount\",\"GG\":\"Grand Gedeh\",\"GK\":\"Grand Kru\",\"LO\":\"Lofa\",\"MA\":\"Margibi\",\"MY\":\"Maryland\",\"MO\":\"Montserrado\",\"NM\":\"Nimba\",\"RV\":\"Rivercess\",\"RG\":\"River Gee\",\"SN\":\"Sinoe\"},\"LU\":[],\"MD\":{\"C\":\"Chi\\u0219in\\u0103u\",\"BL\":\"B\\u0103l\\u021bi\",\"AN\":\"Anenii Noi\",\"BS\":\"Basarabeasca\",\"BR\":\"Briceni\",\"CH\":\"Cahul\",\"CT\":\"Cantemir\",\"CL\":\"C\\u0103l\\u0103ra\\u0219i\",\"CS\":\"C\\u0103u\\u0219eni\",\"CM\":\"Cimi\\u0219lia\",\"CR\":\"Criuleni\",\"DN\":\"Dondu\\u0219eni\",\"DR\":\"Drochia\",\"DB\":\"Dub\\u0103sari\",\"ED\":\"Edine\\u021b\",\"FL\":\"F\\u0103le\\u0219ti\",\"FR\":\"Flore\\u0219ti\",\"GE\":\"UTA G\\u0103g\\u0103uzia\",\"GL\":\"Glodeni\",\"HN\":\"H\\u00eence\\u0219ti\",\"IL\":\"Ialoveni\",\"LV\":\"Leova\",\"NS\":\"Nisporeni\",\"OC\":\"Ocni\\u021ba\",\"OR\":\"Orhei\",\"RZ\":\"Rezina\",\"RS\":\"R\\u00ee\\u0219cani\",\"SG\":\"S\\u00eengerei\",\"SR\":\"Soroca\",\"ST\":\"Str\\u0103\\u0219eni\",\"SD\":\"\\u0218old\\u0103ne\\u0219ti\",\"SV\":\"\\u0218tefan Vod\\u0103\",\"TR\":\"Taraclia\",\"TL\":\"Telene\\u0219ti\",\"UN\":\"Ungheni\"},\"MQ\":[],\"MT\":[],\"MX\":{\"DF\":\"Ciudad de M\\u00e9xico\",\"JA\":\"Jalisco\",\"NL\":\"Nuevo Le\\u00f3n\",\"AG\":\"Aguascalientes\",\"BC\":\"B\\u00e1n \\u0111\\u1ea3o Baja California\",\"BS\":\"Baja California Sur\",\"CM\":\"Campeche\",\"CS\":\"Chiapas\",\"CH\":\"Chihuahua\",\"CO\":\"Coahuila\",\"CL\":\"Colima\",\"DG\":\"Durango\",\"GT\":\"Guanajuato\",\"GR\":\"Guerrero\",\"HG\":\"Hidalgo\",\"MX\":\"Estado de M\\u00e9xico\",\"MI\":\"Michoac\\u00e1n\",\"MO\":\"Morelos\",\"NA\":\"Nayarit\",\"OA\":\"Oaxaca\",\"PU\":\"Puebla\",\"QT\":\"Quer\\u00e9taro\",\"QR\":\"Quintana Roo\",\"SL\":\"San Luis Potos\\u00ed\",\"SI\":\"Sinaloa\",\"SO\":\"Sonora\",\"TB\":\"Tabasco\",\"TM\":\"Tamaulipas\",\"TL\":\"Tlaxcala\",\"VE\":\"Veracruz\",\"YU\":\"Yucat\\u00e1n\",\"ZA\":\"Zacatecas\"},\"MY\":{\"JHR\":\"Johor\",\"KDH\":\"Kedah\",\"KTN\":\"Kelantan\",\"LBN\":\"Labuan\",\"MLK\":\"Malacca (Melaka)\",\"NSN\":\"Negeri Sembilan\",\"PHG\":\"Pahang\",\"PNG\":\"Penang (Pulau Pinang)\",\"PRK\":\"Perak\",\"PLS\":\"Perlis\",\"SBH\":\"Sabah\",\"SWK\":\"Sarawak\",\"SGR\":\"Selangor\",\"TRG\":\"Terengganu\",\"PJY\":\"Putrajaya\",\"KUL\":\"Kuala Lumpur\"},\"MZ\":{\"MZP\":\"Cabo Delgado\",\"MZG\":\"Gaza\",\"MZI\":\"Inhambane\",\"MZB\":\"Manica\",\"MZL\":\"Maputo Province\",\"MZMPM\":\"Maputo\",\"MZN\":\"Nampula\",\"MZA\":\"Niassa\",\"MZS\":\"Sofala\",\"MZT\":\"Tete\",\"MZQ\":\"Zamb\\u00e9zia\"},\"NA\":{\"ER\":\"Erongo\",\"HA\":\"Hardap\",\"KA\":\"Karas\",\"KE\":\"Kavango East\",\"KW\":\"Kavango West\",\"KH\":\"Khomas\",\"KU\":\"Kunene\",\"OW\":\"Ohangwena\",\"OH\":\"Omaheke\",\"OS\":\"Omusati\",\"ON\":\"Oshana\",\"OT\":\"Oshikoto\",\"OD\":\"Otjozondjupa\",\"CA\":\"Zambezi\"},\"NG\":{\"AB\":\"Abia\",\"FC\":\"Abuja\",\"AD\":\"Adamawa\",\"AK\":\"Akwa Ibom\",\"AN\":\"Anambra\",\"BA\":\"Bauchi\",\"BY\":\"Bayelsa\",\"BE\":\"Benue\",\"BO\":\"Borno\",\"CR\":\"Cross River\",\"DE\":\"Delta\",\"EB\":\"Ebonyi\",\"ED\":\"Edo\",\"EK\":\"Ekiti\",\"EN\":\"Enugu\",\"GO\":\"Gombe\",\"IM\":\"Imo\",\"JI\":\"Jigawa\",\"KD\":\"Kaduna\",\"KN\":\"Kano\",\"KT\":\"Katsina\",\"KE\":\"Kebbi\",\"KO\":\"Kogi\",\"KW\":\"Kwara\",\"LA\":\"Lagos\",\"NA\":\"Nasarawa\",\"NI\":\"Niger\",\"OG\":\"Ogun\",\"ON\":\"Ondo\",\"OS\":\"Osun\",\"OY\":\"Oyo\",\"PL\":\"Plateau\",\"RI\":\"Rivers\",\"SO\":\"Sokoto\",\"TA\":\"Taraba\",\"YO\":\"Yobe\",\"ZA\":\"Zamfara\"},\"NL\":[],\"NO\":[],\"NP\":{\"BAG\":\"Bagmati\",\"BHE\":\"Bheri\",\"DHA\":\"Dhaulagiri\",\"GAN\":\"Gandaki\",\"JAN\":\"Janakpur\",\"KAR\":\"Karnali\",\"KOS\":\"Koshi\",\"LUM\":\"Lumbini\",\"MAH\":\"Mahakali\",\"MEC\":\"Mechi\",\"NAR\":\"Narayani\",\"RAP\":\"Rapti\",\"SAG\":\"Sagarmatha\",\"SET\":\"Seti\"},\"NI\":{\"NI-AN\":\"Atl\\u00e1ntico Norte\",\"NI-AS\":\"Atl\\u00e1ntico Sur\",\"NI-BO\":\"Boaco\",\"NI-CA\":\"Carazo\",\"NI-CI\":\"Chinandega\",\"NI-CO\":\"Chontales\",\"NI-ES\":\"Estel\\u00ed\",\"NI-GR\":\"Granada\",\"NI-JI\":\"Jinotega\",\"NI-LE\":\"Le\\u00f3n\",\"NI-MD\":\"Madriz\",\"NI-MN\":\"Managua\",\"NI-MS\":\"Masaya\",\"NI-MT\":\"Matagalpa\",\"NI-NS\":\"Nueva Segovia\",\"NI-RI\":\"Rivas\",\"NI-SJ\":\"R\\u00edo San Juan\"},\"NZ\":{\"NL\":\"Northland\",\"AK\":\"Auckland\",\"WA\":\"Waikato\",\"BP\":\"Bay of Plenty\",\"TK\":\"Taranaki\",\"GI\":\"Gisborne\",\"HB\":\"Hawke\\u2019s Bay\",\"MW\":\"Manawatu-Wanganui\",\"WE\":\"Wellington\",\"NS\":\"Nelson\",\"MB\":\"Marlborough\",\"TM\":\"Tasman\",\"WC\":\"West Coast\",\"CT\":\"Canterbury\",\"OT\":\"Otago\",\"SL\":\"Southland\"},\"PA\":{\"PA-1\":\"Bocas del Toro\",\"PA-2\":\"Cocl\\u00e9\",\"PA-3\":\"Col\\u00f3n\",\"PA-4\":\"Chiriqu\\u00ed\",\"PA-5\":\"Dari\\u00e9n\",\"PA-6\":\"Herrera\",\"PA-7\":\"Los Santos\",\"PA-8\":\"Panam\\u00e1\",\"PA-9\":\"Veraguas\",\"PA-10\":\"West Panam\\u00e1\",\"PA-EM\":\"Ember\\u00e1\",\"PA-KY\":\"Guna Yala\",\"PA-NB\":\"Ng\\u00f6be-Bugl\\u00e9\"},\"PE\":{\"CAL\":\"El Callao\",\"LMA\":\"Municipalidad Metropolitana de Lima\",\"AMA\":\"Amazonas\",\"ANC\":\"Ancash\",\"APU\":\"Apur\\u00edmac\",\"ARE\":\"Arequipa\",\"AYA\":\"Ayacucho\",\"CAJ\":\"Cajamarca\",\"CUS\":\"Cusco\",\"HUV\":\"Huancavelica\",\"HUC\":\"Hu\\u00e1nuco\",\"ICA\":\"Ica\",\"JUN\":\"Jun\\u00edn\",\"LAL\":\"La Libertad\",\"LAM\":\"Lambayeque\",\"LIM\":\"Lima\",\"LOR\":\"Loreto\",\"MDD\":\"Madre de Dios\",\"MOQ\":\"Moquegua\",\"PAS\":\"Pasco\",\"PIU\":\"Piura\",\"PUN\":\"Puno\",\"SAM\":\"San Mart\\u00edn\",\"TAC\":\"Tacna\",\"TUM\":\"Tumbes\",\"UCA\":\"Ucayali\"},\"PH\":{\"ABR\":\"Abra\",\"AGN\":\"Agusan del Norte\",\"AGS\":\"Agusan del Sur\",\"AKL\":\"Aklan\",\"ALB\":\"Albay\",\"ANT\":\"Antique\",\"APA\":\"Apayao\",\"AUR\":\"Aurora\",\"BAS\":\"Basilan\",\"BAN\":\"Bataan\",\"BTN\":\"Batanes\",\"BTG\":\"Batangas\",\"BEN\":\"Benguet\",\"BIL\":\"Biliran\",\"BOH\":\"Bohol\",\"BUK\":\"Bukidnon\",\"BUL\":\"Bulacan\",\"CAG\":\"Cagayan\",\"CAN\":\"Camarines Norte\",\"CAS\":\"Camarines Sur\",\"CAM\":\"Camiguin\",\"CAP\":\"Capiz\",\"CAT\":\"Catanduanes\",\"CAV\":\"Cavite\",\"CEB\":\"Cebu\",\"COM\":\"Compostela Valley\",\"NCO\":\"Cotabato\",\"DAV\":\"Davao del Norte\",\"DAS\":\"Davao del Sur\",\"DAC\":\"Davao Occidental\",\"DAO\":\"Davao Oriental\",\"DIN\":\"Dinagat Islands\",\"EAS\":\"Eastern Samar\",\"GUI\":\"Guimaras\",\"IFU\":\"Ifugao\",\"ILN\":\"Ilocos Norte\",\"ILS\":\"Ilocos Sur\",\"ILI\":\"Iloilo\",\"ISA\":\"Isabela\",\"KAL\":\"Kalinga\",\"LUN\":\"La Union\",\"LAG\":\"Laguna\",\"LAN\":\"Lanao del Norte\",\"LAS\":\"Lanao del Sur\",\"LEY\":\"Leyte\",\"MAG\":\"Maguindanao\",\"MAD\":\"Marinduque\",\"MAS\":\"Masbate\",\"MSC\":\"Misamis Occidental\",\"MSR\":\"Misamis Oriental\",\"MOU\":\"Mountain Province\",\"NEC\":\"Negros Occidental\",\"NER\":\"Negros Oriental\",\"NSA\":\"Northern Samar\",\"NUE\":\"Nueva Ecija\",\"NUV\":\"Nueva Vizcaya\",\"MDC\":\"Occidental Mindoro\",\"MDR\":\"Oriental Mindoro\",\"PLW\":\"Palawan\",\"PAM\":\"Pampanga\",\"PAN\":\"Pangasinan\",\"QUE\":\"Quezon\",\"QUI\":\"Quirino\",\"RIZ\":\"Rizal\",\"ROM\":\"Romblon\",\"WSA\":\"Samar\",\"SAR\":\"Sarangani\",\"SIQ\":\"Siquijor\",\"SOR\":\"Sorsogon\",\"SCO\":\"South Cotabato\",\"SLE\":\"Southern Leyte\",\"SUK\":\"Sultan Kudarat\",\"SLU\":\"Sulu\",\"SUN\":\"Surigao del Norte\",\"SUR\":\"Surigao del Sur\",\"TAR\":\"Tarlac\",\"TAW\":\"Tawi-Tawi\",\"ZMB\":\"Zambales\",\"ZAN\":\"Zamboanga del Norte\",\"ZAS\":\"Zamboanga del Sur\",\"ZSI\":\"Zamboanga Sibugay\",\"00\":\"Metro Manila\"},\"PK\":{\"JK\":\"Azad Kashmir\",\"BA\":\"Balochistan\",\"TA\":\"FATA\",\"GB\":\"Gilgit Baltistan\",\"IS\":\"Islamabad Capital Territory\",\"KP\":\"Khyber Pakhtunkhwa\",\"PB\":\"Punjab\",\"SD\":\"Sindh\"},\"PL\":[],\"PR\":[],\"PT\":[],\"PY\":{\"PY-ASU\":\"Asunci\\u00f3n\",\"PY-1\":\"Concepci\\u00f3n\",\"PY-2\":\"San Pedro\",\"PY-3\":\"Cordillera\",\"PY-4\":\"Guair\\u00e1\",\"PY-5\":\"Caaguaz\\u00fa\",\"PY-6\":\"Caazap\\u00e1\",\"PY-7\":\"Itap\\u00faa\",\"PY-8\":\"Misiones\",\"PY-9\":\"Paraguar\\u00ed\",\"PY-10\":\"Alto Paran\\u00e1\",\"PY-11\":\"Central\",\"PY-12\":\"\\u00d1eembuc\\u00fa\",\"PY-13\":\"Amambay\",\"PY-14\":\"Canindey\\u00fa\",\"PY-15\":\"Presidente Hayes\",\"PY-16\":\"Alto Paraguay\",\"PY-17\":\"Boquer\\u00f3n\"},\"RE\":[],\"RO\":{\"AB\":\"Alba\",\"AR\":\"Arad\",\"AG\":\"Arge\\u0219\",\"BC\":\"Bac\\u0103u\",\"BH\":\"Bihor\",\"BN\":\"Bistri\\u021ba-N\\u0103s\\u0103ud\",\"BT\":\"Boto\\u0219ani\",\"BR\":\"Br\\u0103ila\",\"BV\":\"Bra\\u0219ov\",\"B\":\"Bucure\\u0219ti\",\"BZ\":\"Buz\\u0103u\",\"CL\":\"C\\u0103l\\u0103ra\\u0219i\",\"CS\":\"Cara\\u0219-Severin\",\"CJ\":\"Cluj\",\"CT\":\"Constan\\u021ba\",\"CV\":\"Covasna\",\"DB\":\"D\\u00e2mbovi\\u021ba\",\"DJ\":\"Dolj\",\"GL\":\"Gala\\u021bi\",\"GR\":\"Giurgiu\",\"GJ\":\"Gorj\",\"HR\":\"Harghita\",\"HD\":\"Hunedoara\",\"IL\":\"Ialomi\\u021ba\",\"IS\":\"Ia\\u0219i\",\"IF\":\"Ilfov\",\"MM\":\"Maramure\\u0219\",\"MH\":\"Mehedin\\u021bi\",\"MS\":\"Mure\\u0219\",\"NT\":\"Neam\\u021b\",\"OT\":\"Olt\",\"PH\":\"Prahova\",\"SJ\":\"S\\u0103laj\",\"SM\":\"Satu Mare\",\"SB\":\"Sibiu\",\"SV\":\"Suceava\",\"TR\":\"Teleorman\",\"TM\":\"Timi\\u0219\",\"TL\":\"Tulcea\",\"VL\":\"V\\u00e2lcea\",\"VS\":\"Vaslui\",\"VN\":\"Vrancea\"},\"SG\":[],\"SK\":[],\"SI\":[],\"SV\":{\"SV-AH\":\"Ahuachap\\u00e1n\",\"SV-CA\":\"Caba\\u00f1as\",\"SV-CH\":\"Chalatenango\",\"SV-CU\":\"Cuscatl\\u00e1n\",\"SV-LI\":\"La Libertad\",\"SV-MO\":\"Moraz\\u00e1n\",\"SV-PA\":\"La Paz\",\"SV-SA\":\"Santa Ana\",\"SV-SM\":\"San Miguel\",\"SV-SO\":\"Sonsonate\",\"SV-SS\":\"San Salvador\",\"SV-SV\":\"San Vicente\",\"SV-UN\":\"La Uni\\u00f3n\",\"SV-US\":\"Usulut\\u00e1n\"},\"TH\":{\"TH-37\":\"Amnat Charoen\",\"TH-15\":\"Ang Thong\",\"TH-14\":\"Ayutthaya\",\"TH-10\":\"Bangkok\",\"TH-38\":\"Bueng Kan\",\"TH-31\":\"Buri Ram\",\"TH-24\":\"Chachoengsao\",\"TH-18\":\"Chai Nat\",\"TH-36\":\"Chaiyaphum\",\"TH-22\":\"Chanthaburi\",\"TH-50\":\"Chiang Mai\",\"TH-57\":\"Chiang Rai\",\"TH-20\":\"Chonburi\",\"TH-86\":\"Chumphon\",\"TH-46\":\"Kalasin\",\"TH-62\":\"Kamphaeng Phet\",\"TH-71\":\"Kanchanaburi\",\"TH-40\":\"Khon Kaen\",\"TH-81\":\"Krabi\",\"TH-52\":\"Lampang\",\"TH-51\":\"Lamphun\",\"TH-42\":\"Loei\",\"TH-16\":\"Lopburi\",\"TH-58\":\"Mae Hong Son\",\"TH-44\":\"Maha Sarakham\",\"TH-49\":\"Mukdahan\",\"TH-26\":\"Nakhon Nayok\",\"TH-73\":\"Nakhon Pathom\",\"TH-48\":\"Nakhon Phanom\",\"TH-30\":\"Nakhon Ratchasima\",\"TH-60\":\"Nakhon Sawan\",\"TH-80\":\"Nakhon Si Thammarat\",\"TH-55\":\"Nan\",\"TH-96\":\"Narathiwat\",\"TH-39\":\"Nong Bua Lam Phu\",\"TH-43\":\"Nong Khai\",\"TH-12\":\"Nonthaburi\",\"TH-13\":\"Pathum Thani\",\"TH-94\":\"Pattani\",\"TH-82\":\"Phang Nga\",\"TH-93\":\"Phatthalung\",\"TH-56\":\"Phayao\",\"TH-67\":\"Phetchabun\",\"TH-76\":\"Phetchaburi\",\"TH-66\":\"Phichit\",\"TH-65\":\"Phitsanulok\",\"TH-54\":\"Phrae\",\"TH-83\":\"Phuket\",\"TH-25\":\"Prachin Buri\",\"TH-77\":\"Prachuap Khiri Khan\",\"TH-85\":\"Ranong\",\"TH-70\":\"Ratchaburi\",\"TH-21\":\"Rayong\",\"TH-45\":\"Roi Et\",\"TH-27\":\"Sa Kaeo\",\"TH-47\":\"Sakon Nakhon\",\"TH-11\":\"Samut Prakan\",\"TH-74\":\"Samut Sakhon\",\"TH-75\":\"Samut Songkhram\",\"TH-19\":\"Saraburi\",\"TH-91\":\"Satun\",\"TH-17\":\"Sing Buri\",\"TH-33\":\"Sisaket\",\"TH-90\":\"Songkhla\",\"TH-64\":\"Sukhothai\",\"TH-72\":\"Suphan Buri\",\"TH-84\":\"Surat Thani\",\"TH-32\":\"Surin\",\"TH-63\":\"Tak\",\"TH-92\":\"Trang\",\"TH-23\":\"Trat\",\"TH-34\":\"Ubon Ratchathani\",\"TH-41\":\"Udon Thani\",\"TH-61\":\"Uthai Thani\",\"TH-53\":\"Uttaradit\",\"TH-95\":\"Yala\",\"TH-35\":\"Yasothon\"},\"TR\":{\"TR01\":\"Adana\",\"TR02\":\"Ad\\u0131yaman\",\"TR03\":\"Afyon\",\"TR04\":\"A\\u011fr\\u0131\",\"TR05\":\"Amasya\",\"TR06\":\"Ankara\",\"TR07\":\"Antalya\",\"TR08\":\"Artvin\",\"TR09\":\"Ayd\\u0131n\",\"TR10\":\"Bal\\u0131kesir\",\"TR11\":\"Bilecik\",\"TR12\":\"Bing\\u00f6l\",\"TR13\":\"Bitlis\",\"TR14\":\"Bolu\",\"TR15\":\"Burdur\",\"TR16\":\"Bursa\",\"TR17\":\"\\u00c7anakkale\",\"TR18\":\"\\u00c7ank\\u0131r\\u0131\",\"TR19\":\"\\u00c7orum\",\"TR20\":\"Denizli\",\"TR21\":\"Diyarbak\\u0131r\",\"TR22\":\"Edirne\",\"TR23\":\"Elaz\\u0131\\u011f\",\"TR24\":\"Erzincan\",\"TR25\":\"Erzurum\",\"TR26\":\"Eski\\u015fehir\",\"TR27\":\"Gaziantep\",\"TR28\":\"Giresun\",\"TR29\":\"G\\u00fcm\\u00fc\\u015fhane\",\"TR30\":\"Hakkari\",\"TR31\":\"Hatay\",\"TR32\":\"Isparta\",\"TR33\":\"\\u0130\\u00e7el\",\"TR34\":\"\\u0130stanbul\",\"TR35\":\"\\u0130zmir\",\"TR36\":\"Kars\",\"TR37\":\"Kastamonu\",\"TR38\":\"Kayseri\",\"TR39\":\"K\\u0131rklareli\",\"TR40\":\"K\\u0131r\\u015fehir\",\"TR41\":\"Kocaeli\",\"TR42\":\"Konya\",\"TR43\":\"K\\u00fctahya\",\"TR44\":\"Malatya\",\"TR45\":\"Manisa\",\"TR46\":\"Kahramanmara\\u015f\",\"TR47\":\"Mardin\",\"TR48\":\"Mu\\u011fla\",\"TR49\":\"Mu\\u015f\",\"TR50\":\"Nev\\u015fehir\",\"TR51\":\"Ni\\u011fde\",\"TR52\":\"Ordu\",\"TR53\":\"Rize\",\"TR54\":\"Sakarya\",\"TR55\":\"Samsun\",\"TR56\":\"Siirt\",\"TR57\":\"Sinop\",\"TR58\":\"Sivas\",\"TR59\":\"Tekirda\\u011f\",\"TR60\":\"Tokat\",\"TR61\":\"Trabzon\",\"TR62\":\"Tunceli\",\"TR63\":\"\\u015eanl\\u0131urfa\",\"TR64\":\"U\\u015fak\",\"TR65\":\"Van\",\"TR66\":\"Yozgat\",\"TR67\":\"Zonguldak\",\"TR68\":\"Aksaray\",\"TR69\":\"Bayburt\",\"TR70\":\"Karaman\",\"TR71\":\"K\\u0131r\\u0131kkale\",\"TR72\":\"Batman\",\"TR73\":\"\\u015e\\u0131rnak\",\"TR74\":\"Bart\\u0131n\",\"TR75\":\"Ardahan\",\"TR76\":\"I\\u011fd\\u0131r\",\"TR77\":\"Yalova\",\"TR78\":\"Karab\\u00fck\",\"TR79\":\"Kilis\",\"TR80\":\"Osmaniye\",\"TR81\":\"D\\u00fczce\"},\"TZ\":{\"TZ01\":\"Arusha\",\"TZ02\":\"Dar es Salaam\",\"TZ03\":\"Dodoma\",\"TZ04\":\"Iringa\",\"TZ05\":\"Kagera\",\"TZ06\":\"Pemba North\",\"TZ07\":\"Zanzibar North\",\"TZ08\":\"Kigoma\",\"TZ09\":\"Kilimanjaro\",\"TZ10\":\"Pemba South\",\"TZ11\":\"Zanzibar South\",\"TZ12\":\"Lindi\",\"TZ13\":\"Mara\",\"TZ14\":\"Mbeya\",\"TZ15\":\"Zanzibar West\",\"TZ16\":\"Morogoro\",\"TZ17\":\"Mtwara\",\"TZ18\":\"Mwanza\",\"TZ19\":\"Coast\",\"TZ20\":\"Rukwa\",\"TZ21\":\"Ruvuma\",\"TZ22\":\"Shinyanga\",\"TZ23\":\"Singida\",\"TZ24\":\"Tabora\",\"TZ25\":\"Tanga\",\"TZ26\":\"Manyara\",\"TZ27\":\"Geita\",\"TZ28\":\"Katavi\",\"TZ29\":\"Njombe\",\"TZ30\":\"Simiyu\"},\"LK\":[],\"RS\":{\"RS00\":\"Belgrade\",\"RS14\":\"Bor\",\"RS11\":\"Brani\\u010devo\",\"RS02\":\"Central Banat\",\"RS10\":\"Danube\",\"RS23\":\"Jablanica\",\"RS09\":\"Kolubara\",\"RS08\":\"Ma\\u010dva\",\"RS17\":\"Morava\",\"RS20\":\"Ni\\u0161ava\",\"RS01\":\"North Ba\\u010dka\",\"RS03\":\"North Banat\",\"RS24\":\"P\\u010dinja\",\"RS22\":\"Pirot\",\"RS13\":\"Pomoravlje\",\"RS19\":\"Rasina\",\"RS18\":\"Ra\\u0161ka\",\"RS06\":\"South Ba\\u010dka\",\"RS04\":\"South Banat\",\"RS07\":\"Srem\",\"RS12\":\"\\u0160umadija\",\"RS21\":\"Toplica\",\"RS05\":\"West Ba\\u010dka\",\"RS15\":\"Zaje\\u010dar\",\"RS16\":\"Zlatibor\",\"RS25\":\"Kosovo\",\"RS26\":\"Pe\\u0107\",\"RS27\":\"Prizren\",\"RS28\":\"Kosovska Mitrovica\",\"RS29\":\"Kosovo-Pomoravlje\",\"RSKM\":\"Kosovo-Metohija\",\"RSVO\":\"Vojvodina\"},\"SE\":[],\"UA\":{\"VN\":\"Vinnytsia Oblast\",\"VL\":\"Volyn Oblast\",\"DP\":\"Dnipropetrovsk Oblast\",\"DT\":\"Donetsk Oblast\",\"ZT\":\"Zhytomyr Oblast\",\"ZK\":\"Zakarpattia Oblast\",\"ZP\":\"Zaporizhzhia Oblast\",\"IF\":\"Ivano-Frankivsk Oblast\",\"KV\":\"Kyiv Oblast\",\"KH\":\"Kirovohrad Oblast\",\"LH\":\"Luhansk Oblast\",\"LV\":\"Lviv Oblast\",\"MY\":\"Mykolaiv Oblast\",\"OD\":\"Odessa Oblast\",\"PL\":\"Poltava Oblast\",\"RV\":\"Rivne Oblast\",\"SM\":\"Sumy Oblast\",\"TP\":\"Ternopil Oblast\",\"KK\":\"Kharkiv Oblast\",\"KS\":\"Kherson Oblast\",\"KM\":\"Khmelnytskyi Oblast\",\"CK\":\"Cherkasy Oblast\",\"CH\":\"Chernihiv Oblast\",\"CV\":\"Chernivtsi Oblast\"},\"UG\":{\"UG314\":\"Abim\",\"UG301\":\"Adjumani\",\"UG322\":\"Agago\",\"UG323\":\"Alebtong\",\"UG315\":\"Amolatar\",\"UG324\":\"Amudat\",\"UG216\":\"Amuria\",\"UG316\":\"Amuru\",\"UG302\":\"Apac\",\"UG303\":\"Arua\",\"UG217\":\"Budaka\",\"UG218\":\"Bududa\",\"UG201\":\"Bugiri\",\"UG235\":\"Bugweri\",\"UG420\":\"Buhweju\",\"UG117\":\"Buikwe\",\"UG219\":\"Bukedea\",\"UG118\":\"Bukomansimbi\",\"UG220\":\"Bukwa\",\"UG225\":\"Bulambuli\",\"UG416\":\"Buliisa\",\"UG401\":\"Bundibugyo\",\"UG430\":\"Bunyangabu\",\"UG402\":\"Bushenyi\",\"UG202\":\"Busia\",\"UG221\":\"Butaleja\",\"UG119\":\"Butambala\",\"UG233\":\"Butebo\",\"UG120\":\"Buvuma\",\"UG226\":\"Buyende\",\"UG317\":\"Dokolo\",\"UG121\":\"Gomba\",\"UG304\":\"Gulu\",\"UG403\":\"Hoima\",\"UG417\":\"Ibanda\",\"UG203\":\"Iganga\",\"UG418\":\"Isingiro\",\"UG204\":\"Jinja\",\"UG318\":\"Kaabong\",\"UG404\":\"Kabale\",\"UG405\":\"Kabarole\",\"UG213\":\"Kaberamaido\",\"UG427\":\"Kagadi\",\"UG428\":\"Kakumiro\",\"UG101\":\"Kalangala\",\"UG222\":\"Kaliro\",\"UG122\":\"Kalungu\",\"UG102\":\"Kampala\",\"UG205\":\"Kamuli\",\"UG413\":\"Kamwenge\",\"UG414\":\"Kanungu\",\"UG206\":\"Kapchorwa\",\"UG236\":\"Kapelebyong\",\"UG126\":\"Kasanda\",\"UG406\":\"Kasese\",\"UG207\":\"Katakwi\",\"UG112\":\"Kayunga\",\"UG407\":\"Kibaale\",\"UG103\":\"Kiboga\",\"UG227\":\"Kibuku\",\"UG432\":\"Kikuube\",\"UG419\":\"Kiruhura\",\"UG421\":\"Kiryandongo\",\"UG408\":\"Kisoro\",\"UG305\":\"Kitgum\",\"UG319\":\"Koboko\",\"UG325\":\"Kole\",\"UG306\":\"Kotido\",\"UG208\":\"Kumi\",\"UG333\":\"Kwania\",\"UG228\":\"Kween\",\"UG123\":\"Kyankwanzi\",\"UG422\":\"Kyegegwa\",\"UG415\":\"Kyenjojo\",\"UG125\":\"Kyotera\",\"UG326\":\"Lamwo\",\"UG307\":\"Lira\",\"UG229\":\"Luuka\",\"UG104\":\"Luwero\",\"UG124\":\"Lwengo\",\"UG114\":\"Lyantonde\",\"UG223\":\"Manafwa\",\"UG320\":\"Maracha\",\"UG105\":\"Masaka\",\"UG409\":\"Masindi\",\"UG214\":\"Mayuge\",\"UG209\":\"Mbale\",\"UG410\":\"Mbarara\",\"UG423\":\"Mitooma\",\"UG115\":\"Mityana\",\"UG308\":\"Moroto\",\"UG309\":\"Moyo\",\"UG106\":\"Mpigi\",\"UG107\":\"Mubende\",\"UG108\":\"Mukono\",\"UG334\":\"Nabilatuk\",\"UG311\":\"Nakapiripirit\",\"UG116\":\"Nakaseke\",\"UG109\":\"Nakasongola\",\"UG230\":\"Namayingo\",\"UG234\":\"Namisindwa\",\"UG224\":\"Namutumba\",\"UG327\":\"Napak\",\"UG310\":\"Nebbi\",\"UG231\":\"Ngora\",\"UG424\":\"Ntoroko\",\"UG411\":\"Ntungamo\",\"UG328\":\"Nwoya\",\"UG331\":\"Omoro\",\"UG329\":\"Otuke\",\"UG321\":\"Oyam\",\"UG312\":\"Pader\",\"UG332\":\"Pakwach\",\"UG210\":\"Pallisa\",\"UG110\":\"Rakai\",\"UG429\":\"Rubanda\",\"UG425\":\"Rubirizi\",\"UG431\":\"Rukiga\",\"UG412\":\"Rukungiri\",\"UG111\":\"Sembabule\",\"UG232\":\"Serere\",\"UG426\":\"Sheema\",\"UG215\":\"Sironko\",\"UG211\":\"Soroti\",\"UG212\":\"Tororo\",\"UG113\":\"Wakiso\",\"UG313\":\"Yumbe\",\"UG330\":\"Zombo\"},\"UM\":{\"81\":\"Baker Island\",\"84\":\"Howland Island\",\"86\":\"Jarvis Island\",\"67\":\"Johnston Atoll\",\"89\":\"Kingman Reef\",\"71\":\"Midway Atoll\",\"76\":\"Navassa Island\",\"95\":\"Palmyra Atoll\",\"79\":\"Wake Island\"},\"US\":{\"AL\":\"Alabama\",\"AK\":\"Alaska\",\"AZ\":\"Arizona\",\"AR\":\"Arkansas\",\"CA\":\"California\",\"CO\":\"Colorado\",\"CT\":\"Connecticut\",\"DE\":\"Delaware\",\"DC\":\"\\u0110\\u1eb7c khu Columbia\",\"FL\":\"Florida\",\"GA\":\"Georgia\",\"HI\":\"Hawaii\",\"ID\":\"Idaho\",\"IL\":\"Illinois\",\"IN\":\"Indiana\",\"IA\":\"Iowa\",\"KS\":\"Kansas\",\"KY\":\"Kentucky\",\"LA\":\"Louisiana\",\"ME\":\"Maine\",\"MD\":\"Maryland\",\"MA\":\"Massachusetts\",\"MI\":\"Michigan\",\"MN\":\"Minnesota\",\"MS\":\"Mississippi\",\"MO\":\"Missouri\",\"MT\":\"Montana\",\"NE\":\"Nebraska\",\"NV\":\"Nevada\",\"NH\":\"New Hampshire\",\"NJ\":\"New Jersey\",\"NM\":\"New Mexico\",\"NY\":\"New York\",\"NC\":\"B\\u1eafc Carolina\",\"ND\":\"B\\u1eafc Dakota\",\"OH\":\"Ohio\",\"OK\":\"Oklahoma\",\"OR\":\"Oregon\",\"PA\":\"Pennsylvania\",\"RI\":\"Ti\\u1ec3u bang Rhode Island\",\"SC\":\"Nam Carolina\",\"SD\":\"Nam Dakota\",\"TN\":\"Tennessee\",\"TX\":\"Texas\",\"UT\":\"Utah\",\"VT\":\"Vermont\",\"VA\":\"Virginia\",\"WA\":\"Washington\",\"WV\":\"T\\u00e2y Virginia\",\"WI\":\"Wisconsin\",\"WY\":\"Wyoming\",\"AA\":\"Armed Forces (AA)\",\"AE\":\"Armed Forces (AE)\",\"AP\":\"Armed Forces (AP)\"},\"UY\":{\"UY-AR\":\"Artigas\",\"UY-CA\":\"Canelones\",\"UY-CL\":\"Cerro Largo\",\"UY-CO\":\"Colonia\",\"UY-DU\":\"Durazno\",\"UY-FS\":\"Flores\",\"UY-FD\":\"Florida\",\"UY-LA\":\"Lavalleja\",\"UY-MA\":\"Maldonado\",\"UY-MO\":\"Montevideo\",\"UY-PA\":\"Paysand\\u00fa\",\"UY-RN\":\"R\\u00edo Negro\",\"UY-RV\":\"Rivera\",\"UY-RO\":\"Rocha\",\"UY-SA\":\"Salto\",\"UY-SJ\":\"San Jos\\u00e9\",\"UY-SO\":\"Soriano\",\"UY-TA\":\"Tacuaremb\\u00f3\",\"UY-TT\":\"Treinta y Tres\"},\"VE\":{\"VE-A\":\"Capital\",\"VE-B\":\"Anzo\\u00e1tegui\",\"VE-C\":\"Apure\",\"VE-D\":\"Aragua\",\"VE-E\":\"Barinas\",\"VE-F\":\"Bol\\u00edvar\",\"VE-G\":\"Carabobo\",\"VE-H\":\"Cojedes\",\"VE-I\":\"Falc\\u00f3n\",\"VE-J\":\"Gu\\u00e1rico\",\"VE-K\":\"Lara\",\"VE-L\":\"M\\u00e9rida\",\"VE-M\":\"Miranda\",\"VE-N\":\"Monagas\",\"VE-O\":\"Nueva Esparta\",\"VE-P\":\"Portuguesa\",\"VE-R\":\"Sucre\",\"VE-S\":\"T\\u00e1chira\",\"VE-T\":\"Trujillo\",\"VE-U\":\"Yaracuy\",\"VE-V\":\"Zulia\",\"VE-W\":\"Federal Dependencies\",\"VE-X\":\"La Guaira (Vargas)\",\"VE-Y\":\"Delta Amacuro\",\"VE-Z\":\"Amazonas\"},\"VN\":{\"HANOI\":\"H\\u00e0 N\\u1ed9i\",\"HOCHIMINH\":\"H\\u1ed3 Ch\\u00ed Minh\",\"ANGIANG\":\"An Giang\",\"BACGIANG\":\"B\\u1eafc Giang\",\"BACKAN\":\"B\\u1eafc K\\u1ea1n\",\"BACLIEU\":\"B\\u1ea1c Li\\u00eau\",\"BACNINH\":\"B\\u1eafc Ninh\",\"BARIAVUNGTAU\":\"B\\u00e0 R\\u1ecba - V\\u0169ng T\\u00e0u\",\"BENTRE\":\"B\\u1ebfn Tre\",\"BINHDINH\":\"B\\u00ecnh \\u0110\\u1ecbnh\",\"BINHDUONG\":\"B\\u00ecnh D\\u01b0\\u01a1ng\",\"BINHPHUOC\":\"B\\u00ecnh Ph\\u01b0\\u1edbc\",\"BINHTHUAN\":\"B\\u00ecnh Thu\\u1eadn\",\"CAMAU\":\"C\\u00e0 Mau\",\"CANTHO\":\"C\\u1ea7n Th\\u01a1\",\"CAOBANG\":\"Cao B\\u1eb1ng\",\"DAKLAK\":\"\\u0110\\u1eafk L\\u1eafk\",\"DAKNONG\":\"\\u0110\\u1eafk N\\u00f4ng\",\"DANANG\":\"\\u0110\\u00e0 N\\u1eb5ng\",\"DIENBIEN\":\"\\u0110i\\u1ec7n Bi\\u00ean\",\"DONGNAI\":\"\\u0110\\u1ed3ng Nai\",\"DONGTHAP\":\"\\u0110\\u1ed3ng Th\\u00e1p\",\"GIALAI\":\"Gia Lai\",\"HAGIANG\":\"H\\u00e0 Giang\",\"HAIDUONG\":\"H\\u1ea3i D\\u01b0\\u01a1ng\",\"HAIPHONG\":\"H\\u1ea3i Ph\\u00f2ng\",\"HANAM\":\"H\\u00e0 Nam\",\"HATINH\":\"H\\u00e0 T\\u0129nh\",\"HAUGIANG\":\"H\\u1eadu Giang\",\"HOABINH\":\"H\\u00f2a B\\u00ecnh\",\"HUNGYEN\":\"H\\u01b0ng Y\\u00ean\",\"KHANHHOA\":\"Kh\\u00e1nh H\\u00f2a\",\"KIENGIANG\":\"Ki\\u00ean Giang\",\"KONTUM\":\"Kon Tum\",\"LAICHAU\":\"Lai Ch\\u00e2u\",\"LAMDONG\":\"L\\u00e2m \\u0110\\u1ed3ng\",\"LANGSON\":\"L\\u1ea1ng S\\u01a1n\",\"LAOCAI\":\"L\\u00e0o Cai\",\"LONGAN\":\"Long An\",\"NAMDINH\":\"Nam \\u0110\\u1ecbnh\",\"NGHEAN\":\"Ngh\\u1ec7 An\",\"NINHBINH\":\"Ninh B\\u00ecnh\",\"NINHTHUAN\":\"Ninh Thu\\u1eadn\",\"PHUTHO\":\"Ph\\u00fa Th\\u1ecd\",\"PHUYEN\":\"Ph\\u00fa Y\\u00ean\",\"QUANGBINH\":\"Qu\\u1ea3ng B\\u00ecnh\",\"QUANGNAM\":\"Qu\\u1ea3ng Nam\",\"QUANGNGAI\":\"Qu\\u1ea3ng Ng\\u00e3i\",\"QUANGNINH\":\"Qu\\u1ea3ng Ninh\",\"QUANGTRI\":\"Qu\\u1ea3ng Tr\\u1ecb\",\"SOCTRANG\":\"S\\u00f3c Tr\\u0103ng\",\"SONLA\":\"S\\u01a1n La\",\"TAYNINH\":\"T\\u00e2y Ninh\",\"THAIBINH\":\"Th\\u00e1i B\\u00ecnh\",\"THAINGUYEN\":\"Th\\u00e1i Nguy\\u00ean\",\"THANHHOA\":\"Thanh H\\u00f3a\",\"THUATHIENHUE\":\"Th\\u1eeba Thi\\u00ean Hu\\u1ebf\",\"TIENGIANG\":\"Ti\\u1ec1n Giang\",\"TRAVINH\":\"Tr\\u00e0 Vinh\",\"TUYENQUANG\":\"Tuy\\u00ean Quang\",\"VINHLONG\":\"V\\u0129nh Long\",\"VINHPHUC\":\"V\\u0129nh Ph\\u00fac\",\"YENBAI\":\"Y\\u00ean B\\u00e1i\"},\"YT\":[],\"ZA\":{\"EC\":\"Eastern Cape\",\"FS\":\"Free State\",\"GP\":\"Gauteng\",\"KZN\":\"KwaZulu-Natal\",\"LP\":\"Limpopo\",\"MP\":\"Mpumalanga\",\"NC\":\"Northern Cape\",\"NW\":\"North West\",\"WC\":\"Western Cape\"},\"ZM\":{\"ZM-01\":\"Western\",\"ZM-02\":\"Central\",\"ZM-03\":\"Eastern\",\"ZM-04\":\"Luapula\",\"ZM-05\":\"Northern\",\"ZM-06\":\"North-Western\",\"ZM-07\":\"Southern\",\"ZM-08\":\"Copperbelt\",\"ZM-09\":\"Lusaka\",\"ZM-10\":\"Muchinga\"}}", "i18n_select_state_text": "Ch\u1ecdn m\u1ed9t t\u00f9y ch\u1ecdn\u2026", "i18n_no_matches": "Kh\u00f4ng t\u00ecm th\u1ea5y k\u1ebft qu\u1ea3 ph\u00f9 h\u1ee3p", "i18n_ajax_error": "Kh\u00f4ng t\u1ea3i \u0111\u01b0\u1ee3c", "i18n_input_too_short_1": "Vui l\u00f2ng nh\u1eadp 1 ho\u1eb7c nhi\u1ec1u k\u00fd t\u1ef1", "i18n_input_too_short_n": "Vui l\u00f2ng nh\u1eadp %qty% ho\u1eb7c nhi\u1ec1u k\u00fd t\u1ef1", "i18n_input_too_long_1": "Vui l\u00f2ng x\u00f3a 1 k\u00fd t\u1ef1", "i18n_input_too_long_n": "Vui l\u00f2ng x\u00f3a %qty%  k\u00fd t\u1ef1", "i18n_selection_too_long_1": "B\u1ea1n ch\u1ec9 c\u00f3 th\u1ec3 ch\u1ecdn 1 s\u1ea3n ph\u1ea9m", "i18n_selection_too_long_n": "B\u1ea1n c\u00f3 th\u1ec3 ch\u1ecdn %qty% s\u1ea3n ph\u1ea9m", "i18n_load_more": "T\u1ea3i th\u00eam k\u1ebft qu\u1ea3\u2026", "i18n_searching": "T\u00ecm ki\u1ebfm\u2026"};
            /* ]]> */
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/country-select.min.js' id='wc-country-select-js'></script>
        <script type='text/javascript' id='wc-address-i18n-js-extra'>
            /* <![CDATA[ */
            var wc_address_i18n_params = {"locale": "{\"AE\":{\"postcode\":{\"required\":false,\"hidden\":true},\"state\":{\"required\":false}},\"AF\":{\"state\":{\"required\":false,\"hidden\":true}},\"AL\":{\"state\":[]},\"AO\":{\"postcode\":{\"required\":false,\"hidden\":true},\"state\":[]},\"AT\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"AU\":{\"city\":[],\"postcode\":[],\"state\":[]},\"AX\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"BA\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"BD\":{\"postcode\":{\"required\":false},\"state\":[]},\"BE\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"BH\":{\"postcode\":{\"required\":false},\"state\":{\"required\":false,\"hidden\":true}},\"BI\":{\"state\":{\"required\":false,\"hidden\":true}},\"BO\":{\"postcode\":{\"required\":false,\"hidden\":true},\"state\":[]},\"BS\":{\"postcode\":{\"required\":false,\"hidden\":true}},\"CA\":{\"postcode\":[],\"state\":[]},\"CH\":{\"postcode\":[],\"state\":{\"required\":false}},\"CL\":{\"city\":{\"required\":true},\"postcode\":{\"required\":false},\"state\":[]},\"CN\":{\"state\":[]},\"CO\":{\"postcode\":{\"required\":false},\"state\":[]},\"CR\":{\"state\":[]},\"CW\":{\"postcode\":{\"required\":false,\"hidden\":true},\"state\":{\"required\":false}},\"CZ\":{\"state\":{\"required\":false,\"hidden\":true}},\"DE\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"DK\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"DO\":{\"state\":[]},\"EC\":{\"state\":[]},\"EE\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"FI\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"FR\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"GH\":{\"postcode\":{\"required\":false},\"state\":[]},\"GP\":{\"state\":{\"required\":false,\"hidden\":true}},\"GF\":{\"state\":{\"required\":false,\"hidden\":true}},\"GR\":{\"state\":{\"required\":false}},\"GT\":{\"postcode\":{\"required\":false,\"hidden\":true},\"state\":[]},\"HK\":{\"postcode\":{\"required\":false},\"city\":[],\"state\":[]},\"HN\":{\"state\":[]},\"HU\":{\"last_name\":{\"class\":[\"form-row-first\"]},\"first_name\":{\"class\":[\"form-row-last\"]},\"postcode\":{\"class\":[\"form-row-first\",\"address-field\"]},\"city\":{\"class\":[\"form-row-last\",\"address-field\"]},\"address_1\":[],\"address_2\":[],\"state\":[]},\"ID\":{\"state\":[]},\"IE\":{\"postcode\":{\"required\":false},\"state\":[]},\"IS\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"IL\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"IM\":{\"state\":{\"required\":false,\"hidden\":true}},\"IN\":{\"postcode\":[],\"state\":[]},\"IT\":{\"postcode\":[],\"state\":{\"required\":true}},\"JM\":{\"city\":[],\"postcode\":{\"required\":false},\"state\":{\"required\":true}},\"JP\":{\"last_name\":{\"class\":[\"form-row-first\"]},\"first_name\":{\"class\":[\"form-row-last\"]},\"postcode\":{\"class\":[\"form-row-first\",\"address-field\"]},\"state\":{\"class\":[\"form-row-last\",\"address-field\"]},\"city\":[],\"address_1\":[],\"address_2\":[]},\"KR\":{\"state\":{\"required\":false,\"hidden\":true}},\"KW\":{\"state\":{\"required\":false,\"hidden\":true}},\"LV\":{\"state\":{\"required\":false}},\"LB\":{\"state\":{\"required\":false,\"hidden\":true}},\"MQ\":{\"state\":{\"required\":false,\"hidden\":true}},\"MT\":{\"state\":{\"required\":false,\"hidden\":true}},\"MZ\":{\"postcode\":{\"required\":false,\"hidden\":true},\"state\":[]},\"NI\":{\"state\":[]},\"NL\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"NG\":{\"postcode\":{\"required\":false,\"hidden\":true},\"state\":[]},\"NZ\":{\"postcode\":[],\"state\":{\"required\":false}},\"NO\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"NP\":{\"state\":[],\"postcode\":{\"required\":false}},\"PA\":{\"state\":[]},\"PL\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"PR\":{\"city\":[],\"state\":{\"required\":false,\"hidden\":true}},\"PT\":{\"state\":{\"required\":false,\"hidden\":true}},\"PY\":{\"state\":[]},\"RE\":{\"state\":{\"required\":false,\"hidden\":true}},\"RO\":{\"state\":{\"required\":true}},\"RS\":{\"city\":{\"required\":true},\"postcode\":{\"required\":true},\"state\":{\"required\":false}},\"SG\":{\"state\":{\"required\":false,\"hidden\":true},\"city\":{\"required\":false}},\"SK\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"SI\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"SR\":{\"postcode\":{\"required\":false,\"hidden\":true}},\"SV\":{\"state\":[]},\"ES\":{\"postcode\":[],\"state\":[]},\"LI\":{\"postcode\":[],\"state\":{\"required\":false}},\"LK\":{\"state\":{\"required\":false,\"hidden\":true}},\"LU\":{\"state\":{\"required\":false,\"hidden\":true}},\"MD\":{\"state\":[]},\"SE\":{\"postcode\":[],\"state\":{\"required\":false,\"hidden\":true}},\"TR\":{\"postcode\":[],\"state\":[]},\"UG\":{\"postcode\":{\"required\":false,\"hidden\":true},\"city\":{\"required\":true},\"state\":{\"required\":true}},\"US\":{\"postcode\":[],\"state\":[]},\"UY\":{\"state\":[]},\"GB\":{\"postcode\":[],\"state\":{\"required\":false}},\"ST\":{\"postcode\":{\"required\":false,\"hidden\":true},\"state\":[]},\"VN\":{\"state\":[],\"city\":[],\"address_1\":[],\"address_2\":{\"hidden\":false}},\"WS\":{\"postcode\":{\"required\":false,\"hidden\":true}},\"YT\":{\"state\":{\"required\":false,\"hidden\":true}},\"ZA\":{\"state\":[]},\"ZW\":{\"postcode\":{\"required\":false,\"hidden\":true}},\"default\":{\"last_name\":{\"required\":true,\"class\":[\"form-row-wide\"],\"clear\":true},\"city\":{\"type\":\"select\",\"required\":true,\"class\":[\"form-row-wide\"],\"options\":{\"\":\"\"}},\"address_2\":{\"type\":\"select\",\"class\":[\"form-row-wide\"],\"options\":{\"\":\"\"}},\"country\":{\"type\":\"country\",\"required\":true,\"class\":[\"form-row-wide\",\"address-field\",\"update_totals_on_change\"],\"autocomplete\":\"country\"},\"address_1\":{\"required\":true,\"class\":[\"form-row-wide\"],\"autocomplete\":\"address-line1\"},\"state\":{\"type\":\"state\",\"required\":true,\"class\":[\"form-row-wide\",\"address-field\"],\"validate\":[\"state\"],\"autocomplete\":\"address-level1\"}}}", "locale_fields": "{\"address_1\":\"#billing_address_1_field, #shipping_address_1_field\",\"address_2\":\"#billing_address_2_field, #shipping_address_2_field\",\"state\":\"#billing_state_field, #shipping_state_field, #calc_shipping_state_field\",\"postcode\":\"#billing_postcode_field, #shipping_postcode_field, #calc_shipping_postcode_field\",\"city\":\"#billing_city_field, #shipping_city_field, #calc_shipping_city_field\"}", "i18n_required_text": "b\u1eaft bu\u1ed9c", "i18n_optional_text": "tu\u1ef3 ch\u1ecdn"};
            /* ]]> */
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/address-i18n.min.js' id='wc-address-i18n-js'></script>
        <script type='text/javascript' id='wc-cart-js-extra'>
            /* <![CDATA[ */
            var wc_cart_params = {"ajax_url": "\/wp-admin\/admin-ajax.php", "wc_ajax_url": "\/?wc-ajax=%%endpoint%%", "update_shipping_method_nonce": "4a98dd06bc", "apply_coupon_nonce": "ce5a9a03d8", "remove_coupon_nonce": "0f02f997dd"};
            /* ]]> */
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/cart.min.js' id='wc-cart-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/selectWoo/selectWoo.full.min.js' id='selectWoo-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/dist/vendor/regenerator-runtime.min.js' id='regenerator-runtime-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/dist/vendor/wp-polyfill.min.js' id='wp-polyfill-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/dist/hooks.min.js' id='wp-hooks-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/dist/i18n.min.js' id='wp-i18n-js'></script>
        <script type='text/javascript' id='wp-i18n-js-after'>
            wp.i18n.setLocaleData({'text direction\u0004ltr': ['ltr']});
        </script>
        <script type='text/javascript' id='password-strength-meter-js-extra'>
            /* <![CDATA[ */
            var pwsL10n = {"unknown": "M\u1eadt kh\u1ea9u m\u1ea1nh kh\u00f4ng x\u00e1c \u0111\u1ecbnh", "short": "R\u1ea5t y\u1ebfu", "bad": "Y\u1ebfu", "good": "Trung b\u00ecnh", "strong": "M\u1ea1nh", "mismatch": "M\u1eadt kh\u1ea9u kh\u00f4ng kh\u1edbp"};
            /* ]]> */
        </script>
        <script type='text/javascript' id='password-strength-meter-js-translations'>
            (function (domain, translations) {
                var localeData = translations.locale_data[ domain ] || translations.locale_data.messages;
                localeData[""].domain = domain;
                wp.i18n.setLocaleData(localeData, domain);
            })("default", {"translation-revision-date": "2021-11-15 07:20:52+0000", "generator": "GlotPress\/3.0.0-alpha.2", "domain": "messages", "locale_data": {"messages": {"": {"domain": "messages", "plural-forms": "nplurals=1; plural=0;", "lang": "vi_VN"}, "%1$s is deprecated since version %2$s! Use %3$s instead. Please consider writing more inclusive code.": ["%1$s \u0111\u00e3 ng\u1eebng ho\u1ea1t \u0111\u1ed9ng t\u1eeb phi\u00ean b\u1ea3n %2$s! S\u1eed d\u1ee5ng thay th\u1ebf b\u1eb1ng %3$s."]}}, "comment": {"reference": "wp-admin\/js\/password-strength-meter.js"}});
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-admin/js/password-strength-meter.min.js' id='password-strength-meter-js'></script>
        <script type='text/javascript' id='wc-password-strength-meter-js-extra'>
            /* <![CDATA[ */
            var wc_password_strength_meter_params = {"min_password_strength": "3", "stop_checkout": "", "i18n_password_error": "Vui l\u00f2ng nh\u1eadp m\u1eadt kh\u1ea9u kh\u00f3 h\u01a1n.", "i18n_password_hint": "G\u1ee3i \u00fd: M\u1eadt kh\u1ea9u ph\u1ea3i c\u00f3 \u00edt nh\u1ea5t 12 k\u00fd t\u1ef1. \u0110\u1ec3 n\u00e2ng cao \u0111\u1ed9 b\u1ea3o m\u1eadt, s\u1eed d\u1ee5ng ch\u1eef in hoa, in th\u01b0\u1eddng, ch\u1eef s\u1ed1 v\u00e0 c\u00e1c k\u00fd t\u1ef1 \u0111\u1eb7c bi\u1ec7t nh\u01b0 ! \" ? $ % ^ & )."};
            /* ]]> */
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/password-strength-meter.min.js' id='wc-password-strength-meter-js'></script>
        <script type='text/javascript' id='wc-cart-fragments-js-extra'>
            /* <![CDATA[ */
            var wc_cart_fragments_params = {"ajax_url": "\/wp-admin\/admin-ajax.php", "wc_ajax_url": "\/?wc-ajax=%%endpoint%%", "cart_hash_key": "wc_cart_hash_4faecf81c727e9d8cac987c670b90b4f", "fragment_name": "wc_fragments_4faecf81c727e9d8cac987c670b90b4f", "request_timeout": "5000"};
            /* ]]> */
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/cart-fragments.min.js' id='wc-cart-fragments-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/themes/flatsome/inc/extensions/flatsome-live-search/flatsome-live-search.js' id='flatsome-live-search-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/hoverIntent.min.js' id='hoverIntent-js'></script>
        <script type='text/javascript' id='flatsome-js-js-extra'>
            /* <![CDATA[ */
            var flatsomeVars = {"ajaxurl": "https:\/\/shop.mixigaming.com\/wp-admin\/admin-ajax.php", "rtl": "", "sticky_height": "70", "lightbox": {"close_markup": "<button title=\"%title%\" type=\"button\" class=\"mfp-close\"><svg xmlns=\"http:\/\/www.w3.org\/2000\/svg\" width=\"28\" height=\"28\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-x\"><line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"><\/line><line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"><\/line><\/svg><\/button>", "close_btn_inside": false}, "user": {"can_edit_pages": false}, "i18n": {"mainMenu": "Main Menu"}, "options": {"cookie_notice_version": "1"}};
            /* ]]> */
        </script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/js/flatsome.js' id='flatsome-js-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/js/woocommerce.js' id='flatsome-theme-woocommerce-js-js'></script>
        <!--[if IE]>
        <script type='text/javascript' src='https://cdn.jsdelivr.net/gh/nuxodin/ie11CustomProperties@4.0.1/ie11CustomProperties.min.js' id='css-vars-polyfill-js'></script>
        <![endif]-->

    </body>
</html>

