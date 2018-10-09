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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
            integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
            crossorigin="anonymous"></script>
    <title>Mes compétences</title>
<body>
<h1>CRUD mes compétences</h1>

<nav aria-label="breadcrumb">
    <ol class="breadcrumb">
        <li class="breadcrumb-item"><a href="/goToMenu">Menu</a></li>
        <li class="breadcrumb-item active" aria-current="page">Mes Compétences</li>
    </ol>
</nav>
<div><h2>Mes compétences :</h2>
    <table class="table table-sm">

        <thead>
        <tr>
            <th></th>
            <th scope="col">Intitulé</th>
            <th scope="col">Niveau</th>
            <th scope="col">Commentaire</th>
            <th></th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${membreCourant.mesCompetences}" var="competence">
        <tr>
            <th></th>
            <td>${competence.competence.intituleC}</td>
            <td>${competence.niveau}</td>
            <td>${competence.commentaire}</td>
            <td>
                <form action="/modifierCompetence" method="post">
                    <input type="hidden" name="intitule" value="${competence.competence.intituleC}"/>
                    <button>Modifier</button>
                </form>
            </td>
            <td>
                <button value="${competence.competence.intituleC}">Supprimer</button>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>

<div>
    <h2>Ajouter une nouvelle compétence :</h2>


    <form action="/ajouterCompetence" method="post" style="margin-left: 20px">
        <div class="form-row">

            <div class="col-auto">
                <label>Choisir une compétence :</label>
                <select class="form-control" name="competence">
                    <c:forEach items="${lesCompetences}" var="choixC">
                        <option value="${choixC.intituleC}">${choixC.intituleC}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="col-auto">
                <label>Niveau :</label>
                <select class="form-control" name="niveau">
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>
            </div>
            <div class="form-group col-md-4"><label> Commentaire :</label>
                <input class="form-control" type="text" name="commentaire" required/>
            </div>
        </div>
        <div class="form-group col-md-2"><label> </label>
            <button class="btn btn-primary" type="submit"> Valider</button>
        </div>

    </form>
</div>
</body>
</html>