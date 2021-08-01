
<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>eCommerce</title>
    </head>
    <body>
        <!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Header section -->
	<header class="header-section">
		<div class="header-top">
			<div class="container">
				<div class="row">
					<div class="col-lg-2 text-center text-lg-left">
						<!-- logo -->
						<a href="./index.jsp" class="site-logo">
                                                    <h2>FOOD</h2>
						</a>
					</div>
					<div class="col-xl-6 col-lg-5">
                                                <form method="post" action="ProductServlet" class="header-search-form">
							<input type="text" name="character" placeholder="Hello ${user.getUserName()}...">
                                                        <button type="submit"><i class="flaticon-search"></i></button>
						</form>
					</div>
					<div class="col-xl-4 col-lg-5">
						<div class="user-panel">
							<div class="up-item">
								<i class="flaticon-profile"></i>
                                                                <a href="login.jsp">Sign In</a> or <a href="register.jsp">Create Account</a>
							</div>
							<div class="up-item">
								<div class="shopping-card">
									<i class="flaticon-bag"></i>
									<span>${cart != null ? cart.countItem() : 0}</span>
								</div>
								<a href="cart.jsp">Shopping Cart</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
	</header>
	<!-- Header section end -->
    </body>
</html>
