/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr2jpaapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import tr.gov.ptt.entity.Employee;

public class FindEmp {
   
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em = emf.createEntityManager();
        
        Employee e = em.find(Employee.class, 29) ;
        
        if (e == null)
        {
            System.out.println("Kardeş veri yok");
        }  else
        {
            System.out.println(e.getEname());    
        }       
        
        em.close();
        emf.close();   
    }
}
