<%--
  jsp avec scriptlet, old style
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>

    <title>Inscription</title>

<body class="align">

<div class="container">
    <h1 class="form-signin-heading">Inscription sur Project Team</h1>
    <form action="/creerMembre" method="post" class="form-group">
        <div class="input-group input-group-sm mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Login : </span>
            </div>
            <input type="text" class="form-control" aria-label="Sizing example input"
                   aria-describedby="inputGroup-sizing-sm" name="login" autofocus required>
        </div>
        <div class="input-group input-group-sm mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Mot de passe : </span>
            </div>
            <input type="password" class="form-control" aria-label="Sizing example input"
                   aria-describedby="inputGroup-sizing-sm" name="motdepasse" required>
        </div>
        <div class="input-group input-group-sm mb-3">
            <div class="input-group-prepend">
                <span class="input-group-text">Surnom :</span>
            </div>
            <input type="text" class="form-control" aria-label="Sizing example input"
                   aria-describedby="inputGroup-sizing-sm" name="surnom" required>
        </div>
        <button type="submit" class="btn btn-lg btn-primary btn-block"> Valider</button>
    </form>
    <p class="text--center"><a href="/">Retour au menu</a>
</div>

</body>
</html>
