
package tr.gov.ptt.gr2jpaapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import tr.gov.ptt.entity.Employee;


public class UpdateEmp {
   public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em = emf.createEntityManager();
        
        Employee e = em.find(Employee.class, 27) ;
        
        System.out.println("Update'den önce maaş : "+e.getSalary());
            em.getTransaction().begin();
                e.setSalary(3000.0);
            em.getTransaction().commit();
        System.out.println("Update'den önce maaş : "+e.getSalary());
        em.close();
        emf.close();   
    } 
}
