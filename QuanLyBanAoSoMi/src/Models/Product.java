/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Product {
    private int ID_Product;
    private String Code_Product;
    private String Product_Name;
    private int Status;

    public Product() {
    }

    public Product(int ID_Product, String Code_Product, String Product_Name, int Status) {
        this.ID_Product = ID_Product;
        this.Code_Product = Code_Product;
        this.Product_Name = Product_Name;
        this.Status = Status;
    }

    public int getID_Product() {
        return ID_Product;
    }

    public void setID_Product(int ID_Product) {
        this.ID_Product = ID_Product;
    }

    public String getCode_Product() {
        return Code_Product;
    }

    public void setCode_Product(String Code_Product) {
        this.Code_Product = Code_Product;
    }

    public String getProduct_Name() {
        return Product_Name;
    }

    public void setProduct_Name(String Product_Name) {
        this.Product_Name = Product_Name;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
