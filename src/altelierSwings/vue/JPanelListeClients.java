/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altelierSwings.vue;

import atelierswings.entity.Client;
import atelierswings.service.ClientService;
import java.util.List;

/**
 *
 * @author formation
 */
public class JPanelListeClients extends javax.swing.JPanel {

    /** Creates new form JPanelListeClients */
    public JPanelListeClients() {
        initComponents();
        
        ClientService service = new ClientService();
        List<Client> clients = service.listerClient();
        TableModelClients model = new TableModelClients(clients);
        this.jTClients.setModel(model);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jBAjout = new javax.swing.JButton();
        jBModifier = new javax.swing.JButton();
        jBSupprimer = new javax.swing.JButton();
        jBGReservations = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClients = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jBAjout.setText("Ajouter");
        jBAjout.setFocusable(false);
        jBAjout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAjout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAjoutActionPerformed(evt);
            }
        });
        jToolBar1.add(jBAjout);

        jBModifier.setText("Modifier");
        jBModifier.setFocusable(false);
        jBModifier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBModifier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBModifier);

        jBSupprimer.setText("Supprimer");
        jBSupprimer.setFocusable(false);
        jBSupprimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSupprimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBSupprimer);

        jBGReservations.setText("Gérer réservations");
        jBGReservations.setFocusable(false);
        jBGReservations.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGReservations.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBGReservations);

        add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jTClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTClients);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAjoutActionPerformed
        JPanelPrincipal parent = (JPanelPrincipal) this.getParent();
        parent.remplacecomposantCentral(new JPanelClient());
    }//GEN-LAST:event_jBAjoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAjout;
    private javax.swing.JButton jBGReservations;
    private javax.swing.JButton jBModifier;
    private javax.swing.JButton jBSupprimer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClients;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

}