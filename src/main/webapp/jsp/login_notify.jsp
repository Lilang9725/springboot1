<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 32127
  Date: 2020/5/27
  Time: 0:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Cookie> cookies = new ArrayList<Cookie>();
    String userName = request.getParameter("userName");
    String rank = request.getParameter("rank");
    cookies.add(new Cookie("userNumber", request.getParameter("userNumber")));
    cookies.add(new Cookie("userName", userName));
    if (rank.equals("manage")) cookies.add(new Cookie("rank", rank));
    for (Cookie cookie : cookies) {
        cookie.setMaxAge(-3);
        cookie.setPath(request.getContextPath());//千万不可少，不然这个站点找不到这个cookie
        //表示只有本项目地址下的所有位置可取如：cookie.setPath(/J2ee)表示只有J2ee工程下的所有位置可取这个cookie
        response.addCookie(cookie);
    }
%>
<html>
<head>
    <title>登录成功</title>
    <style type="text/css">
        html, body {
            width: 100%;
            height: 100%;
            margin: auto;
            padding: 0;
            text-align: center;
        }
    </style>
</head>
<body>
<div>
    <br><br><br><br>
    恭喜你 <%=userName%>，登录成功<br><br>
    <hr>
    <br><br>
    单击下方的“关闭”或“确认”即可刷新界面！
    <br><br><br>
</div>
</body>
</html>
