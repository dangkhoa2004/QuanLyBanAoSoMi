/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 04dkh
 */
public class ProductRepo implements IProductRepo{
//Tại Tầng DAO Đây là nơi sẽ code Các câu lệnh sql vào các bảng
//    Có bao nhiêu bảng thì có bấy nhiêu class
//    Đặt tên class là tên bảng + Repo   
//    public String insert(){
//        return"Thêm Thành Công";
//    }
    public String update(){
        return"Sửa Thành Công";
    }
    @Override
    public List<Product> getData(){
        List<Product> list = new ArrayList<>();
        return list;
    }
    @Override
    public String insert(){
        return"Dao";
    }
}
