/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswings.service;

import altelierSwings.vue.JPanelPrincipal;
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

    public void modifierClient(Client client) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge(client);
        em.getTransaction().commit();

    }

    public Client selectionClient(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Client c = em.find(Client.class, id);
        return c;
    }

    public void supprimerClient(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Client.class, id));
        em.getTransaction().commit();

    }

}
