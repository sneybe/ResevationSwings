/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswings.service;

import atelierswings.entity.Hotel;
import static atelierswings.entity.Hotel_.id;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author formation
 */
public class HotelService {

    public void ajouter(Hotel hotel) {
        EntityManagerFactory en = Persistence.createEntityManagerFactory("PU");
        EntityManager ent = en.createEntityManager();

        ent.getTransaction().begin();
        ent.persist(hotel);
        ent.getTransaction().commit();
    }

    public List<Hotel> listerHotel() {

        EntityManagerFactory en = Persistence.createEntityManagerFactory("PU");
        EntityManager ent = en.createEntityManager();

        Query query = ent.createQuery("SELECT h "
                + "FROM Hotel h ORDER BY h.nom");

        List<Hotel> hotel = query.getResultList();

        return hotel;

    }

    public void modifierHotel(Hotel hotel) {
        EntityManagerFactory en = Persistence.createEntityManagerFactory("PU");
        EntityManager en1 = en.createEntityManager();
        en1.getTransaction().begin();

        en1.merge(hotel);

        en1.getTransaction().commit();

    }

    public Hotel selectHotel(Long id) {
        
       EntityManagerFactory en = Persistence.createEntityManagerFactory("PU");
        EntityManager en1 = en.createEntityManager();
           return en1.find(Hotel.class, id);
      
        
     

    }
}
