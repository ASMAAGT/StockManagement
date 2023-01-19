/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Order;
import Model.User;
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
public class OrderController implements OrderCrud<Order> {
    public  MyConnexion mc = MyConnexion.getInstance(); 
    public Statement st ;
    public OrderController (){
         try {
            st = MyConnexion.getConnection().createStatement();
         } catch (SQLException ex) {
            System.err.println(ex.getMessage());

         }

    }
    @Override
    public boolean create(Order o) {
        try {
            String sql ="INSERT INTO orders (nameCl, namePro, quantite, price,total,date ) VALUES ( '"+ o.getNameCl()+"','"+o.getNamePro()+"', "+ o.getQte()+","+o.getPrice()+","+o.getTotal()+",'"+o.getDate()+"')";
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! Order not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;
        }      }

    @Override
    public boolean update(int id, Order o) {
          try {
           
            String sql =  "UPDATE orders SET nameCl='"+ o.getNameCl()+"', namePro='"+o.getNamePro()+"', quantite = "+ o.getQte()+", price = "+o.getPrice()+", total= "+o.getTotal()+" WHERE id ="+id ; 
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public boolean delete(int id) {
                try {
            
            String sql =  "DELETE FROM orders  WHERE id ="+id ; 
            System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public ArrayList<Order> retrieveAll() {
                try {
            String sql = "SELECT * FROM orders";
            ArrayList<Order>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Order u = new Order();
                u.setId(rs.getInt(1));
                u.setNameCl(rs.getString(2));
                u.setNamePro(rs.getString(3));
                u.setQte(rs.getInt(4));
                u.setPrice(rs.getFloat(5));
                u.setTotal(rs.getFloat(6));
                u.setDate(rs.getString(7));
               
                arrayList.add(u);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Order retrieveById(int id) {
               try {
            String sql = "SELECT * FROM orders";
            ArrayList<Order>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql); 
            Order u =  null;
            while(rs.next()){
                u = new Order();
                u.setId(rs.getInt(1));
                u.setNameCl(rs.getString(2));
                u.setNamePro(rs.getString(3));
                u.setQte(rs.getInt(4));
                u.setPrice(rs.getFloat(5));
                u.setTotal(rs.getFloat(6));
                u.setDate(rs.getString(7));
               
                arrayList.add(u); 
                             
            }
            return u ; 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Order> retrieveByKeyWord(String key) {
                  try {
            String sql = "SELECT * FROM order WHERE nameCl like '%"+key+"%' OR date like '%"+key+"%'";
            ArrayList<Order>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Order u = new Order();
                u.setId(rs.getInt(1));
                u.setNameCl(rs.getString(2));
                u.setNamePro(rs.getString(3));
                u.setQte(rs.getInt(4));
                u.setPrice(rs.getFloat(5));
                u.setTotal(rs.getFloat(6));
                u.setDate(rs.getString(7));
               
                arrayList.add(u);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    }
    

