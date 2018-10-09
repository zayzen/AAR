package modele;



public class Competence {

  private String intituleC;
  private String descriptionC;

    //Consctructeur
    public Competence(String intituleC, String descriptionC) {
        this.intituleC = intituleC;
        this.descriptionC = descriptionC;
    }

    //Getters & Setters
    public String getIntituleC() {
        return intituleC;
    }
    public void setIntituleC(String intituleC) {
        this.intituleC = intituleC;
    }

    public String getDescriptionC() {
        return descriptionC;
    }
    public void setDescriptionC(String descriptionC) {
        this.descriptionC = descriptionC;
    }
}
