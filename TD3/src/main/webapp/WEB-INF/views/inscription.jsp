<%--
  jsp avec scriptlet, old style
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Inscription</title>
<body>
<h1> Inscription</h1>
<form action="/creerMembre" method="post">
    <p> Login : </p> <input type="text" name="login" />
    <p> Motdepasse : </p> <input type="text" name="motdepasse" />
    <p> Surnom : </p> <input type="text" name="surnom" />
    <!--<input type="hidden" value="inscription" name="action"/>-->
    <button type="submit"> Valider </button>

</form>

</html>
