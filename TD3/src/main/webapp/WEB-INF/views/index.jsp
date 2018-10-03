<%--
JSP minimaliste est invocable directement
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accueil</title>
</head>
<body>

<h1>Bienvenue sur application gestion de projet</h1>
<div>
    <form action="/connexion" method="post">
        <p> Login : </p> <input type="text" name="login"/>
        <p> Motdepasse : </p> <input type="text" name="motdepasse"/>
        <button type="submit"> Valider</button>
    </form>
</div>
<div>
    <a href="/goToInscription">Inscription</a>

</div>
</body>

</body>
</html>
