/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import Models.Product;
import java.util.List;

/**
 *
 * @author 04dkh
 */
public interface IQLProductService {
//  Interface Không Có body code;
//  Trong interface Mặc Đinh là public không thể sử dụng private;
//  Hiểu đơn giản interface là phần xác mà chưa có hồn
    public String addSanPham();
    public List<Product> getData();
}
