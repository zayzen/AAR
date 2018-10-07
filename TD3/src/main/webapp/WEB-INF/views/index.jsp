<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>

    <title>Accueil</title>
</head>
<body class="align">


<div class="container">
    <h1 class="form-signin-heading">Bienvenue sur Project Team</h1>
    <form:form action="/connexion" method="post" modelAttribute="mLogin" class="form-group">
        <div class="input-group input-group-sm mb-3">
            <div class="input-group-prepend">
                <form:label path="login" class="input-group-text">Login : </form:label>
            </div>
            <form:input type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-sm" path="login"/>
        </div>
        <div class="input-group input-group-sm mb-3">
            <div class="input-group-prepend">
                <form:label path="motdepasse" class="input-group-text">Mot de passe : </form:label>
            </div>
            <form:input type="text" class="form-control" aria-label="Sizing example input"
                        aria-describedby="inputGroup-sizing-sm" path="motdepasse" />
        </div>
        <button type="submit" class="btn btn-lg btn-primary btn-block"> Valider</button>
    </form:form>
    <p class="text--center">Pas encore inscrit ? <a href="/goToInscription">Inscription</a>
</div>

</body>


</html>
