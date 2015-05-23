/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr2jpaapp;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrator
 */
public class NamedQueryOrnek {
        public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gr2jpaappPU");
        EntityManager em = emf.createEntityManager();
        
        Double maas = (Double) em.createNamedQuery("Employee.idIleMaasBul").setParameter("p_id", 22).getSingleResult();

        System.out.println("maaş : "+maas);
        
        Date tarih = (Date) em.createNativeQuery("select sysdate from dual").getSingleResult();
            System.out.println("tarih : " +tarih);

        em.close();
        emf.close();   
    }
}
