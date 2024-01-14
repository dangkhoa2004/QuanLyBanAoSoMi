/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Customer {
    private int ID_Customer;
    private String Code_Customer;
    private String Customer_Name;
    private String Email;
    private String Phone;
    private String Address;
    private int Status;

    public Customer() {
    }

    public Customer(int ID_Customer, String Code_Customer, String Customer_Name, String Email, String Phone, String Address, int Status) {
        this.ID_Customer = ID_Customer;
        this.Code_Customer = Code_Customer;
        this.Customer_Name = Customer_Name;
        this.Email = Email;
        this.Phone = Phone;
        this.Address = Address;
        this.Status = Status;
    }

    public int getID_Customer() {
        return ID_Customer;
    }

    public void setID_Customer(int ID_Customer) {
        this.ID_Customer = ID_Customer;
    }

    public String getCode_Customer() {
        return Code_Customer;
    }

    public void setCode_Customer(String Code_Customer) {
        this.Code_Customer = Code_Customer;
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

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
