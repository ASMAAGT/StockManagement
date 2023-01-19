/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static View.Login.isConnect;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;




/**
 *
 * @author Iyed
 */
public class Home extends javax.swing.JFrame {
   

    /**
     * Creates new form Home
     */
    
    public Home() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Home");  
  Login login = new Login();
        jDesktopPane2.add(login);
        login.setVisible(true);


                }
        

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        btn_LogOut = new com.k33ptoo.components.KButton();
        btn_PuList = new com.k33ptoo.components.KButton();
        btn_Clist = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        btn_OrderList = new com.k33ptoo.components.KButton();
        btn_ShowStock = new com.k33ptoo.components.KButton();
        btn_Morder = new com.k33ptoo.components.KButton();
        btn_ShowUsers1 = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_Mpur = new com.k33ptoo.components.KButton();
        btn_ShowCategories = new com.k33ptoo.components.KButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkGradientFocus(900);
        kGradientPanel1.setkStartColor(new java.awt.Color(15, 95, 134));
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseClicked(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_LogOut.setBorder(null);
        btn_LogOut.setText("Sign out");
        btn_LogOut.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btn_LogOut.setkBorderRadius(50);
        btn_LogOut.setkEndColor(new java.awt.Color(153, 153, 255));
        btn_LogOut.setkFillButton(false);
        btn_LogOut.setkHoverEndColor(new java.awt.Color(160, 133, 236));
        btn_LogOut.setkHoverForeGround(new java.awt.Color(0, 153, 204));
        btn_LogOut.setkHoverStartColor(new java.awt.Color(0, 102, 153));
        btn_LogOut.setkStartColor(new java.awt.Color(255, 255, 255));
        btn_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogOutActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 660, 170, 40));

        btn_PuList.setBorder(null);
        btn_PuList.setText("Purchases List");
        btn_PuList.setActionCommand("stock Management");
        btn_PuList.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btn_PuList.setkBorderRadius(50);
        btn_PuList.setkEndColor(new java.awt.Color(153, 153, 255));
        btn_PuList.setkFillButton(false);
        btn_PuList.setkHoverEndColor(new java.awt.Color(160, 133, 236));
        btn_PuList.setkHoverForeGround(new java.awt.Color(0, 153, 204));
        btn_PuList.setkHoverStartColor(new java.awt.Color(0, 102, 153));
        btn_PuList.setkStartColor(new java.awt.Color(255, 255, 255));
        btn_PuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PuListActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_PuList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 170, 40));

        btn_Clist.setBorder(null);
        btn_Clist.setText("Show Clients");
        btn_Clist.setActionCommand("");
        btn_Clist.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btn_Clist.setkBorderRadius(50);
        btn_Clist.setkEndColor(new java.awt.Color(153, 153, 255));
        btn_Clist.setkFillButton(false);
        btn_Clist.setkHoverEndColor(new java.awt.Color(160, 133, 236));
        btn_Clist.setkHoverForeGround(new java.awt.Color(0, 153, 204));
        btn_Clist.setkHoverStartColor(new java.awt.Color(0, 102, 153));
        btn_Clist.setkStartColor(new java.awt.Color(255, 255, 255));
        btn_Clist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClistActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_Clist, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/product_6ot9dfitznrq_128_1.png"))); // NOI18N
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 160, 130));

        btn_OrderList.setBorder(null);
        btn_OrderList.setText("Orders List");
        btn_OrderList.setActionCommand("stock Management");
        btn_OrderList.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btn_OrderList.setkBorderRadius(50);
        btn_OrderList.setkEndColor(new java.awt.Color(153, 153, 255));
        btn_OrderList.setkFillButton(false);
        btn_OrderList.setkHoverEndColor(new java.awt.Color(160, 133, 236));
        btn_OrderList.setkHoverForeGround(new java.awt.Color(0, 153, 204));
        btn_OrderList.setkHoverStartColor(new java.awt.Color(0, 102, 153));
        btn_OrderList.setkStartColor(new java.awt.Color(255, 255, 255));
        btn_OrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OrderListActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_OrderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 170, 40));

        btn_ShowStock.setBorder(null);
        btn_ShowStock.setText("Show Stock");
        btn_ShowStock.setActionCommand("");
        btn_ShowStock.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btn_ShowStock.setkBorderRadius(50);
        btn_ShowStock.setkEndColor(new java.awt.Color(153, 153, 255));
        btn_ShowStock.setkFillButton(false);
        btn_ShowStock.setkHoverEndColor(new java.awt.Color(160, 133, 236));
        btn_ShowStock.setkHoverForeGround(new java.awt.Color(0, 153, 204));
        btn_ShowStock.setkHoverStartColor(new java.awt.Color(0, 102, 153));
        btn_ShowStock.setkStartColor(new java.awt.Color(255, 255, 255));
        btn_ShowStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowStockActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_ShowStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 170, 40));

        btn_Morder.setBorder(null);
        btn_Morder.setText("Make Order");
        btn_Morder.setActionCommand("stock Management");
        btn_Morder.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btn_Morder.setkBorderRadius(50);
        btn_Morder.setkEndColor(new java.awt.Color(153, 153, 255));
        btn_Morder.setkFillButton(false);
        btn_Morder.setkHoverEndColor(new java.awt.Color(160, 133, 236));
        btn_Morder.setkHoverForeGround(new java.awt.Color(0, 153, 204));
        btn_Morder.setkHoverStartColor(new java.awt.Color(0, 102, 153));
        btn_Morder.setkStartColor(new java.awt.Color(255, 255, 255));
        btn_Morder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MorderActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_Morder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 170, 40));

        btn_ShowUsers1.setBorder(null);
        btn_ShowUsers1.setText("Show Users");
        btn_ShowUsers1.setActionCommand("stock Management");
        btn_ShowUsers1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btn_ShowUsers1.setkBorderRadius(50);
        btn_ShowUsers1.setkEndColor(new java.awt.Color(153, 153, 255));
        btn_ShowUsers1.setkFillButton(false);
        btn_ShowUsers1.setkHoverEndColor(new java.awt.Color(160, 133, 236));
        btn_ShowUsers1.setkHoverForeGround(new java.awt.Color(0, 153, 204));
        btn_ShowUsers1.setkHoverStartColor(new java.awt.Color(0, 102, 153));
        btn_ShowUsers1.setkStartColor(new java.awt.Color(255, 255, 255));
        btn_ShowUsers1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowUsers1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_ShowUsers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 170, 40));

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Stock Management");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ASMAAGT");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 790, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/github-logo.png"))); // NOI18N
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 780, -1, -1));

        btn_Mpur.setBorder(null);
        btn_Mpur.setText("Make Purchase");
        btn_Mpur.setActionCommand("stock Management");
        btn_Mpur.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btn_Mpur.setkBorderRadius(50);
        btn_Mpur.setkEndColor(new java.awt.Color(153, 153, 255));
        btn_Mpur.setkFillButton(false);
        btn_Mpur.setkHoverEndColor(new java.awt.Color(160, 133, 236));
        btn_Mpur.setkHoverForeGround(new java.awt.Color(0, 153, 204));
        btn_Mpur.setkHoverStartColor(new java.awt.Color(0, 102, 153));
        btn_Mpur.setkStartColor(new java.awt.Color(255, 255, 255));
        btn_Mpur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MpurActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_Mpur, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 170, 40));

        btn_ShowCategories.setBorder(null);
        btn_ShowCategories.setText("Show Categories");
        btn_ShowCategories.setActionCommand("stock Management");
        btn_ShowCategories.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btn_ShowCategories.setkBorderRadius(50);
        btn_ShowCategories.setkEndColor(new java.awt.Color(153, 153, 255));
        btn_ShowCategories.setkFillButton(false);
        btn_ShowCategories.setkHoverEndColor(new java.awt.Color(160, 133, 236));
        btn_ShowCategories.setkHoverForeGround(new java.awt.Color(0, 153, 204));
        btn_ShowCategories.setkHoverStartColor(new java.awt.Color(0, 102, 153));
        btn_ShowCategories.setkStartColor(new java.awt.Color(255, 255, 255));
        btn_ShowCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowCategoriesActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btn_ShowCategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 170, 40));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 820));

        jDesktopPane2.setDesktopManager(null);
        getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1160, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogOutActionPerformed
if (isConnect==true){
        jDesktopPane2.removeAll();
          Login login = new Login();
        jDesktopPane2.add(login);
        login.setVisible(true);
          isConnect=false;
}
    }//GEN-LAST:event_btn_LogOutActionPerformed

    private void btn_ShowStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowStockActionPerformed
        //        jDesktopPane2.removeAll();
        if (isConnect==true){
           
        ShowStock ShowStock = new ShowStock();
        jDesktopPane2.add(ShowStock);
        ShowStock.setVisible(true);
        }

    }//GEN-LAST:event_btn_ShowStockActionPerformed

    private void btn_MorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MorderActionPerformed
       if (isConnect==true){
        MakeOrder Import = new MakeOrder();
        jDesktopPane2.add(Import);
        Import.setVisible(true);
       }
    }//GEN-LAST:event_btn_MorderActionPerformed

    private void btn_PuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PuListActionPerformed
        if (isConnect==true){
        ShowPurchases ShowPurchases = new ShowPurchases();
        jDesktopPane2.add(ShowPurchases);
        ShowPurchases.setVisible(true);
        }
    }//GEN-LAST:event_btn_PuListActionPerformed

    private void btn_OrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OrderListActionPerformed
        if (isConnect==true){
        ShowOrders ShowCategory = new ShowOrders();
        jDesktopPane2.add(ShowCategory);
        ShowCategory.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btn_OrderListActionPerformed

    private void btn_ClistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClistActionPerformed
        if (isConnect==true){
        ShowClients Clients = new ShowClients();
        jDesktopPane2.add(Clients);
        Clients.setVisible(true);
        }
    }//GEN-LAST:event_btn_ClistActionPerformed

    private void btn_ShowUsers1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowUsers1ActionPerformed
       if (isConnect==true){
        ShowUsers ShowUsers = new ShowUsers();
        jDesktopPane2.add(ShowUsers);
        ShowUsers.setVisible(true);
       }
    }//GEN-LAST:event_btn_ShowUsers1ActionPerformed

    private void btn_MpurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MpurActionPerformed
         if (isConnect==true){
        MakePurchase Export = new MakePurchase();
        jDesktopPane2.add(Export);
        Export.setVisible(true);
         }
    }//GEN-LAST:event_btn_MpurActionPerformed

    private void btn_ShowCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowCategoriesActionPerformed
       if (isConnect==true){
        ShowCategory cat = new ShowCategory();
        jDesktopPane2.add(cat);
        cat.setVisible(true);
       }
    }//GEN-LAST:event_btn_ShowCategoriesActionPerformed

    private void kGradientPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseClicked

    }//GEN-LAST:event_kGradientPanel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.k33ptoo.components.KButton btn_Clist;
    private com.k33ptoo.components.KButton btn_LogOut;
    public com.k33ptoo.components.KButton btn_Morder;
    public com.k33ptoo.components.KButton btn_Mpur;
    public com.k33ptoo.components.KButton btn_OrderList;
    public com.k33ptoo.components.KButton btn_PuList;
    public com.k33ptoo.components.KButton btn_ShowCategories;
    public com.k33ptoo.components.KButton btn_ShowStock;
    protected com.k33ptoo.components.KButton btn_ShowUsers1;
    public javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
