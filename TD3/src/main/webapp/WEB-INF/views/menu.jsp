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

</div>
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


<table>
    <tr>
        <th>Mes Projets</th>
    </tr>
    <tr>
        <td>Intitulé</td>
        <td>Description</td>
        <td></td>
        <c:forEach items="${membreCourant.mesProjets}" var="projet">
    <tr>
        <td>${projet.intituleP}</td>

        <td>${projet.description}</td>

    </tr>
    </c:forEach>

</table>


</body>
</html>
