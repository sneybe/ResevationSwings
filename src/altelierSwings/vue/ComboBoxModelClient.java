/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altelierSwings.vue;

import atelierswings.entity.Client;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author formation
 */
public class ComboBoxModelClient extends DefaultComboBoxModel {
    
    private List<Client> listeClients;

    public ComboBoxModelClient(List<Client> listeClients) {
        this.listeClients = listeClients;
    }

    public List<Client> getListeClients() {
        return listeClients;
    }

    public void setListeClients(List<Client> listeClients) {
        this.listeClients = listeClients;
    }

   

    @Override
    public Object getElementAt(int index) {
        return listeClients.get(index).getPrenom();
    }

    @Override
    public int getSize() {
        return listeClients.size();
    }
    
    
    
}
