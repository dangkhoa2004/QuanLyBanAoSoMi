/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Color {
    private int ID_Color;
    private String Code_Color;
    private String Color_Name;
    private int Status;

    public Color() {
    }

    public Color(int ID_Color, String Code_Color, String Color_Name, int Status) {
        this.ID_Color = ID_Color;
        this.Code_Color = Code_Color;
        this.Color_Name = Color_Name;
        this.Status = Status;
    }

    public int getID_Color() {
        return ID_Color;
    }

    public void setID_Color(int ID_Color) {
        this.ID_Color = ID_Color;
    }

    public String getCode_Color() {
        return Code_Color;
    }

    public void setCode_Color(String Code_Color) {
        this.Code_Color = Code_Color;
    }

    public String getColor_Name() {
        return Color_Name;
    }

    public void setColor_Name(String Color_Name) {
        this.Color_Name = Color_Name;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
