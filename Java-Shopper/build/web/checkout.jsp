<%@page import="java.util.Random"%>
<%@page import="java.util.Map"%>
<%@page import="project.two.model.Item"%>
<%@page import="project.two.model.Cart"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zxx">
<head>
	<title>eCommerce</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="description" content="eCommerce">
	<meta name="keywords" content="eCommerce, creative, html">
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
    
    <%
        Random rd = new Random();
        int x = rd.nextInt(100);
    %>
	<!-- Page info -->
	<div class="page-top-info">
		<div class="container">
			<h4>Your cart</h4>
			<div class="site-pagination">
				<a href="">Home</a> /
				<a href="">Your cart</a>
			</div>
		</div>
	</div>
	<!-- Page info end -->


	<!-- checkout section  -->
	<section class="checkout-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 order-2 order-lg-1">
                                    <form class="checkout-form" action="CheckOutServlet" method="post">
						<div class="cf-title">Billing Address</div>
						<div class="row">
							<div class="col-md-7">
								<p>*Billing Information</p>
							</div>
							<div class="col-md-5">
								<div class="cf-radio-btns address-rb">
									<div class="cfr-item">
										<input type="radio" name="pm" id="one">
										<label for="one">Use my regular address</label>
									</div>
									<div class="cfr-item">
										<input type="radio" name="pm" id="two">
										<label for="two">Use a different address</label>
									</div>
								</div>
							</div>
						</div>
						<div class="row address-inputs">
							<div class="col-md-12">
								<input type="text" name="payment" placeholder="Payment">
                                                                <input type="text" name="address" placeholder="Address">
                                                        </div>
							<div class="col-md-6">
								<input type="text" name="name" placeholder="Full name">
							</div>
							<div class="col-md-6">
								<input type="text" name="phone" placeholder="Phone no.">
							</div>
						</div>
                                                <input type="hidden" name="shipping" value=<%=x%>>
                                                <button type="submit" class="site-btn submit-order-btn">Place Order</button>
					</form>
				</div>
				<div class="col-lg-4 order-1 order-lg-2">
					<div class="checkout-cart">
						<h3>Your Cart</h3>
						<ul class="product-list">
						
                                                        <%
                                                               Cart cart = (Cart) session.getAttribute("cart");
                                                                if (cart == null) {
                                                                    cart = new Cart();
                                                                    session.setAttribute("cart", cart);
                                                                }
                                                                %>
                                                        <%for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {%>
                                                    
							<li>
                                                            <div class="pl-thumb"><img src="<%=list.getValue().getProduct().getProductImage()%>" alt=""></div>
								<h6><%=list.getValue().getProduct().getProductName()%></h6>
                                                                <p>Đơn giá: $<%=list.getValue().getProduct().getProductPrice()%></p>
                                                                <p>Số lượng: <%=list.getValue().getQuantity()%></p>
								<p>Tổng tiền: $<%=list.getValue().getProduct().getProductPrice() * list.getValue().getQuantity()%></p>
							</li>
                                                        
                                                        <%}%>
						</ul>
						<ul class="price-list">
							<li>Total<span>$<%=cart.totalCart()%></span></li>
                                                        <li>Shipping<span>$<%=x%></span></li>
							<li class="total">Total<span>$<%=cart.totalCart() + x%></span></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- checkout section end -->


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
