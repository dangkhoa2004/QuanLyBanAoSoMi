/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BUS;

import Models.Brand;
import java.util.List;

public interface IQLBrandService {

    public boolean Insert(Brand br);

    public boolean Update(Brand br);

    public boolean Delete(String br);
  

    public List<Brand> selectALL();
}
