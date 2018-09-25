package servlets;

import facade.Facade;

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
            case "inscription": request.getRequestDispatcher("/WEB-INF/inscription.jsp").forward(request, response); break;

            case "creerMembre": String login = request.getParameter("login");
                String mdp = request.getParameter("mdp");
                String surnom = request.getParameter("surnom");
                request.getRequestDispatcher("/index.jsp").forward(request, response);
                boolean co = maFacade.inscription(login, mdp, surnom);
                if ()
                break;

            case "connexion":
                String loginC = request.getParameter("login");
                String mdpC = request.getParameter("mdp");
                boolean co = maFacade.connexion(loginC,mdpC);
                if(co) request.getRequestDispatcher("/WEB-INF/menu.jsp").forward(request, response);
                else    request.getRequestDispatcher("index.jsp").forward(request,response);
                break;
        }

    }







    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

}
