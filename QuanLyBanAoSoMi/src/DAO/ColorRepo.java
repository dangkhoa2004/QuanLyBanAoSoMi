/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Utilities.Helper;
import Models.Color;
import java.util.List;

/**
 *
 * @author truon
 */
public class ColorRepo  implements IColorRepo{
    String INSERT_SQL = ("INSERT INTO Color(Color_name,Status) Values(?,1)");
    String UPDATE_SQL = ("UPDATE COLOR SET Color_name = ? WHERE Code_Color=?");
    String DELETE_SQL = ("UPDATE COLOR SET Status =0 WHERE Code_Color=?");
    String READ_SQL =( "select * from Color ORDER BY Code_Color DESC");
    
    
    @Override
    public boolean Insert(Color Cl) {
        try {
            Helper.executeUpdate(INSERT_SQL, Cl.getColor_Name());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean Update(Color Cl) {
        try {
            Helper.executeUpdate(UPDATE_SQL,Cl.getColor_Name(),Cl.getStatus());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean Delete(String Cl) {
        try {
            Helper.executeUpdate(DELETE_SQL, Cl);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Color> selectBySQL(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Color> selectALL() {
      return selectBySQL(READ_SQL);
    }
    
}
