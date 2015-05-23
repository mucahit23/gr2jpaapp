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

public class CreeateEmp {
    
    public static void main(String[] args) {
        EntityManagerFactory emf  =  Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em          = emf.createEntityManager();
        Employee emp1             = new Employee ();

        
        emp1.setEname("Mücahit ATAŞÇİ");
        emp1.setSalary(123.45);
        emp1.setDeg("6,3");
       
        em.getTransaction().begin();
        em.persist(emp1);        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
}
