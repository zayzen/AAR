package facade;

import modele.Membre;
import modele.Projet;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.*;

@Service(value = "maFacade")
public class Facade {


    private static Facade instance = new Facade();

    @Getter @Setter private HashSet<Membre> lesMembres;
    @Getter @Setter private HashSet<Projet> lesProjets;


    public Facade() {
        this.lesMembres = new HashSet<Membre>();
        this.lesProjets = new HashSet<Projet>();

        lesMembres.add(new Membre("mohamed","mohamed","Zayzen"));
        lesMembres.add(new Membre("younes","younes","Nesyou"));

    }

    public Facade getFacade(){
        if(instance == null) {
            instance = new Facade();
        }
        return instance;
    }

    public boolean connexion(String login, String mdp){
        for (Membre m : lesMembres)
        {
            if(m.getLogin().equals(login) && m.getMotdepasse().equals(mdp)){
                return true;
            }
        }
        return false;
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

}
