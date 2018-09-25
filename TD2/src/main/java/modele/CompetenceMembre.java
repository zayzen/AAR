package modele;

public class CompetenceMembre {
    private int niveau;
    private String commentaire;

    //Consctructeur
    public CompetenceMembre(int niveau, String commentaire) {
        this.niveau = niveau;
        this.commentaire = commentaire;
    }

    // Getters & Setters
    public int getNiveau() {
        return niveau;
    }
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public String getCommentaire() {
        return commentaire;
    }
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
