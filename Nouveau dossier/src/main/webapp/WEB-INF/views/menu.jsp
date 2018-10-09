<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Menu</title>
<body>
<h1> Menu </h1>
<h1> Bienvenue ${membreCourant.login}</h1>
<nav aria-label="breadcrumb">
    <ol class="breadcrumb">
        <li class="breadcrumb-item active" aria-current="page">Menu</li>
    </ol>
</nav>
<div>
    <p><a href="/goToCreerProjet"> Creer un nouveau projet </a></p>
    <p><a href="/goToMesCompetences"> Ajouter/Modifier mes compétences </a></p>
    <p><a href="/deconnexion"> Deconnexion </a></p>

</div>

<div>
<table>
    <tr>
        <th>Les projets dont je suis responsable : </th>
    </tr>
    <tr>
        <td>Intitulé</td>
        <td>Description</td>
    </tr>
        <c:forEach items="${membreCourant.mesProjets}" var="projet">
    <tr>
        <td>${projet.intituleP}</td>

        <td>${projet.description}</td>

    </tr>
    </c:forEach>

</table>

    <table>
        <tr>
            <th>Les projets auquels je partiticpe:</th>
        </tr>
        <tr>
            <td>Intitulé</td>
            <td>Description</td>
        </tr>
            <c:forEach items="${membreCourant.mesParticipations}" var="projetp">
        <tr>
            <td>${projetp.intituleP}</td>

            <td>${projetp.description}</td>

        </tr>
        </c:forEach>

    </table>
</div>
</div>

</body>
</html>
