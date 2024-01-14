/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.IProductRepo;
import DAO.ProductRepo;
import Models.Product;
import java.util.List;

/**
 *
 * @author 04dkh
 */
public class QLProductService implements IQLProductService{
//  Là Nơi Gọi Đến Các Service Ở Tầng DAO 
//  Không Được Phép Gọi Trực Tiếp Các File Ở Class Các Tầng
//  Phải Gọi Thông quá interface
    IProductRepo iProductRepo;
    List<Product> lst;
    public QLProductService() {
        iProductRepo = new ProductRepo();
        lst = iProductRepo.getData();
    }
    @Override
    public String addSanPham(){
        iProductRepo.insert();
        System.out.println(iProductRepo.insert());
        return"Thêm Thành Công";
    }

    @Override
    public List<Product> getData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
