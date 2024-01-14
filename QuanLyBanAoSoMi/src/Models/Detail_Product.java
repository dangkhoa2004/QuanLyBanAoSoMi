/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Detail_Product {
    private int ID_Detail_Product;
    private int ID_Product;
    private int ID_Size;
    private int ID_Color;
    private int ID_Material;
    private int ID_Collar_Model;
    private int ID_IMG;
    private int ID_Button;
    private int ID_Brand;
    private int ID_Style;
    private String Code_Product_Detail;
    private String Quantity;
    private String Price;
    private int Status;

    public Detail_Product() {
    }

    public Detail_Product(int ID_Detail_Product, int ID_Product, int ID_Size, int ID_Color, int ID_Material, int ID_Collar_Model, int ID_IMG, int ID_Button, int ID_Brand, int ID_Style, String Code_Product_Detail, String Quantity, String Price, int Status) {
        this.ID_Detail_Product = ID_Detail_Product;
        this.ID_Product = ID_Product;
        this.ID_Size = ID_Size;
        this.ID_Color = ID_Color;
        this.ID_Material = ID_Material;
        this.ID_Collar_Model = ID_Collar_Model;
        this.ID_IMG = ID_IMG;
        this.ID_Button = ID_Button;
        this.ID_Brand = ID_Brand;
        this.ID_Style = ID_Style;
        this.Code_Product_Detail = Code_Product_Detail;
        this.Quantity = Quantity;
        this.Price = Price;
        this.Status = Status;
    }

    public int getID_Detail_Product() {
        return ID_Detail_Product;
    }

    public void setID_Detail_Product(int ID_Detail_Product) {
        this.ID_Detail_Product = ID_Detail_Product;
    }

    public int getID_Product() {
        return ID_Product;
    }

    public void setID_Product(int ID_Product) {
        this.ID_Product = ID_Product;
    }

    public int getID_Size() {
        return ID_Size;
    }

    public void setID_Size(int ID_Size) {
        this.ID_Size = ID_Size;
    }

    public int getID_Color() {
        return ID_Color;
    }

    public void setID_Color(int ID_Color) {
        this.ID_Color = ID_Color;
    }

    public int getID_Material() {
        return ID_Material;
    }

    public void setID_Material(int ID_Material) {
        this.ID_Material = ID_Material;
    }

    public int getID_Collar_Model() {
        return ID_Collar_Model;
    }

    public void setID_Collar_Model(int ID_Collar_Model) {
        this.ID_Collar_Model = ID_Collar_Model;
    }

    public int getID_IMG() {
        return ID_IMG;
    }

    public void setID_IMG(int ID_IMG) {
        this.ID_IMG = ID_IMG;
    }

    public int getID_Button() {
        return ID_Button;
    }

    public void setID_Button(int ID_Button) {
        this.ID_Button = ID_Button;
    }

    public int getID_Brand() {
        return ID_Brand;
    }

    public void setID_Brand(int ID_Brand) {
        this.ID_Brand = ID_Brand;
    }

    public int getID_Style() {
        return ID_Style;
    }

    public void setID_Style(int ID_Style) {
        this.ID_Style = ID_Style;
    }

    public String getCode_Product_Detail() {
        return Code_Product_Detail;
    }

    public void setCode_Product_Detail(String Code_Product_Detail) {
        this.Code_Product_Detail = Code_Product_Detail;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
