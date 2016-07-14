<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Mattress A Ecommerce Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>

<link href='<spring:url value="/resource/css/bootstrap.css" htmlEscape="true"/>' rel='stylesheet' type='text/css'/>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<spring:url value='/resource/js/jquery.min.js' /> "></script>
<link rel="stylesheet"
          href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
<script src = "<spring:url value='/resource/js/controllers.js'/>"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href='<spring:url value="/resource/css/style.css" htmlEscape="true" />' rel='stylesheet' type='text/css' />
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
<link href="<spring:url value='/resource/css/memenu.css' /> " rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src='<spring:url value="/resource/js/memenu.js" /> ' ></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="<spring:url value='/resource/js/simpleCart.min.js' /> " > </script>
</head>
<body>
<div class="header">
<jsp:include page="../templates/header.jsp"/>
</div>
    <section>
      <div class="jumbotron">
        <div class="container">
          <h1>Cart</h1>
          <p>All the selected products in your cart</p>
        </div>
      </div>
    </section>

    <section class="container" ng-app="cartApp">
      <div ng-controller="cartCtrl" ng-init="initCartId('${orderId}')">

        <div>
          <a class="btn btn-danger pull-left"
             ng-click="clearCart()"> <span
              class="glyphicon glyphicon-remove-sign"></span> Clear Cart
          </a> <a href="#" class="btn btn-success pull-right"> <span
              class="glyphicon-shopping-cart glyphicon"></span> Check out
          </a>
        </div>
        <table class="table table-hover">
          <tr>
            <th>Product</th>
            <th>Unit price</th>
            <th>Quantity</th>
            <th>Price</th>
            <th>Action</th>
          </tr>
          <tr ng-repeat="item in order.orderItems">
            <td>{{item.product.productId}}-{{item.product.productName}}</td>
            <td>{{item.product.unitPrice}}</td>
            <td>{{item.quantity}}</td>
            <td>{{item.totalPrice}}</td>
            <td><a href="#" class="label label-danger" ng-click="removeFromCart(item.product.productId)"> <span
                  class="glyphicon glyphicon-remove" /></span> Remove
              </a></td>
          </tr>
          <tr>
            <th></th>
            <th></th>
            <th>Grand Total</th>
            <th>{{order.orderPrice}}</th>
            <th></th>
          </tr>
        </table>

        <a href="<spring:url value="/home" />" class="btn btn-default">
          <span class="glyphicon-hand-left glyphicon"></span> Continue shopping
        </a>
      </div>
    </section>
    <p>&nbsp;</p>
    <div class="footer">    
<jsp:include page="../templates/footer.jsp"/>
</div>
</body>
</html>
 