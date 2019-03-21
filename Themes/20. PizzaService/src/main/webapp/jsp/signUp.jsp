<%@ page import="ru.itis.pizza.transfer.UserDto" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
</head>
<a href="/signUp?lan=RU">RU</a>
<br>
<a href="/signUp?lan=EN">EN</a>
<body>
<div class="form-style-3">
    <form method='post'>
        <label for='email'><span>${localization.get("signup.email")}</span></label>
        <input type='text' id='email' name='email' placeholder='${localization.get("signup.email")}'>
        <label for='password'><span>${localization.get("signup.password")}</span></label>
        <input type='password' id='password' name='password'
               placeholder='${localization.get("signup.password")}'><br><br>
        <label for='firstName'><span>${localization.get("signup.firstname")}</span></label>
        <input type='text' id='firstName' name='firstName'
               placeholder='${localization.get("signup.firstname")}'><br><br>
        <label for='lastName'><span>${localization.get("signup.lastname")}</span></label>
        <input type='text' id='lastName' name='lastName' placeholder='${localization.get("signup.lastname")}'><br><br>
        <input type='submit' value='${localization.get("signup.signup")}'>
    </form>
</div>
<div>
    <%--<table>--%>
    <%--<tr>--%>
    <%--<th>id</th>--%>
    <%--<th>name</th>--%>
    <%--<th>surname</th>--%>
    <%--</tr>--%>
    <%--<%--%>
    <%--List<UserDto> users = (List<UserDto>) request.getAttribute("users");--%>
    <%--for (int i = 0; i < users.size(); i++) {%>--%>
    <%--<tr>--%>
    <%--<td><%=users.get(i).getId()%></td>--%>
    <%--<td><%=users.get(i).getFirstName()%></td>--%>
    <%--<td><%=users.get(i).getLastName()%></td>--%>
    <%--</tr>--%>
    <%--<%}%>--%>
    <%--</table>--%>

</div>
<div>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>surname</th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
