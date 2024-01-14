/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Product;
import java.util.List;

/**
 *
 * @author 04dkh
 */
public interface IProductRepo {
    public String insert();
    public List<Product> getData();
}
