/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author Iyed
 */
public interface OrderCrud <T> {
    boolean create (T u);
    boolean update (int id, T u);
    boolean delete (int id);
    ArrayList<T> retrieveAll();
    T retrieveById (int id);
    ArrayList <T> retrieveByKeyWord (String key);
    
    
}
