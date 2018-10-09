package formulaire;

import modele.Competence;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;

public class ProjetForm {
    @NotNull @NotBlank String intitule;
    @NotNull @NotBlank String description;
    @NotNull @NotBlank String[] competencesNecessaires;

    // Constructor
    public ProjetForm() {
    }

    // Getters & Setters
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getCompetencesNecessaires() {
        return competencesNecessaires;
    }
    public void setCompetencesNecessaires(String[] competencesNecessaires) {
        this.competencesNecessaires = competencesNecessaires;
    }
}
