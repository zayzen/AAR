package facade;

import modele.Competence;
import modele.CompetenceMembre;
import modele.Membre;
import modele.Projet;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
public class Facade implements iFacade {
    
    private static Facade instance = new Facade();

    private HashSet<Membre> lesMembres;
    private HashSet<Projet> lesProjets;
    private HashSet<Competence> lesCompetences;

    public Facade() {
        this.lesMembres = new HashSet<>();
        this.lesProjets = new HashSet<>();
        this.lesCompetences = new HashSet<>();

        // Les compétences
        Competence java = new Competence("Java","Java 8.0" );
        Competence chef = new Competence("chef","chef de projet" );
        Competence dotnet = new Competence("Dotnet","Dotnet" );
        Competence css = new Competence("CSS","Css" );
        lesCompetences.add(java);
        lesCompetences.add(chef);
        lesCompetences.add(dotnet);
        lesCompetences.add(css);

        // Les membres isncrits
        Membre m = new Membre("mohamed","mohamed","Zayzen");
        Membre y = new Membre("younes","younes","Nesyou");
        lesMembres.add(y);
        lesMembres.add(m);

        // Les compétences membres
        m.getMesCompetences().add(new CompetenceMembre(1,"Junior",chef));
        m.getMesCompetences().add(new CompetenceMembre(5,"Senior",java));

        y.getMesCompetences().add(new CompetenceMembre(1,"Debutant",css));
        y.getMesCompetences().add(new CompetenceMembre(4,"Pro",dotnet));

        // Les Projets
        Projet a = new Projet("Front", "Modification du Css");
        a.getCompetencesNecessaire().add(chef);
        a.getCompetencesNecessaire().add(css);

        Projet b = new Projet("Site web", "Creation d'un site web");
        b.getCompetencesNecessaire().add(chef);
        b.getCompetencesNecessaire().add(java);
        b.getCompetencesNecessaire().add(dotnet);
        lesProjets.add(a);
        lesProjets.add(b);
        
        // Assignation projet
        m.getMesProjets().add(a);
        m.getMesProjets().add(b);
        y.getParticipation().add(a);


    }

    public Facade getFacade(){
        if(instance == null) {
            instance = new Facade();
        }
        return instance;
    }
    @Override
    public boolean connexion(String login, String mdp){
        for (Membre m : lesMembres)
        {
            if(m.getLogin().equals(login) && m.getMotdepasse().equals(mdp)){
                return true;
            }
        }
        return false;
    }

    public Membre getMembreByLogin(String login){
        for (Membre m : lesMembres)
        {
            if(m.getLogin().equals(login)){
                return m;
            }
        }
        return null;
    }

    public Competence getCompetenceByIntitule(String login){
        for (Competence c : lesCompetences)
        {
            if(c.getIntituleC().equals(login)){
                return c;
            }
        }
        return null;
    }


    public boolean inscription(String login, String mdp, String surnom){
        for (Membre m : lesMembres)
        {
            if(m.getLogin().equals(login)){
                return false;
            }
        }
        lesMembres.add(new Membre(login,mdp,surnom));
        return true;

    }
/*
    public Boolean inscription(String login, String mdp, String surnom){
        if (lesMembres.containsKey(login))
        {
            return false;
        }
        else {
            lesMembres.put("login", new Membre(login,mdp,surnom));
        }
        return true;
    }
*/
    // Getters
    public HashSet<Membre> getLesMembres() {
        return lesMembres;
    }
    public HashSet<Projet> getLesProjets() {
        return lesProjets;
    }
    public HashSet<Competence> getLesCompetences() {
        return lesCompetences;
    }

}
