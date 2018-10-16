package modele;


import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long id;
    private String nom;
    private String prenom;
    private String adresse;
    @OneToMany(mappedBy = "titulaire")
    private Collection<Compte> comptes;

    public Client() {
    }

    public Client(String nom, String prenom, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.comptes = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Collection<Compte> getComptes() {
        return comptes;
    }

    public void addCompte(Compte comptes) {
        getComptes().add(comptes);
    }
}
