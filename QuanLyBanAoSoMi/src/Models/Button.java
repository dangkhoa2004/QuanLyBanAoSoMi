/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Button {
    private int ID_Button;
    private String Code_Button;
    private String Name_Button;
    private int Status;

    public Button() {
    }

    public Button(int ID_Button, String Code_Button, String Name_Button, int Status) {
        this.ID_Button = ID_Button;
        this.Code_Button = Code_Button;
        this.Name_Button = Name_Button;
        this.Status = Status;
    }

    public int getID_Button() {
        return ID_Button;
    }

    public void setID_Button(int ID_Button) {
        this.ID_Button = ID_Button;
    }

    public String getCode_Button() {
        return Code_Button;
    }

    public void setCode_Button(String Code_Button) {
        this.Code_Button = Code_Button;
    }

    public String getName_Button() {
        return Name_Button;
    }

    public void setName_Button(String Name_Button) {
        this.Name_Button = Name_Button;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
