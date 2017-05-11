/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswings.service;

import atelierswings.entity.Reservation;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author formation
 */
public class ReservationService {
    
    public List<Reservation> listerReservation() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query = em.createQuery("SELECT res FROM Reservation res ORDER BY res.id");
        return query.getResultList();
    }
    
    public void modifierReservation(Reservation res)
    {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(res);
        em.getTransaction().commit();
    }
    
    public Reservation selectReservation(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        return em.find(Reservation.class, id);
    }
    
   
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author formation
 */
public class ReservationService {
    
    
    public void ajouterReservation(Reservation reservations){
        EntityManagerFactory en =Persistence.createEntityManagerFactory("PU");
        EntityManager ent= en.createEntityManager();
        
        ent.getTransaction().begin();
        
        ent.persist(reservations);
        
        ent.getTransaction().commit();
        
    }
    
    public void supprimerReservation(long id){
       EntityManagerFactory en =Persistence.createEntityManagerFactory("PU");
        EntityManager ent= en.createEntityManager();
        ent.getTransaction().begin();
        
        int query=ent.createQuery(" DELETE "
                + "FROM Reservation r "
                + "WHERE r.id ="+ id ).executeUpdate();
          
          ent.getTransaction().commit();
        
    }
    
    public Reservation selectReservation(long id){
        
        EntityManagerFactory en =Persistence.createEntityManagerFactory("PU");
        EntityManager ent= en.createEntityManager();
        
        return ent.find(Reservation.class, id);
       
    }
    
    public List<Reservation> listerReservation(){
        EntityManagerFactory en =Persistence.createEntityManagerFactory("PU");
        EntityManager ent= en.createEntityManager();
        
        Query query = ent.createQuery("SELECT r "
                + "FROM Reservation r "
                + "ORDER BY r.id ");
        List<Reservation> res = query.getResultList();
        
   
        return res;
        
    }
     
}
