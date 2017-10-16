$(document).ready(function() {
    $('#recover').click(function() {
        var user=$('#email').val();
       
                $.ajax({
                    url:'servlet',
                    type:'get',
                    data:{
                        type:"email",
                        username:user
                        },
                    success:function(data){
                       ;
                        if(data=="sent"){
                            window.location.replace("login.html");
                        }
                        else if(data=="not"){
                            
                        }
                    },
                    error:function(){alert('error');}
                });
    });
});