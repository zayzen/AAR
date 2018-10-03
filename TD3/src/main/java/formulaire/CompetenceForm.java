package formulaire;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CompetenceForm {
    @NotNull @NotBlank String niveau;
    @NotNull @NotBlank String commentaire;
    @NotNull @NotBlank String competence;

    // Constructor
    public CompetenceForm() {
    }

    // Getters & Setters
     public String getNiveau() {
        return niveau;
    }
    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getCommentaire() {
        return commentaire;
    }
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public String getCompetence() {
        return competence;
    }
    public void setCompetence(String competence) {
        this.competence = competence;
    }
}
