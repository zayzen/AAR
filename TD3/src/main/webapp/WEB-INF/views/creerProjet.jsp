<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Muhammed
  Date: 01/10/2018
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Création Projet</title>
<body>
<h1> Création Projet</h1>
<form action="/creerProjet" method="post">
    <p> Intitulé : </p> <input type="text" name="intitule"/>
    <p> Description : </p> <input type="text" name="description"/>
    <p> Compétences nécessaires : </p>
    <select name="competencesNecessaires" multiple="multiple">
        <c:forEach items="${lesCompetences}" var="competence">
            <option value="${competence.intituleC}">${competence.intituleC}</option>
        </c:forEach>
    </select>

    <button type="submit"> Valider</button>

</form>
</body>
</html>