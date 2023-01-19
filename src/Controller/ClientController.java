/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Category;
import Model.Client;
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
public class ClientController implements ClientCrud <Client>{
    public  MyConnexion mc = MyConnexion.getInstance(); 
    public Statement st ;
    
    public ClientController (){
         try {
            st = MyConnexion.getConnection().createStatement();
         } catch (SQLException ex) {
            System.err.println(ex.getMessage());

         }}

    @Override
    public boolean create(Client c) {
         try {
            String sql ="INSERT INTO client (nameCl,phoneCl) VALUES ( '"+ c.getNameCl()+"'," + c.getPhoneCl()+ ")";
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! Client not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;
        }         
        
    }

    @Override
    public boolean update(int id, Client c) {
                        try {
           
            String sql =  "UPDATE client SET nameCl='"+ c.getNameCl()+"' , phoneCl = "+c.getPhoneCl()+" WHERE idCl ="+id ; 
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }

    @Override
    public boolean delete(int id) {
         try {    
            String sql =  "DELETE FROM client WHERE idCl ="+id ; 
            System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public ArrayList<Client> retrieveAll() {
                       try {
            String sql = "SELECT * FROM client";
            ArrayList<Client>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Client c = new Client();
                c.setIdCl(rs.getInt(1));
                c.setNameCl(rs.getString(2));
                c.setPhoneCl(rs.getInt(3));
                arrayList.add(c);  
                          }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Client retrieveById(int id) {
                         try {
            String sql = "SELECT * FROM client";
            ArrayList<Client>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql); 
            Client c =  null;
            while(rs.next()){
                c = new Client();
                c.setIdCl(rs.getInt(1));
                 c.setNameCl(rs.getString(2));
                 c.setPhoneCl(rs.getInt(3));
               
                arrayList.add(c); 
                             
            }
            return c ; 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Client> retrieveByKeyWord(String key) {
                       try {
            String sql = "SELECT * FROM client WHERE nameCl like '%"+key+"%' OR phoneCl like '%"+key+"%'";
            ArrayList<Client>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Client c = new Client();
               c.setIdCl(rs.getInt(1));
                c.setNameCl(rs.getString(2));
                c.setPhoneCl(rs.getInt(3));
               
                arrayList.add(c);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(ClientController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    }
    

