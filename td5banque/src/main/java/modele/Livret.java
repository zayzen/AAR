package modele;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy =  InheritanceType.JOINED)
public class Livret extends Compte {


    private double tauxInteret;


    public Livret(long id, Client titulaire, double solde, Date dateOuverture, double tauxInteret) {
        super(id, titulaire, solde, dateOuverture);
        this.tauxInteret = tauxInteret;
    }

    public Livret() { this(-1L, null,0,null,0);
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

}
