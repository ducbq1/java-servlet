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
        <link href="../css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="../css/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="../css/startmin.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="../css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <jsp:include page="_reUse.jsp"></jsp:include>
        <div id="wrapper">



<div id="page-wrapper">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12">
                            <h1 class="page-header">Forms</h1>
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    Basic Form Elements
                                </div>
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-lg-6">
                                            <form role="form" method="post" action="FileUploadServlet" enctype="multipart/form-data">
                                                
                                                <div class="form-group">
                                                        <label>Category</label>
                                                        <select class="form-control" name="categoryID">
                                                        <c:forEach var="category" items="${listCategories}">
                                                            <option value="${category.getCategoryID()}">${category.getCategoryName()}</option>
                                                        </c:forEach>
                                                        </select>
                                                </div>
                                                <div class="form-group">
                                                    <label>Product Name</label>
                                                    <input class="form-control" placeholder="Enter text" name="productname" type="text">
                                                </div>
                                                <div class="form-group">
                                                    <label>Product Price</label>
                                                    <input class="form-control" placeholder="Enter text" name="productprice" type="text">
                                                </div>
                                                <div class="form-group">
                                                    <label>Product Image</label>
                                                    <input type="file" name="file" id="file">
                                                </div>
                                                <div class="form-group">
                                                    <label>Destination</label>
                                                    <input class="form-control" placeholder="Enter text" type="text" value="/home/dansharithm/NetBeansProjects/project_one_webNewbie/web/image" name="destination">
                                                </div>
                                                <div class="form-group">
                                                    <label>Product Description</label>
                                                    <textarea class="form-control" rows="3" name="productdescription" type="text"></textarea>
                                                </div>
                                                <button type="submit" class="btn btn-default" value="Upload" name="upload" id="upload">Submit Button</button>

                                            </form>
                                        </div>
                                        
                                        </div>
                                    <!-- /.row (nested) -->
                                </div>
                                <!-- /.panel-body -->
                            </div>
                            <!-- /.panel -->
                        </div>
                        <!-- /.col-lg-12 -->
                    </div>
                    <!-- /.row -->
                </div>
                <!-- /.container-fluid -->
            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="../js/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="../js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="../js/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="../js/startmin.js"></script>

    </body>
</html>