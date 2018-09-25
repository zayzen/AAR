package modele;

import java.util.ArrayList;
import java.util.HashSet;

public class Membre {
    private String login;
    private String motdepasse;
    private String surnom;
    private HashSet<Projet> mesProjets;
    private HashSet<Projet> ProjetsParticipative;
    private HashSet<Competence> mesCompetences;


    //Consctructeur
    public Membre(String login, String motdepasse, String surnom) {
        this.login = login;
        this.motdepasse = motdepasse;
        this.surnom = surnom;
        mesProjets = new HashSet<>();
        mesCompetences = new HashSet<>();
        ProjetsParticipative = new HashSet<>();
    }

    // Getters & Setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotdepasse() {
        return motdepasse;
    }
    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public String getSurnom() {
        return surnom;
    }
    public void setSurnom(String surnom) {
        this.surnom = surnom;
    }
}
