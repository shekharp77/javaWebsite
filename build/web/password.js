$(document).ready(function (){
     var newpass1;
     var newpass2;
   
    $('#newpass1').focusout(function () {
        newpass1=$('#newpass1').val();
    });
    $('#newpass2').keyup(function () {
        newpass2=$('#newpass2').val();
      if(newpass1!=""){  
        if(newpass1==newpass2){
            $('#u').html("Password Matched");
            $('#u').css({'color':'#05fc05'});
        }
        else if(newpass1!=newpass2){
            $('#u').html("Password not Matched");
            $('#u').css({'color':'red'});
        }
        else{
            $('#u').html("Password not Matched");
            $('#u').css({'color':'red'});
        }
    }
    });
    //======================================================
    $('#newpass2').focusout(function () {
        newpass1=$('#newpass1').val();
    });
    $('#newpass1').keyup(function () {
        newpass2=$('#newpass1').val();
        if(newpass1!=""){ 
        if(newpass1==newpass2){
            $('#u').html("Password Matched");
            $('#u').css({'color':'#05fc05'});
        }
        else if(newpass1!=newpass2){
            $('#u').html("Password not Matched");
            $('#u').css({'color':'red'});
        }
        else{
            $('#u').html("Password not Matched");
            $('#u').css({'color':'red'});
        }
    }
    });
    $('#changepass').click(function (){
        var oldpass=$('#oldpass').val();
        if(oldpass!="" && newpass1!="" && newpass1!=""){
        $.ajax({
                    url:'servlet',
                    type:'get',
                    data:{
                        type:"change",
                        oldpassword:oldpass,
                        newpassword:newpass2
                        },
                    success:function(data){
                       
                        if(data=="changed"){
                            window.location.replace("profilejsp.jsp");
                        }
                        else if(data=="not"){
                            
                        }
                    },
                    error:function(){alert('error');}
                });
            }
            else{
                $('#un').html("Enter data in all fields");
                $('#un').css({'color':'red'});
            }
    });
});

function nospaces(t){
  if(t.value.match(/\s/g)){
    t.value=t.value.replace(/\s/g,'');
  }
}

