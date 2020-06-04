<%--
  Created by IntelliJ IDEA.
  User: 32127
  Date: 2020/5/15
  Time: 0:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String userName = null;
    String status = null;
    String userNumber = null;
    String path = request.getContextPath();
    Cookie[] cookies = request.getCookies();
    if (cookies != null)
        for (Cookie cookie : cookies) {
            switch (cookie.getName()) {
                case "userName":
                    userName = cookie.getValue();
                    break;
                case "rank":
                    status = cookie.getValue();
                    break;
                case "userNumber":
                    userNumber = cookie.getValue();
                    break;
            }
        }
%>
<html>
<head>
    <meta charset="utf-8">
    <title>文件共享系统</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <script type="text/javascript" src="<%=path+"/toolBox/h-ui0/static/h-ui/js/H-ui.js"%>"></script>
    <link href="<%=path+"/toolBox/h-ui0/static/h-ui/css/H-ui.css"%>" rel="stylesheet" type="text/css"/>
    <link href="<%=path+"/toolBox/h-ui0/lib/Hui-iconfont/1.0.8/iconfont.css"%>" rel="stylesheet" type="text/css"/>

    <script src="<%=path+"/toolBox/custom_tool.js"%>" type="text/javascript"></script>
    <script src="<%=path+"/js/home-page.js"%>" type="text/javascript"></script>
    <link href="<%=path+"/css/home-page.css"%>" rel="stylesheet" type="text/css"/>
</head>
<body>
<c:set var="name" value="<%=userName%>"/>
<form action="<%=path+"/gate/homePageView"%>" method="post" id="reload"></form>
<%-- 重新加载 --%>
<form action="<%=path+"/gate/homePageValue"%>" method="post" id="goFlushDate">
    <input name="userId" value="<%=userNumber%>" hidden="hidden">
</form>
<c:if test="${userList.userName ne name}">
    <input hidden="hidden" id="isUser" value="true">
</c:if>
<input type="hidden" value="<%=path%>" id="path">
<input type="hidden" value="${userList.remark}" id="status">
<div id="userMessageBox" class="cl"><%--  顶信息  --%>
    <span class="f-r c-red mt-10">
        <c:if test="${userList.userName ne null}">
            <input id="isLogin" type="hidden" value="true">
            欢迎：<label class="text-overflow">${userList.userName}</label>&nbsp;&nbsp;
            <c:if test="${userList.remark ne 'manage'}">
                当前积分：<label>${userList.integral}</label>&nbsp;&nbsp;
                <span class="pipe">|</span>
            </c:if>
        </c:if>
         <c:if test="${userList.userName eq null}">
             <input id="isLogin" type="hidden" value="false">
             <label class="btn btn-link" onClick="userOperation('Login')">登录</label>
             <span class="pipe">|</span>
             <label class="btn btn-link" onClick="userOperation('register')">注册</label>
         </c:if>
         <span class="pipe">|</span>
         <c:if test="${userList.remark ne 'manage'}">
             <label class="c-green btn btn-secondary-outline radius size-MINI text-overflow"
                    onclick="testMethod()">个人信息</label>
             <span class="pipe">|</span>
             <label class="c-green btn btn-secondary-outline radius size-MINI text-overflow">我要上传</label>
             <span class="pipe">|</span>
             <label class="c-green btn btn-secondary-outline radius size-MINI text-overflow">我要下载</label>
             <span class="pipe">|</span>
         </c:if>
         <c:if test="${userList.remark eq 'manage'}">
             <label class="c-green">$ $管理员$ $</label>
         </c:if>&nbsp;&nbsp;&nbsp;&nbsp;
        </span>
</div>
<%--  顶信息  --%>
<div id="manage"><%--  管理员菜单区域  --%>
    <div id="menu-area" class="lh-16"><%--  菜单区域  --%>
        <ul id="Huifold1" class="Huifold">
            <c:if test="${menuOne ne null}">
                <c:forEach items="${menuOne}" begin="0" step="1" end="100" var="menu1">
                    <li class="item">
                        <h4 class="btn btn-default radius c-green myMenu">${menu1.menuName}<b>▼</b></h4>
                        <div class="info">
                            <c:forEach items="${menu1.list}" begin="0" step="1" end="100" var="menu2">
                                <label class="btn btn-secondary radius size-m myMenu" onclick=
                                        "EnterFunction(${menu2.menuId})">${menu2.menuName}</label>
                                <input type="hidden" value="${menu2.menuPath}" id="menu-2-"${menu2.menuId}><br>
                            </c:forEach>
                        </div>
                    </li>
                </c:forEach>
            </c:if>
        </ul>
    </div>
    <%--  菜单区域  --%>
    <div class="panel panel-default" id="dataArea"><%--  菜单效应功能区域  --%>
        <div class="panel-header">面板标题</div>
        <div class="panel-body">
            <iframe id="content" src=""></iframe>
        </div>
    </div>
    <%--  菜单效应功能区域  --%>
</div>
<div id="notManage">
    <div>
        <input type="text" name="" id="qq" placeholder="请输入您要搜索的文件名称" style="width:250px" class="input-text">
        <button name="" id="ss" class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜索</button>
    </div>
</div>
<div id="modal-demo" class="modal fade" tabindex="-1" role="dialog" aria-labelledby<%--  顶信息功能效应区域  --%>
        ="myModalLabel" aria-hidden="true"><%--  顶信息功能效应区域  --%>
    <div class="modal-dialog">
        <div class="modal-content radius">
            <div class="modal-body" id="myActionBox">
                <div class="panel-body">
                    <iframe id="actionContent" src=""></iframe>
                </div>
            </div>
            <div class="modal-footer">
                <button class="btn btn-primary" data-dismiss="modal" aria-hidden="true" onclick="flushThisView()">确定
                </button>
                <button class="btn" data-dismiss="modal" aria-hidden="true" onclick="flushThisView()">关闭</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
