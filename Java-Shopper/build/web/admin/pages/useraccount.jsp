<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Startmin - Bootstrap Admin Theme</title>

        <!-- Bootstrap Core CSS -->
        <link href="${pageContext.request.contextPath}/admin/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="${pageContext.request.contextPath}/admin/css/metisMenu.min.css" rel="stylesheet">

        <!-- DataTables CSS -->
        <link href="${pageContext.request.contextPath}/admin/css/dataTables/dataTables.bootstrap.css" rel="stylesheet">

        <!-- DataTables Responsive CSS -->
        <link href="${pageContext.request.contextPath}/admin/css/dataTables/dataTables.responsive.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="${pageContext.request.contextPath}/admin/css/startmin.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="${pageContext.request.contextPath}/admin/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <jsp:include page="_reUse.jsp"></jsp:include>

<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">Tables</h1>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    DataTables Advanced Tables
                                </div>
                                <!-- /.panel-heading -->
                                <div class="panel-body">
                                    <div class="table-responsive">
                                        <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                            <thead>
                                                <tr>
                                                    <th>User ID</th>
                                                    <th>Name</th>
                                                    <th>Email</th>
                                                    <th>Password</th>
                                                    <th>Role</th>
                                                    <th>Add User</th>
                                                    <th>Edit User</th>
                                                    <th>Delete User</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach var="user" items="${listUsers}">
                                                <tr class="odd gradeA">
                                                    <td>${user.getUserID()}</td>
                                                    <td>${user.getUserName()}</td>
                                                    <td>${user.getUserEmail()}</td>
                                                    <td class="center">${user.getUserPass()}</td>
                                                    <td class="center">${user.isUserRole()}</td>
                                                    <td><a href="${pageContext.request.contextPath}/AdminUserAccountServlet?method=get&command=add">Add</a></td>
                                                    <td><a href="${pageContext.request.contextPath}/AdminUserAccountServlet?method=get&userID=${user.getUserID()}&command=edit">Edit</a></td>
                                                    <td><a href="${pageContext.request.contextPath}/AdminUserAccountServlet?method=get&userID=${user.getUserID()}&command=delete">Delete</a></td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                    <!-- /.table-responsive -->
                                </div>
                                    <!-- jQuery -->
        <script src="${pageContext.request.contextPath}/admin/js/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="${pageContext.request.contextPath}/admin/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="${pageContext.request.contextPath}/admin/js/metisMenu.min.js"></script>

        <!-- DataTables JavaScript -->
        <script src="${pageContext.request.contextPath}/admin/js/dataTables/jquery.dataTables.min.js"></script>
        <script src="${pageContext.request.contextPath}/admin/js/dataTables/dataTables.bootstrap.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="${pageContext.request.contextPath}/admin/js/startmin.js"></script>

        <!-- Page-Level Demo Scripts - Tables - Use for reference -->
        <script>
            $(document).ready(function() {
                $('#dataTables-example').DataTable({
                        responsive: true
                });
            });
        </script>

    </body>
</html>
