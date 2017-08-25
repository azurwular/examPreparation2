/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fascade;

import Entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Dell
 */
public class Fascade
{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_examPreparationJPA1_jar_1.0-SNAPSHOTPU");
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
    
    public Customer findCustomer(Long id)
    {
       return em.find(Customer.class , id);
        
    }
    
    public List<Customer> getAllCustomers()
    {
        Query q1 = em.createQuery("Select c from Customer c");
        List<Customer> cus = em.getResultList();
        
        return cus;
    }
    
    
    
    
    
    
    
}
