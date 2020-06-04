$(function () {
    $("input[type='button']").button();
    $("a").button();
});

function Refer() {
    let logigId = $("input[name='user_id']").val();
    let loginPass = $("input[name='user_password']").val();
    let verifyCode = $("input[name='verifyCode']").val();
    if (validate(logigId, loginPass)) {
        if (verifyCode.length == 4) {
            AjaxTransfer($("#path").val() + "/gate/login", "userLoginId=" + logigId +
                "&userLoginPassword=" + loginPass + "&verifyCode=" + verifyCode, function (mag) {
                if (mag.code == 0) {
                    location.href = $("#path").val() + "/jsp/login_notify.jsp?userNumber=" + mag.data[0].userId +
                        "&userName=" + mag.data[0].userName + "&rank=" + mag.data[0].remark;
                } else {
                    if (confirm(mag.msg)) VerifyShow();//跳转页面
                }
            }, undefined, undefined, "json");
        } else alert("请填入正确的验证码！");
    }
}

function validate(logigId, loginPass) {
    if (logigId == "") {
        alert("请输入账号");
        return false;
    } else {
        if (logigId.length >= 2 && logigId.length < 9) ;
        else {
            alert("账号由2~8大写字母和数字组成");
            return false;
        }
    }
    if (loginPass == "") {
        alert("请输入密码！");
        return false;
    } else {
        if (loginPass.length >= 2 && loginPass.length < 16) ;
        else {
            alert("密码长度为2~15位字符组成！");
            return false;
        }
    }
    return true;
}

function VerifyShow() {//刷新验证码！
    const verify = $("#verify");
    verify.attr("src", verify.attr("src") + "?" + Math.random());
}