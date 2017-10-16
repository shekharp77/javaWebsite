$(document).ready(function (){
    $('#signup').click(function (){
        var user=$('#un').val();
        var pass1=$('#pw1').val();
        var pass2=$('#pw2').val();
        if(user!==null){
            if(pass1===pass2){
                $.ajax({
                    url:'servlet',
                    type:'get',
                    data:{
                        type:"signup",
                        username:user,
                        password:pass1
                        },
                    success:function(data){
                      
                        if(data=="SIGNUP SUCCESS")
                            window.location.replace("setupAccount.html");
                    },
                    error:function(){alert('error');}
                });
               
            }else {
            alert("password not matching");
        }
            
        }
        else {
            alert("Enter username");
        }       
    });
//====================================================================================================
    $('#un').keyup(function (){
        var user=$('#un').val();
            if(user!=""){
                $.ajax({
                    url:'servlet',
                    type:'get',
                    data:{
                        type:"username",
                        username:user
                        },
                    success:function(data){
                        if(data=="Available"){
                            $('#u').html("Username Available");
                            $('#u').css({'color':'#05fc05'});
                        }
                        else if(data=="not"){
                            $('#u').html("Username NOT Available");
                            $('#u').css({'color':'red'});
                        }
                    },
                    error:function(){alert('error');}
                });
            }    
            $('#u').html("Please choose a Username");
            $('#u').css({'color':'red'});
    });
    
    $(window).bind("beforeunload", function() { 
        confirm("Close?"); 
});
});



function nospaces(t){
  if(t.value.match(/\s/g)){
    t.value=t.value.replace(/\s/g,'');
  }
 }
 
 
