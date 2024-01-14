/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Type_Transaction {
    private int ID_Type_Transaction;
    private String Code_Type_Transaction;
    private String Type_Transaction_Name;
    private int Status;

    public Type_Transaction() {
    }

    public Type_Transaction(int ID_Type_Transaction, String Code_Type_Transaction, String Type_Transaction_Name, int Status) {
        this.ID_Type_Transaction = ID_Type_Transaction;
        this.Code_Type_Transaction = Code_Type_Transaction;
        this.Type_Transaction_Name = Type_Transaction_Name;
        this.Status = Status;
    }

    public int getID_Type_Transaction() {
        return ID_Type_Transaction;
    }

    public void setID_Type_Transaction(int ID_Type_Transaction) {
        this.ID_Type_Transaction = ID_Type_Transaction;
    }

    public String getCode_Type_Transaction() {
        return Code_Type_Transaction;
    }

    public void setCode_Type_Transaction(String Code_Type_Transaction) {
        this.Code_Type_Transaction = Code_Type_Transaction;
    }

    public String getType_Transaction_Name() {
        return Type_Transaction_Name;
    }

    public void setType_Transaction_Name(String Type_Transaction_Name) {
        this.Type_Transaction_Name = Type_Transaction_Name;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
