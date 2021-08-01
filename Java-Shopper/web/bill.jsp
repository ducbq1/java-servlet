<%@page import="project.two.utils.BillDetailGet"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Map"%>
<%@page import="project.two.model.Item"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="project.two.model.Cart;" %>


<!DOCTYPE html>
<html lang="en">

<head>
  <title>Bill History</title>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!--===============================================================================================-->
  <link rel="icon" type="image/png" href="images/icons/favicon.ico" />
  <!--===============================================================================================-->
  <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
  <!--===============================================================================================-->
  <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
  <!--===============================================================================================-->
  <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
  <!--===============================================================================================-->
  <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
  <!--===============================================================================================-->
  <link rel="stylesheet" type="text/css" href="vendor/perfect-scrollbar/perfect-scrollbar.css">
  <!--===============================================================================================-->
  <link rel="stylesheet" type="text/css" href="css/util.css">
  <link rel="stylesheet" type="text/css" href="css/main.css">
  <!--===============================================================================================-->
</head>

<body>
 <jsp:include page="_header.jsp"></jsp:include>
    <jsp:include page="_menu.jsp"></jsp:include>
  <div class="limiter">
    <div class="container-table100">
      <div class="wrap-table100">

        <div class="table100 ver3 m-b-110">
          <div class="table100-head">
            <table>
              <thead>
                <tr class="row100 head">
                  <th class="cell100 column1">Bill ID</th>
                  <th class="cell100 column2">User ID</th>
                  <th class="cell100 column3">Total Payment</th>
                  <th class="cell100 column4">Address</th>
                  <th class="cell100 column5">Date</th>
                </tr>
              </thead>
            </table>
          </div>

          <div class="table100-body js-pscroll">
            <table>
              <tbody>
              <c:forEach var="billDAO" items="${bill}">
                <tr class="row100 body">
                  <td class="cell100 column1">${billDAO.getBillID()}</td>
                  <td class="cell100 column2">${billDAO.getUserID()}</td>
                  <td class="cell100 column3">${billDAO.getTotal()}</td>
                  <td class="cell100 column4">${billDAO.getAddress()}</td>
                  <td class="cell100 column5">${billDAO.getDate()}</td>
                </tr>
              </c:forEach>
              </tbody>
            </table>
          </div>
        </div>

      </div>
    </div>
  </div>


  <!--===============================================================================================-->
  <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
  <!--===============================================================================================-->
  <script src="vendor/bootstrap/js/popper.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
  <!--===============================================================================================-->
  <script src="vendor/select2/select2.min.js"></script>
  <!--===============================================================================================-->
  <script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
  <script>
    $('.js-pscroll').each(function() {
      var ps = new PerfectScrollbar(this);

      $(window).on('resize', function() {
        ps.update();
      })
    });
  </script>
  <!--===============================================================================================-->
  <script src="js/main.js"></script>
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