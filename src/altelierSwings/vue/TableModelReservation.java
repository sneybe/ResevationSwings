/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altelierSwings.vue;

import atelierswings.entity.Reservation;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author formation
 */
public class TableModelReservation extends AbstractTableModel {

    private List<Reservation> reservations;

    private TableModelReservation() {

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
        return 2;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Reservation reservation =reservations.get(rowIndex);
       
       if(columnIndex==0){
           return reservation.getId();
       }
       else if(columnIndex==1){
           return reservation.getClient().getNom();
       }
  
       else {
           return new RuntimeException("indice introuvale ");
       }
    }

}
