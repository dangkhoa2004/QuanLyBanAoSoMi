/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Transaction {
    private int ID_Transaction;
    private int ID_Invoice;
    private int ID_Type;
    private String Code_Transaction;
    private String Money;

    public Transaction() {
    }

    public Transaction(int ID_Transaction, int ID_Invoice, int ID_Type, String Code_Transaction, String Money) {
        this.ID_Transaction = ID_Transaction;
        this.ID_Invoice = ID_Invoice;
        this.ID_Type = ID_Type;
        this.Code_Transaction = Code_Transaction;
        this.Money = Money;
    }

    public int getID_Transaction() {
        return ID_Transaction;
    }

    public void setID_Transaction(int ID_Transaction) {
        this.ID_Transaction = ID_Transaction;
    }

    public int getID_Invoice() {
        return ID_Invoice;
    }

    public void setID_Invoice(int ID_Invoice) {
        this.ID_Invoice = ID_Invoice;
    }

    public int getID_Type() {
        return ID_Type;
    }

    public void setID_Type(int ID_Type) {
        this.ID_Type = ID_Type;
    }

    public String getCode_Transaction() {
        return Code_Transaction;
    }

    public void setCode_Transaction(String Code_Transaction) {
        this.Code_Transaction = Code_Transaction;
    }

    public String getMoney() {
        return Money;
    }

    public void setMoney(String Money) {
        this.Money = Money;
    }
    
}
