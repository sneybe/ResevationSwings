/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altelierSwings.vue;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author formation
 */
public class JPanelPrincipal extends javax.swing.JPanel {

   
    public void remplacecomposantCentral(JPanel nouveauPanneau ){
        
        BorderLayout layout=(BorderLayout) this.getLayout();
        Component component =layout.getLayoutComponent(BorderLayout.CENTER);
        if(component!=null){
            this.remove(component);
        }
         this.add(nouveauPanneau, BorderLayout.CENTER);
         
         this.validate();
        
    }
    public JPanelPrincipal() {
       
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        Jbh = new javax.swing.JButton();
        jbch = new javax.swing.JButton();
        jbcl = new javax.swing.JButton();
        jbres = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jToolBar2.setRollover(true);

        Jbh.setText("Hotel");
        Jbh.setFocusable(false);
        Jbh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Jbh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Jbh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbhActionPerformed(evt);
            }
        });
        jToolBar2.add(Jbh);

        jbch.setText("Chambre");
        jbch.setFocusable(false);
        jbch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbchActionPerformed(evt);
            }
        });
        jToolBar2.add(jbch);

        jbcl.setText("Client");
        jbcl.setFocusable(false);
        jbcl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbcl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jbcl);

        jbres.setText("Reservations");
        jbres.setFocusable(false);
        jbres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(jbres);

        add(jToolBar2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void JbhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbhActionPerformed
       
        this.remplacecomposantCentral(new JPanelListeHotels());
       
       
    }//GEN-LAST:event_JbhActionPerformed

    private void jbchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbchActionPerformed
         this.remplacecomposantCentral(new JpanelListeChambre());
    }//GEN-LAST:event_jbchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbh;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jbch;
    private javax.swing.JButton jbcl;
    private javax.swing.JButton jbres;
    // End of variables declaration//GEN-END:variables
}
