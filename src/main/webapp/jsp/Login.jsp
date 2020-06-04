<%--
  Created by IntelliJ IDEA.
  User: 32127
  Date: 2020/5/8
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String userLoginId = request.getParameter("userLoginId");
    try {
        String[] da = userLoginId.split(":");
        userLoginId = da[1];
    } catch (Exception e) {
    }
    if (userLoginId == null) userLoginId = "";
%>
<html>
<head>
    <meta charset="utf-8">
    <title>文件共享系统</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <script type="text/javascript" src="<%=path+"/toolBox/h-ui/static/h-ui/js/H-ui.js"%>"></script>
    <link href="<%=path+"/toolBox/h-ui/static/h-ui/css/H-ui.css"%>" rel="stylesheet" type="text/css"/>
    <link href="<%=path+"/toolBox/h-ui/lib/Hui-iconfont/1.0.8/iconfont.css"%>" rel="stylesheet" type="text/css"/>

    <script src="<%=path+"/toolBox/custom_tool.js"%>" type="text/javascript"></script>
    <script src="<%=path+"/js/Login.js"%>"></script>
    <link rel="stylesheet" href=<%=path+"/css/Login.css"%>>
</head>
<body background="<%=path+"/image/loginBack.png"%>">
<input type="hidden" value="<%=path%>" id="path">
<div id="messageArea">
    <h2 class="f-30 c-blue .va-m">文件共享系统登录</h2>
    <p><input type="text" value="<%=userLoginId%>" name="user_id" placeholder="请输入你的账号" class="message"></p>
    <p><input type="password" value="" name="user_password" placeholder="请输入你的密码" class="message"></p>
    <p>
    <td><input type="text" value="" name="verifyCode" placeholder="请输入右图的验证码"></td>
    <td><img height="40px" id="verify" onclick="VerifyShow()" src=<%=path+"/tool/getCaptcha"%>></td>
    </p>
    <p><label class="btn btn-primary radius .va-m size-M" onclick="Refer()">提交</label></p>
    <a href="<%=path+"/tool/advanceRegister"%>" id="regA" class="c-red">注册</a>
</div>
</body>
</html>
