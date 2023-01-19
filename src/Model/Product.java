/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



/**
 *
 * @author Iyed
 */

public class Product {
        private int idPro ;
        private String namePro ;
        private float pricePro ;
        private int Qte;
    
        private String categorie;

    public int getIdPro() {
        return idPro;
    }

    public String getNamePro() {
        return namePro;
    }

    public float getPrice() {
        return pricePro;
    }

    public int getQte() {
        return Qte;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setId(int idPro) {
        this.idPro = idPro;
    }

    public void setNamePro(String namePro) {
        this.namePro = namePro;
    }

    public void setPrice(float pricePro) {
        this.pricePro = pricePro;
    }

    public void setQte(int Qte) {
        this.Qte = Qte;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public Product() {
    }
    
        
        
    
}
