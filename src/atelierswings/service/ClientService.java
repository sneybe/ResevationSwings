/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswings.service;


import atelierswings.entity.Client;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author formation
 */
public class ClientService {
    public void ajoutClient(Client client) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
    }
    
    public List<Client> listerClient() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query = em.createQuery("SELECT c FROM Client c ORDER BY c.nom");
        return query.getResultList();
    }

   
}
