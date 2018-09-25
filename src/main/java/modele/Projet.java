package modele;

import java.util.ArrayList;
import java.util.HashSet;

public class Projet {
    private String intituleP;
    private String description;
    private HashSet<Competence> competencesNecessaire;

    //Consctructeur
    public Projet(String intituleP, String description) {
        this.intituleP = intituleP;
        this.description = description;
        this.competencesNecessaire = new HashSet<>();
    }

    // Getters & Setters
    public String getIntituleP() {
        return intituleP;
    }
    public void setIntituleP(String intituleP) {
        this.intituleP = intituleP;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public HashSet<Competence> getCompetencesNecessaire() {
        return competencesNecessaire;
    }
    public void setCompetencesNecessaire(HashSet<Competence> competencesNecessaire) {
        this.competencesNecessaire = competencesNecessaire;
    }
}
