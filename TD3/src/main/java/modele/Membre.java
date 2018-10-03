package modele;

import java.util.HashSet;

public class Membre {

    private String login;
    private String motdepasse;
    private String surnom;
    private HashSet<Projet> mesProjets;
    private HashSet<Projet> mesParticipations;
    private HashSet<CompetenceMembre> mesCompetences;

    // Constructor
    public Membre(String login, String motdepasse, String surnom) {
        this.login = login;
        this.motdepasse = motdepasse;
        this.surnom = surnom;
        this.mesProjets = new HashSet<>();
        this.mesParticipations = new HashSet<>();
        this.mesCompetences = new HashSet<>();
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

    public HashSet<Projet> getMesProjets() {
        return mesProjets;
    }
    public void setMesProjets(HashSet<Projet> mesProjets) {
        this.mesProjets = mesProjets;
    }

    public HashSet<Projet> getMesParticipations() {
        return mesParticipations;
    }
    public void setMesParticipations(HashSet<Projet> mesParticipations) {
        this.mesParticipations = mesParticipations;
    }

    public HashSet<CompetenceMembre> getMesCompetences() {
        return mesCompetences;
    }
    public void setMesCompetences(HashSet<CompetenceMembre> mesCompetences) {
        this.mesCompetences = mesCompetences;
    }
}
