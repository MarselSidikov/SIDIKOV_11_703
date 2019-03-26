<#ftl encoding='UTF-8'>
<html>
<head>
    <script
            src="http://code.jquery.com/jquery-3.3.1.js"
            integrity="sha256-2Kok7MbOyxpgUVvAk/HJ2jigOSYS2auK4Pfzbm7uH60="
            crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="static/css/style.css">
    <script src="static/js/main.js"></script>
</head>
<body>
<#--<div>-->
<#--<form action="/users" method="post">-->
<#--<input name="name" placeholder="Name">-->
<#--<input name="age" placeholder="Age">-->
<#--<input type="submit" value="Add">-->
<#--</form>-->
<#--</div>-->
<div>
    <input id="name" name="name" placeholder="Name">
    <input id="age" name="age" placeholder="Age">
    <button onclick="addUser($('#name').val(), $('#age').val())">Add</button>
</div>
<div>
    <table id="users">
        <tr>
            <th>ID</th>
            <th>Name</th>
        </tr>
        <#list users as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>