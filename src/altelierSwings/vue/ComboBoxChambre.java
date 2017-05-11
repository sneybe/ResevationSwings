/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altelierSwings.vue;

import atelierswings.entity.Chambre;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author formation
 */
public class ComboBoxChambre extends DefaultComboBoxModel {
    
    private List<Chambre>chambres;

    public ComboBoxChambre(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }



    public void setChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    @Override
    public Object getElementAt(int index) {
        return this.chambres.get(index).getNom();
    }

    @Override
    public int getSize() {
        return chambres.size();
    }
    
    
}
