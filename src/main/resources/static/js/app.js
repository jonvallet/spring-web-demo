var app = angular.module('app', []);

app.controller('appCtrl', function ($scope, $http) {


    $http.get('/appointments/list').success(function(data) {
        $scope.appointments = data.content
    })

    $scope.create = function (appointment) {
        $http.post("/appointments/create", appointment).success(function(){
            $scope.appointments.push(angular.copy(appointment))
        }).error(function(data){
            window.alert("There was an error: "+data)
        })

    }

});