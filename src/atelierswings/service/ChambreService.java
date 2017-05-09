/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswings.service;

import atelierswings.entity.Chambre;
import atelierswings.entity.Hotel;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author formation
 */
public class ChambreService {
    
    public void AjouterChambre(Chambre chambre){
        
        EntityManagerFactory en=Persistence.createEntityManagerFactory("PU");
        EntityManager e =en.createEntityManager();
        
        e.getTransaction().begin();
        e.persist(chambre);
        e.getTransaction().commit();
    }
    
}
