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
public class ComboBoxModelChambre extends DefaultComboBoxModel {
    private List<Chambre> listeChambres;

    public ComboBoxModelChambre(List<Chambre> listeChambres) {
        this.listeChambres = listeChambres;
    }

    public List<Chambre> getListeChambres() {
        return listeChambres;
    }

    public void setListeChambres(List<Chambre> listeChambres) {
        this.listeChambres = listeChambres;
    }

    @Override
    public Object getElementAt(int index) {
        return listeChambres.get(index).getNom();
    }

    @Override
    public int getSize() {
        return listeChambres.size();
    }
    
    
}
