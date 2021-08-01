<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Map"%>
<%@page import="project.two.model.Item"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="project.two.model.Cart;" %>

<!DOCTYPE html>
<html lang="zxx">
<head>
	<title>eCommerce</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="description" content="eCommerce Template">
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


	<!-- cart section end -->
	<section class="cart-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="cart-table">
						<h3>Your Cart</h3>
						<div class="cart-table-warp">
							<table>
							<thead>
								<tr>
									<th class="product-th">Product</th>
									<th class="quy-th">Quantity</th>
									<th class="size-th">Category</th>
									<th class="total-th">Price</th>
								</tr>
							</thead>
							<tbody>
                                                                <%
                                                                Cart cart = (Cart) session.getAttribute("cart");
                                                                if (cart == null) {
                                                                    cart = new Cart();
                                                                    session.setAttribute("cart", cart);
                                                                }
                                                                %>
                                                        <%for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {%>

								<tr>
									<td class="product-col">
                                                                            <a href="CartServlet?method=get&command=remove&productID=<%=list.getValue().getProduct().getProductID()%>"><img src="<%=list.getValue().getProduct().getProductImage()%>" alt=""></a>
										<div class="pc-title">
											<h4><%=list.getValue().getProduct().getProductName()%></h4>
											<p>$<%=list.getValue().getProduct().getProductPrice()%></p>
										</div>
									</td>
									<td class="quy-col">
										<div class="quantity">
					                        <div class="pro-qty">
												<input type="text" value="<%=list.getValue().getQuantity()%>">
											</div>
                    					</div>
									</td>
									<td class="size-col"><h4><%=list.getValue().getProduct().getCategoryID()%></h4></td>
                                                                        <td class="total-col"><h4><%=list.getValue().getProduct().getProductPrice() * list.getValue().getQuantity()%></h4></td>
								</tr>
                                                        <%}%>
							</tbody>
						</table>
						</div>
						<div class="total-cost">
							<h6>Total <span>$<%=cart.totalCart()%></span></h6>
						</div>
					</div>
				</div>
				<div class="col-lg-4 card-right">
					<form class="promo-code-form">
						<input type="text" placeholder="Enter promo code">
						<button>Submit</button>
					</form>
					<a href="./checkout.jsp" class="site-btn">Proceed to checkout</a>
					<a href="./category.jsp" class="site-btn sb-dark">Continue shopping</a>
				</div>
			</div>
		</div>
	</section>
	<!-- cart section end -->

	<!-- Related product section -->
	<section class="related-product-section">
		<div class="container">
			<div class="section-title text-uppercase">
				<h2>Continue Shopping</h2>
			</div>
			<div class="row">
                        <c:forEach var="product" items="${listProducts}">
				<div class="col-lg-3 col-sm-6">
					<div class="product-item">
						<div class="pi-pic">
							<div class="tag-new">New</div>
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
		</div>
	</section>
	<!-- Related product section end -->




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
