<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  jsp avec scriptlet, old style
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
<body>
<h1> Menu </h1>
<h1> Bienvenue ${membreCourant.login}</h1>

<div>
    <a href="/goToCreerProjet"> Creer un nouveau projet </a>
    <a href="/goToAjouterCompetence"> Ajouter une nouvelle compétence </a>

</div>
<div>
<table>
    <tr>
        <th>Mes Compétences</th>
    </tr>
    <tr>
        <td>Intitulé</td>
        <td>Niveau</td>
        <td>Commentaire</td>
        <c:forEach items="${membreCourant.mesCompetences}" var="competence">
    <tr>
        <td>${competence.competence.intituleC}</td>
        <td>${competence.niveau}</td>
        <td>${competence.commentaire}</td>
    </tr>
    </c:forEach>

    </tr>
</table>
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
