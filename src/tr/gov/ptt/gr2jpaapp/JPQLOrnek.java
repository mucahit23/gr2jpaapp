
package tr.gov.ptt.gr2jpaapp;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLOrnek {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em = emf.createEntityManager();
        
        Query query1 = em.createQuery("select upper(e.ename) from Employee e");
        List<String> nameList = query1.getResultList();
        
        System.out.println("ad sayısı : "+nameList.size());
        for (String nameList1 : nameList) {
            System.out.println("ad : "+nameList1);
        }
        
        Query query2 = em.createQuery("select max(e.salary) from Employee e");
        Double sonuc = (Double) query2.getSingleResult();
        System.out.println("max maaş : "+sonuc);
        em.close();
        emf.close();   
    }
    
}
