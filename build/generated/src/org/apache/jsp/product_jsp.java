package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/navbar.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 9 ]> <html lang=\"vi\" class=\"ie9 loading-site no-js\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]> <html lang=\"vi\" class=\"ie8 loading-site no-js\"> <![endif]-->\n");
      out.write("<!--[if (gte IE 9)|!(IE)]><!--><html lang=\"vi\" class=\"loading-site no-js\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <link rel=\"pingback\" href=\"\" />\n");
      out.write("        <script>(function(html){html.className = html.className.replace(/\\bno-js\\b/, 'js')})(document.documentElement);</script>\n");
      out.write("        <meta name='robots' content='index, follow, max-image-preview:large, max-snippet:-1, max-video-preview:-1' />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("        <title>MixiBook - Cửa hàng truyện tranh</title>\n");
      out.write("        <meta name=\"description\" content=\"Website chính thức của MixiBook. Chuyên cung cấp truyện tranh. Ship toàn quốc nhanh chóng, đảm bảo.\" />\n");
      out.write("        <link rel=\"canonical\" href=\"https://shop.mixigaming.com/\" />\n");
      out.write("        <meta property=\"og:locale\" content=\"vi_VN\" />\n");
      out.write("        <meta property=\"og:type\" content=\"website\" />\n");
      out.write("        <meta property=\"og:title\" content=\"MixiBook - Cửa hàng truyện tranh\" />\n");
      out.write("        <meta property=\"og:description\" content=\"Website chính thức của MixiBook. Chuyên cung cấp truyện tranh. Ship toàn quốc nhanh chóng, đảm bảo\" />\n");
      out.write("        <meta property=\"og:url\" content=\"https://shop.mixigaming.com/\" />\n");
      out.write("        <meta property=\"og:site_name\" content=\"MixiBook\" />\n");
      out.write("        <meta property=\"article:publisher\" content=\"https://www.facebook.com/Sown.1610\" />\n");
      out.write("        <meta property=\"article:modified_time\" content=\"2022-02-15T18:00:51+00:00\" />\n");
      out.write("        <meta property=\"og:image\" content=\"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg\" />\n");
      out.write("        <meta property=\"og:image:width\" content=\"960\" />\n");
      out.write("        <meta property=\"og:image:height\" content=\"960\" />\n");
      out.write("        <meta property=\"og:image:type\" content=\"image/jpeg\" />\n");
      out.write("        <meta name=\"twitter:card\" content=\"summary_large_image\" />\n");
      out.write("        <meta name=\"twitter:label1\" content=\"Ước tính thời gian đọc\" />\n");
      out.write("        <meta name=\"twitter:data1\" content=\"1 phút\" />\n");
      out.write("        <script type=\"application/ld+json\" class=\"yoast-schema-graph\">{\"@context\":\"https://schema.org\",\"@graph\":[{\"@type\":\"Organization\",\"@id\":\"https://shop.mixigaming.com/#organization\",\"name\":\"Mixishop\",\"url\":\"https://shop.mixigaming.com/\",\"sameAs\":[\"https://www.facebook.com/MixiShop-182674912385853/\"],\"logo\":{\"@type\":\"ImageObject\",\"@id\":\"https://shop.mixigaming.com/#logo\",\"inLanguage\":\"vi\",\"url\":\"https://shop.mixigaming.com/wp-content/uploads/2019/06/logo-mixi-tét.png\",\"contentUrl\":\"https://shop.mixigaming.com/wp-content/uploads/2019/06/logo-mixi-tét.png\",\"width\":2018,\"height\":1207,\"caption\":\"Mixishop\"},\"image\":{\"@id\":\"https://shop.mixigaming.com/#logo\"}},{\"@type\":\"WebSite\",\"@id\":\"https://shop.mixigaming.com/#website\",\"url\":\"https://shop.mixigaming.com/\",\"name\":\"Mixishop\",\"description\":\"MixiShop\",\"publisher\":{\"@id\":\"https://shop.mixigaming.com/#organization\"},\"potentialAction\":[{\"@type\":\"SearchAction\",\"target\":{\"@type\":\"EntryPoint\",\"urlTemplate\":\"https://shop.mixigaming.com/?s={search_term_string}\"},\"query-input\":\"required name=search_term_string\"}],\"inLanguage\":\"vi\"},{\"@type\":\"ImageObject\",\"@id\":\"https://shop.mixigaming.com/#primaryimage\",\"inLanguage\":\"vi\",\"url\":\"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg\",\"contentUrl\":\"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg\",\"width\":960,\"height\":960},{\"@type\":\"WebPage\",\"@id\":\"https://shop.mixigaming.com/#webpage\",\"url\":\"https://shop.mixigaming.com/\",\"name\":\"MixiShop - Đồ hiệu Mixi, áo PUBG, áo CSGO ship toàn quốc\",\"isPartOf\":{\"@id\":\"https://shop.mixigaming.com/#website\"},\"about\":{\"@id\":\"https://shop.mixigaming.com/#organization\"},\"primaryImageOfPage\":{\"@id\":\"https://shop.mixigaming.com/#primaryimage\"},\"datePublished\":\"2013-08-06T20:13:19+00:00\",\"dateModified\":\"2022-02-15T18:00:51+00:00\",\"description\":\"Website chính thức của MixiShop. Chuyên cung cấp đồ hiệu Mixi, đồ lưu niệm, áo Refund Gaming, áo PUBG, CSGO. Ship toàn quốc nhanh chóng, đảm bảo.\",\"breadcrumb\":{\"@id\":\"https://shop.mixigaming.com/#breadcrumb\"},\"inLanguage\":\"vi\",\"potentialAction\":[{\"@type\":\"ReadAction\",\"target\":[\"https://shop.mixigaming.com/\"]}]},{\"@type\":\"BreadcrumbList\",\"@id\":\"https://shop.mixigaming.com/#breadcrumb\",\"itemListElement\":[{\"@type\":\"ListItem\",\"position\":1,\"name\":\"Trang chủ\"}]}]}</script>\n");
      out.write("        <!-- / Yoast SEO plugin. -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"alternate\" type=\"application/rss+xml\" title=\"Dòng thông tin MixiShop &raquo;\" href=\"https://shop.mixigaming.com/feed/\" />\n");
      out.write("        <link rel=\"alternate\" type=\"application/rss+xml\" title=\"Dòng phản hồi MixiShop &raquo;\" href=\"https://shop.mixigaming.com/comments/feed/\" />\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window._wpemojiSettings = {\"baseUrl\":\"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/13.1.0\\/72x72\\/\", \"ext\":\".png\", \"svgUrl\":\"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/13.1.0\\/svg\\/\", \"svgExt\":\".svg\", \"source\":{\"concatemoji\":\"https:\\/\\/shop.mixigaming.com\\/wp-includes\\/js\\/wp-emoji-release.min.js\"}};\n");
      out.write("            /*! This file is auto-generated */\n");
      out.write("            !function(e, a, t){var n, r, o, i = a.createElement(\"canvas\"), p = i.getContext && i.getContext(\"2d\"); function s(e, t){var a = String.fromCharCode; p.clearRect(0, 0, i.width, i.height), p.fillText(a.apply(this, e), 0, 0); e = i.toDataURL(); return p.clearRect(0, 0, i.width, i.height), p.fillText(a.apply(this, t), 0, 0), e === i.toDataURL()}function c(e){var t = a.createElement(\"script\"); t.src = e, t.defer = t.type = \"text/javascript\", a.getElementsByTagName(\"head\")[0].appendChild(t)}for (o = Array(\"flag\", \"emoji\"), t.supports = {everything:!0, everythingExceptFlag:!0}, r = 0; r < o.length; r++)t.supports[o[r]] = function(e){if (!p || !p.fillText)return!1; switch (p.textBaseline = \"top\", p.font = \"600 32px Arial\", e){case\"flag\":return s([127987, 65039, 8205, 9895, 65039], [127987, 65039, 8203, 9895, 65039])?!1:!s([55356, 56826, 55356, 56819], [55356, 56826, 8203, 55356, 56819]) && !s([55356, 57332, 56128, 56423, 56128, 56418, 56128, 56421, 56128, 56430, 56128, 56423, 56128, 56447], [55356, 57332, 8203, 56128, 56423, 8203, 56128, 56418, 8203, 56128, 56421, 8203, 56128, 56430, 8203, 56128, 56423, 8203, 56128, 56447]); case\"emoji\":return!s([10084, 65039, 8205, 55357, 56613], [10084, 65039, 8203, 55357, 56613])}return!1}(o[r]), t.supports.everything = t.supports.everything && t.supports[o[r]], \"flag\" !== o[r] && (t.supports.everythingExceptFlag = t.supports.everythingExceptFlag && t.supports[o[r]]); t.supports.everythingExceptFlag = t.supports.everythingExceptFlag && !t.supports.flag, t.DOMReady = !1, t.readyCallback = function(){t.DOMReady = !0}, t.supports.everything || (n = function(){t.readyCallback()}, a.addEventListener?(a.addEventListener(\"DOMContentLoaded\", n, !1), e.addEventListener(\"load\", n, !1)):(e.attachEvent(\"onload\", n), a.attachEvent(\"onreadystatechange\", function(){\"complete\" === a.readyState && t.readyCallback()})), (n = t.source || {}).concatemoji?c(n.concatemoji):n.wpemoji && n.twemoji && (c(n.twemoji), c(n.wpemoji)))}(window, document, window._wpemojiSettings);</script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            img.wp-smiley,\n");
      out.write("            img.emoji {\n");
      out.write("                display: inline !important;\n");
      out.write("                border: none !important;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                height: 1em !important;\n");
      out.write("                width: 1em !important;\n");
      out.write("                margin: 0 0.07em !important;\n");
      out.write("                vertical-align: -0.1em !important;\n");
      out.write("                background: none !important;\n");
      out.write("                padding: 0 !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel='stylesheet' id='sbi_styles-css'  href='https://shop.mixigaming.com/wp-content/plugins/instagram-feed/css/sbi-styles.min.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='wp-block-library-css'  href='https://shop.mixigaming.com/wp-includes/css/dist/block-library/style.min.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='wc-blocks-vendors-style-css'  href='https://shop.mixigaming.com/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/wc-blocks-vendors-style.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='wc-blocks-style-css'  href='https://shop.mixigaming.com/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/wc-blocks-style.css' type='text/css' media='all' />\n");
      out.write("        <style id='global-styles-inline-css' type='text/css'>\n");
      out.write("        </style>\n");
      out.write("        <style id='woocommerce-inline-inline-css' type='text/css'>\n");
      out.write("            .woocommerce form .form-row .required { visibility: visible; }\n");
      out.write("        </style>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel='stylesheet' id='flatsome-icons-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/fl-icons.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-main-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/flatsome.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-shop-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/flatsome-shop.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-style-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome-child/style.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-googlefonts-css'  href='//fonts.googleapis.com/css?family=Montserrat%3Aregular%2Cregular%2Cregular%2C700%2Cregular&#038;display=swap' type='text/css' media='all' />\n");
      out.write("        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/jquery.min.js' id='jquery-core-js'></script>\n");
      out.write("        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/jquery-migrate.min.js' id='jquery-migrate-js'></script>\n");
      out.write("        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/wp-extra/js/copy.js' id='donotcopy-js'></script>\n");
      out.write("        <link rel=\"https://api.w.org/\" href=\"https://shop.mixigaming.com/wp-json/\" /><link rel=\"alternate\" type=\"application/json\" href=\"https://shop.mixigaming.com/wp-json/wp/v2/pages/89\" /><link rel=\"EditURI\" type=\"application/rsd+xml\" title=\"RSD\" href=\"https://shop.mixigaming.com/xmlrpc.php?rsd\" />\n");
      out.write("        <link rel=\"wlwmanifest\" type=\"application/wlwmanifest+xml\" href=\"https://shop.mixigaming.com/wp-includes/wlwmanifest.xml\" /> \n");
      out.write("        <link rel='shortlink' href='https://shop.mixigaming.com/' />\n");
      out.write("        <link rel=\"alternate\" type=\"application/json+oembed\" href=\"https://shop.mixigaming.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fshop.mixigaming.com%2F\" />\n");
      out.write("        <link rel=\"alternate\" type=\"text/xml+oembed\" href=\"https://shop.mixigaming.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fshop.mixigaming.com%2F&#038;format=xml\" />\n");
      out.write("        <!--[if IE]><link rel=\"stylesheet\" type=\"text/css\" href=\"https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/ie-fallback.css\"><script src=\"//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.1/html5shiv.js\"></script><script>var head = document.getElementsByTagName('head')[0],style = document.createElement('style');style.type = 'text/css';style.styleSheet.cssText = ':before,:after{content:none !important';head.appendChild(style);setTimeout(function(){head.removeChild(style);}, 0);</script><script src=\"https://shop.mixigaming.com/wp-content/themes/flatsome/assets/libs/ie-flexibility.js\"></script><![endif]--><!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.dataLayer = window.dataLayer || [];\n");
      out.write("            function gtag(){dataLayer.push(arguments); }\n");
      out.write("            gtag('js', new Date());\n");
      out.write("            gtag('config', 'UA-129718705-2');</script>\n");
      out.write("        <noscript><style>.woocommerce-product-gallery{ opacity: 1 !important; }</style></noscript>\n");
      out.write("        <link rel=\"icon\" href=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-32x32.png\" sizes=\"32x32\" />\n");
      out.write("        <link rel=\"icon\" href=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-192x192.png\" sizes=\"192x192\" />\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-180x180.png\" />\n");
      out.write("        <meta name=\"msapplication-TileImage\" content=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-270x270.png\" />\n");
      out.write("        <style id=\"custom-css\" type=\"text/css\">:root {--primary-color: #0a4da8;}.full-width .ubermenu-nav, .container, .row{max-width: 1310px}.row.row-collapse{max-width: 1280px}.row.row-small{max-width: 1302.5px}.row.row-large{max-width: 1340px}.sticky-add-to-cart--active, #wrapper,#main,#main.dark{background-color: #f0f0f0}.header-main{height: 100px}#logo img{max-height: 100px}#logo{width:151px;}#logo img{padding:4px 0;}.header-bottom{min-height: 50px}.header-top{min-height: 30px}.transparent .header-main{height: 30px}.transparent #logo img{max-height: 30px}.has-transparent + .page-title:first-of-type,.has-transparent + #main > .page-title,.has-transparent + #main > div > .page-title,.has-transparent + #main .page-header-wrapper:first-of-type .page-title{padding-top: 30px;}.header.show-on-scroll,.stuck .header-main{height:70px!important}.stuck #logo img{max-height: 70px!important}.search-form{ width: 75%;}.header-bg-color, .header-wrapper {background-color: rgba(255,255,255,0.9)}.header-bottom {background-color: #ffffff}.header-main .nav > li > a{line-height: 16px }.header-bottom-nav > li > a{line-height: 30px }@media (max-width: 549px) {.header-main{height: 70px}#logo img{max-height: 70px}}/* Color */.accordion-title.active, .has-icon-bg .icon .icon-inner,.logo a, .primary.is-underline, .primary.is-link, .badge-outline .badge-inner, .nav-outline > li.active> a,.nav-outline >li.active > a, .cart-icon strong,[data-color='primary'], .is-outline.primary{color: #0a4da8;}/* Color !important */[data-text-color=\"primary\"]{color: #0a4da8!important;}/* Background Color */[data-text-bg=\"primary\"]{background-color: #0a4da8;}/* Background */.scroll-to-bullets a,.featured-title, .label-new.menu-item > a:after, .nav-pagination > li > .current,.nav-pagination > li > span:hover,.nav-pagination > li > a:hover,.has-hover:hover .badge-outline .badge-inner,button[type=\"submit\"], .button.wc-forward:not(.checkout):not(.checkout-button), .button.submit-button, .button.primary:not(.is-outline),.featured-table .title,.is-outline:hover, .has-icon:hover .icon-label,.nav-dropdown-bold .nav-column li > a:hover, .nav-dropdown.nav-dropdown-bold > li > a:hover, .nav-dropdown-bold.dark .nav-column li > a:hover, .nav-dropdown.nav-dropdown-bold.dark > li > a:hover, .is-outline:hover, .tagcloud a:hover,.grid-tools a, input[type='submit']:not(.is-form), .box-badge:hover .box-text, input.button.alt,.nav-box > li > a:hover,.nav-box > li.active > a,.nav-pills > li.active > a ,.current-dropdown .cart-icon strong, .cart-icon:hover strong, .nav-line-bottom > li > a:before, .nav-line-grow > li > a:before, .nav-line > li > a:before,.banner, .header-top, .slider-nav-circle .flickity-prev-next-button:hover svg, .slider-nav-circle .flickity-prev-next-button:hover .arrow, .primary.is-outline:hover, .button.primary:not(.is-outline), input[type='submit'].primary, input[type='submit'].primary, input[type='reset'].button, input[type='button'].primary, .badge-inner{background-color: #0a4da8;}/* Border */.nav-vertical.nav-tabs > li.active > a,.scroll-to-bullets a.active,.nav-pagination > li > .current,.nav-pagination > li > span:hover,.nav-pagination > li > a:hover,.has-hover:hover .badge-outline .badge-inner,.accordion-title.active,.featured-table,.is-outline:hover, .tagcloud a:hover,blockquote, .has-border, .cart-icon strong:after,.cart-icon strong,.blockUI:before, .processing:before,.loading-spin, .slider-nav-circle .flickity-prev-next-button:hover svg, .slider-nav-circle .flickity-prev-next-button:hover .arrow, .primary.is-outline:hover{border-color: #0a4da8}.nav-tabs > li.active > a{border-top-color: #0a4da8}.widget_shopping_cart_content .blockUI.blockOverlay:before { border-left-color: #0a4da8 }.woocommerce-checkout-review-order .blockUI.blockOverlay:before { border-left-color: #0a4da8 }/* Fill */.slider .flickity-prev-next-button:hover svg,.slider .flickity-prev-next-button:hover .arrow{fill: #0a4da8;}body{font-size: 100%;}@media screen and (max-width: 549px){body{font-size: 100%;}}body{font-family:\"Montserrat\", sans-serif}body{font-weight: 0}body{color: #000000}.nav > li > a {font-family:\"Montserrat\", sans-serif;}.mobile-sidebar-levels-2 .nav > li > ul > li > a {font-family:\"Montserrat\", sans-serif;}.nav > li > a {font-weight: 700;}.mobile-sidebar-levels-2 .nav > li > ul > li > a {font-weight: 700;}h1,h2,h3,h4,h5,h6,.heading-font, .off-canvas-center .nav-sidebar.nav-vertical > li > a{font-family: \"Montserrat\", sans-serif;}h1,h2,h3,h4,h5,h6,.heading-font,.banner h1,.banner h2{font-weight: 0;}h1,h2,h3,h4,h5,h6,.heading-font{color: #000000;}.alt-font{font-family: \"Montserrat\", sans-serif;}.alt-font{font-weight: 0!important;}.header:not(.transparent) .header-nav-main.nav > li > a:hover,.header:not(.transparent) .header-nav-main.nav > li.active > a,.header:not(.transparent) .header-nav-main.nav > li.current > a,.header:not(.transparent) .header-nav-main.nav > li > a.active,.header:not(.transparent) .header-nav-main.nav > li > a.current{color: #0a4da8;}.header-nav-main.nav-line-bottom > li > a:before,.header-nav-main.nav-line-grow > li > a:before,.header-nav-main.nav-line > li > a:before,.header-nav-main.nav-box > li > a:hover,.header-nav-main.nav-box > li.active > a,.header-nav-main.nav-pills > li > a:hover,.header-nav-main.nav-pills > li.active > a{color:#FFF!important;background-color: #0a4da8;}a{color: #0a4da8;}a:hover{color: #8224e3;}.tagcloud a:hover{border-color: #8224e3;background-color: #8224e3;}@media screen and (min-width: 550px){.products .box-vertical .box-image{min-width: 300px!important;width: 300px!important;}}.header-main .social-icons,.header-main .cart-icon strong,.header-main .menu-title,.header-main .header-button > .button.is-outline,.header-main .nav > li > a > i:not(.icon-angle-down){color: #000000!important;}.header-main .header-button > .button.is-outline,.header-main .cart-icon strong:after,.header-main .cart-icon strong{border-color: #000000!important;}.header-main .header-button > .button:not(.is-outline){background-color: #000000!important;}.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover,.header-main .header-button > .button:hover i,.header-main .header-button > .button:hover span{color:#FFF!important;}.header-main .menu-title:hover,.header-main .social-icons a:hover,.header-main .header-button > .button.is-outline:hover,.header-main .nav > li > a:hover > i:not(.icon-angle-down){color: #000000!important;}.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover{background-color: #000000!important;}.header-main .current-dropdown .cart-icon strong:after,.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover{border-color: #000000!important;}.footer-2{background-color: rgba(22,22,22,0.9)}.absolute-footer, html{background-color: #fafafa}.page-title-small + main .product-container > .row{padding-top:0;}.label-new.menu-item > a:after{content:\"New\";}.label-hot.menu-item > a:after{content:\"Hot\";}.label-sale.menu-item > a:after{content:\"Sale\";}.label-popular.menu-item > a:after{content:\"Popular\";}</style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body data-rsssl=1 class=\"home page-template page-template-page-blank page-template-page-blank-php page page-id-89 theme-flatsome woocommerce-no-js header-shadow lightbox nav-dropdown-has-arrow nav-dropdown-has-shadow nav-dropdown-has-border\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <a class=\"skip-link screen-reader-text\" href=\"#main\">Skip to content</a>\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <div class=\"page-loader fixed fill z-top-3 \">\n");
      out.write("                <div class=\"page-loader-inner x50 y50 md-y50 md-x50 lg-y50 lg-x50 absolute\">\n");
      out.write("                    <div class=\"page-loader-logo\" style=\"padding-bottom: 30px;\">\n");
      out.write("\n");
      out.write("                        <a href=\"home\" title=\"MixiBook\" rel=\"home\">\n");
      out.write("                            <img width=\"600\" src=\"img/logo fpt new.png\" class=\"header_logo header-logo\" /></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"page-loader-spin\"><div class=\"loading-spin\"></div></div>\n");
      out.write("                </div>\n");
      out.write("                <style>\n");
      out.write("                    .page-loader{opacity: 0; transition: opacity .3s; transition-delay: .3s;\n");
      out.write("                                 background-color: #fff;\n");
      out.write("                    }\n");
      out.write("                    .loading-site .page-loader{opacity: .98;}\n");
      out.write("                    .page-loader-logo{max-width: px; animation: pageLoadZoom 1.3s ease-out; -webkit-animation: pageLoadZoom 1.3s ease-out;}\n");
      out.write("                    .page-loader-spin{animation: pageLoadZoomSpin 1.3s ease-out;}\n");
      out.write("                    .page-loader-spin .loading-spin{width: 40px; height: 40px; }\n");
      out.write("                    @keyframes pageLoadZoom {\n");
      out.write("                        0%   {opacity:0; transform: translateY(30px);}\n");
      out.write("                        100% {opacity:1; transform: translateY(0);}\n");
      out.write("                    }\n");
      out.write("                    @keyframes pageLoadZoomSpin {\n");
      out.write("                        0%   {opacity:0; transform: translateY(60px);}\n");
      out.write("                        100% {opacity:1; transform: translateY(0);}\n");
      out.write("                    }\n");
      out.write("                </style>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <header id=\"header\" class=\"header has-sticky sticky-jump\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <link rel=\"pingback\" href=\"\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"modal.js\"></script>\n");
      out.write("        <script>(function (html) {\n");
      out.write("                html.className = html.className.replace(/\\bno-js\\b/, 'js')\n");
      out.write("            })(document.documentElement);</script>\n");
      out.write("        <meta name='robots' content='index, follow, max-image-preview:large, max-snippet:-1, max-video-preview:-1' />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("        <title>MixiBook - Cửa hàng truyện tranh</title>\n");
      out.write("        <meta name=\"description\" content=\"Website chính thức của MixiBook. Chuyên cung cấp truyện tranh. Ship toàn quốc nhanh chóng, đảm bảo.\" />\n");
      out.write("        <link rel=\"canonical\" href=\"https://shop.mixigaming.com/\" />\n");
      out.write("        <meta property=\"og:locale\" content=\"vi_VN\" />\n");
      out.write("        <meta property=\"og:type\" content=\"website\" />\n");
      out.write("        <meta property=\"og:title\" content=\"MixiBook - Cửa hàng truyện tranh\" />\n");
      out.write("        <meta property=\"og:description\" content=\"Website chính thức của MixiBook. Chuyên cung cấp truyện tranh. Ship toàn quốc nhanh chóng, đảm bảo\" />\n");
      out.write("        <meta property=\"og:url\" content=\"https://shop.mixigaming.com/\" />\n");
      out.write("        <meta property=\"og:site_name\" content=\"MixiBook\" />\n");
      out.write("        <meta property=\"article:publisher\" content=\"https://www.facebook.com/Sown.1610\" />\n");
      out.write("        <meta property=\"article:modified_time\" content=\"2022-02-15T18:00:51+00:00\" />\n");
      out.write("        <meta property=\"og:image\" content=\"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg\" />\n");
      out.write("        <meta property=\"og:image:width\" content=\"960\" />\n");
      out.write("        <meta property=\"og:image:height\" content=\"960\" />\n");
      out.write("        <meta property=\"og:image:type\" content=\"image/jpeg\" />\n");
      out.write("        <meta name=\"twitter:card\" content=\"summary_large_image\" />\n");
      out.write("        <meta name=\"twitter:label1\" content=\"Ước tính thời gian đọc\" />\n");
      out.write("        <meta name=\"twitter:data1\" content=\"1 phút\" />\n");
      out.write("        <script type=\"application/ld+json\" class=\"yoast-schema-graph\">{\"@context\":\"https://schema.org\",\"@graph\":[{\"@type\":\"Organization\",\"@id\":\"https://shop.mixigaming.com/#organization\",\"name\":\"Mixishop\",\"url\":\"https://shop.mixigaming.com/\",\"sameAs\":[\"https://www.facebook.com/MixiShop-182674912385853/\"],\"logo\":{\"@type\":\"ImageObject\",\"@id\":\"https://shop.mixigaming.com/#logo\",\"inLanguage\":\"vi\",\"url\":\"https://shop.mixigaming.com/wp-content/uploads/2019/06/logo-mixi-tét.png\",\"contentUrl\":\"https://shop.mixigaming.com/wp-content/uploads/2019/06/logo-mixi-tét.png\",\"width\":2018,\"height\":1207,\"caption\":\"Mixishop\"},\"image\":{\"@id\":\"https://shop.mixigaming.com/#logo\"}},{\"@type\":\"WebSite\",\"@id\":\"https://shop.mixigaming.com/#website\",\"url\":\"https://shop.mixigaming.com/\",\"name\":\"Mixishop\",\"description\":\"MixiShop\",\"publisher\":{\"@id\":\"https://shop.mixigaming.com/#organization\"},\"potentialAction\":[{\"@type\":\"SearchAction\",\"target\":{\"@type\":\"EntryPoint\",\"urlTemplate\":\"https://shop.mixigaming.com/?s={search_term_string}\"},\"query-input\":\"required name=search_term_string\"}],\"inLanguage\":\"vi\"},{\"@type\":\"ImageObject\",\"@id\":\"https://shop.mixigaming.com/#primaryimage\",\"inLanguage\":\"vi\",\"url\":\"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg\",\"contentUrl\":\"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg\",\"width\":960,\"height\":960},{\"@type\":\"WebPage\",\"@id\":\"https://shop.mixigaming.com/#webpage\",\"url\":\"https://shop.mixigaming.com/\",\"name\":\"MixiShop - Đồ hiệu Mixi, áo PUBG, áo CSGO ship toàn quốc\",\"isPartOf\":{\"@id\":\"https://shop.mixigaming.com/#website\"},\"about\":{\"@id\":\"https://shop.mixigaming.com/#organization\"},\"primaryImageOfPage\":{\"@id\":\"https://shop.mixigaming.com/#primaryimage\"},\"datePublished\":\"2013-08-06T20:13:19+00:00\",\"dateModified\":\"2022-02-15T18:00:51+00:00\",\"description\":\"Website chính thức của MixiShop. Chuyên cung cấp đồ hiệu Mixi, đồ lưu niệm, áo Refund Gaming, áo PUBG, CSGO. Ship toàn quốc nhanh chóng, đảm bảo.\",\"breadcrumb\":{\"@id\":\"https://shop.mixigaming.com/#breadcrumb\"},\"inLanguage\":\"vi\",\"potentialAction\":[{\"@type\":\"ReadAction\",\"target\":[\"https://shop.mixigaming.com/\"]}]},{\"@type\":\"BreadcrumbList\",\"@id\":\"https://shop.mixigaming.com/#breadcrumb\",\"itemListElement\":[{\"@type\":\"ListItem\",\"position\":1,\"name\":\"Trang chủ\"}]}]}</script>\n");
      out.write("        <!-- / Yoast SEO plugin. -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"alternate\" type=\"application/rss+xml\" title=\"Dòng thông tin MixiShop &raquo;\" href=\"https://shop.mixigaming.com/feed/\" />\n");
      out.write("        <link rel=\"alternate\" type=\"application/rss+xml\" title=\"Dòng phản hồi MixiShop &raquo;\" href=\"https://shop.mixigaming.com/comments/feed/\" />\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window._wpemojiSettings = {\"baseUrl\": \"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/13.1.0\\/72x72\\/\", \"ext\": \".png\", \"svgUrl\": \"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/13.1.0\\/svg\\/\", \"svgExt\": \".svg\", \"source\": {\"concatemoji\": \"https:\\/\\/shop.mixigaming.com\\/wp-includes\\/js\\/wp-emoji-release.min.js\"}};\n");
      out.write("            /*! This file is auto-generated */\n");
      out.write("            !function (e, a, t) {\n");
      out.write("                var n, r, o, i = a.createElement(\"canvas\"), p = i.getContext && i.getContext(\"2d\");\n");
      out.write("                function s(e, t) {\n");
      out.write("                    var a = String.fromCharCode;\n");
      out.write("                    p.clearRect(0, 0, i.width, i.height), p.fillText(a.apply(this, e), 0, 0);\n");
      out.write("                    e = i.toDataURL();\n");
      out.write("                    return p.clearRect(0, 0, i.width, i.height), p.fillText(a.apply(this, t), 0, 0), e === i.toDataURL()\n");
      out.write("                }\n");
      out.write("                function c(e) {\n");
      out.write("                    var t = a.createElement(\"script\");\n");
      out.write("                    t.src = e, t.defer = t.type = \"text/javascript\", a.getElementsByTagName(\"head\")[0].appendChild(t)\n");
      out.write("                }\n");
      out.write("                for (o = Array(\"flag\", \"emoji\"), t.supports = {everything:!0, everythingExceptFlag:!0}, r = 0; r < o.length; r++)\n");
      out.write("                    t.supports[o[r]] = function (e) {\n");
      out.write("                        if (!p || !p.fillText)\n");
      out.write("                            return!1;\n");
      out.write("                        switch (p.textBaseline = \"top\", p.font = \"600 32px Arial\", e) {\n");
      out.write("                            case\"flag\":\n");
      out.write("                                return s([127987, 65039, 8205, 9895, 65039], [127987, 65039, 8203, 9895, 65039]) ? !1 : !s([55356, 56826, 55356, 56819], [55356, 56826, 8203, 55356, 56819]) && !s([55356, 57332, 56128, 56423, 56128, 56418, 56128, 56421, 56128, 56430, 56128, 56423, 56128, 56447], [55356, 57332, 8203, 56128, 56423, 8203, 56128, 56418, 8203, 56128, 56421, 8203, 56128, 56430, 8203, 56128, 56423, 8203, 56128, 56447]);\n");
      out.write("                            case\"emoji\":\n");
      out.write("                                return!s([10084, 65039, 8205, 55357, 56613], [10084, 65039, 8203, 55357, 56613])\n");
      out.write("                        }\n");
      out.write("                        return!1\n");
      out.write("                    }(o[r]), t.supports.everything = t.supports.everything && t.supports[o[r]], \"flag\" !== o[r] && (t.supports.everythingExceptFlag = t.supports.everythingExceptFlag && t.supports[o[r]]);\n");
      out.write("                t.supports.everythingExceptFlag = t.supports.everythingExceptFlag && !t.supports.flag, t.DOMReady = !1, t.readyCallback = function () {\n");
      out.write("                    t.DOMReady = !0\n");
      out.write("                }, t.supports.everything || (n = function () {\n");
      out.write("                    t.readyCallback()\n");
      out.write("                }, a.addEventListener ? (a.addEventListener(\"DOMContentLoaded\", n, !1), e.addEventListener(\"load\", n, !1)) : (e.attachEvent(\"onload\", n), a.attachEvent(\"onreadystatechange\", function () {\n");
      out.write("                    \"complete\" === a.readyState && t.readyCallback()\n");
      out.write("                })), (n = t.source || {}).concatemoji ? c(n.concatemoji) : n.wpemoji && n.twemoji && (c(n.twemoji), c(n.wpemoji)))\n");
      out.write("            }(window, document, window._wpemojiSettings);</script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            img.wp-smiley,\n");
      out.write("            img.emoji {\n");
      out.write("                display: inline !important;\n");
      out.write("                border: none !important;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                height: 1em !important;\n");
      out.write("                width: 1em !important;\n");
      out.write("                margin: 0 0.07em !important;\n");
      out.write("                vertical-align: -0.1em !important;\n");
      out.write("                background: none !important;\n");
      out.write("                padding: 0 !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel='stylesheet' id='sbi_styles-css'  href='https://shop.mixigaming.com/wp-content/plugins/instagram-feed/css/sbi-styles.min.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='wp-block-library-css'  href='https://shop.mixigaming.com/wp-includes/css/dist/block-library/style.min.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='wc-blocks-vendors-style-css'  href='https://shop.mixigaming.com/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/wc-blocks-vendors-style.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='wc-blocks-style-css'  href='https://shop.mixigaming.com/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/wc-blocks-style.css' type='text/css' media='all' />\n");
      out.write("        <style id='global-styles-inline-css' type='text/css'>\n");
      out.write("        </style>\n");
      out.write("        <style id='woocommerce-inline-inline-css' type='text/css'>\n");
      out.write("            .woocommerce form .form-row .required { visibility: visible; }\n");
      out.write("        </style>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel='stylesheet' id='flatsome-icons-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/fl-icons.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-main-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/flatsome.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-shop-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/flatsome-shop.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-style-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome-child/style.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-googlefonts-css'  href='//fonts.googleapis.com/css?family=Montserrat%3Aregular%2Cregular%2Cregular%2C700%2Cregular&#038;display=swap' type='text/css' media='all' />\n");
      out.write("        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/jquery.min.js' id='jquery-core-js'></script>\n");
      out.write("        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/jquery-migrate.min.js' id='jquery-migrate-js'></script>\n");
      out.write("        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/wp-extra/js/copy.js' id='donotcopy-js'></script>\n");
      out.write("        <link rel=\"https://api.w.org/\" href=\"https://shop.mixigaming.com/wp-json/\" /><link rel=\"alternate\" type=\"application/json\" href=\"https://shop.mixigaming.com/wp-json/wp/v2/pages/89\" /><link rel=\"EditURI\" type=\"application/rsd+xml\" title=\"RSD\" href=\"https://shop.mixigaming.com/xmlrpc.php?rsd\" />\n");
      out.write("        <link rel=\"wlwmanifest\" type=\"application/wlwmanifest+xml\" href=\"https://shop.mixigaming.com/wp-includes/wlwmanifest.xml\" /> \n");
      out.write("        <link rel='shortlink' href='https://shop.mixigaming.com/' />\n");
      out.write("        <link rel=\"alternate\" type=\"application/json+oembed\" href=\"https://shop.mixigaming.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fshop.mixigaming.com%2F\" />\n");
      out.write("        <link rel=\"alternate\" type=\"text/xml+oembed\" href=\"https://shop.mixigaming.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fshop.mixigaming.com%2F&#038;format=xml\" />\n");
      out.write("        <!--[if IE]><link rel=\"stylesheet\" type=\"text/css\" href=\"https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/ie-fallback.css\"><script src=\"//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.1/html5shiv.js\"></script><script>var head = document.getElementsByTagName('head')[0],style = document.createElement('style');style.type = 'text/css';style.styleSheet.cssText = ':before,:after{content:none !important';head.appendChild(style);setTimeout(function(){head.removeChild(style);}, 0);</script><script src=\"https://shop.mixigaming.com/wp-content/themes/flatsome/assets/libs/ie-flexibility.js\"></script><![endif]--><!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.dataLayer = window.dataLayer || [];\n");
      out.write("            function gtag() {\n");
      out.write("                dataLayer.push(arguments);\n");
      out.write("            }\n");
      out.write("            gtag('js', new Date());\n");
      out.write("            gtag('config', 'UA-129718705-2');</script>\n");
      out.write("        <noscript><style>.woocommerce-product-gallery{ opacity: 1 !important; }</style></noscript>\n");
      out.write("        <link rel=\"icon\" href=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-32x32.png\" sizes=\"32x32\" />\n");
      out.write("        <link rel=\"icon\" href=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-192x192.png\" sizes=\"192x192\" />\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-180x180.png\" />\n");
      out.write("        <meta name=\"msapplication-TileImage\" content=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-270x270.png\" />\n");
      out.write("        <style id=\"custom-css\" type=\"text/css\">:root {--primary-color: #0a4da8;}.full-width .ubermenu-nav, .container, .row{max-width: 1310px}.row.row-collapse{max-width: 1280px}.row.row-small{max-width: 1302.5px}.row.row-large{max-width: 1340px}.sticky-add-to-cart--active, #wrapper,#main,#main.dark{background-color: #f0f0f0}.header-main{height: 100px}#logo img{max-height: 100px}#logo{width:151px;}#logo img{padding:4px 0;}.header-bottom{min-height: 50px}.header-top{min-height: 30px}.transparent .header-main{height: 30px}.transparent #logo img{max-height: 30px}.has-transparent + .page-title:first-of-type,.has-transparent + #main > .page-title,.has-transparent + #main > div > .page-title,.has-transparent + #main .page-header-wrapper:first-of-type .page-title{padding-top: 30px;}.header.show-on-scroll,.stuck .header-main{height:70px!important}.stuck #logo img{max-height: 70px!important}.search-form{ width: 75%;}.header-bg-color, .header-wrapper {background-color: rgba(255,255,255,0.9)}.header-bottom {background-color: #ffffff}.header-main .nav > li > a{line-height: 16px }.header-bottom-nav > li > a{line-height: 30px }@media (max-width: 549px) {.header-main{height: 70px}#logo img{max-height: 70px}}/* Color */.accordion-title.active, .has-icon-bg .icon .icon-inner,.logo a, .primary.is-underline, .primary.is-link, .badge-outline .badge-inner, .nav-outline > li.active> a,.nav-outline >li.active > a, .cart-icon strong,[data-color='primary'], .is-outline.primary{color: #0a4da8;}/* Color !important */[data-text-color=\"primary\"]{color: #0a4da8!important;}/* Background Color */[data-text-bg=\"primary\"]{background-color: #0a4da8;}/* Background */.scroll-to-bullets a,.featured-title, .label-new.menu-item > a:after, .nav-pagination > li > .current,.nav-pagination > li > span:hover,.nav-pagination > li > a:hover,.has-hover:hover .badge-outline .badge-inner,button[type=\"submit\"], .button.wc-forward:not(.checkout):not(.checkout-button), .button.submit-button, .button.primary:not(.is-outline),.featured-table .title,.is-outline:hover, .has-icon:hover .icon-label,.nav-dropdown-bold .nav-column li > a:hover, .nav-dropdown.nav-dropdown-bold > li > a:hover, .nav-dropdown-bold.dark .nav-column li > a:hover, .nav-dropdown.nav-dropdown-bold.dark > li > a:hover, .is-outline:hover, .tagcloud a:hover,.grid-tools a, input[type='submit']:not(.is-form), .box-badge:hover .box-text, input.button.alt,.nav-box > li > a:hover,.nav-box > li.active > a,.nav-pills > li.active > a ,.current-dropdown .cart-icon strong, .cart-icon:hover strong, .nav-line-bottom > li > a:before, .nav-line-grow > li > a:before, .nav-line > li > a:before,.banner, .header-top, .slider-nav-circle .flickity-prev-next-button:hover svg, .slider-nav-circle .flickity-prev-next-button:hover .arrow, .primary.is-outline:hover, .button.primary:not(.is-outline), input[type='submit'].primary, input[type='submit'].primary, input[type='reset'].button, input[type='button'].primary, .badge-inner{background-color: #0a4da8;}/* Border */.nav-vertical.nav-tabs > li.active > a,.scroll-to-bullets a.active,.nav-pagination > li > .current,.nav-pagination > li > span:hover,.nav-pagination > li > a:hover,.has-hover:hover .badge-outline .badge-inner,.accordion-title.active,.featured-table,.is-outline:hover, .tagcloud a:hover,blockquote, .has-border, .cart-icon strong:after,.cart-icon strong,.blockUI:before, .processing:before,.loading-spin, .slider-nav-circle .flickity-prev-next-button:hover svg, .slider-nav-circle .flickity-prev-next-button:hover .arrow, .primary.is-outline:hover{border-color: #0a4da8}.nav-tabs > li.active > a{border-top-color: #0a4da8}.widget_shopping_cart_content .blockUI.blockOverlay:before { border-left-color: #0a4da8 }.woocommerce-checkout-review-order .blockUI.blockOverlay:before { border-left-color: #0a4da8 }/* Fill */.slider .flickity-prev-next-button:hover svg,.slider .flickity-prev-next-button:hover .arrow{fill: #0a4da8;}body{font-size: 100%;}@media screen and (max-width: 549px){body{font-size: 100%;}}body{font-family:\"Montserrat\", sans-serif}body{font-weight: 0}body{color: #000000}.nav > li > a {font-family:\"Montserrat\", sans-serif;}.mobile-sidebar-levels-2 .nav > li > ul > li > a {font-family:\"Montserrat\", sans-serif;}.nav > li > a {font-weight: 700;}.mobile-sidebar-levels-2 .nav > li > ul > li > a {font-weight: 700;}h1,h2,h3,h4,h5,h6,.heading-font, .off-canvas-center .nav-sidebar.nav-vertical > li > a{font-family: \"Montserrat\", sans-serif;}h1,h2,h3,h4,h5,h6,.heading-font,.banner h1,.banner h2{font-weight: 0;}h1,h2,h3,h4,h5,h6,.heading-font{color: #000000;}.alt-font{font-family: \"Montserrat\", sans-serif;}.alt-font{font-weight: 0!important;}.header:not(.transparent) .header-nav-main.nav > li > a:hover,.header:not(.transparent) .header-nav-main.nav > li.active > a,.header:not(.transparent) .header-nav-main.nav > li.current > a,.header:not(.transparent) .header-nav-main.nav > li > a.active,.header:not(.transparent) .header-nav-main.nav > li > a.current{color: #0a4da8;}.header-nav-main.nav-line-bottom > li > a:before,.header-nav-main.nav-line-grow > li > a:before,.header-nav-main.nav-line > li > a:before,.header-nav-main.nav-box > li > a:hover,.header-nav-main.nav-box > li.active > a,.header-nav-main.nav-pills > li > a:hover,.header-nav-main.nav-pills > li.active > a{color:#FFF!important;background-color: #0a4da8;}a{color: #0a4da8;}a:hover{color: #8224e3;}.tagcloud a:hover{border-color: #8224e3;background-color: #8224e3;}@media screen and (min-width: 550px){.products .box-vertical .box-image{min-width: 300px!important;width: 300px!important;}}.header-main .social-icons,.header-main .cart-icon strong,.header-main .menu-title,.header-main .header-button > .button.is-outline,.header-main .nav > li > a > i:not(.icon-angle-down){color: #000000!important;}.header-main .header-button > .button.is-outline,.header-main .cart-icon strong:after,.header-main .cart-icon strong{border-color: #000000!important;}.header-main .header-button > .button:not(.is-outline){background-color: #000000!important;}.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover,.header-main .header-button > .button:hover i,.header-main .header-button > .button:hover span{color:#FFF!important;}.header-main .menu-title:hover,.header-main .social-icons a:hover,.header-main .header-button > .button.is-outline:hover,.header-main .nav > li > a:hover > i:not(.icon-angle-down){color: #000000!important;}.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover{background-color: #000000!important;}.header-main .current-dropdown .cart-icon strong:after,.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover{border-color: #000000!important;}.footer-2{background-color: rgba(22,22,22,0.9)}.absolute-footer, html{background-color: #fafafa}.page-title-small + main .product-container > .row{padding-top:0;}.label-new.menu-item > a:after{content:\"New\";}.label-hot.menu-item > a:after{content:\"Hot\";}.label-sale.menu-item > a:after{content:\"Sale\";}.label-popular.menu-item > a:after{content:\"Popular\";}</style></head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header-wrapper\">\n");
      out.write("            <div id=\"masthead\" class=\"header-main \">\n");
      out.write("                <div class=\"header-inner flex-row container logo-left medium-logo-center\" role=\"navigation\">\n");
      out.write("\n");
      out.write("                    <!-- Logo -->\n");
      out.write("                    <div id=\"logo\" class=\"flex-col logo\">\n");
      out.write("                        <!-- Header logo -->\n");
      out.write("                        <a href=\"home\" title=\"MixiBook\" rel=\"home\">\n");
      out.write("                            <img width=\"300\" src=\"img/logo.png\" class=\"header_logo header-logo\" alt=\"MixiBook\"/></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Mobile Left Elements -->\n");
      out.write("                    <div class=\"flex-col show-for-medium flex-left\">\n");
      out.write("                        <ul class=\"mobile-nav nav nav-left \">\n");
      out.write("                            <li class=\"nav-icon has-icon\">\n");
      out.write("                                <a href=\"#\" data-open=\"#main-menu\" data-pos=\"left\" data-bg=\"main-menu-overlay\" data-color=\"\" class=\"is-small\" aria-label=\"Menu\" aria-controls=\"main-menu\" aria-expanded=\"false\">\n");
      out.write("\n");
      out.write("                                    <i class=\"icon-menu\" ></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>            </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Left Elements -->\n");
      out.write("                    <div class=\"flex-col hide-for-medium flex-left\n");
      out.write("                         flex-grow\">\n");
      out.write("                        <ul class=\"header-nav header-nav-main nav nav-left  nav-line-bottom nav-spacing-xlarge nav-uppercase\" >\n");
      out.write("                            <li class=\"header-search header-search-lightbox has-icon\">\n");
      out.write("                                <a href=\"#search-lightbox\" aria-label=\"Tìm kiếm\" data-open=\"#search-lightbox\" data-focus=\"input.search-field\"\n");
      out.write("                                   class=\"is-small\">\n");
      out.write("                                    <i class=\"fa fa-search\" style=\"font-size:16px;\"></i></a>\n");
      out.write("\n");
      out.write("                                <div id=\"search-lightbox\" class=\"mfp-hide dark text-center\">\n");
      out.write("                                    <div class=\"searchform-wrapper ux-search-box relative form-flat is-large\">\n");
      out.write("                                        <form action=\"search\" >\n");
      out.write("                                            <div class=\"flex-row relative\">\n");
      out.write("                                                <div class=\"flex-col flex-grow\">\n");
      out.write("                                                    <label class=\"screen-reader-text\" for=\"woocommerce-product-search-field-0\">Tìm kiếm:</label>\n");
      out.write("                                                    <input type=\"search\" id=\"woocommerce-product-search-field-0\" class=\"search-field mb-0\" placeholder=\"Tìm kiếm&hellip;\"name=\"keyword\" />\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"flex-col\">\n");
      out.write("                                                    <button type=\"submit\" value=\"Tìm kiếm\" class=\"ux-search-submit submit-button secondary button icon mb-0\" aria-label=\"Submit\">\n");
      out.write("                                                        <i class=\"fa fa-search\" ></i>\t\t\t</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\t</div>\n");
      out.write("                            </li>\n");
      out.write("                            <li id=\"menu-item-19969\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-home current-menu-item page_item page-item-89 current_page_item menu-item-19969 active menu-item-design-default\"><a href=\"home\" aria-current=\"page\" class=\"nav-top-link\">Home</a></li>\n");
      out.write("                            <li id=\"menu-item-19975\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-19975 menu-item-design-full-width menu-item-has-block has-dropdown nav-dropdown-toggle\">\n");
      out.write("                                <a class=\"nav-top-link\">Danh mục sản phẩm <i class=\"fas fa-angle-down\" ></i></a>\n");
      out.write("                                <div class=\"sub-menu nav-dropdown\">\t<section class=\"section\" id=\"section_1210283286\">\n");
      out.write("                                        <div class=\"bg section-bg fill bg-fill bg-loaded bg-loaded\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"section-content relative\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"row row-collapse\"  id=\"row-1588371424\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div id=\"col-1042897076\" class=\"col medium-12 small-12 large-3\"  >\n");
      out.write("                                                    <div class=\"col-inner\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <div id=\"text-1019243891\" class=\"text\">\n");
      out.write("\n");
      out.write("                                                            <h3><span data-text-color=\"primary\">Danh mục sản phẩm &nbsp</span></h3>\n");
      out.write("                                                            <div id=\"gtx-trans\" style=\"position: absolute; left: -38px; top: 47.1562px;\">\n");
      out.write("                                                                <div class=\"gtx-trans-icon\"></div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <style>\n");
      out.write("                                                                #text-1019243891 {\n");
      out.write("                                                                    font-size: 1rem;\n");
      out.write("                                                                }\n");
      out.write("                                                            </style>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                        <div id=\"gap-539643135\" class=\"gap-element clearfix\" style=\"display:block; height:auto;\">\n");
      out.write("\n");
      out.write("                                                            <style>\n");
      out.write("                                                                #gap-539643135 {\n");
      out.write("                                                                    padding-top: 10px;\n");
      out.write("                                                                }\n");
      out.write("                                                            </style>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <div class=\"ux-menu stack stack-col justify-start\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                        <div id=\"gap-1822212215\" class=\"gap-element clearfix\" style=\"display:block; height:auto;\">\n");
      out.write("\n");
      out.write("                                                            <style>\n");
      out.write("                                                                #gap-1822212215 {\n");
      out.write("                                                                    padding-top: 20px;\n");
      out.write("                                                                }\n");
      out.write("                                                            </style>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <a href=\"product\" target=\"_self\" class=\"button primary is-outline is-small\"  style=\"border-radius:9px;\">\n");
      out.write("                                                            <span>Xem tất cả</span>\n");
      out.write("                                                        </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <style>\n");
      out.write("                                                        #col-1042897076 > .col-inner {\n");
      out.write("                                                            padding: 0px 15px 0px 15px;\n");
      out.write("                                                        }\n");
      out.write("                                                        @media (min-width:850px) {\n");
      out.write("                                                            #col-1042897076 > .col-inner {\n");
      out.write("                                                                padding: 0 0px 0px 0px;\n");
      out.write("                                                            }\n");
      out.write("                                                        }\n");
      out.write("                                                    </style>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div id=\"col-1586640504\" class=\"col medium-12 small-12 large-9\"  >\n");
      out.write("                                                    <div class=\"col-inner\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <div class=\"row\"  id=\"row-1224889174\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            <div id=\"col-473248023\" class=\"col medium-4 small-12 large-4\"  >\n");
      out.write("                                                                <div class=\"col-inner\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                    <div class=\"box has-hover   has-hover box-text-bottom\" >\n");
      out.write("\n");
      out.write("                                                                        <div class=\"box-image\" >\n");
      out.write("                                                                            <div class=\"image-zoom image-cover\" style=\"padding-top:75%;\">\n");
      out.write("                                                                                <img width=\"1656\" height=\"2560\" src=\"https://cf.shopee.vn/file/610a462c7882855cf817617427714a00\" \n");
      out.write("                                                                                     class=\"attachment-original size-original\" alt=\"Nm D9485\" loading=\"lazy\" \n");
      out.write("                                                                                     />\t\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                                                        </div>\n");
      out.write("\n");
      out.write("                                                                        <div class=\"box-text text-left\" >\n");
      out.write("                                                                            <div class=\"box-text-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                <div id=\"gap-1724512713\" class=\"gap-element clearfix\" style=\"display:block; height:auto;\">\n");
      out.write("\n");
      out.write("                                                                                    <style>\n");
      out.write("                                                                                        #gap-1724512713 {\n");
      out.write("                                                                                            padding-top: 15px;\n");
      out.write("                                                                                        }\n");
      out.write("                                                                                    </style>\n");
      out.write("                                                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                <a href=\"detail?productID=1\" target=\"_self\" class=\"button primary is-link is-small\"  style=\"padding:0 0px 0px 0px;\">\n");
      out.write("                                                                                    <span>Xem thêm</span>\n");
      out.write("                                                                                    <i class=\"fas fa-caret-right\" ></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            <div id=\"col-1843474777\" class=\"col medium-4 small-12 large-4\"  >\n");
      out.write("                                                                <div class=\"col-inner\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                    <div class=\"box has-hover   has-hover box-text-bottom\" >\n");
      out.write("\n");
      out.write("                                                                        <div class=\"box-image\" >\n");
      out.write("                                                                            <div class=\"image-zoom image-cover\" style=\"padding-top:75%;\">\n");
      out.write("                                                                                <img width=\"2560\" height=\"1707\" src=\"https://www.themoviedb.org/t/p/original/a4vMwDgtOuvsijaeO5GNZGrbdRn.jpg\" class=\"attachment-original size-original\" />\t\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("\n");
      out.write("                                                                        <div class=\"box-text text-left\" >\n");
      out.write("                                                                            <div class=\"box-text-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                <div id=\"gap-1789351991\" class=\"gap-element clearfix\" style=\"display:block; height:auto;\">\n");
      out.write("\n");
      out.write("                                                                                    <style>\n");
      out.write("                                                                                        #gap-1789351991 {\n");
      out.write("                                                                                            padding-top: 15px;\n");
      out.write("                                                                                        }\n");
      out.write("                                                                                    </style>\n");
      out.write("                                                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                <a href=\"detail?productID=2\" target=\"_self\" class=\"button primary is-link is-small\"  style=\"padding:0 0px 0px 0px;\">\n");
      out.write("                                                                                    <span>Xem thêm</span>\n");
      out.write("                                                                                    <i class=\"fas fa-caret-right\" ></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            <div id=\"col-650280936\" class=\"col medium-4 small-12 large-4\"  >\n");
      out.write("                                                                <div class=\"col-inner\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                    <div class=\"box has-hover   has-hover box-text-bottom\" >\n");
      out.write("\n");
      out.write("                                                                        <div class=\"box-image\" >\n");
      out.write("                                                                            <div class=\"image-zoom image-cover\" style=\"padding-top:75%;\">\n");
      out.write("                                                                                <img width=\"2560\" height=\"1707\" src=\"https://salt.tikicdn.com/ts/tmp/29/ae/ed/c8869212243ca891c8ef4e529a87ca57.jpg\" class=\"attachment-original size-original\" alt=\"2\" loading=\"lazy\" />\t\t\t\t\t\t\t\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("\n");
      out.write("                                                                        <div class=\"box-text text-left\" >\n");
      out.write("                                                                            <div class=\"box-text-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                <div id=\"gap-370750606\" class=\"gap-element clearfix\" style=\"display:block; height:auto;\">\n");
      out.write("\n");
      out.write("                                                                                    <style>\n");
      out.write("                                                                                        #gap-370750606 {\n");
      out.write("                                                                                            padding-top: 15px;\n");
      out.write("                                                                                        }\n");
      out.write("                                                                                    </style>\n");
      out.write("                                                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                <a href=\"detail?productID=3\" target=\"_self\" class=\"button primary is-link is-small\"  style=\"padding:0 0px 0px 0px;\">\n");
      out.write("                                                                                    <span>Xem thêm</span>\n");
      out.write("                                                                                    <i class=\"fas fa-caret-right\" ></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <style>\n");
      out.write("                                                        #col-1586640504 > .col-inner {\n");
      out.write("                                                            padding: 0px 15px 0px 15px;\n");
      out.write("                                                            margin: 10px 0px 0px 0px;\n");
      out.write("                                                        }\n");
      out.write("                                                        @media (min-width:850px) {\n");
      out.write("                                                            #col-1586640504 > .col-inner {\n");
      out.write("                                                                padding: 0 0px 0px 0px;\n");
      out.write("                                                            }\n");
      out.write("                                                        }\n");
      out.write("                                                    </style>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <style>\n");
      out.write("                                            #section_1210283286 {\n");
      out.write("                                                padding-top: 30px;\n");
      out.write("                                                padding-bottom: 30px;\n");
      out.write("                                                background-color: rgb(245, 240, 234);\n");
      out.write("                                            }\n");
      out.write("                                        </style>\n");
      out.write("                                    </section>\n");
      out.write("                                </div></li>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <style>\n");
      out.write("                                /* Dropdown Button */\n");
      out.write("                                .dropbtn {\n");
      out.write("                                    background-color: #04AA6D;\n");
      out.write("                                    color: white;\n");
      out.write("                                    padding: 16px;\n");
      out.write("                                    font-size: 16px;\n");
      out.write("                                    border: none;\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                                /* The container <div> - needed to position the dropdown content */\n");
      out.write("                                .dropdown {\n");
      out.write("                                    position: relative;\n");
      out.write("                                    display: inline-block;\n");
      out.write("\n");
      out.write("                                    font-weight: 700;\n");
      out.write("                                    font-family: \"Montserrat\", sans-serif;\n");
      out.write("                                    font-size: 14px;\n");
      out.write("\n");
      out.write("                                    text-transform: uppercase;\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                                /* Dropdown Content (Hidden by Default) */\n");
      out.write("                                .dropdown-content {\n");
      out.write("                                    display: none;\n");
      out.write("                                    position: absolute;\n");
      out.write("                                    background-color: #f1f1f1;\n");
      out.write("                                    min-width: 160px;\n");
      out.write("                                    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("                                    z-index: 1;\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                                /* Links inside the dropdown */\n");
      out.write("                                .dropdown-content a {\n");
      out.write("                                    color: black;\n");
      out.write("                                    padding: 12px 16px;\n");
      out.write("                                    text-decoration: none;\n");
      out.write("                                    display: block;\n");
      out.write("                                }\n");
      out.write("\n");
      out.write("                                /* Change color of dropdown links on hover */\n");
      out.write("                                .dropdown-content a:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("                                /* Show the dropdown menu on hover */\n");
      out.write("                                .dropdown:hover .dropdown-content {display: block;}\n");
      out.write("\n");
      out.write("                                /* Change the background color of the dropdown button when the dropdown content is shown */\n");
      out.write("                                .dropdown:hover .dropbtn {background-color: #3e8e41;}\n");
      out.write("                            </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Right Elements -->\n");
      out.write("                    <div class=\"flex-col hide-for-medium flex-right\">\n");
      out.write("                        <ul class=\"header-nav header-nav-main nav nav-right  nav-line-bottom nav-spacing-xlarge nav-uppercase\">\n");
      out.write("                            <li class=\"header-contact-wrapper\">\n");
      out.write("                                <ul id=\"header-contact\" class=\"nav nav-divided nav-uppercase header-contact\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <li class=\"\">\n");
      out.write("                                        <a href=\"tel:036.345.1610\"  title=\"036.345.1610\">\n");
      out.write("                                            <i class=\"fas fa-phone-alt\" style=\"font-size:16px;\"></i>\t\t\t      <span>036.345.1610</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-divider\">\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!--                                    ------------------------------------------   ------------------------------------------   ------------------------------------------   -------------------------------------------->\n");
      out.write("                            <script>\n");
      out.write("                                function myFunction() {\n");
      out.write("                                    alert(\"Vui lòng đăng nhập!!!\");\n");
      out.write("                                }\n");
      out.write("                            </script>\n");
      out.write("\n");
      out.write("                            <li class=\"cart-item has-icon has-dropdown\">\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <ul class=\"nav-dropdown nav-dropdown-bold\" style=\"\">\n");
      out.write("                                    <li class=\"html widget_shopping_cart\">\n");
      out.write("                                        <div class=\"widget_shopping_cart_content\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!--                                    ------------------------------------------   ------------------------------------------   ------------------------------------------   -------------------------------------------->\n");
      out.write("\n");
      out.write("                            <li class=\"header-divider\">\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li id=\"menu-item-19964\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-19964 menu-item-design-default\">\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Mobile Right Elements -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-bg-container fill\"><div class=\"header-bg-image fill\"></div><div class=\"header-bg-color fill\"></div></div>\t\t</div>\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                    <!-- Modal Header -->\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4 class=\"modal-title text-center\" style=\"font-weight: bold\">SỬA THÔNG TIN</h4>\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!-- Modal body -->\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <form action=\"editprofile\" method=\"POST\" class=\"needs-validation\">\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"mb-2 text-muted\" for=\"username\">Tên tài khoản</label>\n");
      out.write("                                <input class=\"form-control\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" disabled>\n");
      out.write("                                <input class=\"form-control\" name=\"user\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" hidden=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"mb-2 text-muted\" for=\"fullname\">Họ và tên</label>\n");
      out.write("                                <input id=\"name\" type=\"text\" class=\"form-control\" name=\"fullname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required >\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"mb-2 text-muted\" for=\"email\">E-Mail</label>\n");
      out.write("                                <input id=\"email\" type=\"email\" class=\"form-control\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"mb-2 text-muted\" for=\"phone\">Số điện thoại</label>\n");
      out.write("                                <input id=\"email\" type=\"tel\" class=\"form-control\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.phone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <!-- Modal footer -->\n");
      out.write("                            <div class=\"align-items-center d-flex\">\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary ms-auto\" style=\"font-weight: bold\">\n");
      out.write("                                    Sửa\t\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("            \n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <main id=\"main\" class=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div id=\"content\" role=\"main\" class=\"content-area\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"banner has-hover\" id=\"banner-1707099471\">\n");
      out.write("                        <div class=\"banner-inner fill\">\n");
      out.write("                            <div class=\"banner-bg fill\" >\n");
      out.write("                                <div class=\"bg fill bg-fill bg-loaded\"></div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"banner-layers container\">\n");
      out.write("                                <div class=\"fill banner-link\"></div>            \n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"header-bg-container fill\"><div class=\"header-bg-image fill\"></div><div class=\"header-bg-color fill\"></div></div>\t\t</div>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <!--                    <div class=\"shop-page-title category-page-title page-title \">\n");
      out.write("                                            <div class=\"page-title-inner flex-row  medium-flex-wrap container\">\n");
      out.write("                                                <div class=\"flex-col flex-grow medium-text-center\">\n");
      out.write("                    \n");
      out.write("                                                    <h1 class=\"shop-page-title is-xlarge\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${g.genreName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                    \n");
      out.write("                                                    <div class=\"category-filtering category-filter-row show-for-medium\">\n");
      out.write("                                                        <a href=\"#\" data-open=\"#shop-sidebar\" data-visible-after=\"true\" data-pos=\"left\" class=\"filter-button uppercase plain\">\n");
      out.write("                                                            <i class=\"icon-equalizer\"></i>\n");
      out.write("                                                            <strong>Lọc</strong>\n");
      out.write("                                                        </a>\n");
      out.write("                                                        <div class=\"inline-block\">\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"flex-col medium-text-center\">\n");
      out.write("                                                    <p class=\"woocommerce-result-count hide-for-medium\">\n");
      out.write("                    \n");
      out.write("                                                    <form class=\"woocommerce-ordering\" method=\"get\">\n");
      out.write("                                                        <select name=\"orderby\" class=\"orderby\" aria-label=\"Đơn hàng của cửa hàng\">\n");
      out.write("                    \n");
      out.write("                                                            <option value=\"product\"  selected='selected'>Mới nhất</option>\n");
      out.write("                                                            <option value=\"price\" >Thứ tự theo giá: thấp đến cao</option>\n");
      out.write("                                                            <option value=\"price-desc\" >Thứ tự theo giá: cao xuống thấp</option>\n");
      out.write("                                                        </select>\n");
      out.write("                                                        <input type=\"hidden\" name=\"paged\" value=\"1\" />\n");
      out.write("                                                    </form>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row category-page-row\">\n");
      out.write("\n");
      out.write("                        <div class=\"col large-3 hide-for-medium \">\n");
      out.write("                            <div id=\"shop-sidebar\" class=\"sidebar-inner col-inner\">\n");
      out.write("                                <aside id=\"woocommerce_price_filter-9\" class=\"widget woocommerce widget_price_filter\">\n");
      out.write("                                    <!--                                    <span class=\"widget-title shop-sidebar\"></span><div class=\"is-divider small\"></div>-->\n");
      out.write("                                    <!--                                    <form method=\"get\" action=\"https://shop.mixigaming.com/danh-muc/ao-mixi/\">\n");
      out.write("                                                                            <div class=\"price_slider_wrapper\">\n");
      out.write("                                                                                <div class=\"price_slider\" style=\"display:none;\"></div>\n");
      out.write("                                                                                <div class=\"price_slider_amount\" data-step=\"10\">\n");
      out.write("                                                                                    <input type=\"text\" id=\"min_price\" name=\"min_price\" value=\"220000\" data-min=\"220000\" placeholder=\"Giá thấp nhất\" />\n");
      out.write("                                                                                    <input type=\"text\" id=\"max_price\" name=\"max_price\" value=\"500000\" data-max=\"500000\" placeholder=\"Giá cao nhất\" />\n");
      out.write("                                                                                    <button type=\"submit\" class=\"button\">Lọc</button>\n");
      out.write("                                                                                    <div class=\"price_label\" style=\"display:none;\">\n");
      out.write("                                                                                        Giá <span class=\"from\"></span> &mdash; <span class=\"to\"></span>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    <div class=\"clear\"></div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </form>-->\n");
      out.write("\n");
      out.write("                                </aside><aside id=\"woocommerce_product_categories-13\" class=\"widget woocommerce widget_product_categories\"><span class=\"widget-title shop-sidebar\">Danh mục sản phẩm</span><div class=\"is-divider small\"></div><ul class=\"product-categories\">\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    </ul></aside>\t\t\t</div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col large-9\">\n");
      out.write("                            <div class=\"shop-container\">\n");
      out.write("\n");
      out.write("                                <div class=\"woocommerce-notices-wrapper\"></div><div class=\"products row row-small large-columns-3 medium-columns-3 small-columns-2\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div><!-- row -->\n");
      out.write("                            </div><!-- shop container -->\t\t</div>\n");
      out.write("                    </div>\n");
      out.write("                    <nav aria-label=\"Page navigation example\" class=\"d-flex justify-content-center\">\n");
      out.write("                        <ul class=\"pagination \" >\n");
      out.write("                            <li class=\"page-item ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page==1||page==null?\"disabled\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" ><a class=\"page-link \" href=\"product?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Trang Trước</a></li>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            <li class=\"page-item ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page==totalPage?\"disabled\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a class=\"page-link\" href=\"product?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Trang Sau</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("            </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <footer id=\"footer\" class=\"footer-wrapper\">\n");
      out.write("\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("       <head>\n");
      out.write("         <meta charset=\"UTF-8\" />\n");
      out.write("        <link rel=\"pingback\" href=\"\" />\n");
      out.write("        <script>(function (html) {\n");
      out.write("                html.className = html.className.replace(/\\bno-js\\b/, 'js')\n");
      out.write("            })(document.documentElement);</script>\n");
      out.write("        <meta name='robots' content='index, follow, max-image-preview:large, max-snippet:-1, max-video-preview:-1' />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("        <title>MixiBook - Cửa hàng truyện tranh</title>\n");
      out.write("        <meta name=\"description\" content=\"Website chính thức của MixiBook. Chuyên cung cấp truyện tranh. Ship toàn quốc nhanh chóng, đảm bảo.\" />\n");
      out.write("        <link rel=\"canonical\" href=\"https://shop.mixigaming.com/\" />\n");
      out.write("        <meta property=\"og:locale\" content=\"vi_VN\" />\n");
      out.write("        <meta property=\"og:type\" content=\"website\" />\n");
      out.write("        <meta property=\"og:title\" content=\"MixiBook - Cửa hàng truyện tranh\" />\n");
      out.write("        <meta property=\"og:description\" content=\"Website chính thức của MixiBook. Chuyên cung cấp truyện tranh. Ship toàn quốc nhanh chóng, đảm bảo\" />\n");
      out.write("        <meta property=\"og:url\" content=\"https://shop.mixigaming.com/\" />\n");
      out.write("        <meta property=\"og:site_name\" content=\"MixiBook\" />\n");
      out.write("        <meta property=\"article:publisher\" content=\"https://www.facebook.com/Sown.1610\" />\n");
      out.write("        <meta property=\"article:modified_time\" content=\"2022-02-15T18:00:51+00:00\" />\n");
      out.write("        <meta property=\"og:image\" content=\"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg\" />\n");
      out.write("        <meta property=\"og:image:width\" content=\"960\" />\n");
      out.write("        <meta property=\"og:image:height\" content=\"960\" />\n");
      out.write("        <meta property=\"og:image:type\" content=\"image/jpeg\" />\n");
      out.write("        <meta name=\"twitter:card\" content=\"summary_large_image\" />\n");
      out.write("        <meta name=\"twitter:label1\" content=\"Ước tính thời gian đọc\" />\n");
      out.write("        <meta name=\"twitter:data1\" content=\"1 phút\" />\n");
      out.write("        <script type=\"application/ld+json\" class=\"yoast-schema-graph\">{\"@context\":\"https://schema.org\",\"@graph\":[{\"@type\":\"Organization\",\"@id\":\"https://shop.mixigaming.com/#organization\",\"name\":\"Mixishop\",\"url\":\"https://shop.mixigaming.com/\",\"sameAs\":[\"https://www.facebook.com/MixiShop-182674912385853/\"],\"logo\":{\"@type\":\"ImageObject\",\"@id\":\"https://shop.mixigaming.com/#logo\",\"inLanguage\":\"vi\",\"url\":\"https://shop.mixigaming.com/wp-content/uploads/2019/06/logo-mixi-tét.png\",\"contentUrl\":\"https://shop.mixigaming.com/wp-content/uploads/2019/06/logo-mixi-tét.png\",\"width\":2018,\"height\":1207,\"caption\":\"Mixishop\"},\"image\":{\"@id\":\"https://shop.mixigaming.com/#logo\"}},{\"@type\":\"WebSite\",\"@id\":\"https://shop.mixigaming.com/#website\",\"url\":\"https://shop.mixigaming.com/\",\"name\":\"Mixishop\",\"description\":\"MixiShop\",\"publisher\":{\"@id\":\"https://shop.mixigaming.com/#organization\"},\"potentialAction\":[{\"@type\":\"SearchAction\",\"target\":{\"@type\":\"EntryPoint\",\"urlTemplate\":\"https://shop.mixigaming.com/?s={search_term_string}\"},\"query-input\":\"required name=search_term_string\"}],\"inLanguage\":\"vi\"},{\"@type\":\"ImageObject\",\"@id\":\"https://shop.mixigaming.com/#primaryimage\",\"inLanguage\":\"vi\",\"url\":\"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg\",\"contentUrl\":\"https://shop.mixigaming.com/wp-content/uploads/2020/09/118070490_238469837342215_4161744696367508805_n.jpg\",\"width\":960,\"height\":960},{\"@type\":\"WebPage\",\"@id\":\"https://shop.mixigaming.com/#webpage\",\"url\":\"https://shop.mixigaming.com/\",\"name\":\"MixiShop - Đồ hiệu Mixi, áo PUBG, áo CSGO ship toàn quốc\",\"isPartOf\":{\"@id\":\"https://shop.mixigaming.com/#website\"},\"about\":{\"@id\":\"https://shop.mixigaming.com/#organization\"},\"primaryImageOfPage\":{\"@id\":\"https://shop.mixigaming.com/#primaryimage\"},\"datePublished\":\"2013-08-06T20:13:19+00:00\",\"dateModified\":\"2022-02-15T18:00:51+00:00\",\"description\":\"Website chính thức của MixiShop. Chuyên cung cấp đồ hiệu Mixi, đồ lưu niệm, áo Refund Gaming, áo PUBG, CSGO. Ship toàn quốc nhanh chóng, đảm bảo.\",\"breadcrumb\":{\"@id\":\"https://shop.mixigaming.com/#breadcrumb\"},\"inLanguage\":\"vi\",\"potentialAction\":[{\"@type\":\"ReadAction\",\"target\":[\"https://shop.mixigaming.com/\"]}]},{\"@type\":\"BreadcrumbList\",\"@id\":\"https://shop.mixigaming.com/#breadcrumb\",\"itemListElement\":[{\"@type\":\"ListItem\",\"position\":1,\"name\":\"Trang chủ\"}]}]}</script>\n");
      out.write("        <!-- / Yoast SEO plugin. -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"alternate\" type=\"application/rss+xml\" title=\"Dòng thông tin MixiShop &raquo;\" href=\"https://shop.mixigaming.com/feed/\" />\n");
      out.write("        <link rel=\"alternate\" type=\"application/rss+xml\" title=\"Dòng phản hồi MixiShop &raquo;\" href=\"https://shop.mixigaming.com/comments/feed/\" />\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window._wpemojiSettings = {\"baseUrl\": \"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/13.1.0\\/72x72\\/\", \"ext\": \".png\", \"svgUrl\": \"https:\\/\\/s.w.org\\/images\\/core\\/emoji\\/13.1.0\\/svg\\/\", \"svgExt\": \".svg\", \"source\": {\"concatemoji\": \"https:\\/\\/shop.mixigaming.com\\/wp-includes\\/js\\/wp-emoji-release.min.js\"}};\n");
      out.write("            /*! This file is auto-generated */\n");
      out.write("            !function (e, a, t) {\n");
      out.write("                var n, r, o, i = a.createElement(\"canvas\"), p = i.getContext && i.getContext(\"2d\");\n");
      out.write("                function s(e, t) {\n");
      out.write("                    var a = String.fromCharCode;\n");
      out.write("                    p.clearRect(0, 0, i.width, i.height), p.fillText(a.apply(this, e), 0, 0);\n");
      out.write("                    e = i.toDataURL();\n");
      out.write("                    return p.clearRect(0, 0, i.width, i.height), p.fillText(a.apply(this, t), 0, 0), e === i.toDataURL()\n");
      out.write("                }\n");
      out.write("                function c(e) {\n");
      out.write("                    var t = a.createElement(\"script\");\n");
      out.write("                    t.src = e, t.defer = t.type = \"text/javascript\", a.getElementsByTagName(\"head\")[0].appendChild(t)\n");
      out.write("                }\n");
      out.write("                for (o = Array(\"flag\", \"emoji\"), t.supports = {everything:!0, everythingExceptFlag:!0}, r = 0; r < o.length; r++)\n");
      out.write("                    t.supports[o[r]] = function (e) {\n");
      out.write("                        if (!p || !p.fillText)\n");
      out.write("                            return!1;\n");
      out.write("                        switch (p.textBaseline = \"top\", p.font = \"600 32px Arial\", e) {\n");
      out.write("                            case\"flag\":\n");
      out.write("                                return s([127987, 65039, 8205, 9895, 65039], [127987, 65039, 8203, 9895, 65039]) ? !1 : !s([55356, 56826, 55356, 56819], [55356, 56826, 8203, 55356, 56819]) && !s([55356, 57332, 56128, 56423, 56128, 56418, 56128, 56421, 56128, 56430, 56128, 56423, 56128, 56447], [55356, 57332, 8203, 56128, 56423, 8203, 56128, 56418, 8203, 56128, 56421, 8203, 56128, 56430, 8203, 56128, 56423, 8203, 56128, 56447]);\n");
      out.write("                            case\"emoji\":\n");
      out.write("                                return!s([10084, 65039, 8205, 55357, 56613], [10084, 65039, 8203, 55357, 56613])\n");
      out.write("                        }\n");
      out.write("                        return!1\n");
      out.write("                    }(o[r]), t.supports.everything = t.supports.everything && t.supports[o[r]], \"flag\" !== o[r] && (t.supports.everythingExceptFlag = t.supports.everythingExceptFlag && t.supports[o[r]]);\n");
      out.write("                t.supports.everythingExceptFlag = t.supports.everythingExceptFlag && !t.supports.flag, t.DOMReady = !1, t.readyCallback = function () {\n");
      out.write("                    t.DOMReady = !0\n");
      out.write("                }, t.supports.everything || (n = function () {\n");
      out.write("                    t.readyCallback()\n");
      out.write("                }, a.addEventListener ? (a.addEventListener(\"DOMContentLoaded\", n, !1), e.addEventListener(\"load\", n, !1)) : (e.attachEvent(\"onload\", n), a.attachEvent(\"onreadystatechange\", function () {\n");
      out.write("                    \"complete\" === a.readyState && t.readyCallback()\n");
      out.write("                })), (n = t.source || {}).concatemoji ? c(n.concatemoji) : n.wpemoji && n.twemoji && (c(n.twemoji), c(n.wpemoji)))\n");
      out.write("            }(window, document, window._wpemojiSettings);</script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            img.wp-smiley,\n");
      out.write("            img.emoji {\n");
      out.write("                display: inline !important;\n");
      out.write("                border: none !important;\n");
      out.write("                box-shadow: none !important;\n");
      out.write("                height: 1em !important;\n");
      out.write("                width: 1em !important;\n");
      out.write("                margin: 0 0.07em !important;\n");
      out.write("                vertical-align: -0.1em !important;\n");
      out.write("                background: none !important;\n");
      out.write("                padding: 0 !important;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel='stylesheet' id='sbi_styles-css'  href='https://shop.mixigaming.com/wp-content/plugins/instagram-feed/css/sbi-styles.min.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='wp-block-library-css'  href='https://shop.mixigaming.com/wp-includes/css/dist/block-library/style.min.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='wc-blocks-vendors-style-css'  href='https://shop.mixigaming.com/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/wc-blocks-vendors-style.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='wc-blocks-style-css'  href='https://shop.mixigaming.com/wp-content/plugins/woocommerce/packages/woocommerce-blocks/build/wc-blocks-style.css' type='text/css' media='all' />\n");
      out.write("        <style id='global-styles-inline-css' type='text/css'>\n");
      out.write("        </style>\n");
      out.write("        <style id='woocommerce-inline-inline-css' type='text/css'>\n");
      out.write("            .woocommerce form .form-row .required { visibility: visible; }\n");
      out.write("        </style>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/a076d05399.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel='stylesheet' id='flatsome-icons-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/fl-icons.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-main-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/flatsome.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-shop-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/flatsome-shop.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-style-css'  href='https://shop.mixigaming.com/wp-content/themes/flatsome-child/style.css' type='text/css' media='all' />\n");
      out.write("        <link rel='stylesheet' id='flatsome-googlefonts-css'  href='//fonts.googleapis.com/css?family=Montserrat%3Aregular%2Cregular%2Cregular%2C700%2Cregular&#038;display=swap' type='text/css' media='all' />\n");
      out.write("        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/jquery.min.js' id='jquery-core-js'></script>\n");
      out.write("        <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/jquery-migrate.min.js' id='jquery-migrate-js'></script>\n");
      out.write("        <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/wp-extra/js/copy.js' id='donotcopy-js'></script>\n");
      out.write("        <link rel=\"https://api.w.org/\" href=\"https://shop.mixigaming.com/wp-json/\" /><link rel=\"alternate\" type=\"application/json\" href=\"https://shop.mixigaming.com/wp-json/wp/v2/pages/89\" /><link rel=\"EditURI\" type=\"application/rsd+xml\" title=\"RSD\" href=\"https://shop.mixigaming.com/xmlrpc.php?rsd\" />\n");
      out.write("        <link rel=\"wlwmanifest\" type=\"application/wlwmanifest+xml\" href=\"https://shop.mixigaming.com/wp-includes/wlwmanifest.xml\" /> \n");
      out.write("        <link rel='shortlink' href='https://shop.mixigaming.com/' />\n");
      out.write("        <link rel=\"alternate\" type=\"application/json+oembed\" href=\"https://shop.mixigaming.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fshop.mixigaming.com%2F\" />\n");
      out.write("        <link rel=\"alternate\" type=\"text/xml+oembed\" href=\"https://shop.mixigaming.com/wp-json/oembed/1.0/embed?url=https%3A%2F%2Fshop.mixigaming.com%2F&#038;format=xml\" />\n");
      out.write("        <!--[if IE]><link rel=\"stylesheet\" type=\"text/css\" href=\"https://shop.mixigaming.com/wp-content/themes/flatsome/assets/css/ie-fallback.css\"><script src=\"//cdnjs.cloudflare.com/ajax/libs/html5shiv/3.6.1/html5shiv.js\"></script><script>var head = document.getElementsByTagName('head')[0],style = document.createElement('style');style.type = 'text/css';style.styleSheet.cssText = ':before,:after{content:none !important';head.appendChild(style);setTimeout(function(){head.removeChild(style);}, 0);</script><script src=\"https://shop.mixigaming.com/wp-content/themes/flatsome/assets/libs/ie-flexibility.js\"></script><![endif]--><!-- Global site tag (gtag.js) - Google Analytics -->\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            window.dataLayer = window.dataLayer || [];\n");
      out.write("            function gtag() {\n");
      out.write("                dataLayer.push(arguments);\n");
      out.write("            }\n");
      out.write("            gtag('js', new Date());\n");
      out.write("            gtag('config', 'UA-129718705-2');</script>\n");
      out.write("        <noscript><style>.woocommerce-product-gallery{ opacity: 1 !important; }</style></noscript>\n");
      out.write("        <link rel=\"icon\" href=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-32x32.png\" sizes=\"32x32\" />\n");
      out.write("        <link rel=\"icon\" href=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-192x192.png\" sizes=\"192x192\" />\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-180x180.png\" />\n");
      out.write("        <meta name=\"msapplication-TileImage\" content=\"https://shop.mixigaming.com/wp-content/uploads/2019/06/cropped-logo-mixi-tét-1-270x270.png\" />\n");
      out.write("        <style id=\"custom-css\" type=\"text/css\">:root {--primary-color: #0a4da8;}.full-width .ubermenu-nav, .container, .row{max-width: 1310px}.row.row-collapse{max-width: 1280px}.row.row-small{max-width: 1302.5px}.row.row-large{max-width: 1340px}.sticky-add-to-cart--active, #wrapper,#main,#main.dark{background-color: #f0f0f0}.header-main{height: 100px}#logo img{max-height: 100px}#logo{width:151px;}#logo img{padding:4px 0;}.header-bottom{min-height: 50px}.header-top{min-height: 30px}.transparent .header-main{height: 30px}.transparent #logo img{max-height: 30px}.has-transparent + .page-title:first-of-type,.has-transparent + #main > .page-title,.has-transparent + #main > div > .page-title,.has-transparent + #main .page-header-wrapper:first-of-type .page-title{padding-top: 30px;}.header.show-on-scroll,.stuck .header-main{height:70px!important}.stuck #logo img{max-height: 70px!important}.search-form{ width: 75%;}.header-bg-color, .header-wrapper {background-color: rgba(255,255,255,0.9)}.header-bottom {background-color: #ffffff}.header-main .nav > li > a{line-height: 16px }.header-bottom-nav > li > a{line-height: 30px }@media (max-width: 549px) {.header-main{height: 70px}#logo img{max-height: 70px}}/* Color */.accordion-title.active, .has-icon-bg .icon .icon-inner,.logo a, .primary.is-underline, .primary.is-link, .badge-outline .badge-inner, .nav-outline > li.active> a,.nav-outline >li.active > a, .cart-icon strong,[data-color='primary'], .is-outline.primary{color: #0a4da8;}/* Color !important */[data-text-color=\"primary\"]{color: #0a4da8!important;}/* Background Color */[data-text-bg=\"primary\"]{background-color: #0a4da8;}/* Background */.scroll-to-bullets a,.featured-title, .label-new.menu-item > a:after, .nav-pagination > li > .current,.nav-pagination > li > span:hover,.nav-pagination > li > a:hover,.has-hover:hover .badge-outline .badge-inner,button[type=\"submit\"], .button.wc-forward:not(.checkout):not(.checkout-button), .button.submit-button, .button.primary:not(.is-outline),.featured-table .title,.is-outline:hover, .has-icon:hover .icon-label,.nav-dropdown-bold .nav-column li > a:hover, .nav-dropdown.nav-dropdown-bold > li > a:hover, .nav-dropdown-bold.dark .nav-column li > a:hover, .nav-dropdown.nav-dropdown-bold.dark > li > a:hover, .is-outline:hover, .tagcloud a:hover,.grid-tools a, input[type='submit']:not(.is-form), .box-badge:hover .box-text, input.button.alt,.nav-box > li > a:hover,.nav-box > li.active > a,.nav-pills > li.active > a ,.current-dropdown .cart-icon strong, .cart-icon:hover strong, .nav-line-bottom > li > a:before, .nav-line-grow > li > a:before, .nav-line > li > a:before,.banner, .header-top, .slider-nav-circle .flickity-prev-next-button:hover svg, .slider-nav-circle .flickity-prev-next-button:hover .arrow, .primary.is-outline:hover, .button.primary:not(.is-outline), input[type='submit'].primary, input[type='submit'].primary, input[type='reset'].button, input[type='button'].primary, .badge-inner{background-color: #0a4da8;}/* Border */.nav-vertical.nav-tabs > li.active > a,.scroll-to-bullets a.active,.nav-pagination > li > .current,.nav-pagination > li > span:hover,.nav-pagination > li > a:hover,.has-hover:hover .badge-outline .badge-inner,.accordion-title.active,.featured-table,.is-outline:hover, .tagcloud a:hover,blockquote, .has-border, .cart-icon strong:after,.cart-icon strong,.blockUI:before, .processing:before,.loading-spin, .slider-nav-circle .flickity-prev-next-button:hover svg, .slider-nav-circle .flickity-prev-next-button:hover .arrow, .primary.is-outline:hover{border-color: #0a4da8}.nav-tabs > li.active > a{border-top-color: #0a4da8}.widget_shopping_cart_content .blockUI.blockOverlay:before { border-left-color: #0a4da8 }.woocommerce-checkout-review-order .blockUI.blockOverlay:before { border-left-color: #0a4da8 }/* Fill */.slider .flickity-prev-next-button:hover svg,.slider .flickity-prev-next-button:hover .arrow{fill: #0a4da8;}body{font-size: 100%;}@media screen and (max-width: 549px){body{font-size: 100%;}}body{font-family:\"Montserrat\", sans-serif}body{font-weight: 0}body{color: #000000}.nav > li > a {font-family:\"Montserrat\", sans-serif;}.mobile-sidebar-levels-2 .nav > li > ul > li > a {font-family:\"Montserrat\", sans-serif;}.nav > li > a {font-weight: 700;}.mobile-sidebar-levels-2 .nav > li > ul > li > a {font-weight: 700;}h1,h2,h3,h4,h5,h6,.heading-font, .off-canvas-center .nav-sidebar.nav-vertical > li > a{font-family: \"Montserrat\", sans-serif;}h1,h2,h3,h4,h5,h6,.heading-font,.banner h1,.banner h2{font-weight: 0;}h1,h2,h3,h4,h5,h6,.heading-font{color: #000000;}.alt-font{font-family: \"Montserrat\", sans-serif;}.alt-font{font-weight: 0!important;}.header:not(.transparent) .header-nav-main.nav > li > a:hover,.header:not(.transparent) .header-nav-main.nav > li.active > a,.header:not(.transparent) .header-nav-main.nav > li.current > a,.header:not(.transparent) .header-nav-main.nav > li > a.active,.header:not(.transparent) .header-nav-main.nav > li > a.current{color: #0a4da8;}.header-nav-main.nav-line-bottom > li > a:before,.header-nav-main.nav-line-grow > li > a:before,.header-nav-main.nav-line > li > a:before,.header-nav-main.nav-box > li > a:hover,.header-nav-main.nav-box > li.active > a,.header-nav-main.nav-pills > li > a:hover,.header-nav-main.nav-pills > li.active > a{color:#FFF!important;background-color: #0a4da8;}a{color: #0a4da8;}a:hover{color: #8224e3;}.tagcloud a:hover{border-color: #8224e3;background-color: #8224e3;}@media screen and (min-width: 550px){.products .box-vertical .box-image{min-width: 300px!important;width: 300px!important;}}.header-main .social-icons,.header-main .cart-icon strong,.header-main .menu-title,.header-main .header-button > .button.is-outline,.header-main .nav > li > a > i:not(.icon-angle-down){color: #000000!important;}.header-main .header-button > .button.is-outline,.header-main .cart-icon strong:after,.header-main .cart-icon strong{border-color: #000000!important;}.header-main .header-button > .button:not(.is-outline){background-color: #000000!important;}.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover,.header-main .header-button > .button:hover i,.header-main .header-button > .button:hover span{color:#FFF!important;}.header-main .menu-title:hover,.header-main .social-icons a:hover,.header-main .header-button > .button.is-outline:hover,.header-main .nav > li > a:hover > i:not(.icon-angle-down){color: #000000!important;}.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover{background-color: #000000!important;}.header-main .current-dropdown .cart-icon strong:after,.header-main .current-dropdown .cart-icon strong,.header-main .header-button > .button:hover{border-color: #000000!important;}.footer-2{background-color: rgba(22,22,22,0.9)}.absolute-footer, html{background-color: #fafafa}.page-title-small + main .product-container > .row{padding-top:0;}.label-new.menu-item > a:after{content:\"New\";}.label-hot.menu-item > a:after{content:\"Hot\";}.label-sale.menu-item > a:after{content:\"Sale\";}.label-popular.menu-item > a:after{content:\"Popular\";}</style></head>\n");
      out.write("    <body>\n");
      out.write("        <footer id=\"footer\" class=\"footer-wrapper\">\n");
      out.write("\n");
      out.write("                <div class=\"is-divider divider clearfix\" style=\"margin-top:0px;margin-bottom:0px;max-width:100%;height:1px;\"></div>\n");
      out.write("\n");
      out.write("                <section class=\"section\" id=\"section_1622558052\">\n");
      out.write("                    <div class=\"bg section-bg fill bg-fill bg-loaded bg-loaded\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"section-content relative\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"row\"  id=\"row-98647434\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div id=\"col-1068653155\" class=\"col medium-6 small-12 large-3 medium-col-first\"  >\n");
      out.write("                                <div class=\"col-inner\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div id=\"gap-1891654759\" class=\"gap-element clearfix\" style=\"display:block; height:auto;\">\n");
      out.write("\n");
      out.write("                                        <style>\n");
      out.write("                                            #gap-1891654759 {\n");
      out.write("                                                padding-top: 30px;\n");
      out.write("                                            }\n");
      out.write("                                        </style>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <h5 style=\"font-weight: bold\">Về chúng tôi</h5>\n");
      out.write("                                    <p><span style=\"font-size: 90%;\">Website chính thức và duy nhất của MixiBook.</span></p>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div id=\"col-1367170307\" class=\"col medium-12 small-12 large-5\"  >\n");
      out.write("                                <div class=\"col-inner\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"row row-small\"  id=\"row-397936269\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div id=\"col-1821280017\" class=\"col medium-6 small-12 large-6\"  >\n");
      out.write("                                            <div class=\"col-inner\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div id=\"gap-393829027\" class=\"gap-element clearfix\" style=\"display:block; height:auto;\">\n");
      out.write("\n");
      out.write("                                                    <style>\n");
      out.write("                                                        #gap-393829027 {\n");
      out.write("                                                            padding-top: 30px;\n");
      out.write("                                                        }\n");
      out.write("                                                    </style>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <h5>Truyện nổi bật </h5>\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a href=\"detail?productID=1\">Doraemon</a></li>\n");
      out.write("                                                    <li><a href=\"detail?productID=3\">Dragon Ball</a></li>\n");
      out.write("                                                    <li><a href=\"detail?productID=2\">Conan</a></li>\n");
      out.write("                                                    <li><a href=\"detail?productID=6\">Tý Quậy</a></li>\n");
      out.write("                                                    <li><a href=\"detail?productID=5\">Trạng Quỳnh</a></li>\n");
      out.write("                                                    <li><a href=\"detail?productID=7\">Trạng Nguyên</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                                <div id=\"gtx-trans\" style=\"position: absolute; left: 22px; top: 180.906px;\">\n");
      out.write("                                                    <div class=\"gtx-trans-icon\"> </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div id=\"col-1867412971\" class=\"col medium-6 small-12 large-6\"  >\n");
      out.write("                                            <div class=\"col-inner\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div id=\"gap-1024259630\" class=\"gap-element clearfix\" style=\"display:block; height:auto;\">\n");
      out.write("\n");
      out.write("                                                    <style>\n");
      out.write("                                                        #gap-1024259630 {\n");
      out.write("                                                            padding-top: 30px;\n");
      out.write("                                                        }\n");
      out.write("                                                    </style>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <h5>Danh mục sản phẩm</h5>\n");
      out.write("                                                <div class=\"ux-menu stack stack-col justify-start\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                    ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div id=\"col-357492779\" class=\"col medium-6 small-12 large-4 medium-col-first\"  >\n");
      out.write("                                <div class=\"col-inner\"  >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div id=\"gap-1354649098\" class=\"gap-element clearfix\" style=\"display:block; height:auto;\">\n");
      out.write("\n");
      out.write("                                        <style>\n");
      out.write("                                            #gap-1354649098 {\n");
      out.write("                                                padding-top: 30px;\n");
      out.write("                                            }\n");
      out.write("                                        </style>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <h5>Hỗ trợ</h5>\n");
      out.write("                                    <p><span style=\"font-size: 90%;\">Mọi thắc mắc và góp ý cần hỗ trợ xin vui lòng liên hệ Fanpage và Instagram</span></p>\n");
      out.write("                                    <div class=\"social-icons follow-icons\" style=\"font-size:70%\"><a href=\"https://www.facebook.com/Sown.1610\" target=\"_blank\" data-label=\"Facebook\"  rel=\"noopener noreferrer nofollow\" class=\"icon primary button circle facebook tooltip\" title=\"Follow on Facebook\"><i class=\"fab fa-facebook-f\" ></i></a>\n");
      out.write("                                        <a href=\"https://www.instagram.com/sown.1610/\" target=\"_blank\" rel=\"noopener noreferrer nofollow\" data-label=\"Instagram\" class=\"icon primary button circle  instagram tooltip\" title=\"Follow on Instagram\"><i class=\"fab fa-instagram\" ></i></a></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <style>\n");
      out.write("                        #section_1622558052 {\n");
      out.write("                            padding-top: 0px;\n");
      out.write("                            padding-bottom: 0px;\n");
      out.write("                            background-color: rgb(250, 250, 250);\n");
      out.write("                        }\n");
      out.write("                    </style>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <div class=\"text-center\"><div class=\"is-divider divider clearfix\" style=\"margin-top:0px;margin-bottom:0px;max-width:80%;height:1px;\"></div></div>\n");
      out.write("                <div class=\"absolute-footer light medium-text-center small-text-center\">\n");
      out.write("                    <div class=\"container clearfix\">\n");
      out.write("\n");
      out.write("                        <div class=\"footer-secondary pull-right\">\n");
      out.write("                            <div class=\"footer-text inline-block small-block\">\n");
      out.write("                                <a href=\"img/logo fpt new.png\"  class=\"dmca-badge\"> <img src =\"img/logo fpt new.png\"  width=\"250px\" /></a>            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"footer-primary pull-left\">\n");
      out.write("                            <div class=\"copyright-footer\">\n");
      out.write("                                Copyright 2022 © <strong>MixiBook</strong>      </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a href=\"#top\" class=\"back-to-top button icon invert plain fixed bottom z-1 is-outline round hide-for-medium\" id=\"top-link\"><i class=\"fas fa-arrow-circle-up\" ></i></a>\n");
      out.write("\n");
      out.write("            </footer>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"main-menu\" class=\"mobile-sidebar no-scrollbar mfp-hide\">\n");
      out.write("            <div class=\"sidebar-menu no-scrollbar \">\n");
      out.write("                <ul class=\"nav nav-sidebar nav-vertical nav-uppercase\">\n");
      out.write("                    <li class=\"header-search-form search-form html relative has-icon\">\n");
      out.write("                        <div class=\"header-search-form-wrapper\">\n");
      out.write("                            <div class=\"searchform-wrapper ux-search-box relative form-flat is-normal\"><form role=\"search\" method=\"get\" class=\"searchform\" action=\"https://shop.mixigaming.com/\">\n");
      out.write("                                    <div class=\"flex-row relative\">\n");
      out.write("                                        <div class=\"flex-col flex-grow\">\n");
      out.write("                                            <label class=\"screen-reader-text\" for=\"woocommerce-product-search-field-1\">Tìm kiếm:</label>\n");
      out.write("                                            <input type=\"search\" id=\"woocommerce-product-search-field-1\" class=\"search-field mb-0\" placeholder=\"Tìm kiếm&hellip;\" value=\"\" name=\"s\" />\n");
      out.write("                                            <input type=\"hidden\" name=\"post_type\" value=\"product\" />\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"flex-col\">\n");
      out.write("                                            <button type=\"submit\" value=\"Tìm kiếm\" class=\"ux-search-submit submit-button secondary button icon mb-0\" aria-label=\"Submit\">\n");
      out.write("                                                <i class=\"icon-search\" ></i>\t\t\t</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"live-search-results text-left z-top\"></div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\t</div>\n");
      out.write("                    </li><li id=\"menu-item-230\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-home menu-item-230\"><a href=\"home\">MixiShop</a></li>\n");
      out.write("                    <li id=\"menu-item-7117\" class=\"label-hot menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-7117\"><a href=\"https://shop.mixigaming.com/danh-muc/do-luu-niem-mixi/\">ĐỒ LƯU NIỆM MIXI</a></li>\n");
      out.write("                    <li id=\"menu-item-20084\" class=\"menu-item menu-item-type-custom menu-item-object-custom current-menu-ancestor current-menu-parent menu-item-has-children menu-item-20084\"><a>ÁO</a>\n");
      out.write("                        <ul class=\"sub-menu nav-sidebar-ul children\">\n");
      out.write("                            <li id=\"menu-item-7119\" class=\"label-new menu-item menu-item-type-taxonomy menu-item-object-product_cat current-menu-item menu-item-7119\"><a href=\"https://shop.mixigaming.com/danh-muc/ao-mixi/\" aria-current=\"page\">ÁO MIXI</a></li>\n");
      out.write("                            <li id=\"menu-item-20085\" class=\"label-popular menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-20085\"><a href=\"https://shop.mixigaming.com/danh-muc/ao-ba-lo/\">ÁO BA LỖ</a></li>\n");
      out.write("                            <li id=\"menu-item-7118\" class=\"menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-7118\"><a href=\"https://shop.mixigaming.com/danh-muc/ao-refund-gaming/\">ÁO REFUND GAMING</a></li>\n");
      out.write("                            <li id=\"menu-item-7115\" class=\"menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-7115\"><a href=\"https://shop.mixigaming.com/danh-muc/ao-pubg/\">ÁO PUBG</a></li>\n");
      out.write("                            <li id=\"menu-item-7116\" class=\"menu-item menu-item-type-taxonomy menu-item-object-product_cat menu-item-7116\"><a href=\"https://shop.mixigaming.com/danh-muc/ao-csgo/\">ÁO CSGO</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li id=\"menu-item-19966\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-19966\"><a rel=\"nofollow\" href=\"https://shop.mixigaming.com/gioi-thieu/\">Thông báo</a></li>\n");
      out.write("                    <li class=\"html header-social-icons ml-0\">\n");
      out.write("                        <div class=\"social-icons follow-icons\" ><a href=\"https://www.facebook.com/MixiShop-182674912385853/\" target=\"_blank\" data-label=\"Facebook\"  rel=\"noopener noreferrer nofollow\" class=\"icon primary button circle facebook tooltip\" title=\"Follow on Facebook\"><i class=\"icon-facebook\" ></i></a><a href=\"https://www.instagram.com/mixi.shop/\" target=\"_blank\" rel=\"noopener noreferrer nofollow\" data-label=\"Instagram\" class=\"icon primary button circle  instagram tooltip\" title=\"Follow on Instagram\"><i class=\"icon-instagram\" ></i></a></div></li>\t\t</ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Instagram Feed JS -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var sbiajaxurl = \"https://shop.mixigaming.com/wp-admin/admin-ajax.php\";</script>\n");
      out.write("        <div id=\"login-form-popup\" class=\"lightbox-content mfp-hide\">\n");
      out.write("            <div class=\"woocommerce-notices-wrapper\"></div>\n");
      out.write("            <div class=\"account-container lightbox-inner\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"account-login-inner\">\n");
      out.write("\n");
      out.write("                    <h3 class=\"uppercase\">Đăng nhập</h3>\n");
      out.write("\n");
      out.write("                    <form class=\"woocommerce-form woocommerce-form-login login\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <p class=\"woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide\">\n");
      out.write("                            <label for=\"username\">Tên tài khoản hoặc địa chỉ email&nbsp;<span class=\"required\">*</span></label>\n");
      out.write("                            <input type=\"text\" class=\"woocommerce-Input woocommerce-Input--text input-text\" name=\"username\" id=\"username\" autocomplete=\"username\" value=\"\" />\t\t\t\t\t</p>\n");
      out.write("                        <p class=\"woocommerce-form-row woocommerce-form-row--wide form-row form-row-wide\">\n");
      out.write("                            <label for=\"password\">Mật khẩu&nbsp;<span class=\"required\">*</span></label>\n");
      out.write("                            <input class=\"woocommerce-Input woocommerce-Input--text input-text\" type=\"password\" name=\"password\" id=\"password\" autocomplete=\"current-password\" />\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <p class=\"form-row\">\n");
      out.write("                            <label class=\"woocommerce-form__label woocommerce-form__label-for-checkbox woocommerce-form-login__rememberme\">\n");
      out.write("                                <input class=\"woocommerce-form__input woocommerce-form__input-checkbox\" name=\"rememberme\" type=\"checkbox\" id=\"rememberme\" value=\"forever\" /> <span>Ghi nhớ mật khẩu</span>\n");
      out.write("                            </label>\n");
      out.write("                            <input type=\"hidden\" id=\"woocommerce-login-nonce\" name=\"woocommerce-login-nonce\" value=\"4a17eb8052\" /><input type=\"hidden\" name=\"_wp_http_referer\" value=\"/danh-muc/ao-mixi/\" />\t\t\t\t\t\t<button type=\"submit\" class=\"woocommerce-button button woocommerce-form-login__submit\" name=\"login\" value=\"Đăng nhập\">Đăng nhập</button>\n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"woocommerce-LostPassword lost_password\">\n");
      out.write("                            <a href=\"https://shop.mixigaming.com/my-account/quen-mat-khau/\">Quên mật khẩu?</a>\n");
      out.write("                        </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    <svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 0 0\" width=\"0\" height=\"0\" focusable=\"false\" role=\"none\" style=\"visibility: hidden; position: absolute; left: -9999px; overflow: hidden;\" ><defs><filter id=\"wp-duotone-dark-grayscale\"><feColorMatrix color-interpolation-filters=\"sRGB\" type=\"matrix\" values=\" .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 \" /><feComponentTransfer color-interpolation-filters=\"sRGB\" ><feFuncR type=\"table\" tableValues=\"0 0.49803921568627\" /><feFuncG type=\"table\" tableValues=\"0 0.49803921568627\" /><feFuncB type=\"table\" tableValues=\"0 0.49803921568627\" /><feFuncA type=\"table\" tableValues=\"1 1\" /></feComponentTransfer><feComposite in2=\"SourceGraphic\" operator=\"in\" /></filter></defs></svg><svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 0 0\" width=\"0\" height=\"0\" focusable=\"false\" role=\"none\" style=\"visibility: hidden; position: absolute; left: -9999px; overflow: hidden;\" ><defs><filter id=\"wp-duotone-grayscale\"><feColorMatrix color-interpolation-filters=\"sRGB\" type=\"matrix\" values=\" .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 \" /><feComponentTransfer color-interpolation-filters=\"sRGB\" ><feFuncR type=\"table\" tableValues=\"0 1\" /><feFuncG type=\"table\" tableValues=\"0 1\" /><feFuncB type=\"table\" tableValues=\"0 1\" /><feFuncA type=\"table\" tableValues=\"1 1\" /></feComponentTransfer><feComposite in2=\"SourceGraphic\" operator=\"in\" /></filter></defs></svg><svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 0 0\" width=\"0\" height=\"0\" focusable=\"false\" role=\"none\" style=\"visibility: hidden; position: absolute; left: -9999px; overflow: hidden;\" ><defs><filter id=\"wp-duotone-purple-yellow\"><feColorMatrix color-interpolation-filters=\"sRGB\" type=\"matrix\" values=\" .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 \" /><feComponentTransfer color-interpolation-filters=\"sRGB\" ><feFuncR type=\"table\" tableValues=\"0.54901960784314 0.98823529411765\" /><feFuncG type=\"table\" tableValues=\"0 1\" /><feFuncB type=\"table\" tableValues=\"0.71764705882353 0.25490196078431\" /><feFuncA type=\"table\" tableValues=\"1 1\" /></feComponentTransfer><feComposite in2=\"SourceGraphic\" operator=\"in\" /></filter></defs></svg><svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 0 0\" width=\"0\" height=\"0\" focusable=\"false\" role=\"none\" style=\"visibility: hidden; position: absolute; left: -9999px; overflow: hidden;\" ><defs><filter id=\"wp-duotone-blue-red\"><feColorMatrix color-interpolation-filters=\"sRGB\" type=\"matrix\" values=\" .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 \" /><feComponentTransfer color-interpolation-filters=\"sRGB\" ><feFuncR type=\"table\" tableValues=\"0 1\" /><feFuncG type=\"table\" tableValues=\"0 0.27843137254902\" /><feFuncB type=\"table\" tableValues=\"0.5921568627451 0.27843137254902\" /><feFuncA type=\"table\" tableValues=\"1 1\" /></feComponentTransfer><feComposite in2=\"SourceGraphic\" operator=\"in\" /></filter></defs></svg><svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 0 0\" width=\"0\" height=\"0\" focusable=\"false\" role=\"none\" style=\"visibility: hidden; position: absolute; left: -9999px; overflow: hidden;\" ><defs><filter id=\"wp-duotone-midnight\"><feColorMatrix color-interpolation-filters=\"sRGB\" type=\"matrix\" values=\" .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 \" /><feComponentTransfer color-interpolation-filters=\"sRGB\" ><feFuncR type=\"table\" tableValues=\"0 0\" /><feFuncG type=\"table\" tableValues=\"0 0.64705882352941\" /><feFuncB type=\"table\" tableValues=\"0 1\" /><feFuncA type=\"table\" tableValues=\"1 1\" /></feComponentTransfer><feComposite in2=\"SourceGraphic\" operator=\"in\" /></filter></defs></svg><svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 0 0\" width=\"0\" height=\"0\" focusable=\"false\" role=\"none\" style=\"visibility: hidden; position: absolute; left: -9999px; overflow: hidden;\" ><defs><filter id=\"wp-duotone-magenta-yellow\"><feColorMatrix color-interpolation-filters=\"sRGB\" type=\"matrix\" values=\" .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 \" /><feComponentTransfer color-interpolation-filters=\"sRGB\" ><feFuncR type=\"table\" tableValues=\"0.78039215686275 1\" /><feFuncG type=\"table\" tableValues=\"0 0.94901960784314\" /><feFuncB type=\"table\" tableValues=\"0.35294117647059 0.47058823529412\" /><feFuncA type=\"table\" tableValues=\"1 1\" /></feComponentTransfer><feComposite in2=\"SourceGraphic\" operator=\"in\" /></filter></defs></svg><svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 0 0\" width=\"0\" height=\"0\" focusable=\"false\" role=\"none\" style=\"visibility: hidden; position: absolute; left: -9999px; overflow: hidden;\" ><defs><filter id=\"wp-duotone-purple-green\"><feColorMatrix color-interpolation-filters=\"sRGB\" type=\"matrix\" values=\" .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 \" /><feComponentTransfer color-interpolation-filters=\"sRGB\" ><feFuncR type=\"table\" tableValues=\"0.65098039215686 0.40392156862745\" /><feFuncG type=\"table\" tableValues=\"0 1\" /><feFuncB type=\"table\" tableValues=\"0.44705882352941 0.4\" /><feFuncA type=\"table\" tableValues=\"1 1\" /></feComponentTransfer><feComposite in2=\"SourceGraphic\" operator=\"in\" /></filter></defs></svg><svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 0 0\" width=\"0\" height=\"0\" focusable=\"false\" role=\"none\" style=\"visibility: hidden; position: absolute; left: -9999px; overflow: hidden;\" ><defs><filter id=\"wp-duotone-blue-orange\"><feColorMatrix color-interpolation-filters=\"sRGB\" type=\"matrix\" values=\" .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 .299 .587 .114 0 0 \" /><feComponentTransfer color-interpolation-filters=\"sRGB\" ><feFuncR type=\"table\" tableValues=\"0.098039215686275 1\" /><feFuncG type=\"table\" tableValues=\"0 0.66274509803922\" /><feFuncB type=\"table\" tableValues=\"0.84705882352941 0.41960784313725\" /><feFuncA type=\"table\" tableValues=\"1 1\" /></feComponentTransfer><feComposite in2=\"SourceGraphic\" operator=\"in\" /></filter></defs></svg>\t<script type=\"text/javascript\">\n");
      out.write("        (function () {\n");
      out.write("        var c = document.body.className;\n");
      out.write("        c = c.replace(/woocommerce-no-js/, 'woocommerce-js');\n");
      out.write("        document.body.className = c;\n");
      out.write("        })();\n");
      out.write("    </script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/jquery-blockui/jquery.blockUI.min.js' id='jquery-blockui-js'></script>\n");
      out.write("    <script type='text/javascript' id='wc-add-to-cart-js-extra'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var wc_add_to_cart_params = {\"ajax_url\":\"\\/wp-admin\\/admin-ajax.php\", \"wc_ajax_url\":\"\\/?wc-ajax=%%endpoint%%\", \"i18n_view_cart\":\"Xem gi\\u1ecf h\\u00e0ng\", \"cart_url\":\"https:\\/\\/shop.mixigaming.com\\/cart\\/\", \"is_cart\":\"\", \"cart_redirect_after_add\":\"no\"};\n");
      out.write("        /* ]]> */\n");
      out.write("    </script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/add-to-cart.min.js' id='wc-add-to-cart-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/js-cookie/js.cookie.min.js' id='js-cookie-js'></script>\n");
      out.write("    <script type='text/javascript' id='woocommerce-js-extra'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var woocommerce_params = {\"ajax_url\":\"\\/wp-admin\\/admin-ajax.php\", \"wc_ajax_url\":\"\\/?wc-ajax=%%endpoint%%\"};\n");
      out.write("        /* ]]> */\n");
      out.write("    </script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/woocommerce.min.js' id='woocommerce-js'></script>\n");
      out.write("    <script type='text/javascript' id='wc-cart-fragments-js-extra'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var wc_cart_fragments_params = {\"ajax_url\":\"\\/wp-admin\\/admin-ajax.php\", \"wc_ajax_url\":\"\\/?wc-ajax=%%endpoint%%\", \"cart_hash_key\":\"wc_cart_hash_4faecf81c727e9d8cac987c670b90b4f\", \"fragment_name\":\"wc_fragments_4faecf81c727e9d8cac987c670b90b4f\", \"request_timeout\":\"5000\"};\n");
      out.write("        /* ]]> */\n");
      out.write("    </script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/cart-fragments.min.js' id='wc-cart-fragments-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/themes/flatsome/inc/extensions/flatsome-live-search/flatsome-live-search.js' id='flatsome-live-search-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/hoverIntent.min.js' id='hoverIntent-js'></script>\n");
      out.write("    <script type='text/javascript' id='flatsome-js-js-extra'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var flatsomeVars = {\"ajaxurl\":\"https:\\/\\/shop.mixigaming.com\\/wp-admin\\/admin-ajax.php\", \"rtl\":\"\", \"sticky_height\":\"70\", \"lightbox\":{\"close_markup\":\"<button title=\\\"%title%\\\" type=\\\"button\\\" class=\\\"mfp-close\\\"><svg xmlns=\\\"http:\\/\\/www.w3.org\\/2000\\/svg\\\" width=\\\"28\\\" height=\\\"28\\\" viewBox=\\\"0 0 24 24\\\" fill=\\\"none\\\" stroke=\\\"currentColor\\\" stroke-width=\\\"2\\\" stroke-linecap=\\\"round\\\" stroke-linejoin=\\\"round\\\" class=\\\"feather feather-x\\\"><line x1=\\\"18\\\" y1=\\\"6\\\" x2=\\\"6\\\" y2=\\\"18\\\"><\\/line><line x1=\\\"6\\\" y1=\\\"6\\\" x2=\\\"18\\\" y2=\\\"18\\\"><\\/line><\\/svg><\\/button>\", \"close_btn_inside\":false}, \"user\":{\"can_edit_pages\":false}, \"i18n\":{\"mainMenu\":\"Main Menu\"}, \"options\":{\"cookie_notice_version\":\"1\"}};\n");
      out.write("        /* ]]> */\n");
      out.write("    </script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/js/flatsome.js' id='flatsome-js-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/themes/flatsome/assets/js/woocommerce.js' id='flatsome-theme-woocommerce-js-js'></script>\n");
      out.write("    <!--[if IE]>\n");
      out.write("    <script type='text/javascript' src='https://cdn.jsdelivr.net/gh/nuxodin/ie11CustomProperties@4.0.1/ie11CustomProperties.min.js' id='css-vars-polyfill-js'></script>\n");
      out.write("    <![endif]-->\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/ui/core.min.js' id='jquery-ui-core-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/ui/mouse.min.js' id='jquery-ui-mouse-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/jquery/ui/slider.min.js' id='jquery-ui-slider-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/jquery-ui-touch-punch/jquery-ui-touch-punch.min.js' id='wc-jquery-ui-touchpunch-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/accounting/accounting.min.js' id='accounting-js'></script>\n");
      out.write("    <script type='text/javascript' id='wc-price-slider-js-extra'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var woocommerce_price_slider_params = {\"currency_format_num_decimals\":\"0\", \"currency_format_symbol\":\"\\u20ab\", \"currency_format_decimal_sep\":\".\", \"currency_format_thousand_sep\":\",\", \"currency_format\":\"%v\\u00a0%s\"};\n");
      out.write("        /* ]]> */\n");
      out.write("    </script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/price-slider.min.js' id='wc-price-slider-js'></script>\n");
      out.write("    <script type='text/javascript' id='zxcvbn-async-js-extra'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var _zxcvbnSettings = {\"src\":\"https:\\/\\/shop.mixigaming.com\\/wp-includes\\/js\\/zxcvbn.min.js\"};\n");
      out.write("        /* ]]> */\n");
      out.write("    </script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/zxcvbn-async.min.js' id='zxcvbn-async-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/dist/vendor/regenerator-runtime.min.js' id='regenerator-runtime-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/dist/vendor/wp-polyfill.min.js' id='wp-polyfill-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/dist/hooks.min.js' id='wp-hooks-js'></script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-includes/js/dist/i18n.min.js' id='wp-i18n-js'></script>\n");
      out.write("    <script type='text/javascript' id='wp-i18n-js-after'>\n");
      out.write("        wp.i18n.setLocaleData({ 'text direction\\u0004ltr': [ 'ltr' ] });</script>\n");
      out.write("    <script type='text/javascript' id='password-strength-meter-js-extra'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var pwsL10n = {\"unknown\":\"M\\u1eadt kh\\u1ea9u m\\u1ea1nh kh\\u00f4ng x\\u00e1c \\u0111\\u1ecbnh\", \"short\":\"R\\u1ea5t y\\u1ebfu\", \"bad\":\"Y\\u1ebfu\", \"good\":\"Trung b\\u00ecnh\", \"strong\":\"M\\u1ea1nh\", \"mismatch\":\"M\\u1eadt kh\\u1ea9u kh\\u00f4ng kh\\u1edbp\"};\n");
      out.write("        /* ]]> */\n");
      out.write("    </script>\n");
      out.write("    <script type='text/javascript' id='password-strength-meter-js-translations'>\n");
      out.write("        (function(domain, translations) {\n");
      out.write("        var localeData = translations.locale_data[ domain ] || translations.locale_data.messages;\n");
      out.write("        localeData[\"\"].domain = domain;\n");
      out.write("        wp.i18n.setLocaleData(localeData, domain);\n");
      out.write("        })(\"default\", {\"translation-revision-date\":\"2021-11-15 07:20:52+0000\", \"generator\":\"GlotPress\\/3.0.0-alpha.2\", \"domain\":\"messages\", \"locale_data\":{\"messages\":{\"\":{\"domain\":\"messages\", \"plural-forms\":\"nplurals=1; plural=0;\", \"lang\":\"vi_VN\"}, \"%1$s is deprecated since version %2$s! Use %3$s instead. Please consider writing more inclusive code.\":[\"%1$s \\u0111\\u00e3 ng\\u1eebng ho\\u1ea1t \\u0111\\u1ed9ng t\\u1eeb phi\\u00ean b\\u1ea3n %2$s! S\\u1eed d\\u1ee5ng thay th\\u1ebf b\\u1eb1ng %3$s.\"]}}, \"comment\":{\"reference\":\"wp-admin\\/js\\/password-strength-meter.js\"}});</script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-admin/js/password-strength-meter.min.js' id='password-strength-meter-js'></script>\n");
      out.write("    <script type='text/javascript' id='wc-password-strength-meter-js-extra'>\n");
      out.write("        /* <![CDATA[ */\n");
      out.write("        var wc_password_strength_meter_params = {\"min_password_strength\":\"3\", \"stop_checkout\":\"\", \"i18n_password_error\":\"Vui l\\u00f2ng nh\\u1eadp m\\u1eadt kh\\u1ea9u kh\\u00f3 h\\u01a1n.\", \"i18n_password_hint\":\"G\\u1ee3i \\u00fd: M\\u1eadt kh\\u1ea9u ph\\u1ea3i c\\u00f3 \\u00edt nh\\u1ea5t 12 k\\u00fd t\\u1ef1. \\u0110\\u1ec3 n\\u00e2ng cao \\u0111\\u1ed9 b\\u1ea3o m\\u1eadt, s\\u1eed d\\u1ee5ng ch\\u1eef in hoa, in th\\u01b0\\u1eddng, ch\\u1eef s\\u1ed1 v\\u00e0 c\\u00e1c k\\u00fd t\\u1ef1 \\u0111\\u1eb7c bi\\u1ec7t nh\\u01b0 ! \\\" ? $ % ^ & ).\"};\n");
      out.write("        /* ]]> */\n");
      out.write("    </script>\n");
      out.write("    <script type='text/javascript' src='https://shop.mixigaming.com/wp-content/plugins/woocommerce/assets/js/frontend/password-strength-meter.min.js' id='wc-password-strength-meter-js'></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!-- Dynamic page generated in 1.206 seconds. -->\n");
      out.write("<!-- Cached page generated by WP-Super-Cache on 2022-02-26 16:06:03 -->\n");
      out.write("\n");
      out.write("<!-- super cache -->\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listGenre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("g");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                <div class=\"ux-menu-link flex menu-item label-hot\">\n");
          out.write("                                                                    <a class=\"ux-menu-link__link flex\" href=\"genre?genreID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${g.genreID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  >\n");
          out.write("                                                                        <i class=\"ux-menu-link__icon text-center fad fas fa-angle-right\" ></i>\t\t\t<span class=\"ux-menu-link__text\">\n");
          out.write("                                                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${g.genreName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\t\t</span>\n");
          out.write("                                                                    </a>\n");
          out.write("                                                                </div>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.role==true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                                <li id=\"menu-item-19975\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-19975 menu-item-design-full-width\">\n");
        out.write("                                    <a class=\"nav-top-link\" href=\"manager\">Quản lý sản phẩm</a>\n");
        out.write("                                </li>\n");
        out.write("                                <li id=\"menu-item-19975\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-19975 menu-item-design-full-width\">\n");
        out.write("                                    <a class=\"nav-top-link\" href=\"users\">Người dùng</a>\n");
        out.write("                                </li>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <a  onclick=\"myFunction()\" href=\"login\" title=\"Giỏ hàng\" class=\"header-cart-link is-small\">\n");
        out.write("\n");
        out.write("\n");
        out.write("                                            <span class=\"header-cart-title\">\n");
        out.write("                                                Giỏ hàng   /      <span class=\"cart-price\"><span class=\"woocommerce-Price-amount amount\"><bdi>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</bdi></span></span>\n");
        out.write("                                            </span>\n");
        out.write("\n");
        out.write("                                            <i class=\"fas fa-shopping-cart\"\n");
        out.write("                                               data-icon-label=\"0\">\n");
        out.write("                                            </i>\n");
        out.write("                                        </a>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                        <a href=\"carts\" title=\"Giỏ hàng\" class=\"header-cart-link is-small\">\n");
        out.write("\n");
        out.write("\n");
        out.write("                                            <span class=\"header-cart-title\">\n");
        out.write("                                                Giỏ hàng   /      <span class=\"cart-price\"><span class=\"woocommerce-Price-amount amount\"><bdi>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</bdi></span></span>\n");
        out.write("                                            </span>\n");
        out.write("\n");
        out.write("                                            <i class=\"fas fa-shopping-cart\"\n");
        out.write("                                               data-icon-label=\"0\">\n");
        out.write("                                            </i>\n");
        out.write("                                        </a>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()==null ||sessionScope.carts.size()==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <p class=\"woocommerce-mini-cart__empty-message\">Chưa có sản phẩm trong giỏ hàng.</p>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                                                    ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    <p class=\"woocommerce-mini-cart__total total\">\n");
        out.write("                                                        <strong>Tổng số phụ:</strong> <span class=\"woocommerce-Price-amount amount\"><bdi>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalMoney}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("00&nbsp;<span class=\"woocommerce-Price-currencySymbol\">₫</span></bdi></span>\t</p>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                   \n");
        out.write("                                                    ");
        if (_jspx_meth_c_choose_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${carts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("c");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <ul class=\"woocommerce-mini-cart cart_list product_list_widget \">\n");
          out.write("                                                            <li class=\"woocommerce-mini-cart-item mini_cart_item\">\n");
          out.write("                                                                <a href=\"delete-cart?productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.value.product.bookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"remove remove_from_cart_button\" aria-label=\"Xóa sản phẩm này\" data-product_id=\"32025\" data-cart_item_key=\"65dbfb2fa8342f59bdf6e4f8547ad8d2\" data-product_sku=\"\">×\n");
          out.write("                                                                </a>\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("                                                                <a href=\"product?productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.value.product.bookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"font-weight: bold\">\n");
          out.write("                                                                    <img  src=\"img/comic/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.value.product.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail\" alt=\"Apcitylogotrang\" loading=\"lazy\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.value.product.bookName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\t\t\t\t\t\t</a>\n");
          out.write("                                                                <span class=\"quantity\" style=\"font-weight: bold\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" × <span class=\"woocommerce-Price-amount amount\"><bdi>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.value.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("00&nbsp;<span class=\"woocommerce-Price-currencySymbol\">₫</span></bdi></span></span>\t\t\t\t\n");
          out.write("                                                            </li>\n");
          out.write("\n");
          out.write("                                                        </ul>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                             <p class=\"woocommerce-mini-cart__buttons buttons\"><a onclick=\"myFunction()\" href=\"login\"  class=\"button wc-forward\">Xem giỏ hàng</a><a  onclick=\"myFunction()\" href=\"login\"  class=\"button checkout wc-forward\">Thanh toán</a></p>\n");
        out.write("                                                            </a>\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                                             <p class=\"woocommerce-mini-cart__buttons buttons\"><a href=\"carts\" class=\"button wc-forward\">Xem giỏ hàng</a><a href=\"checkout\" class=\"button checkout wc-forward\">Thanh toán</a></p>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent(null);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_otherwise_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <a rel=\"nofollow\" href=\"login\" class=\"nav-top-link\" style=\"color: #0a4da8\">Đăng nhập</a>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_3.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
    if (_jspx_eval_c_otherwise_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"dropdown\" >\n");
        out.write("                                            <div href=\"profile\" class=\"dropdown \" style=\"color: #0a4da8\">Hí ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" &nbsp<i class=\"fas fa-user-circle\"></i></div>\n");
        out.write("                                            <div class=\"dropdown-content\">\n");
        out.write("                                                <a href=\"#\" data-bs-toggle=\"modal\" data-bs-target=\"#myModal\" >Sửa thông tin </a>\n");
        out.write("                                                <a href=\"changepass\" >Đổi mật khẩu</a>\n");
        out.write("                                                <a href=\"logout\" class=\"dropdown\">Đăng xuất</a>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listGenre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("g");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <li class=\"cat-item cat-item-142\"><a href=\"genre?genreID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${g.genreID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${g.genreName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${all}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("a");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <div class=\"product-small col has-hover out-of-stock product type-product post-32017 status-publish first outofstock product_cat-ao-mixi has-post-thumbnail shipping-taxable purchasable product-type-variable\">\n");
          out.write("                                            <div class=\"col-inner\">\n");
          out.write("\n");
          out.write("                                                <div class=\"badge-container absolute left top z-1\">\n");
          out.write("                                                </div>\n");
          out.write("                                                <div class=\"product-small box \">\n");
          out.write("                                                    <div class=\"box-image\">\n");
          out.write("                                                        <div class=\"image-fade_in_back\">\n");
          out.write("                                                            <a href=\"detail?productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.bookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                                <img width=\"300\" height=\"400\" src=\"img/comic/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"attachment-woocommerce_thumbnail size-woocommerce_thumbnail\" alt=\"Apcitylogoden\" loading=\"lazy\" /><img width=\"300\" height=\"400\" src=\"img/comic/hover.png\" class=\"show-on-hover absolute fill hide-for-small back-image\" alt=\"Vuvu4680\" loading=\"lazy\" />\t\t\t\t</a>\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <div class=\"image-tools is-small top right show-on-hover\">\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <div class=\"image-tools is-small hide-for-small bottom left show-on-hover\">\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <div class=\"image-tools grid-tools text-center hide-for-small bottom hover-slide-in show-on-hover\">\n");
          out.write("                                                        </div>\n");
          out.write("                                                        <!--                                                            <div class=\"out-of-stock-label\">Hết hàng</div>\t\t-->\n");
          out.write("                                                    </div>\n");
          out.write("\n");
          out.write("                                                    <div class=\"box-text box-text-products text-center grid-style-2\">\n");
          out.write("                                                        <div class=\"title-wrapper\">\t \t\n");
          out.write("                                                            <p class=\"name product-title woocommerce-loop-product__title\"><a href=\"https://shop.mixigaming.com/san-pham/ao-phong-mixicity-logo-be-den/\" class=\"woocommerce-LoopProduct-link woocommerce-loop-product__link \" style=\"font-weight: bold;font-size: initial\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.bookName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></p></div><div class=\"price-wrapper\">\n");
          out.write("                                                            <span class=\"price\"><span class=\"woocommerce-Price-amount amount\" style=\"font-style: italic;\"><bdi>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("00&nbsp;<span class=\"woocommerce-Price-currencySymbol\">&#8363;</span></bdi></span></span>\n");
          out.write("                                                                        ");
          if (_jspx_meth_c_choose_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("  \n");
          out.write("                                                        </div>\t\t</div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_4.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    int _jspx_eval_c_choose_4 = _jspx_th_c_choose_4.doStartTag();
    if (_jspx_eval_c_choose_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                                                                            ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\n");
        out.write("                                                                ");
        if (_jspx_meth_c_otherwise_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_4, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        out.write("\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_choose_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_4);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.quantity == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("\n");
        out.write("                                                                    <a  class=\"button alt disabled\" style=\" background-color: #0a4da8\"  >Sản phẩm đã hết hàng </a>\n");
        out.write("                                                                    <div class=\"product_meta\">\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_4 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_4.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_4);
    int _jspx_eval_c_otherwise_4 = _jspx_th_c_otherwise_4.doStartTag();
    if (_jspx_eval_c_otherwise_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("  \n");
        out.write("                                                                    <a  class=\"button alt \" style=\" background-color: #0a4da8\" href=\"add-to-cart?productID=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${a.bookID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" >Thêm vào giỏ hàng </a>\n");
        out.write("                                                                    <div class=\"product_meta\">\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_4);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setBegin(1);
    _jspx_th_c_forEach_4.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_4.setVar("i");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"page-item ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i==page?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a class=\"page-link\" href=\"product?page=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listGenre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("g");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                        <div class=\"ux-menu-link flex menu-item label-hot\">\n");
          out.write("                                                            <a class=\"ux-menu-link__link flex\" style=\"color: #0a4da8\" href=\"genre?genreID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${g.genreID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"  >\n");
          out.write("                                                                <i class=\"ux-menu-link__icon text-center fad fas fa-angle-right\" ></i>\t\t\t<span class=\"ux-menu-link__text\">\n");
          out.write("                                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${g.genreName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\t\t</span>\n");
          out.write("                                                            </a>\n");
          out.write("                                                        </div>\n");
          out.write("                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }
}
