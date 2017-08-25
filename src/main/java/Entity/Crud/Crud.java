/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.Crud;

import Entity.Book;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Dell
 */
public class Crud
{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_examPreparation2_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    public Book createBook()
    {
        Book book = new Book();
        try
          {
            em.getTransaction().begin();
            em.persist(book);
            em.getTransaction().commit();
          }
        finally
          {
            em.close();
          }
        return book;
    }
    
    public long getBook()
    {
        Query q1 = em.createQuery("Select b.isbn from book as b");
        long b = (long)q1.getSingleResult();
        return b;
    }
    public void deleteBook(long isbn)
    {
        Book book = em.find (Book.class , isbn);
        
        em.getTransaction().begin();
        em.remove(book);
        em.getTransaction().commit();
    }
}

