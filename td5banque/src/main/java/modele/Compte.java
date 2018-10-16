package modele;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Compte {
    @Id
    private long id;
    @ManyToOne
    private Client titulaire;
    private double solde;
    @Temporal(TemporalType.DATE)
    private Date dateOuverture;

    public Compte() { this(-1L, null,0,null);
    }

    public Compte(long id, Client titulaire, double solde, Date dateOuverture) {
        this.id = id;
        this.titulaire = titulaire;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Client getTitulaire() {
        return titulaire;
    }

    public void setTitulaire(Client titulaire) {
        this.titulaire = titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }
}
