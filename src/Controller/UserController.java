/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.User;

/**
 *
 * @author Iyed
 */
public class UserController implements UserCrud <User>
{
    public  MyConnexion mc = MyConnexion.getInstance(); 
    public Statement st ;
    
    public UserController (){
         try {
            st = MyConnexion.getConnection().createStatement();
         } catch (SQLException ex) {
            System.err.println(ex.getMessage());

         }

    }

    @Override
    public  boolean create(User obj) {        
        try {
            String sql ="INSERT INTO user (Name, Password, Login ,Email,Type ) VALUES ( '"+ obj.getName()+"','"+obj.getPassword()+"', '"+ obj.getLogin()+"', '"+ obj.getEmail()+"','"+obj.getType()+"')";
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! User not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;
        }         
    }
     
    @Override
    public boolean delete(int id) {
        try {
            
            String sql =  "DELETE FROM user  WHERE id ="+id ; 
            System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }      
    }

    @Override
    public boolean update(int id, User obj) {

        try {
           
            String sql =  "UPDATE user SET Name='"+ obj.getName()+"', Password='"+obj.getPassword()+"', Login = '"+ obj.getLogin()+"',Email= '"+ obj.getEmail()+"', Type= '"+obj.getType()+"' WHERE id ="+id ; 
            //System.out.println(sql);
            return (st.executeUpdate(sql)==1);    
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   

    }
   
    public boolean connect(String login, String pwd) {
      try {
            String sql ="SELECT * FROM user WHERE Login='"+ login +"' and Password='"+pwd +"'";
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) 
                return true;
            else
                return false;
            } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! User not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;
        } 
    }
  public boolean VerifAdmin()
  { try{
      String sql ="SELECT * FROM  user WHERE Type='admin'";
      ResultSet rs = st.executeQuery(sql);
       String r = rs.getString(6);
      if(rs.next())
      return true;  
          else
      return false;
      }
  catch(SQLException ex)
  {System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error ! User not added", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            return false;   
  }
  
  }
    @Override
    public ArrayList<User> retrieveAll() {
         try {
            String sql = "SELECT * FROM user";
            ArrayList<User>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                User u = new User();
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setLogin(rs.getString(4));
                u.setEmail(rs.getString(5));
                u.setType(rs.getString(6));
                arrayList.add(u);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public User retrieveById(int id) {
         try {
            String sql = "SELECT * FROM user";
            ArrayList<User>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql); 
            User u =  null;
            while(rs.next()){
                u = new User();
                u.setId(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setLogin(rs.getString(4));
                u.setEmail(rs.getString(5)); 
                u.setType(rs.getString(6));
                arrayList.add(u); 
                             
            }
            return u ; 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    @Override
    public ArrayList<User> retrieveByKeyWord(String key) {
          try {
            String sql = "SELECT * FROM user WHERE Name like '%"+key+"%' OR login like '%"+key+"%' OR email like '%"+key+"%'";
            ArrayList<User>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                User u = new User();
                u.setId(rs.getInt(1));
                u.setLogin(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setName(rs.getString(4));
                u.setEmail(rs.getString(5)); 
                u.setType(rs.getString(6));
                arrayList.add(u);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        public ArrayList<User> SelectByLoginPwd(String login , String pwd) {
          try {
            String sql = "SELECT * FROM user WHERE login='"+login+"' AND Password ='"+pwd+"'";
            ArrayList<User>  arrayList = new ArrayList<>();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next()){
                User u = new User();
                u.setId(rs.getInt(1));
                u.setLogin(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setName(rs.getString(4));
                u.setEmail(rs.getString(5)); 
                u.setType(rs.getString(6));
                arrayList.add(u);                
            }
            
            return arrayList;
        } catch (SQLException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    
}