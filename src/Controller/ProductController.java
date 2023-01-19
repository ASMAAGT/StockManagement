/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product;
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
public class ProductController implements ProductCrud <Product>{
        public  MyConnexion mc = MyConnexion.getInstance(); 
    public Statement st ;
    
    public ProductController (){
         try {
            st = MyConnexion.getConnection().createStatement();
         } catch (SQLException ex) {
            System.err.println(ex.getMessage());

         }

    }

    @Override
    public boolean create(Product p) {
                try {
            String sql ="INSERT INTO product (namePro, category, quantity,price) VALUES ( '"+ p.getNamePro()+"','"+p.getCategorie()+"', "+ p.getQte()+", "+ p.getPrice()+")";
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! Product not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;
        }
        
    }

    @Override
    public boolean update(int id, Product p) {
               try {
           
            String sql =  "UPDATE product SET namePro='"+ p.getNamePro()+"', category= '"+p.getCategorie()+"', quantity= "+ p.getQte()+", price= "+ p.getPrice()+" WHERE idPro ="+id ; 
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }

    @Override
    public boolean delete(int id) {
               try {
            
            String sql =  "DELETE FROM product  WHERE idPro ="+id ; 
            System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public ArrayList<Product> retrieveAll() {
         try {
            String sql = "SELECT * FROM product";
            ArrayList<Product>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setNamePro(rs.getString(2));
                p.setCategorie (rs.getString(3)) ;
                p.setQte(rs.getInt(4));
                p.setPrice(rs.getFloat(5));
           
                arrayList.add(p);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Product retrieveById(int id) {
                 try {
            String sql = "SELECT * FROM product";
            ArrayList<Product>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql); 
            Product p =  null;
            while(rs.next()){
                 p = new Product();
                p.setId(rs.getInt(1));
                p.setNamePro(rs.getString(2));
                p.setCategorie (rs.getString(3)) ;
                p.setQte(rs.getInt(4));
                p.setPrice(rs.getFloat(5));
           
                arrayList.add(p);   
                             
            }
            return p ; 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Product> retrieveByKeyWord(String key) {
                 try {
            String sql = "SELECT * FROM product WHERE namePro like '%"+key+"%' OR category like '%"+key+"%' OR price like %"+key+"%";
            ArrayList<Product>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setNamePro(rs.getString(2));
                p.setCategorie (rs.getString(3)) ;
                p.setQte(rs.getInt(4));
                p.setPrice(rs.getFloat(5));
           
                arrayList.add(p);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(ProductController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
