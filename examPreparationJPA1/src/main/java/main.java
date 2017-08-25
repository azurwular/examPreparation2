
import Entity.Customer;
import fascade.Fascade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class main
{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("classicmodelsPU");
    EntityManager em = emf.createEntityManager();
    public Customer createCustomer()
    {
        Customer c = new Customer();
        try
          {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
          }
        finally
          {
            em.close();
          }
        return c;
    }
    
    public static void main (String [] args)
    {
        Fascade f = new Fascade();
        
        f.createCustomer();
    }
}
