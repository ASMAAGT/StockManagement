/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.UserController;
import Model.User;
import static View.Login.isAdmin;

import java.awt.Color;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Iyed
 */
public class ShowUsers extends javax.swing.JInternalFrame {

    /**
     * Creates new form ShowUsers
     */
     public static int id ;
    public ShowUsers() {
        initComponents();
        TxtId.setEditable(false);
         if (!isAdmin )
         {
             AddButn.setEnabled(false);
             ModifyButn.setEnabled(false);
             DeleteButn.setEnabled(false);
         }
      
        ArrayList<User>  myuserlist = new UserController().retrieveAll();
        DefaultTableModel model = new DefaultTableModel() ;
        userList.setModel(model) ; 
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Login");
        model.addColumn("Password");
        model.addColumn("Type");

        for (User u : myuserlist) {            
            Object[] row =   new Object[]{u.getId(), u.getName(), u.getEmail(), u.getLogin(), u.getPassword(), u.getType() };
            model.addRow(  row);
        }
        userList.setModel(model);
       
                
 
    }
        public void refresh()
    {
        TxtId.setText("");
        TxtName.setText("");
        TxtEmail.setText("");
        TxtLogin.setText("");
        Password.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        componentMoverUtil1 = new com.k33ptoo.utils.ComponentMoverUtil();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        Txtsearch = new javax.swing.JTextField();
        Search = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userList = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ModifyButn = new com.k33ptoo.components.KButton();
        DeleteButn = new com.k33ptoo.components.KButton();
        AddButn = new com.k33ptoo.components.KButton();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        TxtName = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtId = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtLogin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("All Users");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        kGradientPanel1.setkBorderRadius(0);
        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 153));
        kGradientPanel1.setkGradientFocus(900);
        kGradientPanel1.setkStartColor(new java.awt.Color(15, 95, 134));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Txtsearch.setBackground(new Color (0,0,0,0));
        Txtsearch.setFont(new java.awt.Font("Bell MT", 0, 24)); // NOI18N
        Txtsearch.setForeground(new java.awt.Color(255, 255, 255));
        Txtsearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Txtsearch.setOpaque(false);
        kGradientPanel1.add(Txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 310, 33));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/search.png"))); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        kGradientPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/utilisateur_d1ngge8ard5t_64.png"))); // NOI18N
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, -1, -1));

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 110));

        userList.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        userList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        userList.setGridColor(new java.awt.Color(255, 255, 255));
        userList.setOpaque(false);
        userList.setSelectionBackground(new java.awt.Color(0, 153, 153));
        userList.getTableHeader().setReorderingAllowed(false);
        userList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userList);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 580, 460));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/delete_user_px74wjrc8rn6_32.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 670, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/compose_v8rchwj06sxy_32.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 730, -1, -1));

        ModifyButn.setText("Modify User");
        ModifyButn.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        ModifyButn.setkBorderRadius(50);
        ModifyButn.setkEndColor(new java.awt.Color(102, 204, 255));
        ModifyButn.setkHoverEndColor(new java.awt.Color(0, 102, 255));
        ModifyButn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        ModifyButn.setkHoverStartColor(new java.awt.Color(102, 102, 255));
        ModifyButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButnActionPerformed(evt);
            }
        });
        jPanel1.add(ModifyButn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 720, -1, -1));

        DeleteButn.setText("Delete User");
        DeleteButn.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        DeleteButn.setkBorderRadius(50);
        DeleteButn.setkEndColor(new java.awt.Color(102, 204, 255));
        DeleteButn.setkHoverEndColor(new java.awt.Color(0, 102, 255));
        DeleteButn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        DeleteButn.setkHoverStartColor(new java.awt.Color(102, 102, 255));
        DeleteButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteButn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 660, -1, -1));

        AddButn.setText("Add New User");
        AddButn.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        AddButn.setkBorderRadius(50);
        AddButn.setkEndColor(new java.awt.Color(102, 204, 255));
        AddButn.setkHoverEndColor(new java.awt.Color(0, 102, 255));
        AddButn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        AddButn.setkHoverStartColor(new java.awt.Color(102, 102, 255));
        AddButn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButnActionPerformed(evt);
            }
        });
        jPanel1.add(AddButn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic/add_user_dhb2qcoc65n2_32.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, -1, -1));

        kGradientPanel2.setkBorderRadius(50);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkFillBackground(false);
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 153, 153));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtName.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNameActionPerformed(evt);
            }
        });
        kGradientPanel2.add(TxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 260, 30));

        TxtEmail.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmailActionPerformed(evt);
            }
        });
        kGradientPanel2.add(TxtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 260, 30));

        TxtId.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TxtId.setForeground(new java.awt.Color(204, 0, 102));
        TxtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIdActionPerformed(evt);
            }
        });
        kGradientPanel2.add(TxtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 260, 30));
        kGradientPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 260, 30));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("PASSWORD :");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("LOGIN : ");
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("NAME : ");
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("EMAIL : ");
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        TxtLogin.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        TxtLogin.setForeground(new java.awt.Color(204, 0, 102));
        TxtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLoginActionPerformed(evt);
            }
        });
        kGradientPanel2.add(TxtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 260, 30));

        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("ID : ");
        kGradientPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "admin", "User" }));
        jComboBox1.setToolTipText("");
        jComboBox1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(255, 255, 255)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 120, 30));

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 350, 410));

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Users List");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
                String keywork= Txtsearch.getText();
        ArrayList<User>  myuserlist = new UserController().retrieveByKeyWord(keywork);
        DefaultTableModel model = new DefaultTableModel() ;
        userList.setModel(model) ; 
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Login");
        model.addColumn("Password");
        model.addColumn("Type");

        for (User u : myuserlist) {            
            Object[] row =   new Object[]{u.getId(), u.getName(), u.getEmail(), u.getLogin(), u.getPassword(),u.getType() };
            model.addRow(  row);
        }
        userList.setModel(model);
    }//GEN-LAST:event_SearchMouseClicked

    private void AddButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButnActionPerformed

        User user = new User();
        user.setName(TxtName.getText());
        user.setEmail(TxtEmail.getText());
        user.setLogin(TxtLogin.getText());
        user.setPassword( String.valueOf(Password.getPassword()));
        user.setType(jComboBox1.getSelectedItem().toString());
          
        boolean result = new UserController().create(user);
        
         if(result){              
            JOptionPane.showMessageDialog(this,
            user.getName().toUpperCase()+" Is successfuly added  ",
            "New User", JOptionPane.INFORMATION_MESSAGE);
            //new userList().setVisible(true);
                                ArrayList<User>  myuserlist = new UserController().retrieveAll();
                    DefaultTableModel model = new DefaultTableModel() ;
                    userList.setModel(model) ; 
                    model.addColumn("Id");
                    model.addColumn("Name");
                    model.addColumn("Email");
                    model.addColumn("Login");
                    model.addColumn("Password");
                    model.addColumn("Type");

                    for (User u : myuserlist) {            
                        Object[] row =   new Object[]{u.getId(), u.getName(), u.getEmail(), u.getLogin(), u.getPassword(),u.getType() };
                        model.addRow(  row);
                    }
                    userList.setModel(model);
            refresh();
            
            
        }else{          
            JOptionPane.showMessageDialog(this,
            "Ajout erronée ",
            "Nouvel utilisateur", JOptionPane.ERROR_MESSAGE);
        }
         refresh();
    }//GEN-LAST:event_AddButnActionPerformed

    private void ModifyButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButnActionPerformed

        User user = new User();
        user.setName(TxtName.getText());
        user.setEmail(TxtEmail.getText());
        user.setLogin(TxtLogin.getText());
        user.setPassword( String.valueOf(Password.getPassword()));
        user.setType(jComboBox1.getSelectedItem().toString());
 
        
        int id = Integer.parseInt(""+ TxtId.getText());
        boolean result = new UserController().update(id, user);
        
         if(result){              
            JOptionPane.showMessageDialog(this,
            user.getName().toUpperCase()+" est modifié avec success ",
            "Modifier utilisateur", JOptionPane.INFORMATION_MESSAGE);
            //new userList().setVisible(true);
                    ArrayList<User>  myuserlist = new UserController().retrieveAll();
                    DefaultTableModel model = new DefaultTableModel() ;
                    userList.setModel(model) ; 
                    model.addColumn("Id");
                    model.addColumn("Name");
                    model.addColumn("Email");
                    model.addColumn("Login");
                    model.addColumn("Password");
                    model.addColumn("Type");

                    for (User u : myuserlist) {            
                        Object[] row =   new Object[]{u.getId(), u.getName(), u.getEmail(), u.getLogin(), u.getPassword(),u.getType() };
                        model.addRow(  row);
                    }
                    userList.setModel(model);
          
        }else{          
            JOptionPane.showMessageDialog(this,
            "Modification erronée ",
            "Modifier utilisateur", JOptionPane.ERROR_MESSAGE);
        }
         refresh();
    }//GEN-LAST:event_ModifyButnActionPerformed

    private void TxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNameActionPerformed

    private void TxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailActionPerformed

    private void TxtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIdActionPerformed

    private void TxtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLoginActionPerformed

    private void DeleteButnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButnActionPerformed

         
        int x= userList.getSelectedRow();
        if(x == -1){
             JOptionPane.showMessageDialog(this,
            "Select row please !",
            "Information Message", JOptionPane.INFORMATION_MESSAGE);
        } else{
            int p=  JOptionPane.showConfirmDialog(this,
            "Confirm to delete row number : "+ (x+1),
            "Information Message", JOptionPane.INFORMATION_MESSAGE);
             System.out.println(p);
             if (p == 0){
                 int id =  Integer.parseInt(""+userList.getValueAt(x, 0));
                 System.out.println(id);
                 if(new UserController().delete(id)){
                      JOptionPane.showMessageDialog(this,
            "User Deleted with success!",
            "Information Message", JOptionPane.INFORMATION_MESSAGE);
                      
                      
                    ArrayList<User>  myuserlist = new UserController().retrieveAll();
                    DefaultTableModel model = new DefaultTableModel() ;
                    userList.setModel(model) ; 
                    model.addColumn("Id");
                    model.addColumn("Name");
                    model.addColumn("Email");
                    model.addColumn("Login");
                    model.addColumn("Password");
                    model.addColumn("Type");

                    for (User u : myuserlist) {            
                        Object[] row =   new Object[]{u.getId(), u.getName(), u.getEmail(), u.getLogin(), u.getPassword(),u.getType() };
                        model.addRow(  row);
                    }
                    userList.setModel(model);

                      refresh();
                      
                      
                 } else{
                      JOptionPane.showMessageDialog(this,
            "User not Deleted check with the administrator!",
            "Error Message", JOptionPane.ERROR_MESSAGE);
                 }
                 
             }
        refresh();
        }    }//GEN-LAST:event_DeleteButnActionPerformed

    private void userListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userListMouseClicked
        int x= userList.getSelectedRow();
        if(x == -1){
             JOptionPane.showMessageDialog(this,
            "Select row please !",
            "Information Message", JOptionPane.INFORMATION_MESSAGE);
        } else{

                int id = Integer.parseInt(""+userList.getValueAt(x, 0));
                String Name = (String) userList.getValueAt(x, 1);
                String Email = (String) userList.getValueAt(x, 2);
                String Login = (String) userList.getValueAt(x, 3);
                String pwd = (String) userList.getValueAt(x,4);
                String Type = (String) userList.getValueAt(x, 5);
                 TxtId.setText(String.valueOf(id));
                 TxtEmail.setText(Email);
                 TxtLogin.setText(Login);
                 TxtName.setText(Name);
                 jComboBox1.setSelectedItem(Type);

              }
    }//GEN-LAST:event_userListMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton AddButn;
    private com.k33ptoo.components.KButton DeleteButn;
    private com.k33ptoo.components.KButton ModifyButn;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel Search;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtLogin;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField Txtsearch;
    private com.k33ptoo.utils.ComponentMoverUtil componentMoverUtil1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTable userList;
    // End of variables declaration//GEN-END:variables
}
