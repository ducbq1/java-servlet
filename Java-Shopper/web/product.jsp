<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zxx">
<head>
	<title>eCommerce</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="description" content=" Divisima | eCommerce Template">
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
	<!-- Page info -->
	<div class="page-top-info">
		<div class="container">
			<h4>Category Page</h4>
			<div class="site-pagination">
				<a href="index.jsp">Home</a> /
				<a href="product.jsp">Shop</a>
			</div>
		</div>
	</div>
	<!-- Page info end -->


	<!-- product section -->
	<section class="product-section">
		<div class="container">
			<div class="back-link">
				<a href="./category.jsp"> &lt;&lt; Back to Category</a>
			</div>
			<div class="row">
				<div class="col-lg-6">
					<div class="product-pic-zoom">
                                            <img class="product-big-img" src="${products.getProductID() != null ? products.getProductImage() : randomProduct.getProductImage()}" alt="">
                                        </div>
					<div class="product-thumbs" tabindex="1" style="overflow: hidden; outline: none;">
						<div class="product-thumbs-track">
							<div class="pt active" data-imgbigurl="image/icon1.png"><img src="image/icon1.png" alt=""></div>
							<div class="pt" data-imgbigurl="image/icon2.png"><img src="image/icon2.png" alt=""></div>
							<div class="pt" data-imgbigurl="image/icon3.png"><img src="image/icon3.png" alt=""></div>
							<div class="pt" data-imgbigurl="image/icon4.png"><img src="image/icon4.png" alt=""></div>
						</div>
					</div>
				</div>
                                        <form class="col-lg-6 product-details" method="get" action="CartServlet">
					<h2 class="p-title">${products.getProductID() != null ? products.getProductName() : randomProduct.getProductName()}</h2>
					<h3 class="p-price">$${products.getProductID() != null ? products.getProductPrice() : randomProduct.getProductPrice()}</h3>
					<h4 class="p-stock">Available: <span>In Stock</span></h4>
					<div class="p-rating">
						<i class="fa fa-star-o"></i>
						<i class="fa fa-star-o"></i>
						<i class="fa fa-star-o"></i>
						<i class="fa fa-star-o"></i>
						<i class="fa fa-star-o fa-fade"></i>
					</div>
					<div class="p-review">
						<a href="">3 reviews</a>|<a href="review.jsp">Add your review</a>
					</div>
					<div class="fw-size-choose">
						<p>Number</p>
						<div class="sc-item">
							<input type="radio" name="sc" id="xs-size">
							<label for="xs-size">32</label>
						</div>
						<div class="sc-item">
							<input type="radio" name="sc" id="s-size">
							<label for="s-size">34</label>
						</div>
						<div class="sc-item">
							<input type="radio" name="sc" id="m-size" checked="">
							<label for="m-size">36</label>
						</div>
						<div class="sc-item">
							<input type="radio" name="sc" id="l-size">
							<label for="l-size">38</label>
						</div>
						<div class="sc-item disable">
							<input type="radio" name="sc" id="xl-size" disabled>
							<label for="xl-size">40</label>
						</div>
						<div class="sc-item">
							<input type="radio" name="sc" id="xxl-size">
							<label for="xxl-size">42</label>
						</div>
					</div>
					<div class="quantity">
						<p>Quantity</p>
                                            <div class="pro-qty"><input type="text" name="quantity" value="1"></div>
                                        </div>
                                        
                                        <input type="hidden" name="command" value="numberplus">
                                        <input type="hidden" name="productID" value="${products.getProductID() != null ? products.getProductID() : randomProduct.getProductID()}">
                                        <a href="#" onclick="$(this).closest('form').submit()" class="site-btn">ORDER NOW</a>

					<div id="accordion" class="accordion-area">
						<div class="panel">
							<div class="panel-header" id="headingOne">
								<button class="panel-link active" data-toggle="collapse" data-target="#collapse1" aria-expanded="true" aria-controls="collapse1">information</button>
							</div>
							<div id="collapse1" class="collapse show" aria-labelledby="headingOne" data-parent="#accordion">
								<div class="panel-body">
									<p>${products.getProductID() != null ? products.getProductDescription() : randomProduct.getProductDescription()}</p>
                                                                        <p>Category ID: ${products.getProductID() != null ? products.getCategoryID() : randomProduct.getCategoryID()}</p>
                                                                        <p>Category: ${products.getProductID() != null ? categories.getCategoryName() : randomCategory.getCategoryName()}</p>
									<p>Thanks for ordering</p>
								</div>
							</div>
						</div>
						<div class="panel">
							<div class="panel-header" id="headingTwo">
								<button class="panel-link" data-toggle="collapse" data-target="#collapse2" aria-expanded="false" aria-controls="collapse2">care details </button>
							</div>
							<div id="collapse2" class="collapse" aria-labelledby="headingTwo" data-parent="#accordion">
								<div class="panel-body">
									<img src="./img/cards.png" alt="">
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.</p>
								</div>
							</div>
						</div>
						<div class="panel">
							<div class="panel-header" id="headingThree">
								<button class="panel-link" data-toggle="collapse" data-target="#collapse3" aria-expanded="false" aria-controls="collapse3">shipping & Returns</button>
							</div>
							<div id="collapse3" class="collapse" aria-labelledby="headingThree" data-parent="#accordion">
								<div class="panel-body">
									<h4>7 Days Returns</h4>
									<p>Cash on Delivery Available<br>Home Delivery <span>3 - 4 days</span></p>
									<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin pharetra tempor so dales. Phasellus sagittis auctor gravida. Integer bibendum sodales arcu id te mpus. Ut consectetur lacus leo, non scelerisque nulla euismod nec.</p>
								</div>
							</div>
						</div>
					</div>
					<div class="social-sharing">
						<a href=""><i class="fa fa-google-plus"></i></a>
						<a href=""><i class="fa fa-pinterest"></i></a>
						<a href=""><i class="fa fa-facebook"></i></a>
						<a href=""><i class="fa fa-twitter"></i></a>
						<a href=""><i class="fa fa-youtube"></i></a>
					</div>
				<form>
			</div>
		</div>
	</section>
	<!-- product section end -->


	<!-- RELATED PRODUCTS section -->
	<section class="related-product-section">

		<div class="container">
			<div class="section-title">
				<h2>RELATED PRODUCTS</h2>
			</div>
			<div class="product-slider owl-carousel">
                        <c:forEach var="product" items="${listProducts}">
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
                            </c:forEach>	
			</div>
		</div>
	</section>
	<!-- RELATED PRODUCTS section end -->

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
