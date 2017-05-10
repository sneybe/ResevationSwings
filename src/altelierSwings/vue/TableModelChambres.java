/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altelierSwings.vue;

import atelierswings.entity.Chambre;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author formation
 */
public class TableModelChambres extends AbstractTableModel {

    private List<Chambre> chambres;

    private TableModelChambres() {

    }

    public TableModelChambres(List<Chambre> chambres) {
        this.chambres = chambres;
    }

    @Override
    public int getRowCount() {

        return this.chambres.size();

    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Chambre chambre = chambres.get(rowIndex);

        if (columnIndex == 0) {
            return chambre.getId();
        } else if (columnIndex == 1) {
            return chambre.getNom();
        } else {
            return new RuntimeException("indice de colonne incorrect ");
        }
    }

}
