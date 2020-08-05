$(".txtb input").focus(function(){
    $(this).removeClass("error_focus");
    $(this).addClass("focus");
});
$(".txtb input").blur(function(){
    if($(this).val() == ''){ /* If there is a word, it will not fall */
        $(this).removeClass("focus");
        $(this).removeClass("error_focus");
    }
});
$(document).ready(function(){
    $(this).attr('text','');
});
function check() {
    let username = $("#username").val();
    let password = $("#password").val();
    var flag;
    if (username === ''){
        $("#username").addClass("error_focus");
        return false;
    } else if (password === ''){
        $("#password").addClass("error_focus");
        return false;
    } else {
        flag = false;
        $.post("/admin/check", {username:username, password:password}, function (data) {
            $.ajaxSettings.async = false;
            if (data !== '') {
                $('.bottom-text').empty();
                $('.bottom-text').append("<div class='error' style='color: red'>" + data + "</div>");
                flag = false;
            } else {
                flag = true;
            }
        });
        return flag;
    }
}
