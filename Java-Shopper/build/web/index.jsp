<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zxx">
<head>
	<title>eCommerce</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="description" content="eCommerce">
	<meta name="keywords" content="divisima, eCommerce, creative, html">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">

	<!-- Google Font -->
	<link href="https://fonts.googleapis.com/css?family=Josefin+Sans:300,300i,400,400i,700,700i" rel="stylesheet">


	<!-- Stylesheets -->
	<link rel="stylesheet" href="css/bootstrap.min.css"/>
	<link rel="stylesheet" href="css/font-awesome.min.css"/>
	<link rel="stylesheet" href="css/flaticon.css"/>
	<link rel="stylesheet" href="css/slicknav.min.css"/>
	<link rel="stylesheet" href="css/jquery-ui.min.css"/>
	<link rel="stylesheet" href="css/owl.carousel.min.css"/>
	<link rel="stylesheet" href="css/animate.css"/>
	<link rel="stylesheet" href="css/style.css"/>

</head>
<body>

    <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
	<!-- Hero section -->
	<section class="hero-section">
		<div class="hero-slider owl-carousel">
			<div class="hs-item set-bg" data-setbg="image/banner1.jpg">
				<div class="container">
					<div class="row">
						<div class="col-xl-6 col-lg-7 text-white">
							<span>New Arrivals</span>
							<h2>fast food</h2>
                                                        <p style="text-shadow: 2px 2px 4px #000000;">Thị trường thực phẩm sạch chưa bao giờ trở nên sôi động đến vậy, nhà nhà, người người cần cung cấp thực phẩm sạch. Vấn đề sức khỏe người tiêu dùng luôn được đề cao, đặc biệt là khi vấn nạn mất vệ sinh an toàn thực phẩm diễn ra hàng ngày, hàng giờ như hiện nay. Nắm bắt tình hình thực tế ấy, không ít người đã cho ra đời dịch vụ cung cấp thực phẩm sạch hay còn gọi là bán hàng thực phẩm sạch.</p>
							<a href="#" class="site-btn sb-line">DISCOVER</a>
							<a href="#" class="site-btn sb-white">ADD TO CART</a>
						</div>
					</div>
					<div class="offer-card text-white">
						<span>from</span>
						<h2>$29</h2>
						<p>SHOP NOW</p>
					</div>
				</div>
			</div>
			<div class="hs-item set-bg" data-setbg="image/banner2.jpg">
				<div class="container">
					<div class="row">
						<div class="col-xl-6 col-lg-7 text-white">
							<span>Old Arrivals</span>
							<h2>slow food</h2>
                                                        <p style="text-shadow: 2px 2px 4px #000000;">An toàn thực phẩm là thước đo của sức khỏe, vì vậy mà thực phẩm sạch luôn được mỗi người tiêu dùng đặt lên hàng đầu. Là một nhà kinh doanh thông minh, bạn không nên bỏ lỡ cơ hội kiếm tiền từ thị trường đầy tiềm năng này cùng tuyệt chiêu bán hàng qua website thực phẩm sạch.
 </p>
							<a href="#" class="site-btn sb-line">DISCOVER</a>
							<a href="#" class="site-btn sb-white">ADD TO CART</a>
						</div>
					</div>
					<div class="offer-card text-white">
						<span>bottom</span>
						<h2>$92</h2>
						<p>SHOP NOW</p>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="slide-num-holder" id="snh-1"></div>
		</div>
	</section>
	<!-- Hero section end -->



	<!-- Features section -->
	<section class="features-section">
		<div class="container-fluid">
			<div class="row">
				<div class="col-md-4 p-0 feature">
					<div class="feature-inner">
						<div class="feature-icon">
							<img src="img/icons/1.png" alt="#">
						</div>
						<h2>Fast Secure Payments</h2>
					</div>
				</div>
				<div class="col-md-4 p-0 feature">
					<div class="feature-inner">
						<div class="feature-icon">
							<img src="img/icons/2.png" alt="#">
						</div>
						<h2>Premium Products</h2>
					</div>
				</div>
				<div class="col-md-4 p-0 feature">
					<div class="feature-inner">
						<div class="feature-icon">
							<img src="img/icons/3.png" alt="#">
						</div>
						<h2>Free & fast Delivery</h2>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Features section end -->


	<!-- letest product section -->
	<section class="top-letest-product-section">
		<div class="container">
			<div class="section-title">
				<h2>LATEST PRODUCTS</h2>
			</div>
			<div class="product-slider owl-carousel">
                        <c:forEach var="product" items="${list6Products}">
                            <div class="product-item">
					<div class="pi-pic">
						<img src="${product.getProductImage()}" alt="">
						<div class="pi-links">
							<a href="CartServlet?method=get&command=plus&productID=${product.getProductID()}" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
							<a href="IndexServlet?method=get&productID=${product.getProductID()}" class="wishlist-btn"><i class="flaticon-heart"></i></a>
						</div>
					</div>
					<div class="pi-text">
						<h6>$${product.getProductPrice()}</h6>
						<p>${product.getProductName()}</p>
					</div>
				</div>
                            </c:forEach>
                            
			</div>
		</div>
	</section>
	<!-- letest product section end -->



	<!-- Product filter section -->
	<section class="product-filter-section">
		<div class="container">
			<div class="section-title">
				<h2>BROWSE TOP SELLING PRODUCTS</h2>
			</div>
			<ul class="product-filter-menu">
				<li><a href="#">Stunning</a></li>
				<li><a href="#">Appealing</a></li>
				<li><a href="#">Gorgeous</a></li>
				<li><a href="#">Ravishing</a></li>
				<li><a href="#">Dazzling</a></li>
				<li><a href="#">Alluring</a></li>
				<li><a href="#">Attractive</a></li>
			</ul>
			<div class="row">
                        <c:forEach var="product" items="${list8Products}">
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<img src="./${product.getProductImage()}" alt="">
							<div class="pi-links">
                                                            <a href="CartServlet?method=get&command=plus&productID=${product.getProductID()}" class="add-card"><i class="flaticon-bag"></i><span>ADD TO CART</span></a>
                                                            <a href="IndexServlet?method=get&productID=${product.getProductID()}" class="wishlist-btn"><i class="flaticon-heart"></i></a>
							</div>
						</div>
						<div class="pi-text">
							<h6>$${product.getProductPrice()}</h6>
							<p>${product.getProductName()}</p>
						</div>
					</div>
				</div>
                        </c:forEach>
			</div>
			<div class="text-center pt-5">
				<button class="site-btn sb-line sb-dark">LOAD MORE</button>
			</div>
		</div>
	</section>
	<!-- Product filter section end -->


	<!-- Banner section -->
	<section class="banner-section">
		<div class="container">
			<div class="banner set-bg" data-setbg="image/banner.jpg">
				<div class="tag-new">NEW</div>
				<span style="color: white">New Arrivals</span>
                                <h2 style="color: white">STRIPED SHIRTS</h2>
				<a href="#" class="site-btn">SHOP NOW</a>
			</div>
		</div>
	</section>
	<!-- Banner section end  -->


    <jsp:include page="_footer.jsp"></jsp:include>



	<!--====== Javascripts & Jquery ======-->
	<script src="js/jquery-3.2.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.slicknav.min.js"></script>
	<script src="js/owl.carousel.min.js"></script>
	<script src="js/jquery.nicescroll.min.js"></script>
	<script src="js/jquery.zoom.min.js"></script>
	<script src="js/jquery-ui.min.js"></script>
	<script src="js/main.js"></script>
        
        
	</body>
</html>
