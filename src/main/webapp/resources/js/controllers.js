var cartApp = angular.module('cartApp', []);

cartApp.controller('cartCtrl', function($scope, $http){
    $scope.refreshCart = function(){
        $http.get('/ecommerce/rest/order/'+$scope.orderId)
                .success(function(data){
                    $scope.order = data;
        });
    };
    
    $scope.clearCart = function(){
        $http.delete('/ecommerce/rest/order/'+$scope.orderId)
                .success($scope.refreshCart());
    };
    
    $scope.initCartId = function(orderId){
        $scope.orderId = orderId;
        $scope.refreshCart($scope.orderId);
    };
    
    $scope.addToCart = function (productId){
        $http.put('/ecommerce/rest/order/add/'+productId)
                .success(function (){
                    alert ("Product Successfully added to the Cart!");
                });
    };
    
    $scope.removeFromCart = function(productId){
        $http.put('/ecommerce/rest/order/remove/'+productId)
                .success(function (){
                    $scope.refreshCart();
        });
    };
});