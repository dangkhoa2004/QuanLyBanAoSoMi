/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import Models.Color;
import java.util.List;

/**
 *
 * @author truon
 */
public interface IColorRepo {
    public boolean Insert(Color Cl);
   public boolean Update(Color Cl);
   public boolean Delete(String Cl);
   public List<Color> selectBySQL(String sql,Object...args);
   public List<Color> selectALL();
}
