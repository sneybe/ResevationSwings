/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altelierSwings.vue;

import atelierswings.entity.Client;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author formation
 */
public class TableModelClients extends AbstractTableModel {

    private List<Client> clients;

    private TableModelClients() {
    }

    public TableModelClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public int getRowCount() {
        return clients.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client client = clients.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return client.getId();

            case 1:
                return client.getPrenom();
            case 2:
                return client.getNom();
            default:
                return new RuntimeException("L'index indiqué n'est pas correct");
        }

    }

}
