$(document).ready(function (){
    $('#signup').click(function (){
        var name=$('#un').val();
        var age=$('#age').val();
        var gen=$('#gen').val();
        var email=$('#email').val();
        var add=$('#add').val();
        $.ajax({
                    url:'servlet',
                    type:'get',
                    data:{
                        type:"setup",
                        fullname:name,
                        age:age,
                        gen:gen,
                        email:email,
                        add:add
                        },
                        success:function(data){
                            
                            if(data=="signinsc"){
                               
                                window.location.replace("profilejsp.jsp");
                        }
                    },
                    error:function(){alert('error');}
                });
    });
    
});

