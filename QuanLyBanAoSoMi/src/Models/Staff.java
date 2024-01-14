/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author 04dkh
 */
public class Staff {
    private int ID_Staff;
    private String Code_Staff;
    private String Phone;
    private String Pass;
    private String Staff_Name;
    private String Email;
    private boolean Role;
    private int Status;

    public Staff() {
    }

    public Staff(int ID_Staff, String Code_Staff, String Phone, String Pass, String Staff_Name, String Email, boolean Role, int Status) {
        this.ID_Staff = ID_Staff;
        this.Code_Staff = Code_Staff;
        this.Phone = Phone;
        this.Pass = Pass;
        this.Staff_Name = Staff_Name;
        this.Email = Email;
        this.Role = Role;
        this.Status = Status;
    }

    public int getID_Staff() {
        return ID_Staff;
    }

    public void setID_Staff(int ID_Staff) {
        this.ID_Staff = ID_Staff;
    }

    public String getCode_Staff() {
        return Code_Staff;
    }

    public void setCode_Staff(String Code_Staff) {
        this.Code_Staff = Code_Staff;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getStaff_Name() {
        return Staff_Name;
    }

    public void setStaff_Name(String Staff_Name) {
        this.Staff_Name = Staff_Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isRole() {
        return Role;
    }

    public void setRole(boolean Role) {
        this.Role = Role;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    
}
