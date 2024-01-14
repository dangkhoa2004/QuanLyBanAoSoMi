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
    
}
