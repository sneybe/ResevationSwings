/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswings.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author formation
 */
public class test {
    @Test
    public void test1() {
        
        EntityManagerFactory en = Persistence.createEntityManagerFactory("PU");
        EntityManager e=en.createEntityManager();
        
    }
    
}
