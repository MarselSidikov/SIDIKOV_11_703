<%@ page import="ru.itis.pizza.transfer.UserDto" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css"/>
</head>
<body>
<div class="form-style-3">
    <form method='post'>
        <label for='email'><span>Email:</span></label>
        <input type='text' id='email' name='email' placeholder='email'>
        <label for='password'><span>Password:</span></label>
        <input type='password' id='password' name='password' placeholder='Password'><br><br>
        <label for='firstName'><span>First Name:</span></label>
        <input type='text' id='firstName' name='firstName' placeholder='First Name'><br><br>
        <label for='lastName'><span>Last Name:</span></label>
        <input type='text' id='lastName' name='lastName' placeholder='Last Name'><br><br>
        <input type='submit' value='Sign Up'>
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
