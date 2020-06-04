$(function () {
    try {
        if ($("#isUser").val()) $("#goFlushDate").submit();
    } catch (e) {
    }
    let status = $("#status").val();
    HideOrShow($("#manage"), !(status == "manage"));
    HideOrShow($("#notManage"), status == "manage");
})
jQuery.Huifold = function (obj, obj_c, speed, obj_type, Event) {/*菜单功能函数2*/
    if (obj_type == 2) {
        $(obj + ":first").find("b").html("-");
        $(obj_c + ":first").show()
    }
    $(obj).bind(Event, function () {
        if ($(this).next().is(":visible")) {
            if (obj_type == 2) {
                return false
            } else {
                $(this).next().slideUp(speed).end().removeClass("selected");
                $(this).find("b").html("▼")
            }
        } else {
            if (obj_type == 3) {
                $(this).next().slideDown(speed).end().addClass("selected");
                $(this).find("b").html("▲")
            } else {
                $(obj_c).slideUp(speed);
                $(obj).removeClass("selected");
                $(obj).find("b").html("▼");
                $(this).next().slideDown(speed).end().addClass("selected");
                $(this).find("b").html("▲")
            }
        }
    })
};/*菜单功能函数2*/
$(function () {/*菜单功能函数1*/
    $.Huifold("#Huifold1 .item h4", "#Huifold1 .item .info", "fast", 1, "click"); /*5个参数顺序不可打乱，分别是：相应区,隐藏显示的内容,速度,类型,事件*/
});
let ss = true;

function userOperation(order) {
    $("#modal-demo").modal("show");//打开界面
    let actionContent = $("#actionContent");
    actionContent.attr("src", $("#path").val() + "/jsp/" + order + ".jsp");
}

function EnterFunction(mid) {//菜单栏跳转
    $("#content").attr("src", $("#menu-2-" + mid).val());
}

function testMethod() {
    $("#test").submit();
}

function flushThisView() {
    $("#reload").submit();
}