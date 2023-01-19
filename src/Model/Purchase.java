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
public class Purchase {
     private int Id;
    private String NamePro , date;
    private int Qte;
    private float price , total;

    public Purchase() {
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getPrice() {
        return price;
    }

    public float getTotal() {
        return total;
    }

    public int getId() {
        return Id;
    }

    public String getNamePro() {
        return NamePro;
    }

    public int getQte() {
        return Qte;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNamePro(String NamePro) {
        this.NamePro = NamePro;
    }

    public void setQte(int Qte) {
        this.Qte = Qte;
    }
    
}
