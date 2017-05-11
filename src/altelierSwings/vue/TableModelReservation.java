/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altelierSwings.vue;

import atelierswings.entity.Chambre;
import atelierswings.entity.Reservation;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author formation
 */
public class TableModelReservation extends AbstractTableModel {

    private List<Reservation> reservations;

    public TableModelReservation() {
    }

    public TableModelReservation(List<Reservation> reservations) {
        this.reservations = reservations;
    }
    
    @Override
    public int getRowCount() {
        return this.reservations.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reservation res = reservations.get(rowIndex);
        if(columnIndex == 0){
            return res.getId();
        }
            
        if(columnIndex == 1){
            return res.getDateDebut();
        }
            
        if(columnIndex == 2) {
            return res.getDateFin();
        }
            
      if(columnIndex == 3){
            return res.getClient().getPrenom() + " " + res.getClient().getNom();
       }
      
      if(columnIndex == 4) {
          return res.getChambres().get(rowIndex).getNom();
      }
            
        
         return new RuntimeException("L'index indiqué n'est pas correct");
        
    }
    
}
