/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BUS;

import javax.swing.JTable;
import javax.swing.JTextField;


public interface IQLBrandService {
   public void filltable(JTable tblBrand);
   public void addBrand(JTextField TenHang, JTextField MieuTa );
   public void updateBrand(JTextField TenHang, JTextField MieuTa, JTextField Ma);
   public void deleteBrand(JTextField Ma);
   public void click(JTextField TenHang, JTextField MieuTa,JTextField MaBrand, JTable table);
}
