/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queries;

import Entity.Semester;
import Entity.Student;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Dell
 */
public class Utility
{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.mycompany_examPreparationJPQL_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    public void addStudent()
    {
        Student student = new Student();
        try
          {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
          }
        finally
          {
            em.close();
          }
        
    }
    

    public void sumSemesterStudents(Semester semester)
    {
        Query query = em.createQuery("SELECT COUNT(stu) from Student stu "
                + "WHERE stu.currentsemesterId = (SELECT sem.id from Semester sem "
                + "where sem.name = :semesterName)").setParameter("semesterName", semester.getName());
        
    }
    
    
}
