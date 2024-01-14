/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Size {
    private int ID_Size;
    private String Code_Size;
    private String Size;
    private  String Describie_Size;
    private int Status;

    public Size() {
    }

    public Size(int ID_Size, String Code_Size, String Size, String Describie_Size, int Status) {
        this.ID_Size = ID_Size;
        this.Code_Size = Code_Size;
        this.Size = Size;
        this.Describie_Size = Describie_Size;
        this.Status = Status;
    }

    public int getID_Size() {
        return ID_Size;
    }

    public void setID_Size(int ID_Size) {
        this.ID_Size = ID_Size;
    }

    public String getCode_Size() {
        return Code_Size;
    }

    public void setCode_Size(String Code_Size) {
        this.Code_Size = Code_Size;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getDescribie_Size() {
        return Describie_Size;
    }

    public void setDescribie_Size(String Describie_Size) {
        this.Describie_Size = Describie_Size;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
