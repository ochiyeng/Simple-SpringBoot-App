$(function () {

        let initChat = function(){
            //load messages
            //load users
            alert('yes');
        };

        let authUser = function(){
            let name = prompt("Enter the userName: ");
            $.post('api/users', {'name': name}, function (response) {
                if (response.result){
                    initChat();
                }else {
                    alert('Something went wrong  :( ');
                }
        });
        };

        let checkAuthStatus = function () {
            $.get('/api/auth', function (response) {
                if (response.result){
                    initChat();
                }else {
                    authUser();
                }
            });
        };
        checkAuthStatus();
});