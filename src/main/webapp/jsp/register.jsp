<%--
  Created by IntelliJ IDEA.
  User: 32127
  Date: 2020/5/10
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>注册</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <script src="<%=path+"/toolBox/h-ui/static/h-ui/js/H-ui.js"%>" type="text/javascript"></script>
    <%--    <link href="<%=path+"/front/h-ui/static/h-ui/css/H-ui.css"%>" rel="stylesheet" type="text/css" />--%>
    <link href="<%=path+"/toolBox/h-ui/lib/Hui-iconfont/1.0.8/iconfont.css"%>" rel="stylesheet" type="text/css"/>

    <script src="<%=path+"/toolBox/custom_tool.js"%>" type="text/javascript"></script>
    <script src="<%=path+"/js/register.js"%>"></script>
    <link rel="stylesheet" href=<%=path+"/css/register.css"%>>
</head>
<body>
<input type="hidden" value="<%=path%>" id="path">
<c:if test="${profession eq null}">
    <form action="<%=path+"/tool/advanceRegister"%>" method="get" id="toServerGet">
        <input type="hidden" class="init" value="true">
    </form>
</c:if>
<c:if test="${profession ne null}">
    <input type="hidden" class="init" value="false">
</c:if>
<div id="messageArea" class="c-success .av-m">
    <h2 class=".va-m">用户注册</h2>
    <form action="<%=path+"/gate/register"%>" method="post" id="toServer">
        <table>
            <tr>
                <td class="text_head">用户名：</td>
                <td colspan="2" class=".va-m"><input type="text" value="" placeholder="请输入你的名字" class="message"
                                                     name="name"></td>
            </tr>
            <tr>
                <td class="text_head">密码：</td>
                <td colspan="2" class=".va-m"><input type="password" value="" placeholder="请设置你的登录密码" class="message"
                                                     name="pass"></td>
            </tr>
            <tr>
                <td class="text_head">确认密码：</td>
                <td colspan="2" class=".va-m"><input type="password" value="" placeholder="请输入你的名字" class="message"
                                                     name="pass2"></td>
            </tr>
            <tr>
                <td class="text_head">性别：</td>
                <td class=".va-m f-20">男<input type="checkbox" onclick="Gender(true)" checked="checked" id="boy"
                                               class="btn btn-secondary-outline radius f-22"></td>
                <td class=".va-m f-20">女<input type="checkbox" onclick="Gender(false)" id="girl"
                                               class="btn btn-secondary-outline radius f-22"></td>
                <input type="hidden" name="gender" value="">
            </tr>
            <tr>
                <td class="text_head">学历：</td>
                <td colspan="2" class=".va-m"><select class="message" id="education" placeholder="请填写你的学历">
                    <option value=""></option>
                    <c:forEach items="${education}" begin="0" end="100" step="1" var="ed">
                        <option value="${ed.itemId}">${ed.itemName}</option>
                    </c:forEach>
                </select></td>
            </tr>
            <tr>
                <td class="text_head">职业：</td>
                <td colspan="2" class=".va-m"><select class="message" id="profession" placeholder="请填写你的职业">
                    <option value=""></option>
                    <c:forEach items="${profession}" begin="0" end="100" step="1" var="pro">
                        <option value="${pro.itemId}">${pro.itemName}</option>
                    </c:forEach>
                </select></td>
            </tr>
            <tr>
                <td class="text_head">手机号码：</td>
                <td colspan="2" class=".va-m"><input type="text" value="" placeholder="请输入你的联系电话" class="message"
                                                     name="mobile"></td>
            </tr>
            <tr>
                <td class="text_head">E-mail：</td>
                <td colspan="2" class=".va-m"><input type="email" value="" placeholder="请输入你的电子邮箱" class="message"
                                                     name="email"></td>
            </tr>
        </table>
        <input class="btn btn-primary radius size-M" type="button" value="注册" onclick="ToServlet()" id="rea">
        <input class="btn btn-primary radius size-M" type="button" value="返回" onclick="GoBack()">
    </form>
</div>
<div id="errorNotify"></div>
</body>
</html>
