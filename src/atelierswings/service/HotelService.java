/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswings.service;

import atelierswings.entity.Hotel;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author formation
 */
public class HotelService {
    
    public void Ajouter(Hotel hotel){
        EntityManagerFactory en=Persistence.createEntityManagerFactory("PU");
        EntityManager ent =en.createEntityManager();
        
        ent.getTransaction().begin();
        ent.persist(hotel);
        ent.getTransaction().commit();
    }
    
}
