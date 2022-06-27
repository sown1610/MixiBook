<%-- 
    Document   : navbar
    Created on : Mar 9, 2022, 4:43:58 PM
    Author     : Sown
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <link rel="pingback" href="" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="modal.js"></script>
        <script>(function (html) {
                html.className = html.className.replace(/\bno-js\b/, 'js')
            })(document.documentElement);</script>
        <meta name='robots' content='index, follow, max-image-preview:large, max-snippet:-1, max-video-preview:-1' />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
        <title>MixiBook - Cửa hàng truyện tranh</title>
        <meta name="description" content="Website chính thức của MixiBook. Chuyên cung cấp truyện tranh. Ship toàn quốc nhanh chóng, đảm bảo." />
        <link rel="canonical" href="https://shop.mixigaming.com/" />
        <meta property="og:locale" content="vi_VN" />
        <meta property="og:type" content="website" />
        <meta property="og:title" content="MixiBook - Cửa hàng truyện tranh" />
        <meta property="og:description" content="Website chính thức của MixiBook. Chuyên cung cấp truyện tranh. Ship toàn quốc nhanh chóng, đảm bảo" />
        <meta property="og:url" content="https://shop.mixigaming.com/" />
        <meta property="og:site_name" content="MixiBook" />
        <meta property="article:publisher" content="https://www.facebook.com/Sown.1610" />
        <meta property="article:modified_time" content="2022-02-15T18:00:51+00:00" />
        <meta property="og:image" content="https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg" />
        <meta property="og:image:width" content="960" />
        <meta property="og:image:height" content="960" />
        <meta property="og:image:type" content="image/jpeg" />
        <meta name="twitter:card" content="summary_large_image" />
        <meta name="twitter:label1" content="Ước tính thời gian đọc" />
        <meta name="twitter:data1" content="1 phút" />
        <script type="application/ld+json" class="yoast-schema-graph">{"@context":"https://schema.org","@graph":[{"@type":"Organization","@id":"https://shop.mixigaming.com/#organization","name":"Mixishop","url":"https://shop.mixigaming.com/","sameAs":["https://www.facebook.com/MixiShop-182674912385853/"],"logo":{"@type":"ImageObject","@id":"https://shop.mixigaming.com/#logo","inLanguage":"vi","url":"https://shop.mixigaming.com/wp-content/uploads/2019/06/logo-mixi-tét.png","contentUrl":"https://shop.mixigaming.com/wp-content/uploads/2019/06/logo-mixi-tét.png","width":2018,"height":1207,"caption":"Mixishop"},"image":{"@id":"https://shop.mixigaming.com/#logo"}},{"@type":"WebSite","@id":"https://shop.mixigaming.com/#website","url":"https://shop.mixigaming.com/","name":"Mixishop","description":"MixiShop","publisher":{"@id":"https://shop.mixigaming.com/#organization"},"potentialAction":[{"@type":"SearchAction","target":{"@type":"EntryPoint","urlTemplate":"https://shop.mixigaming.com/?s={search_term_string}"},"query-input":"required name=search_term_string"}],"inLanguage":"vi"},{"@type":"ImageObject","@id":"https://shop.mixigaming.com/#primaryimage","inLanguage":"vi","url":"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg","contentUrl":"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg","width":960,"height":960},{"@type":"WebPage","@id":"https://shop.mixigaming.com/#webpage","url":"https://shop.mixigaming.com/","name":"MixiShop - Đồ hiệu Mixi, áo PUBG, áo CSGO ship toàn quốc","isPartOf":{"@id":"https://shop.mixigaming.com/#website"},"about":{"@id":"https://shop.mixigaming.com/#organization"},"primaryImageOfPage":{"@id":"https://shop.mixigaming.com/#primaryimage"},"datePublished":"2013-08-06T20:13:19+00:00","dateModified":"2022-02-15T18:00:51+00:00","description":"Website chính thức của MixiShop. Chuyên cung cấp đồ hiệu Mixi, đồ lưu niệm, áo Refund Gaming, áo PUBG, CSGO. Ship toàn quốc nhanh chóng, đảm bảo.","breadcrumb":{"@id":"https://shop.mixigaming.com/#breadcrumb"},"inLanguage":"vi","potentialAction":[{"@type":"ReadAction","target":["https://shop.mixigaming.com/"]}]},{"@type":"BreadcrumbList","@id":"https://shop.mixigaming.com/#breadcrumb","itemListElement":[{"@type":"ListItem","position":1,"name":"Trang chủ"}]}]}</script>
        <!-- / Yoast SEO plugin. -->




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
            }(window, document, window._wpemojiSettings);</script>
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
        <style id='woocommerce-inline-inline-css' type='text/css'>
            .woocommerce form .form-row .required { visibility: visible; }
        </style>
        <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
        <link rel='stylesheet' id='flatsome-icons-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/fl-icons.css' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-main-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/flatsome.css' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-shop-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/flatsome-shop.css' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-style-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome-child/style.css' type='text/css' media='all' />
        <link rel='stylesheet' id='flatsome-googlefonts-css'  href='//fonts.googleapis.com/css?family=Montserrat%3Aregular%2Cregular%2Cregular%2C700%2Cregular&#038;display=swap' type='text/css' media='all' />
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/jquery.min.js' id='jquery-core-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/jquery-migrate.min.js' id='jquery-migrate-js'></script>
        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/wp-extra/js/copy.js' id='donotcopy-js'></script>
        <link rel="https://api.w.org/" href="https://shop.mixigaming.com/wp-json/" /><link rel="alternate" type="application/json" href="https://shop.mixigaming.com/wp-json/wp/v2/pages/89" /><link rel="EditURI" type="application/rsd+xml" title="RSD" href="https://shop.mixigaming.com/xmlrpc.php?rsd" />
        <link rel="wlwmanifest" type="application/wlwmanifest+xml" href="https://shop.mixigaming.com/wp-includes/wlwmanifest.xml" /> 
        <link rel='shortlink' href='https://shop.mixigaming.com/' />
        <link rel="alternate" type="application/json+oembed" href="https://shop.mixigaming.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fshop.mixigaming.com%2F" />
        <link rel="alternate" type="text/xml+oembed" href="https://shop.mixigaming.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fshop.mixigaming.com%2F&#038;format=xml" />
        <!--[if IE]><link rel="stylesheet" type="text/css" href="https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/ie-fallback.css"><script src="//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.1/html5shiv.js"></script><script>var head = document.getElementsByTagName('head')[0],style = document.createElement('style');style.type = 'text/css';style.styleSheet.cssText = ':before,:after{content:none !important';head.appendChild(style);setTimeout(function(){head.removeChild(style);}, 0);</script><script src="https://shop.mixigaming.com/wp-content/themes/flatsome/assets/libs/ie-flexibility.js"></script><![endif]--><!-- Global site tag (gtag.js) - Google Analytics -->

        <script>
            window.dataLayer = window.dataLayer || [];
            function gtag() {
                dataLayer.push(arguments);
            }
            gtag('js', new Date());
            gtag('config', 'UA-129718705-2');</script>
        <noscript><style>.woocommerce-product-gallery{ opacity: 1 !important; }</style></noscript>
        <link rel="icon" href="https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-32x32.png" sizes="32x32" />
        <link rel="icon" href="https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-192x192.png" sizes="192x192" />
        <link rel="apple-touch-icon" href="https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-180x180.png" />
        <meta name="msapplication-TileImage" content="https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-270x270.png" />
        <style id="custom-css" type="text/css">:root {--primary-color: #0a4da8;}.full-width .ubermenu-nav, .container, .row{max-width: 1310px}.row.row-collapse{max-width: 1280px}.row.row-small{max-width: 1302.5px}.row.row-large{max-width: 1340px}.sticky-add-to-cart--active, #wrapper,#main,#main.dark{background-color: #f0f0f0}.header-main{height: 100px}#logo img{max-height: 100px}#logo{width:151px;}#logo img{padding:4px 0;}.header-bottom{min-height: 50px}.header-top{min-height: 30px}.transparent .header-main{height: 30px}.transparent #logo img{max-height: 30px}.has-transparent + .page-title:first-of-type,.has-transparent + #main > .page-title,.has-transparent + #main > div > .page-title,.has-transparent + #main .page-header-wrapper:first-of-type .page-title{padding-top: 30px;}.header.show-on-scroll,.stuck .header-main{height:70px!important}.stuck #logo img{max-height: 70px!important}.search-form{ width: 75%;}.header-bg-color, .header-wrapper {background-color: rgba(255,255,255,0.9)}.header-bottom {background-color: #ffffff}.header-main .nav > li > a{line-height: 16px }.header-bottom-nav > li > a{line-height: 30px }@media (max-width: 549px) {.header-main{height: 70px}#logo img{max-height: 70px}}/* Color */.accordion-title.active, .has-icon-bg .icon .icon-inner,.logo a, .primary.is-underline, .primary.is-link, .badge-outline .badge-inner, .nav-outline > li.active> a,.nav-outline >li.active > a, .cart-icon strong,[data-color='primary'], .is-outline.primary{color: #0a4da8;}/* Color !important */[data-text-color="primary"]{color: #0a4da8!important;}/* Background Color */[data-text-bg="primary"]{background-color: #0a4da8;}/* Background */.scroll-to-bullets a,.featured-title, .label-new.menu-item > a:after, .nav-pagination > li > .current,.nav-pagination > li > span:hover,.nav-pagination > li > a:hover,.has-hover:hover .badge-outline .badge-inner,button[type="submit"], .button.wc-forward:not(.checkout):not(.checkout-button), .button.submit-button, .button.primary:not(.is-outline),.featured-table .title,.is-outline:hover, .has-icon:hover .icon-label,.nav-dropdown-bold .nav-column li > a:hover, .nav-dropdown.nav-dropdown-bold > li > a:hover, .nav-dropdown-bold.dark .nav-column li > a:hover, .nav-dropdown.nav-dropdown-bold.dark > li > a:hover, .is-outline:hover, .tagcloud a:hover,.grid-tools a, input[type='submit']:not(.is-form), .box-badge:hover .box-text, input.button.alt,.nav-box > li > a:hover,.nav-box > li.active > a,.nav-pills > li.active > a ,.current-dropdown .cart-icon strong, .cart-icon:hover strong, .nav-line-bottom > li > a:before, .nav-line-grow > li > a:before, .nav-line > li > a:before,.banner, .header-top, .slider-nav-circle .flickity-prev-next-button:hover svg, .slider-nav-circle .flickity-prev-next-button:hover .arrow, .primary.is-outline:hover, .button.primary:not(.is-outline), input[type='submit'].primary, input[type='submit'].primary, input[type='reset'].button, input[type='button'].primary, .badge-inner{background-color: #0a4da8;}/* Border */.nav-vertical.nav-tabs > li.active > a,.scroll-to-bullets a.active,.nav-pagination > li > .current,.nav-pagination > li > span:hover,.nav-pagination > li > a:hover,.has-hover:hover .badge-outline .badge-inner,.accordion-title.active,.featured-table,.is-outline:hover, .tagcloud a:hover,blockquote, .has-border, .cart-icon strong:after,.cart-icon strong,.blockUI:before, .processing:before,.loading-spin, .slider-nav-circle .flickity-prev-next-button:hover svg, .slider-nav-circle .flickity-prev-next-button:hover .arrow, .primary.is-outline:hover{border-color: #0a4da8}.nav-tabs > li.active > a{border-top-color: #0a4da8}.widget_shopping_cart_content .blockUI.blockOverlay:before { border-left-color: #0a4da8 }.woocommerce-checkout-review-order .blockUI.blockOverlay:before { border-left-color: #0a4da8 }/* Fill */.slider .flickity-prev-next-button:hover svg,.slider .flickity-prev-next-button:hover .arrow{fill: #0a4da8;}body{font-size: 100%;}@media screen and (max-width: 549px){body{font-size: 100%;}}body{font-family:"Montserrat", sans-serif}body{font-weight: 0}body{color: #000000}.nav > li > a {font-family:"Montserrat", sans-serif;}.mobile-sidebar-levels-2 .nav > li > ul > li > a {font-family:"Montserrat", sans-serif;}.nav > li > a {font-weight: 700;}.mobile-sidebar-levels-2 .nav > li > ul > li > a {font-weight: 700;}h1,h2,h3,h4,h5,h6,.heading-font, .off-canvas-center .nav-sidebar.nav-vertical > li > a{font-family: "Montserrat", sans-serif;}h1,h2,h3,h4,h5,h6,.heading-font,.banner h1,.banner h2{font-weight: 0;}h1,h2,h3,h4,h5,h6,.heading-font{color: #000000;}.alt-font{font-family: "Montserrat", sans-serif;}.alt-font{font-weight: 0!important;}.header:not(.transparent) .header-nav-main.nav > li > a:hover,.header:not(.transparent) .header-nav-main.nav > li.active > a,.header:not(.transparent) .header-nav-main.nav > li.current > a,.header:not(.transparent) .header-nav-main.nav > li > a.active,.header:not(.transparent) .header-nav-main.nav > li > a.current{color: #0a4da8;}.header-nav-main.nav-line-bottom > li > a:before,.header-nav-main.nav-line-grow > li > a:before,.header-nav-main.nav-line > li > a:before,.header-nav-main.nav-box > li > a:hover,.header-nav-main.nav-box > li.active > a,.header-nav-main.nav-pills > li > a:hover,.header-nav-main.nav-pills > li.active > a{color:#FFF!important;background-color: #0a4da8;}a{color: #0a4da8;}a:hover{color: #8224e3;}.tagcloud a:hover{border-color: #8224e3;background-color: #8224e3;}@media screen and (min-width: 550px){.products .box-vertical .box-image{min-width: 300px!important;width: 300px!important;}}.header-main .social-icons,.header-main .cart-icon strong,.header-main .menu-title,.header-main .header-button > .button.is-outline,.header-main .nav > li > a > i:not(.icon-angle-down){color: #000000!important;}.header-main .header-button > .button.is-outline,.header-main .cart-icon strong:after,.header-main .cart-icon strong{border-color: #000000!important;}.header-main .header-button > .button:not(.is-outline){background-color: #000000!important;}.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover,.header-main .header-button > .button:hover i,.header-main .header-button > .button:hover span{color:#FFF!important;}.header-main .menu-title:hover,.header-main .social-icons a:hover,.header-main .header-button > .button.is-outline:hover,.header-main .nav > li > a:hover > i:not(.icon-angle-down){color: #000000!important;}.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover{background-color: #000000!important;}.header-main .current-dropdown .cart-icon strong:after,.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover{border-color: #000000!important;}.footer-2{background-color: rgba(22,22,22,0.9)}.absolute-footer, html{background-color: #fafafa}.page-title-small + main .product-container > .row{padding-top:0;}.label-new.menu-item > a:after{content:"New";}.label-hot.menu-item > a:after{content:"Hot";}.label-sale.menu-item > a:after{content:"Sale";}.label-popular.menu-item > a:after{content:"Popular";}</style></head>


    <body>
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
                                <a class="nav-top-link">Danh mục sản phẩm <i class="fas fa-angle-down" ></i></a>
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


                                                                                <a href="detail?productID=1" target="_self" class="button primary is-link is-small"  style="padding:0 0px 0px 0px;">
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


                                                                                <a href="detail?productID=2" target="_self" class="button primary is-link is-small"  style="padding:0 0px 0px 0px;">
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


                                                                                <a href="detail?productID=3" target="_self" class="button primary is-link is-small"  style="padding:0 0px 0px 0px;">
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
                                <c:if test="${sessionScope.account.role==true}">  
                                <li id="menu-item-19975" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-19975 menu-item-design-full-width">
                                    <a class="nav-top-link" href="manager">Quản lý sản phẩm</a>
                                </li>
                                <li id="menu-item-19975" class="menu-item menu-item-type-custom menu-item-object-custom menu-item-19975 menu-item-design-full-width">
                                    <a class="nav-top-link" href="users">Người dùng</a>
                                </li>
                            </c:if>
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
                            <script>
                                function myFunction() {
                                    alert("Vui lòng đăng nhập!!!");
                                }
                            </script>

                            <li class="cart-item has-icon has-dropdown">
                                <c:choose>
                                    <c:when test="${sessionScope.account==null}">
                                        <a  onclick="myFunction()" href="login" title="Giỏ hàng" class="header-cart-link is-small">


                                            <span class="header-cart-title">
                                                Giỏ hàng   /      <span class="cart-price"><span class="woocommerce-Price-amount amount"><bdi>${sessionScope.carts.size()}</bdi></span></span>
                                            </span>

                                            <i class="fas fa-shopping-cart"
                                               data-icon-label="0">
                                            </i>
                                        </a>
                                    </c:when>
                                    <c:otherwise>

                                        <a href="carts" title="Giỏ hàng" class="header-cart-link is-small">


                                            <span class="header-cart-title">
                                                Giỏ hàng   /      <span class="cart-price"><span class="woocommerce-Price-amount amount"><bdi>${sessionScope.carts.size()}</bdi></span></span>
                                            </span>

                                            <i class="fas fa-shopping-cart"
                                               data-icon-label="0">
                                            </i>
                                        </a>



                                    </c:otherwise>
                                </c:choose>


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


                                                   
                                                    <c:choose>
                                                        <c:when test="${sessionScope.account==null}">
                                                             <p class="woocommerce-mini-cart__buttons buttons"><a onclick="myFunction()" href="login"  class="button wc-forward">Xem giỏ hàng</a><a  onclick="myFunction()" href="login"  class="button checkout wc-forward">Thanh toán</a></p>
                                                            </a>
                                                        </c:when>
                                                        <c:otherwise>

                                                             <p class="woocommerce-mini-cart__buttons buttons"><a href="carts" class="button wc-forward">Xem giỏ hàng</a><a href="checkout" class="button checkout wc-forward">Thanh toán</a></p>



                                                        </c:otherwise>
                                                    </c:choose>
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


                </div>

            </div>
            <div class="header-bg-container fill"><div class="header-bg-image fill"></div><div class="header-bg-color fill"></div></div>		</div>
        <div class="modal fade" id="myModal">
            <div class="modal-dialog">
                <div class="modal-content">

                    <!-- Modal Header -->
                    <div class="modal-header">
                        <h4 class="modal-title text-center" style="font-weight: bold">SỬA THÔNG TIN</h4>
                        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                    </div>

                    <!-- Modal body -->
                    <div class="modal-body">
                        <form action="editprofile" method="POST" class="needs-validation">
                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="username">Tên tài khoản</label>
                                <input class="form-control" name="username" value="${sessionScope.account.user}" disabled>
                                <input class="form-control" name="user" value="${sessionScope.account.user}" hidden="">
                            </div>
                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="fullname">Họ và tên</label>
                                <input id="name" type="text" class="form-control" name="fullname" value="${sessionScope.account.fullname}" required >
                            </div>

                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="email">E-Mail</label>
                                <input id="email" type="email" class="form-control" name="email" value="${sessionScope.account.email}" required>
                            </div>
                            <div class="mb-3">
                                <label class="mb-2 text-muted" for="phone">Số điện thoại</label>
                                <input id="email" type="tel" class="form-control" name="phone" value="${sessionScope.account.phone}" required>
                            </div>






                            <!-- Modal footer -->
                            <div class="align-items-center d-flex">
                                <button type="submit" class="btn btn-primary ms-auto" style="font-weight: bold">
                                    Sửa	
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
