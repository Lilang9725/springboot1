let genders = true;
$(function () {
    if ($(".init").val()) $("#toServerGet").submit();
})

function GoBack() {
    location.href = $("#path").val() + "/jsp/Login.jsp"
}

function ToServlet() {
    if (genders) $("input[name='gender']").attr("value", "男");
    else $("input[name='gender']").attr("value", "女");
    if (validate()) {
        AjaxTransfer($("#path").val() + "/gate/register", "userName=" + $("input[name = 'name']").val()
            + "&userLoginPassword=" + $("input[name = 'pass']").val() + "&userGender=" + $("input[name = 'gender']").val() + "&educationId=" + $("#education").val() + "&professionId=" + $("#profession").val() + "&mobile=" +
            $("input[name = 'mobile']").val() + "&eMail=" + $("input[name = 'email']").val(), function (mag) {
            if (confirm(mag.msg + "\n是否返回登录界面"))
                location.href = $("#path").val() + "/jsp/Login.jsp?userLoginId=" + mag.msg;
        }, undefined, undefined, "json");
    }

}

function validate() {
    return $("#toServer").validate({
        //把错误信息统一放在一个容器里面。
        errorLabelContainer: "#errorNotify",
        //用什么标签再把上边的 errorELement 包起来。
        wrapper: "li",
        rules: {
            name: {
                required: true,
                rangelength: [2, 8]
            },
            pass: {
                required: true,
                rangelength: [2, 15]
            },
            pass2: {
                required: true,
                rangelength: function () {
                    if ($("input[name='pass2']").val() != "") {
                        if ($("input[name='pass']").val() == $("input[name='pass2']").val()) ;
                        else return false;
                    }
                }
            },
            mobile: {
                required: true,
                rangelength: function () {
                    let mobiles = $("input[name='mobile']").val()
                    if (number.test(mobiles) && mobiles.length == 11) ;
                    else return false;
                }
            }
        },
        messages: {
            name: {
                required: "*请输入用户名",
                rangelength: "*长度2到8个字符"
            }, pass: {
                required: "*请输入密码",
                rangelength: "*长度2到15个字符"
            }, pass2: {
                required: "*请再次确认密码",
                rangelength: "*请保证前后密码一致"
            }, mobile: {
                required: "*请输入手机号",
                rangelength: "*手机号码为11位纯数字"
            }
        }
    }).form();
}

function Gender(gender) {
    genders = gender;
    $("#boy").attr("checked", gender);
    $("#girl").attr("checked", !gender);
}