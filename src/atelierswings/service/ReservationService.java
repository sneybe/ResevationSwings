/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswings.service;

import atelierswings.entity.Reservation;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
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
    
    public void supprimerReservation(long id){
       EntityManagerFactory en =Persistence.createEntityManagerFactory("PU");
        EntityManager ent= en.createEntityManager();
        ent.getTransaction().begin();
        
        int query=ent.createQuery(" DELETE "
                + "FROM Reservation r "
                + "WHERE r.id ="+ id ).executeUpdate();
          
          ent.getTransaction().commit();
        
    }
    
    public void ajouterReservation(Reservation reservation)
    {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(reservation);
        em.getTransaction().commit();
    }
    
   

     
}
