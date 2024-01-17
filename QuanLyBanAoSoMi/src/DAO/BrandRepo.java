/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Brand;
import Utilities.Helper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author truon
 */
public class BrandRepo implements IBrandRepo{
    String INSERT_SQL = "INSERT INTO Brand(Brand,Describe_Brand,Status) Values(?,?,1)";
    String UPDATE_SQL ="Update brand set Brand=?,Describe_Brand= ? where Code_Brand= ?";
    String DELETE_SQL ="Update brand set Status = 0 where Code_Brand = ? ";
    String READ= "select * from Brand order by Code_Brand desc ";
    @Override
    public boolean Insert(Brand br) {
        try {
            Helper.executeUpdate(INSERT_SQL,br.getBrand_Name(),br.getDescribe_Brand());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean Update(Brand br) {
        try {
            Helper.executeUpdate(UPDATE_SQL, br.getBrand_Name(),br.getDescribe_Brand(),br.getCode_Brand());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

 

    @Override
    public List<Brand> selectBySQL(String sql, Object... args) {
         List<Brand> list = new ArrayList<>();
        try {
            ResultSet rs = Helper.executeQuery(sql, args);
            while (rs.next()) {
                Brand br = new Brand();
                br.setID_Brand(rs.getInt("ID_Brand"));
                br.setCode_Brand(rs.getString("Code_Brand"));
                br.setBrand_Name(rs.getString("Brand"));
                br.setDescribe_Brand(rs.getString("Describe_Brand"));
                br.setStatus(rs.getInt("Status"));
                list.add(br);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.getMessage();
            throw new RuntimeException(e);
        }}

    @Override
    public boolean Delete(String br) {
        try {
            Helper.executeUpdate(DELETE_SQL,br);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Brand> selectALL() {
        return selectBySQL(READ);
   }

   
 
    
}
