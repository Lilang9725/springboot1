<%--
  Created by IntelliJ IDEA.
  User: 32127
  Date: 2020/5/28
  Time: 11:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String tableStr = "序号,用户名,注册时间,积分,上传文档数,下载文档数,用户状态";
    String[] tableHead = tableStr.split(",");
    int i = 1;
%>
<html>
<head>
    <meta charset="utf-8">
    <title>用户查询</title>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <script type="text/javascript" src="<%=path+"/toolBox/h-ui0/static/h-ui/js/H-ui.js"%>"></script>
    <link href="<%=path+"/toolBox/h-ui0/static/h-ui/css/H-ui.css"%>" rel="stylesheet" type="text/css"/>
    <link href="<%=path+"/toolBox/h-ui0/lib/Hui-iconfont/1.0.8/iconfont.css"%>" rel="stylesheet" type="text/css"/>
    <script type="text/javascript" src="<%=path+"/toolBox/h-ui0/lib/My97DatePicker/4.8/WdatePicker.js"%>"></script>

    <script src="<%=path+"/toolBox/custom_tool.js"%>" type="text/javascript"></script>

</head>
<body>
<div class="text-c">
    <form action="<%=path+"/manager/userQuery"%>" method="get">
        注册时间：<input type="text" name="timeMin" onfocus="WdatePicker({maxDate:'#F{$dp.$D(\'logmax\')||\'%y-%M-%d\'}'})"
                    id="logmin" class="input-text Wdate" style="width:150px;" value="${timeMin}">&nbsp;&nbsp;-&nbsp;&nbsp;
        <input type="text" name="timeMan" onfocus="WdatePicker({minDate:'#F{$dp.$D(\'logmin\')}',maxDate:'%y-%M-%d'})"
               id="logmax" class="input-text Wdate" style="width:150px;" value="${timeMan}">
        <input type="text" name="userName" id="userName" placeholder=" 用户名称" style="width:250px"
               class="input-text" value="${userName}">
        <button class="btn btn-success" type="submit"><i class="Hui-iconfont">&#xe665;</i> 搜用户</button>
    </form>
</div>
<table class="table table-border table-bordered table-bg table-hover table-sort">
    <thead>
    <tr class="text-c">
        <c:forEach items="<%=tableHead%>" begin="0" step="1" end="100" var="head">
            <th width="50">${head}</th>
        </c:forEach>
    </tr>
    <c:forEach items="${utils.data}" begin="0" step="1" end="100" var="user">
        <tr class="text-c">
            <td><%=i++%>
            </td>
            <td>${user.userName}</td>
            <td>${user.remark}</td>
            <td>${user.integral}</td>
            <td>${user.professionId}</td>
            <td>${user.educationId}</td>
            <td>${user.userState}</td>
        </tr>
    </c:forEach>
    </thead>
</table>
</body>
</html>
