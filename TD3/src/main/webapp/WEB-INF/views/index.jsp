<%--
JSP minimaliste est invocable directement
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>

<h1>Bienvenue sur application gestion de projet</h1>
<!-- <form action="/?action=connexion" method="post"> -->

<form action="/connexion" method="post">
    <p> Login : </p> <input type="text" name="login" />
    <p> Motdepasse : </p> <input type="text" name="motdepasse" />
    <!--<input type="hidden" value="inscription" name="action"/>-->
    <button type="submit"> Valider </button>
</form>


</body>
</html>
