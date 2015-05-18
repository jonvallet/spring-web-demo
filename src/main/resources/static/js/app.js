var app = angular.module('app', []);

app.controller('appCtrl', function ($scope, $http) {

    $scope.error = false
    $scope.errorMessage= "Unknown Error."


    $http.get('/appointments/list').success(function(data) {
        $scope.appointments = data.content
    })

    $scope.create = function (appointment) {
        $http.post("/appointments/create", appointment).success(function(){
            $scope.appointments.push(angular.copy(appointment))
            $scope.appointment = {}
        }).error(function(data){
            $scope.success = false
            $scope.errorMessage=data
            $scope.error=true
        })

    }

});