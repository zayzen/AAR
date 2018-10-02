package controllers;

import facade.iFacade;
import formulaire.LoginForm;
import formulaire.ProjetForm;
import modele.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Iterator;

@Controller
@SessionAttributes("membreCourant")
@RequestMapping("/")
public class monCtrl {

    @Autowired
    private iFacade maFacade;

    @GetMapping(value = "/")
    public String root() {
        return "index";
    }

    @PostMapping(value = "/connexion")
    public String loginsimple(LoginForm aConnecter, Model model) {

        String login = aConnecter.getLogin();
        String mdp = aConnecter.getMotdepasse();
        boolean co = maFacade.connexion(login,mdp);
        if(co){
            Membre m = maFacade.getMembreByLogin(aConnecter.getLogin());
            model.addAttribute("membreCourant",m);
            return "menu";
           }
        else return "index";

    }

    @GetMapping(value = "/goToCreerProjet")
    public String goToCreerProjet(Model model) {
        model.addAttribute("lesCompetences",maFacade.getLesCompetences());
        return "creerProjet";
    }

    @PostMapping(value = "/creerProjet")
    public String creerProjet(@SessionAttribute(value="membreCourant", required = false) Membre m,
                               ProjetForm p){
        String intitule = p.getIntitule();
        String description = p.getDescription();
        String[] competences = p.getCompetencesNecessaires();

        if(competences   != null){
            Projet aCreer = new Projet(intitule,description);
            int taileC = competences.length;
            for(int i = 0; i<taileC;i++){
                Competence c = maFacade.getCompetenceByIntitule(competences[i]);
                aCreer.getCompetencesNecessaire().add(c);
            }
            m.getMesProjets().add(aCreer);
            return "menu";
        }
        return "creerProjet";

    }

}
