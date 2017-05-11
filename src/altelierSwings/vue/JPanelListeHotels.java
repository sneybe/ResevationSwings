/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altelierSwings.vue;

import atelierswings.entity.Hotel;
import atelierswings.service.HotelService;
import java.awt.BorderLayout;
import java.util.List;

/**
 *
 * @author formation
 */
public class JPanelListeHotels extends javax.swing.JPanel {

    /**
     * Creates new form JPanelListeHotels
     */
    public JPanelListeHotels() {
        initComponents();
        
        // Code maison
        HotelService service = new HotelService();
        List<Hotel> listeHotels = service.listerHotel();
        TableModelHotels model = new TableModelHotels(listeHotels);
        this.jTableHotels.setModel(model);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jBAjouter = new javax.swing.JButton();
        jBModifier = new javax.swing.JButton();
        jBSupprimer = new javax.swing.JButton();
        jBGererChambres = new javax.swing.JButton();
        jSPCentre = new javax.swing.JScrollPane();
        jTableHotels = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jToolBar1.setRollover(true);

        jBAjouter.setText("Ajouter");
        jBAjouter.setFocusable(false);
        jBAjouter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAjouter.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAjouterActionPerformed(evt);
            }
        });
        jToolBar1.add(jBAjouter);

        jBModifier.setText("Modifier");
        jBModifier.setFocusable(false);
        jBModifier.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBModifier.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModifierActionPerformed(evt);
            }
        });
        jToolBar1.add(jBModifier);

        jBSupprimer.setText("Supprimer");
        jBSupprimer.setFocusable(false);
        jBSupprimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBSupprimer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBSupprimer);

        jBGererChambres.setText("Gérer les Chambres");
        jBGererChambres.setFocusable(false);
        jBGererChambres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGererChambres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBGererChambres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGererChambresActionPerformed(evt);
            }
        });
        jToolBar1.add(jBGererChambres);

        add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        jTableHotels.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Adresse", "Etoiles"
            }
        ));
        jSPCentre.setViewportView(jTableHotels);

        add(jSPCentre, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jBAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAjouterActionPerformed
//        JPanelPrincipal.getSingleton().remove(this);
    JPanelPrincipal parent=(JPanelPrincipal)this.getParent();
    
    parent.remplacecomposantCentral(new JPanelHotel());
    
    
    
       
    }//GEN-LAST:event_jBAjouterActionPerformed

    private void jBModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModifierActionPerformed
     
        Long row = (Long) this.jTableHotels.getModel().getValueAt(this.jTableHotels.getSelectedRow(), 0);
        Hotel h = new HotelService().selectHotel(row);
        
        JPanelPrincipal parent = (JPanelPrincipal) this.getParent();

        parent.remplacecomposantCentral(new JPanelModifierHotel(h));
    }//GEN-LAST:event_jBModifierActionPerformed

    private void jBGererChambresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGererChambresActionPerformed
        Long row = (Long) this.jTableHotels.getModel().getValueAt(this.jTableHotels.getSelectedRow(), 0);
        Hotel h = new HotelService().selectHotel(row);
        JPanelPrincipal parent = (JPanelPrincipal) this.getParent();
        parent.remplacecomposantCentral(new JpanelListeChambre(h));
    }//GEN-LAST:event_jBGererChambresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAjouter;
    private javax.swing.JButton jBGererChambres;
    private javax.swing.JButton jBModifier;
    private javax.swing.JButton jBSupprimer;
    private javax.swing.JScrollPane jSPCentre;
    private javax.swing.JTable jTableHotels;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
