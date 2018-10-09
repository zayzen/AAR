<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Muhammed
  Date: 05/10/2018
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier Competence</title>
</head>
<body>
<form action="/modiferCompetence" method="post">
    <p> Choisir une compétence :
        <select name="competence">
            <c:forEach items="${lesCompetences}" var="choixC">
                <option value="${choixC.intituleC}">${choixC.intituleC}</option>
            </c:forEach>
        </select>
    </p>
    <p> Niveau :
        <select name="niveau">
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
        </select>
    </p>
    <p> Commentaire : </p> <input type="text" name="commentaire"/>
    <button type="submit"> Valider</button>
</form>
</body>
</html>
