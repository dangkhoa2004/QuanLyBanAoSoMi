/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.BrandRepo;
import DAO.IBrandRepo;
import Models.Brand;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author truon
 */
public class QLBrandService implements IQLBrandService{
    IBrandRepo iBrandRepo;
    List<Brand> lstBrand;
    public QLBrandService() {
        iBrandRepo = new BrandRepo();
        lstBrand = iBrandRepo.selectALL();
    }

 

    @Override
    public void filltable(JTable tblBrand) {
    DefaultTableModel model = (DefaultTableModel) tblBrand.getModel();
        model.setRowCount(0);
        try {
            List<Brand> list = lstBrand;
            for (Brand br : list) {
               
                    Object[] row = {br.getCode_Brand(),
                        br.getBrand_Name(),
                        br.getDescribe_Brand()
                        
                    };
                    model.addRow(row);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
    }

    @Override
    public void addBrand(JTextField TenHang, JTextField MieuTa) {
        try {
            Brand br = new Brand();
            br.setBrand_Name(TenHang.getText());
            br.setDescribe_Brand(MieuTa.getText());
            iBrandRepo.Insert(br);
            System.out.println("Them thanh cong");
        } catch (Exception e) {
            System.out.println("them that bai");
            e.printStackTrace();
            
        }
    }

  


    @Override
    public void updateBrand(JTextField TenHang, JTextField MieuTa, JTextField Ma) {
        try {
            Brand br = new Brand();
            br.setBrand_Name(TenHang.getText());
            br.setDescribe_Brand(MieuTa.getText());
            br.setCode_Brand(Ma.getText());
            iBrandRepo.Update(br);
            System.out.println("cap nhat thanh cong");
        } catch (Exception e) {
            System.out.println("xoa that bai");
            e.printStackTrace();
            
        }
    
    }

    @Override
    public void deleteBrand(JTextField Ma) {
        try {
            iBrandRepo.Delete(Ma.getText());
            System.out.println("xoa thanh cong");
        } catch (Exception e) {
            System.out.println("xoa that bai");
            e.printStackTrace();
            
        }
    }

    @Override
    public void click(JTextField TenHang, JTextField MieuTa,JTextField MaBrand, JTable table) {
      int row = table.getSelectedRow();
      String mahang = (String) table.getValueAt(row, 0);
      String tenhang = (String) table.getValueAt(row, 1);
      String mieuta = (String) table.getValueAt(row, 2);
      MaBrand.setText(mahang);
      TenHang.setText(tenhang);
      MieuTa.setText(mieuta);
    }
    

    
}
