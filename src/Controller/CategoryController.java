package Controller;

import Model.Category;

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
public class CategoryController  implements CategoryCrud <Category> {
    public  MyConnexion mc = MyConnexion.getInstance(); 
    public Statement st ;
    
    public CategoryController (){
         try {
            st = MyConnexion.getConnection().createStatement();
         } catch (SQLException ex) {
            System.err.println(ex.getMessage());

         }

    }
    @Override
    public boolean create(Category c) {
  try {
            String sql ="INSERT INTO category (nameCat) VALUES ( '"+ c.getNameCat()+"')";
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! Category not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;
        }         
        
    }

    @Override
    public boolean update(int id, Category c) {
                try {
           
            String sql =  "UPDATE category SET nameCat='"+ c.getNameCat()+"' WHERE idCat ="+id ; 
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }

    @Override
    public boolean delete(int id) {
                try {
            
            String sql =  "DELETE FROM category  WHERE idCat ="+id ; 
            System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
    }

    @Override
    public ArrayList<Category> retrieveAll() {
                 try {
            String sql = "SELECT * FROM category";
            ArrayList<Category>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Category c = new Category();
                c.setIdCat(rs.getInt(1));
                c.setNameCat(rs.getString(2));
              
                arrayList.add(c);  
                          }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public Category retrieveById(int id) {
                 try {
            String sql = "SELECT * FROM category";
            ArrayList<Category>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql); 
            Category c =  null;
            while(rs.next()){
                c = new Category();
                c.setIdCat(rs.getInt(1));
                 c.setNameCat(rs.getString(2));
               
                arrayList.add(c); 
                             
            }
            return c ; 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<Category> retrieveByKeyWord(String key) {
                try {
            String sql = "SELECT * FROM category WHERE nameCat like '%"+key+"%'";
            ArrayList<Category>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                Category c = new Category();
               c.setIdCat(rs.getInt(1));
                c.setNameCat(rs.getString(2));
               
                arrayList.add(c);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}