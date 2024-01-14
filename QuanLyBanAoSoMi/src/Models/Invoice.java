/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author 04dkh
 */
public class Invoice {
    private int ID_Invoice;
    private int ID_Customer;
    private int ID_Staff;
    private String Code_Invoice;
    private String Total;
    private Date Date_Invoice;
    private String Customer_Name;
    private String Email;
    private String Phone;
    private String Address;
    private String Discount;
    private String Notes;
    private int Status;

    public Invoice() {
    }

    public Invoice(int ID_Invoice, int ID_Customer, int ID_Staff, String Code_Invoice, String Total, Date Date_Invoice, String Customer_Name, String Email, String Phone, String Address, String Discount, String Notes, int Status) {
        this.ID_Invoice = ID_Invoice;
        this.ID_Customer = ID_Customer;
        this.ID_Staff = ID_Staff;
        this.Code_Invoice = Code_Invoice;
        this.Total = Total;
        this.Date_Invoice = Date_Invoice;
        this.Customer_Name = Customer_Name;
        this.Email = Email;
        this.Phone = Phone;
        this.Address = Address;
        this.Discount = Discount;
        this.Notes = Notes;
        this.Status = Status;
    }

    public int getID_Invoice() {
        return ID_Invoice;
    }

    public void setID_Invoice(int ID_Invoice) {
        this.ID_Invoice = ID_Invoice;
    }

    public int getID_Customer() {
        return ID_Customer;
    }

    public void setID_Customer(int ID_Customer) {
        this.ID_Customer = ID_Customer;
    }

    public int getID_Staff() {
        return ID_Staff;
    }

    public void setID_Staff(int ID_Staff) {
        this.ID_Staff = ID_Staff;
    }

    public String getCode_Invoice() {
        return Code_Invoice;
    }

    public void setCode_Invoice(String Code_Invoice) {
        this.Code_Invoice = Code_Invoice;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public Date getDate_Invoice() {
        return Date_Invoice;
    }

    public void setDate_Invoice(Date Date_Invoice) {
        this.Date_Invoice = Date_Invoice;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String Discount) {
        this.Discount = Discount;
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
