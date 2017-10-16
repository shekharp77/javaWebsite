$(document).ready(function (){
    $('#logout').click(function (){
        var pro=confirm('Are you sure?');
        if(pro==1){
            $.ajax({
                    url:'servlet',
                    type:'get',
                    data:{
                        type:"logout"
                        },
                    success:function(data){
                      
                        window.location.replace("login.html");
                    },
                    error:function(){alert('error');}
                });
        }
    });
    
    $('#myModal').on('shown.bs.modal', function () {
        $('#myInput').focus();
    });

    //=====================================================================================
    $('#name').click(function (){
        $('#name').hide();
        $('#fnchange').append("<input type='text' id='fninput'>");
        $('#fnchange').append("<button id='fnbutton' class='btn btn-secondary btd'>Change fullname</button>");
        $('#fnbutton').click(function (){
        var user=$('#fninput').val();
        var column="fullname";
        if(user!='')
            change(column,user);
        else{
            alert("please enter data");
        }
        });
        
    });
     $('#age').click(function (){
        $('#age').hide();
        $('#fnchange').append("<input type='text' id='fninput'>");
        $('#fnchange').append("<button id='fnbutton' class='btn btn-secondary btd'>Change fullname</button>");
        $('#fnbutton').click(function (){
        var user=$('#fninput').val();
        var column="fullname";
        if(user!='')
            change(column,user);
        else{
            alert("please enter data");
        }
        });
//        var user=prompt("Enter new age");
//        var column="age";
//        if(user!='')
//            change(column,user);
//        else{
//            alert("please enter data");
//        }
    });
     $('#gender').click(function (){
        $('#gender').hide();
        $('#fnchange').append("<input type='text' id='fninput'>");
        $('#fnchange').append("<button id='fnbutton' class='btn btn-secondary btd'>Change fullname</button>");
        $('#fnbutton').click(function (){
        var user=$('#fninput').val();
        var column="fullname";
        if(user!='')
            change(column,user);
        else{
            alert("please enter data");
        }
        });
//        var user=prompt("Enter new gender");
//        var column="gender";
//       if(user!='')
//            change(column,user);
//        else{
//            alert("please enter data");
//        }
    });
     $('#address').click(function (){
        $('#address').hide();
        $('#addchange').append("<input type='text' id='addinput'>");
        $('#addchange').append("<button id='addbutton' class='btn btn-secondary btd'>Change fullname</button>");
        $('#addbutton').click(function (){
        var user=$('#addinput').val();
        var column="address";
        if(user!='')
            change(column,user);
        else{
            alert("please enter data");
        }
        });
//        var user=prompt("Enter new address");
//        var column="address";
//        if(user!='')
//            change(column,user);
//        else{
//            alert("please enter data");
//        }
    });
     $('#email').click(function (){
        $('#email').hide();
        $('#emachange').append("<input type='email' id='emainput'>");
        $('#emachange').append("<button id='emabutton' class='btn btn-secondary btd'>Change fullname</button>");
        $('#emabutton').click(function (){
        var user=$('#emainput').val();
        var column="email";
        if(user!='')
            change(column,user);
        else{
            alert("please enter data");
        }
        });
    });
    
    function change(sub,data){
        $.ajax({
                    url:'servlet',
                    type:'get',
                    data:{
                        type:"update",
                        subject:sub,
                        data:data
                        },
                    success:function(data){
                        
                        if(data=="changed"){
                          window.location.replace("profilejsp.jsp");  
                        }
                    },
                    error:function(){alert('error');}
                });
    }
   


    
});

