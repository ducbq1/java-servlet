
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>JSP Page</title>
        <meta charset="UTF-8">
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
<!-- Header section -->
	<header class="header-section">
	<nav class="main-navbar">
			<div class="container">
				<!-- menu -->
				<ul class="main-menu">
					<li><a href="index.jsp">Home</a></li>
					<li><a href="./product.jsp">Product
						<span class="new">New</span>
					</a></li>
					<li><a href="#">Pages</a>
						<ul class="sub-menu">
							<li><a href="./product.jsp">Product Page</a></li>
							<li><a href="./category.jsp">Category Page</a></li>
							<li><a href="./cart.jsp">Cart Page</a></li>
							<li><a href="CheckOutServlet">Checkout Page</a></li>
							<li><a href="./contact.jsp">Contact Page</a></li>
						</ul>
					</li>
					<li><a href="./about.jsp">About</a></li>
                                        <li><a href="BillServlet">History of bill</a></li>
                                        <li><a href="UserServlet?method=get">Log Out</a></li>
				</ul>
			</div>
		</nav>
        </header>

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