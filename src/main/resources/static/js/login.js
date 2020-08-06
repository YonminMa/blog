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
    if (username === ''){
        $("#username").addClass("error_focus");
        return false;
    } else if (password === ''){
        $("#password").addClass("error_focus");
        return false;
    } else {
        $.ajaxSettings.async = false;
        let flag;
        $.post("/admin/check", {username:username, password:password}, function (data) {
            if (data !== '') {
                $('.bottom-text').empty();
                $('.bottom-text').append(data);
                flag = false;
            } else {
                flag = true;
            }
        });
        return flag;
    }
}
