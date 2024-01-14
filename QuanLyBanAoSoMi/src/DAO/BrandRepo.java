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
    String INSERT_SQL = "INSERT INTO Brand(Code_Brand,Brand,Describe_Brand,Status) Values(?,?,?,?)";
    String UPDATE_SQL ="Update brand set Brand=?,Describe_Brand= ? where Code_Brand= ?";
    String DELETE_SQL ="Update brand set Status = 0 where Code_Brand = ? ";
    String READ= "select * from Brand";
    @Override
    public String Insert(Brand br) {
        try {
            Helper.executeUpdate(INSERT_SQL,br.getCode_Brand(),br.getBrand_Name(),br.getStatus());
            return "Thêm thành công";
        } catch (Exception e) {
            e.printStackTrace();
            return "Thêm thất bại";
        }

    }

    @Override
    public String Update(Brand br) {
        try {
            Helper.executeUpdate(UPDATE_SQL, br.getBrand_Name(),br.getDescribe_Brand(),br.getCode_Brand());
            return "Cập nhật thành công";
        } catch (Exception e) {
            e.printStackTrace();
            return "Cập nhật thất bại";
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
                br.setCode_Brand(rs.getString("Code"));
                br.setBrand_Name(rs.getString("Name_Brand"));
                br.setDescribe_Brand(rs.getString("Describe_Brand"));
                br.setStatus(rs.getInt("Trang Thai"));
                list.add(br);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            e.getMessage();
            throw new RuntimeException(e);
        }}

    @Override
    public String Delete(String br) {
        try {
            Helper.executeUpdate(DELETE_SQL,br);
            return "xóa thành công";
        } catch (Exception e) {
            e.printStackTrace();
            return "Xóa thất bại";
        }
    }

    @Override
    public List<Brand> selectALL() {
        return selectBySQL(READ);
   }

   
 
    
}
