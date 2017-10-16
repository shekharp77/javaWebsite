$(document).ready(function (){
    $('#login').click(function (){
        var username=$('#una').val();
        var password=$('#pww').val();
        $.ajax({    
                    url:'servlet',
                    type:'get',
                    data:{
                        type:"login",
                        user:username,
                        pass:password
                        },
                    success:function(data){
           
                        if(data==="WELCOME"){
                            window.location.replace("profilejsp.jsp");
                        }
                    },
                    error:function(){alert('error');}
                });
    });
});