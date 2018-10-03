package facade;


import modele.Competence;
import modele.Membre;
import modele.Projet;

import java.util.HashSet;

public interface iFacade {

    // Functions
    boolean connexion(String login, String mdp);
    boolean inscription(String login, String mdp, String surnom);
    Membre getMembreByLogin(String login);
    Competence getCompetenceByIntitule(String intituleCompetence);

    // Getters
    HashSet<Membre> getLesMembres();
    HashSet<Projet> getLesProjets();
    HashSet<Competence> getLesCompetences();

}
