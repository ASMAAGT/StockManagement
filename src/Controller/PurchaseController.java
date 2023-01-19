/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Order;
import Model.Purchase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Iyed
 */
public class PurchaseController implements OrderCrud <Purchase> {
        public  MyConnexion mc = MyConnexion.getInstance(); 
    public Statement st ;
    public PurchaseController(){
         try {
            st = MyConnexion.getConnection().createStatement();
         } catch (SQLException ex) {
            System.err.println(ex.getMessage());

         }

    }

    @Override
    public boolean create(Purchase o) {
                try {
            String sql ="INSERT INTO purchase (namePro,quantite, price,total,date ) VALUES ( '"+o.getNamePro()+"', "+ o.getQte()+","+o.getPrice()+","+o.getTotal()+",'"+o.getDate()+"')";
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! purchasing not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;
        }      
    }

    @Override
    public boolean update(int id, Purchase o) {
                  try {
           
            String sql =  "UPDATE purchase SET namePro='"+o.getNamePro()+"', quantite = "+ o.getQte()+", price = "+o.getPrice()+", total= "+o.getTotal()+" WHERE id ="+id ; 
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public boolean delete(int id) {
                        try {
            
            String sql =  "DELETE FROM purchase  WHERE id ="+id ; 
            System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public ArrayList<Purchase> retrieveAll() {
                        try {
            String sql = "SELECT * FROM purchase";
            ArrayList<Purchase>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Purchase u = new Purchase();
                u.setId(rs.getInt(1));
                u.setNamePro(rs.getString(2));
                u.setQte(rs.getInt(3));
                u.setPrice(rs.getFloat(4));
                u.setTotal(rs.getFloat(5));
                u.setDate(rs.getString(6));
               
                arrayList.add(u);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Purchase retrieveById(int id) {
               try {
            String sql = "SELECT * FROM purchase";
            ArrayList<Purchase>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql); 
            Purchase u =  null;
            while(rs.next()){
                u = new Purchase();
                     u.setId(rs.getInt(1));
                u.setNamePro(rs.getString(2));
                u.setQte(rs.getInt(3));
                u.setPrice(rs.getFloat(4));
                u.setTotal(rs.getFloat(5));
                u.setDate(rs.getString(6));
               
                arrayList.add(u);
                             
            }
            return u ; 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Purchase> retrieveByKeyWord(String key) {
                          try {
            String sql = "SELECT * FROM Purchase WHERE date like '%"+key+"%' OR namePro like '%"+key+"%'";
            ArrayList<Purchase>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Purchase u = new Purchase();
                u.setId(rs.getInt(1));
                u.setNamePro(rs.getString(2));
                u.setQte(rs.getInt(3));
                u.setPrice(rs.getFloat(4));
                u.setTotal(rs.getFloat(5));
                u.setDate(rs.getString(6));
               
                arrayList.add(u);               
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    }
    

