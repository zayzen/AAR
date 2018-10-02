package servlets;

import facade.Facade;

import modele.Competence;
import modele.Membre;
import modele.Projet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
@WebServlet(name = "controleur", urlPatterns = "/ctrl")
public class maServlet extends HttpServlet {

    @Autowired
    @Qualifier("maFacade")
    private Facade maFacade;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String param = request.getParameter("action");
        System.out.print(param);

        switch (param){

            case "inscription":
                request.getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response);
                break;
            case "creerMembre":
                creerMembre(request,response);
                break;
            case "connexion":
                connexion(request,response);
                break;
            case "goToCreerProjet":
                request.getRequestDispatcher("/WEB-INF/creerProjet.jsp").forward(request, response);
                break;
            case "creerProjet":
                creerProjet(request, response);
                break;


        }

    }

    private void creerProjet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String intitule = request.getParameter("intitule");
        String description = request.getParameter("description");
        String[] competences = (request.getParameterValues("choixCompetences"));

        if(competences   != null){
            Projet aCreer = new Projet(intitule,description);
            int taileC = competences.length;
            for(int i = 0; i<taileC;i++){
                Competence c = maFacade.getCompetenceByIntitule(competences[i]);
                aCreer.getCompetencesNecessaire().add(c);
            }
            Membre m = (Membre) request.getSession().getAttribute("membre");
            m.getMesProjets().add(aCreer);
            request.getRequestDispatcher("/WEB-INF/menu.jsp").forward(request,response);
        }
        request.getRequestDispatcher("/WEB-INF/creerProjet.jsp").forward(request,response);

    }

    private void connexion (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String mdp = request.getParameter("mdp");
        boolean co = maFacade.connexion(login,mdp);

        if(co){
            Membre aConnecter = maFacade.getMembreByLogin(login);
            request.getSession().setAttribute("membre", aConnecter);
            request.getSession().setAttribute("login", aConnecter.getSurnom());
            request.getSession().setAttribute("mesProjets", aConnecter.getMesProjets()); 
            request.getSession().setAttribute("mesParticipations", aConnecter.getParticipation());
            request.getSession().setAttribute("mesCompetences", aConnecter.getMesCompetences());
            request.getSession().setAttribute("competencesProjet", maFacade.getLesCompetences());
            request.getRequestDispatcher("/WEB-INF/menu.jsp").forward(request, response);
        }
        else    request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    private void creerMembre (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String mdp = request.getParameter("mdp");
        String surnom = request.getParameter("surnom");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        boolean cm = maFacade.inscription(login, mdp, surnom);

    }

 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
*/









