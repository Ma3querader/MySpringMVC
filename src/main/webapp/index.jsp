<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>

<a href="/param/getServlet?username=sss&password=888">ankh oym</a><br/>

<a href="param/testPathVariable/10">testPathVariable</a><br/>

<a href="param/testCookieValue">testCookieValue</a><br/>

<%--<form action="/param/testModelAttribute" method="post">--%>
    <%--用户：<input type="text" name="uname"><br/>--%>
    <%--密码：<input type="text" name="password"><br/>--%>
    <%--<input type="submit" value="提交">--%>
<%--</form>--%>

<a href="param/testSessionAttributes">testSessionAttributes</a><br/>
<a href="param/getSessionAttributes">getSessionAttributes</a><br/>
<a href="param/delSessionAttributes">delSessionAttributes</a><br/>


</body>
</html>
