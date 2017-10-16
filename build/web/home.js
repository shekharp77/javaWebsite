$(document).ready(function (){
    
    $('#good').click(function (){
        var good,bad;
        good=$('#good').html();
        good++;
        $('#good').html(good);
        $('#good').die();
    });
    $('#bad').click(function (){
        good=$('#bad').html();
        good++;
        $('#bad').html(good);
    });
    
});

