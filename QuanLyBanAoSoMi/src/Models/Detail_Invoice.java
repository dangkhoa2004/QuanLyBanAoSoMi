/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Detail_Invoice {
    private int ID_Detail_Invoice;
    private int ID_Invoice;
    private String Code_Invoice_Detail;
    private String Unit_Price;
    private String Quantity;
    private String Notes;
    private int Status;

    public Detail_Invoice() {
    }

    public Detail_Invoice(int ID_Detail_Invoice, int ID_Invoice, String Code_Invoice_Detail, String Unit_Price, String Quantity, String Notes, int Status) {
        this.ID_Detail_Invoice = ID_Detail_Invoice;
        this.ID_Invoice = ID_Invoice;
        this.Code_Invoice_Detail = Code_Invoice_Detail;
        this.Unit_Price = Unit_Price;
        this.Quantity = Quantity;
        this.Notes = Notes;
        this.Status = Status;
    }

    public int getID_Detail_Invoice() {
        return ID_Detail_Invoice;
    }

    public void setID_Detail_Invoice(int ID_Detail_Invoice) {
        this.ID_Detail_Invoice = ID_Detail_Invoice;
    }

    public int getID_Invoice() {
        return ID_Invoice;
    }

    public void setID_Invoice(int ID_Invoice) {
        this.ID_Invoice = ID_Invoice;
    }

    public String getCode_Invoice_Detail() {
        return Code_Invoice_Detail;
    }

    public void setCode_Invoice_Detail(String Code_Invoice_Detail) {
        this.Code_Invoice_Detail = Code_Invoice_Detail;
    }

    public String getUnit_Price() {
        return Unit_Price;
    }

    public void setUnit_Price(String Unit_Price) {
        this.Unit_Price = Unit_Price;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
