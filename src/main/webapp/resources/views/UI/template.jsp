<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Mattress A Ecommerce Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>

<link href='/ecom/src/main/webapp/WEB-INF/views/UI/css/bootstrap.css' rel='stylesheet' type='text/css'/>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/ecom/src/main/webapp/WEB-INF/views/UI/js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href='/ecom/src/main/webapp/WEB-INF/views/UI/css/style.css' rel='stylesheet' type='text/css' />
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Mattress Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='//fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'><!--//fonts-->
<!-- start menu -->
<link href="/ecom/src/main/webapp/WEB-INF/views/UI/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="/ecom/src/main/webapp/WEB-INF/views/UI/js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="/ecom/src/main/webapp/WEB-INF/views/UI/js/simpleCart.min.js"> </script>
</head>
<body>
<div class="header">
<jsp:include page="templates/header.jsp"/>
</div>
<jsp:include page="${pageToRender}"/>
<div class="footer">
<jsp:include page="templates/footer.jsp"/>
</div>
</body>
</html>