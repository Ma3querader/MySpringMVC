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

<a href="model/testModel">model</a><br/>
<a href="/model/testJsp">jsp</a><br/>
<a href="/model/testModelAndView">mv</a><br/>

<a href="/model/testForwardOrRedirect">testForwardOrRedirect</a><br/>

<%--<form action="upload/fileupload1" method="post" enctype="multipart/form-data">--%>
    <%--姓名<input type="text" name="username">--%>
    <%--浏览文件<input type="file" name="upload"/><br/>--%>
    <%--<input type="submit" value="上传"/>--%>
<%--</form>--%>

<%--<form action="upload/fileupload3" method="post" enctype="multipart/form-data">--%>
    <%--浏览文件<input type="file" name="upload"/><br/>--%>
    <%--<input type="submit" value="Springmvc跨服务器文件上传"/>--%>
<%--</form>--%>




</body>
</html>
