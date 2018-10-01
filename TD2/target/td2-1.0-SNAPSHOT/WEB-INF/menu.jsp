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
<h1> Bienvenue ${login}</h1>


<table>
    <tr>
        <th>Mes Compétences</th>
    </tr>
    <tr>
        <td>Intitulé</td>
        <td>Niveau</td>
        <td>Commentaire</td>
    <c:forEach items="${mesCompetences}" var="competence">
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
        <td></td>
        <c:forEach items="${mesProjets}" var="projet">
    <tr>
        <td>${projet.intituleP}</td>>
        <td>${projet.description}</td>>
    </tr>
    </c:forEach>
    </tr>
</table>
</form>
</body>
</html>
