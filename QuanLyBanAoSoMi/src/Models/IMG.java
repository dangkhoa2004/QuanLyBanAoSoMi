/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class IMG {
    private int ID_IMG;
    private String Code_IMG;
    private String Name_IMG;
    private int Status;

    public IMG() {
    }

    public IMG(int ID_IMG, String Code_IMG, String Name_IMG, int Status) {
        this.ID_IMG = ID_IMG;
        this.Code_IMG = Code_IMG;
        this.Name_IMG = Name_IMG;
        this.Status = Status;
    }

    public int getID_IMG() {
        return ID_IMG;
    }

    public void setID_IMG(int ID_IMG) {
        this.ID_IMG = ID_IMG;
    }

    public String getCode_IMG() {
        return Code_IMG;
    }

    public void setCode_IMG(String Code_IMG) {
        this.Code_IMG = Code_IMG;
    }

    public String getName_IMG() {
        return Name_IMG;
    }

    public void setName_IMG(String Name_IMG) {
        this.Name_IMG = Name_IMG;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
