package demo;

import modele.Client;
import modele.Compte;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class demo1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banquePU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Client c1 = new Client("John", "Doe", "3 rue des animaux");
        Client c2 = new Client("Johsn", "Does", "3 rue des ansssimaux");
        em.persist(c1);
        em.persist(c2);
        em.getTransaction().commit();

    }

}
