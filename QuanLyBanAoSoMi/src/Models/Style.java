/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Style {
    private int ID_Style;
    private String Code_Style;
    private String Name_Style;
    private String Describe_Style;
    private int Status;

    public Style() {
    }

    public Style(int ID_Style, String Code_Style, String Name_Style, String Describe_Style, int Status) {
        this.ID_Style = ID_Style;
        this.Code_Style = Code_Style;
        this.Name_Style = Name_Style;
        this.Describe_Style = Describe_Style;
        this.Status = Status;
    }

    public int getID_Style() {
        return ID_Style;
    }

    public void setID_Style(int ID_Style) {
        this.ID_Style = ID_Style;
    }

    public String getCode_Style() {
        return Code_Style;
    }

    public void setCode_Style(String Code_Style) {
        this.Code_Style = Code_Style;
    }

    public String getName_Style() {
        return Name_Style;
    }

    public void setName_Style(String Name_Style) {
        this.Name_Style = Name_Style;
    }

    public String getDescribe_Style() {
        return Describe_Style;
    }

    public void setDescribe_Style(String Describe_Style) {
        this.Describe_Style = Describe_Style;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
