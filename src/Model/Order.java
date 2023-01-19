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
public class Order {
    private int Id;
    private String NameCl;
    private String NamePro , date;
    private int Qte;
    private float price , total;

    public Order() {
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

    public String getNameCl() {
        return NameCl;
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

    public void setNameCl(String NameCl) {
        this.NameCl = NameCl;
    }

    public void setNamePro(String NamePro) {
        this.NamePro = NamePro;
    }

    public void setQte(int Qte) {
        this.Qte = Qte;
    }
    
    
}
