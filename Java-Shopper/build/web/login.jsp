

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Login</title>
  <link rel="stylesheet" href="css/user.css">
</head>

<body>
  <jsp:include page="_header.jsp"></jsp:include>
  <jsp:include page="_menu.jsp"></jsp:include>
  <!-- Hero section -->
  <section class="login">
    <div class="container">
      <form class="box" action="UserServlet" method="post">
        <%if(request.getParameter("error")!=null){%>
        <div>
          <p style="color:red"><%=request.getParameter("error")%></p>
        </div>
        <% } %>
        
        <h1>Login</h1>
        <h6 style="color: red">${error}</h6>
        <input type="text" name="name" placeholder="Username">
        <input type="password" name="pass" placeholder="Password">
        <input type="submit" name="command" value="Login">
      </form>
    </div>
  </section>
  <jsp:include page="_footer.jsp"></jsp:include>
</body>

</html>