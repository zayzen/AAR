package controllers;

import facade.iFacade;
import formulaire.*;
import modele.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@SessionAttributes("membreCourant")
@RequestMapping("/")
public class monCtrl {

    @Autowired
    private iFacade maFacade;

    // Redirection
    @GetMapping(value = "/")
    public String root(Model model) {
        model.addAttribute("mLogin", new LoginForm());
        return "index";
    }

    @GetMapping(value = "/goToInscription")
    public String goToInscription() {
        return "inscription";
    }

    @GetMapping(value = "/goToCreerProjet")
    public String goToCreerProjet(Model model) {
        model.addAttribute("lesCompetences",maFacade.getLesCompetences());
        return "creerProjet";
    }

    @GetMapping(value = "/goToMesCompetences")
    public String goTogoToMesCompetences(Model model) {
        model.addAttribute("lesCompetences",maFacade.getLesCompetences());
        return "mesCompetences";
    }

    @GetMapping(value = "/deconnexion")
    public String deconnexion(Model model) {
        int a = 0;
        model.asMap().remove("membreCourant");
        model.addAttribute("mLogin", new LoginForm());
        return "index";
    }

    @GetMapping(value = "/goToMenu")
    public String goToMenu(Model model) {
        return "menu";
    }


    // Form
    @PostMapping(value = "/connexion")
    public String loginsimple(LoginForm aConnecter, Model model) {

        model.addAttribute("mlogin", new LoginForm());
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

    @PostMapping(value = "/creerMembre")
    public String creerMembre(MembreFrom aInscrire) {

        String login = aInscrire.getLogin();
        String mdp = aInscrire.getMotdepasse();
        String surnom = aInscrire.getSurnom();

        boolean ok = maFacade.inscription(login,mdp,surnom);
        if(ok) return "index";
        else return "inscription";

    }

    @PostMapping(value = "/creerProjet")
    public String creerProjet(@SessionAttribute(value="membreCourant", required = true) Membre m,
                               ProjetForm p){
        String intitule = p.getIntitule();
        String description = p.getDescription();
        String[] competences = p.getCompetencesNecessaires();

        if(null != competences){
            Projet aCreer = new Projet(m,intitule,description);
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

    @PostMapping(value = "/ajouterCompetence")
    public String ajouterCompetence(@SessionAttribute(value="membreCourant", required = true) Membre m,
                               CompetenceForm p){
        String competence = p.getCompetence();
        String niveau = p.getNiveau();
        String commentaire = p.getCommentaire();

        if(null != competence){
            Competence aAjouter = maFacade.getCompetenceByIntitule(competence);
            if(!m.getMesCompetences().contains(aAjouter)){
                CompetenceMembre cm = new CompetenceMembre(Integer.valueOf(niveau),commentaire,aAjouter);
                m.getMesCompetences().add(cm);
            }
            return "menu";
        }
        return "mesCompetences";

    }

    @PostMapping(value = "/supprimerCompetence")
    public String supprimerCompetence(@SessionAttribute(value="membreCourant", required = true) Membre m,
                                    CompetenceForm p){
        String competence = p.getCompetence();
        String niveau = p.getNiveau();
        String commentaire = p.getCommentaire();

        if(null != competence){
            Competence aAjouter = maFacade.getCompetenceByIntitule(competence);
            if(!m.getMesCompetences().contains(aAjouter)){
                CompetenceMembre cm = new CompetenceMembre(Integer.valueOf(niveau),commentaire,aAjouter);
                m.getMesCompetences().add(cm);
            }
            return "menu";
        }
        return "mesCompetences";

    }

}
