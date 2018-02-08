package ua.lviv.myproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App 
{
    public static void main( String[] args ) {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();
		
		
		
		em.getTransaction().commit();

		em.close();
		factory.close();
    }
}
