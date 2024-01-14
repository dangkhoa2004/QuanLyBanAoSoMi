/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Collar {
    private int ID_Collar;
    private String Code_Collar;
    private String Collar_Name;
    private String Describe_Collar;
    private int Status;

    public Collar() {
    }

    public Collar(int ID_Collar, String Code_Collar, String Collar_Name, String Describe_Collar, int Status) {
        this.ID_Collar = ID_Collar;
        this.Code_Collar = Code_Collar;
        this.Collar_Name = Collar_Name;
        this.Describe_Collar = Describe_Collar;
        this.Status = Status;
    }

    public int getID_Collar() {
        return ID_Collar;
    }

    public void setID_Collar(int ID_Collar) {
        this.ID_Collar = ID_Collar;
    }

    public String getCode_Collar() {
        return Code_Collar;
    }

    public void setCode_Collar(String Code_Collar) {
        this.Code_Collar = Code_Collar;
    }

    public String getCollar_Name() {
        return Collar_Name;
    }

    public void setCollar_Name(String Collar_Name) {
        this.Collar_Name = Collar_Name;
    }

    public String getDescribe_Collar() {
        return Describe_Collar;
    }

    public void setDescribe_Collar(String Describe_Collar) {
        this.Describe_Collar = Describe_Collar;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
