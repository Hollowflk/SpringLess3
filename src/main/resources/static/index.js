angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8080/app';

    $scope.loadProducts = function () {
        $http.get(contextPath + '/product/all')
            .then(function (response) {
                $scope.productList = response.data;
            });
    };

    $scope.changeCoast = function (productId, coast){
        $http({
            url: contextPath + '/product/change_coast',
            method: 'GET',
            params: {
                productId: productId,
                coast: coast
            }
        }).then(function (response){
            $scope.loadProducts();
        });
    };

    $scope.loadProducts();

});