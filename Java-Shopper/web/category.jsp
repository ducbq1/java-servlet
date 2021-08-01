<%@page import="project.two.model.Category"%>
<%@page import="project.two.utils.CategoryGet"%>
<%@page import="project.two.utils.ProductGet"%>
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
			<h4>CAtegory PAge</h4>
			<div class="site-pagination">
				<a href="">Home</a> /
				<a href="">Shop</a> /
			</div>
		</div>
	</div>
	<!-- Page info end -->


	<!-- Category section -->
	<section class="category-section spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 order-2 order-lg-1">
					<div class="filter-widget">
						<h2 class="fw-title">Categories</h2>
						<ul class="category-menu">
                                                
							<li><a href="#">Tìm kiếm theo danh mục</a>
								<ul class="sub-menu">
                                                                    <%
                                                                    ProductGet product = new ProductGet();
                                                                    CategoryGet category = new CategoryGet();
                                                                    %>
                                                                    <%for (Category rs: category.getListCategory()) {%>
                                                                    <li><a href="CategoryServlet?method=get&categoryID=<%=rs.getCategoryID()%>"><%=rs.getCategoryName()%><span>(<%=product.countProductByCategory(rs.getCategoryID())%>)</span></a></li>
                                                                    <%}%>
								</ul>
							</li>
                                                        
                                                        <li><a href="#">Tìm kiếm theo...</a>
								<ul class="sub-menu">
									<li><a href="#">Từ khóa<span>(34)</span></a></li>
									<li><a href="#">Loại thực phẩm<span>(7)</span></a></li>
									<li><a href="#">Giá tiền<span>(5)</span></a></li>
								</ul>
							</li>
                                               
						</ul>
					</div>
					<div class="filter-widget mb-0">
						<h2 class="fw-title">refine by</h2>
						<div class="price-range-wrap">
							<h4>Price</h4>
                            <div class="price-range ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content" data-min="10" data-max="270">
								<div class="ui-slider-range ui-corner-all ui-widget-header" style="left: 0%; width: 100%;"></div>
								<span tabindex="0" class="ui-slider-handle ui-corner-all ui-state-default" style="left: 0%;">
								</span>
								<span tabindex="0" class="ui-slider-handle ui-corner-all ui-state-default" style="left: 100%;">
								</span>
							</div>
							<div class="range-slider">
                                <div class="price-input">
                                    <input type="text" id="minamount">
                                    <input type="text" id="maxamount">
                                </div>
                            </div>
                        </div>
					</div>
					<div class="filter-widget mb-0">
						<h2 class="fw-title">color by</h2>
						<div class="fw-color-choose">
							<div class="cs-item">
								<input type="radio" name="cs" id="gray-color">
								<label class="cs-gray" for="gray-color">
									<span>(3)</span>
								</label>
							</div>
							<div class="cs-item">
								<input type="radio" name="cs" id="orange-color">
								<label class="cs-orange" for="orange-color">
									<span>(25)</span>
								</label>
							</div>
							<div class="cs-item">
								<input type="radio" name="cs" id="yollow-color">
								<label class="cs-yollow" for="yollow-color">
									<span>(112)</span>
								</label>
							</div>
							<div class="cs-item">
								<input type="radio" name="cs" id="green-color">
								<label class="cs-green" for="green-color">
									<span>(75)</span>
								</label>
							</div>
							<div class="cs-item">
								<input type="radio" name="cs" id="purple-color">
								<label class="cs-purple" for="purple-color">
									<span>(9)</span>
								</label>
							</div>
							<div class="cs-item">
								<input type="radio" name="cs" id="blue-color" checked="">
								<label class="cs-blue" for="blue-color">
									<span>(29)</span>
								</label>
							</div>
						</div>
					</div>
					
				</div>

				<div class="col-lg-9  order-1 order-lg-2 mb-5 mb-lg-0">
                                    <form class="row" method="get" action="category.jsp" id="form1">
                                            
                                        <%
                                        String rs = request.getParameter("rs");
                                        if (rs==null) {
                                            request.setAttribute("rs", null);
                                        } else {
                                            request.setAttribute("rs", rs);
                                        }
                                        %>
                                        
                                        <c:forEach var="product" items="${rs != null ? listProducts : listProductCategories != null ? listProductCategories : listProductCharacter != null ? listProductCharacter : list6Products}">
						<div class="col-lg-4 col-sm-6">
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
						<div class="text-center w-100 pt-3">
                                                    <button class="site-btn sb-line sb-dark" type="submit" value="submit" name="rs" method="get" form="form1">LOAD MORE</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- Category section end -->


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
