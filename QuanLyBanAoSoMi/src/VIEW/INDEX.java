/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VIEW;

import BUS.IQLProductService;
import BUS.QLProductService;
import Models.Product;
import java.util.List;

/**
 *
 * @author 04dkh
 */
public class INDEX {
    static IQLProductService iQLProductService;
    static List<Product> lstProduct;

    public INDEX() {
        lstProduct = iQLProductService.getData();
    }
    
    public static void main(String[] args) {
        iQLProductService = new QLProductService();
        System.out.println(iQLProductService.addSanPham());
    }
 
}
