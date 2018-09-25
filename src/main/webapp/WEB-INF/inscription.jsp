<%--
  jsp avec scriptlet, old style
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inscription</title>
<body>
<h1> Inscription</h1>
<form action="/ctrl" method="post">
    <p> Login : </p> <input type="text" name="login" />
    <p> Motdepasse : </p> <input type="text" name="mdp" />
    <p> Surnom : </p> <input type="text" name="surnom" />
    <!--<input type="hidden" value="inscription" name="action"/>-->
    <button type="submit" value="creerMembre" name="action"> Valider </button>

</form>
</body>
</html>
