package modele;

public class CompetenceMembre {
    private int niveau;
    private String commentaire;
    private Competence competence;

    //Consctructeur
    public CompetenceMembre(int niveau, String commentaire, Competence competence) {
        this.niveau = niveau;
        this.commentaire = commentaire;
        this.competence = competence;
    }

    // Getters & Setters
    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public Competence getCompetence() {
        return competence;
    }
    public void setCompetence(Competence competence) {
        this.competence = competence;
    }

    public String getCommentaire() {
        return commentaire;
    }
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
