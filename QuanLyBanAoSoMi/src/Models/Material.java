/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Material {
    private int ID_Material;
    private String Code_Material;
    private String Material_Name;
    private String Describe_Material;
    private int Status;

    public Material() {
    }

    public Material(int ID_Material, String Code_Material, String Material_Name, String Describe_Material, int Status) {
        this.ID_Material = ID_Material;
        this.Code_Material = Code_Material;
        this.Material_Name = Material_Name;
        this.Describe_Material = Describe_Material;
        this.Status = Status;
    }

    public int getID_Material() {
        return ID_Material;
    }

    public void setID_Material(int ID_Material) {
        this.ID_Material = ID_Material;
    }

    public String getCode_Material() {
        return Code_Material;
    }

    public void setCode_Material(String Code_Material) {
        this.Code_Material = Code_Material;
    }

    public String getMaterial_Name() {
        return Material_Name;
    }

    public void setMaterial_Name(String Material_Name) {
        this.Material_Name = Material_Name;
    }

    public String getDescribe_Material() {
        return Describe_Material;
    }

    public void setDescribe_Material(String Describe_Material) {
        this.Describe_Material = Describe_Material;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
