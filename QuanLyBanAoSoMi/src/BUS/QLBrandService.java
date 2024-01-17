/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.BrandRepo;
import DAO.IBrandRepo;
import Models.Brand;
import Utilities.DiaLog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author truon
 */
public class QLBrandService implements IQLBrandService {

    IBrandRepo iBrandRepo;
    List<Brand> lstBrand;
    private List<Brand> existingBrands = new ArrayList<>();

    public QLBrandService() {
        iBrandRepo = new BrandRepo();
        lstBrand = iBrandRepo.selectALL();
    }

    @Override
    public boolean Insert(Brand br) {
        if (isValidBrand(br)) {
            if (iBrandRepo.Insert(br)) {
                return true;

            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    private boolean isValidBrand(Brand brand) {
        boolean flag = false;
        existingBrands = iBrandRepo.selectALL();
        if (brand.getBrand_Name().equals("")) {
            DiaLog.alert(null, "tên không được để trống");
            return false;
        }
        for (Brand br : existingBrands) {
            if (br.getBrand_Name().equalsIgnoreCase(brand.getBrand_Name())) {
                flag = true;
                break;
            }
        }
        if (flag) {
            DiaLog.alert(null, "không được tên trùng");
            return false;
        }

        return true;
    }

    @Override
    public boolean Update(Brand br) {
        if (isValidBrand(br)) {
            if (iBrandRepo.Update(br)) {
                return true;

            } else {
                return false;
            }
        } else{
            return false;
        }

    }

    @Override
    public boolean Delete(String br) {
        if (iBrandRepo.Delete(br)) {
            return true;

        } else {
            return false;
        }
    }

    @Override
    public List<Brand> selectALL() {
        return iBrandRepo.selectALL();
    }

}
