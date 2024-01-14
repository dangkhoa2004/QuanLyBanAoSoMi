/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Brand {
    private int ID_Brand;
    private String Code_Brand;
    private String Brand_Name;
    private String Describe_Brand;
    private int Status;

    public Brand() {
    }

    public Brand(int ID_Brand, String Code_Brand, String Brand_Name, String Describe_Brand, int Status) {
        this.ID_Brand = ID_Brand;
        this.Code_Brand = Code_Brand;
        this.Brand_Name = Brand_Name;
        this.Describe_Brand = Describe_Brand;
        this.Status = Status;
    }

    public int getID_Brand() {
        return ID_Brand;
    }

    public void setID_Brand(int ID_Brand) {
        this.ID_Brand = ID_Brand;
    }

    public String getCode_Brand() {
        return Code_Brand;
    }

    public void setCode_Brand(String Code_Brand) {
        this.Code_Brand = Code_Brand;
    }

    public String getBrand_Name() {
        return Brand_Name;
    }

    public void setBrand_Name(String Brand_Name) {
        this.Brand_Name = Brand_Name;
    }

    public String getDescribe_Brand() {
        return Describe_Brand;
    }

    public void setDescribe_Brand(String Describe_Brand) {
        this.Describe_Brand = Describe_Brand;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
