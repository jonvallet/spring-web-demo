var app = angular.module('app', []);

app.controller('appCtrl', function ($scope, $http) {


    $http.get('/appointments/list').success(function(data) {
        $scope.appointments = data
    })

    $scope.appointments = {"content":[{"description":"lol","date":1335205543511},{"description":"lol","date":1335205543511}],"last":true,"totalPages":1,"totalElements":2,"sort":null,"first":true,"numberOfElements":2,"size":20,"number":0}

});