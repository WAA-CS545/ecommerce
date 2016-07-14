var cartApp = angular.module('cartApp', []);

cartApp.controller('cartCtrl', function($scope, $http){
    $scope.refreshCart = function(){
        $http.get('/com.cs545.ecommerce/rest/order/'+$scope.cartId)
                .success(function(data){
                    $scope.cart = data;
        });
    };
    
    $scope.clearCart = function(){
        $http.delete('/com.cs545.ecommerce/rest/order/'+$scope.cartId)
                .sucess($scope.refreshCart());
    };
    
    $scope.initCartId = function(cartId){
        $scope.cartId = cartId;
        $scope.refreshCart($scope.cartId);
    };
    
    $scope.addToCart = function (productId){
        $http.put('/com.cs545.ecommerce/rest/order/add/'+productId)
                .success(function (){
                    alert ("Product Successfully added to the Cart!");
                });
    };
    
    $scope.removeFromCart = function(productId){
        $http.put('/com.cs545.ecommerce/rest/order/remove/'+productId)
                .success(function (){
                    $scope.refreshCart();
        });
    };
});