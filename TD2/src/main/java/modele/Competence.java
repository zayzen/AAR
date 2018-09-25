package modele;

import lombok.Getter;
import lombok.Setter;

public class Competence {

    @Getter @Setter private String intituleC;
    @Getter @Setter private String descriptionC;

    //Consctructeur
    public Competence(String intituleC, String descriptionC) {
        this.intituleC = intituleC;
        this.descriptionC = descriptionC;
    }

}
