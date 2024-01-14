/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Models.Brand;
import java.util.List;

/**
 *
 * @author truon
 */
public interface IBrandRepo {
   public String Insert(Brand br);
   public String Update(Brand br);
   public String Delete(String br);
   public List<Brand> selectBySQL(String sql,Object...args);
   public List<Brand> selectALL();
}
