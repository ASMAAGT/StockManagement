/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import Controller.PurchaseController;
import Model.Order;
import Model.Purchase;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iyed
 */
public class ShowPurchases extends javax.swing.JInternalFrame {

    /**
     * Creates new form ShowPurchases
     */
    public ShowPurchases() {
        initComponents();
                 ArrayList<Purchase>  mypurchaselist = new PurchaseController().retrieveAll();
        DefaultTableModel model = new DefaultTableModel() ;
        PurchasesList.setModel(model) ; 
                    model.addColumn("Id");
                    model.addColumn("NameProduct");
                    model.addColumn("Quantity");
                    model.addColumn("Price");
                    model.addColumn("Total");
                    model.addColumn("Date");

                    for (Purchase u : mypurchaselist) {            
                        Object[] row =   new Object[]{u.getId(), u.getNamePro(), u.getQte(), u.getPrice(),u.getTotal(),u.getDate() };
                        model.addRow(  row);
                    }
                    PurchasesList.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PurchasesList = new javax.swing.JTable();
        Txtsearch = new javax.swing.JTextField();
        Search = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkGradientFocus(900);
        kGradientPanel1.setkStartColor(new java.awt.Color(15, 95, 134));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Purchases List");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/delivery_service_45c25as3bdbd_64.png"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, -1, -1));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 120));

        PurchasesList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(PurchasesList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 880, 320));

        Txtsearch.setBackground(new Color (0,0,0,0));
        Txtsearch.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        Txtsearch.setForeground(new java.awt.Color(255, 255, 255));
        Txtsearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(15, 95, 134)));
        Txtsearch.setOpaque(false);
        jPanel1.add(Txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 310, 33));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/search_r3mpefxhd0uh_32.png"))); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        String keyword= Txtsearch.getText();
        ArrayList<Purchase>  mypurchaselist = new PurchaseController().retrieveByKeyWord(keyword);
        DefaultTableModel model = new DefaultTableModel() ;
        PurchasesList.setModel(model) ; 
                    model.addColumn("Id");
                    model.addColumn("NameProduct");
                    model.addColumn("Quantity");
                    model.addColumn("Price");
                    model.addColumn("Total");
                    model.addColumn("Date");

        for (Purchase u : mypurchaselist) {            
                        Object[] row =   new Object[]{u.getId(), u.getNamePro(), u.getQte(), u.getPrice(),u.getTotal(),u.getDate() };
                        model.addRow(  row);
                    }
                    PurchasesList.setModel(model);
    }//GEN-LAST:event_SearchMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable PurchasesList;
    private javax.swing.JLabel Search;
    private javax.swing.JTextField Txtsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
