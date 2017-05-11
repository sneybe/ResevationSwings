/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altelierSwings.vue;

import atelierswings.entity.Client;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.EventListenerList;

/**
 *
 * @author formation
 */
public class ComboBoxClient extends DefaultComboBoxModel {
    
    private List<Client> clients;

    public ComboBoxClient(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public Object getElementAt(int index) {
        return this.clients.get(index).getNom();
    }

    @Override
    public int getSize() {
       return clients.size();
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    
    
    
   

 

   
    
    
    
    
    
}
