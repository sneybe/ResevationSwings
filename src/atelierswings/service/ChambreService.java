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

    public void AjouterChambre(Chambre chambre) {

        EntityManagerFactory en = Persistence.createEntityManagerFactory("PU");
        EntityManager e = en.createEntityManager();

        e.getTransaction().begin();
        e.persist(chambre);
        e.getTransaction().commit();
    }

    public List<Chambre> listerChambre() {

        EntityManagerFactory en = Persistence.createEntityManagerFactory("PU");
        EntityManager e = en.createEntityManager();

        Query query = e.createQuery("SELECT c "
                + "FROM Chambre c "
                + "ORDER BY c.nom ");

        List<Chambre> chambre = query.getResultList();

        return chambre;
    }
    
    public List<Chambre> listChambreParHotel(Hotel h) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query = em.createQuery(" SELECT c FROM Chambre c JOIN c.hotel h WHERE h.id = " + h.getId() + " ORDER BY c.nom");
        return query.getResultList();
    }

    public void modifierChambre(Chambre chambre) {

        EntityManagerFactory en = Persistence.createEntityManagerFactory("PU");
        EntityManager e = en.createEntityManager();
        e.getTransaction().begin();
        e.merge(chambre);
        e.getTransaction().commit();
    }

    public Chambre selectChambre(long id) {
        EntityManagerFactory en = Persistence.createEntityManagerFactory("PU");
        EntityManager e = en.createEntityManager();

        return e.find(Chambre.class, id);
    }

    public void supprimerChambre(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Chambre.class, id));
        em.getTransaction().commit();
    }
    
    

}
