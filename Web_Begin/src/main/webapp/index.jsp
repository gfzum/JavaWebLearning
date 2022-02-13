<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<form action="${pageContext.request.contextPath}/RedirectServlet" method=post id =form>
    <h1 align="center"> test form</h1>
    <table align="center" cellspacing="2">
        <tr>
            <td id="id01"> name</td>
            <td><input type="text" name="name" value="${cookie.key1.value}" id = text /></td>
        </tr>
        <tr> <td>name</td>
            <td><input type="submit" /></td>
            <td><a href="session.html">sessionTest</a></td>
        </tr>
    </table>
</form>

</body>
</html>