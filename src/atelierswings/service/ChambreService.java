/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswings.service;

import atelierswings.entity.Chambre;
import atelierswings.entity.Hotel;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
    
    public List<Chambre> ListerChambre(){
        
       EntityManagerFactory en=Persistence.createEntityManagerFactory("PU");
       EntityManager e =en.createEntityManager(); 
       
       Query query=e.createQuery("SELECT c "
               + "FROM Chambre c "
               + "ORDER BY c.nom ");
               
        List<Chambre> chambre=query.getResultList();
        
        return chambre;
    }
    
}
