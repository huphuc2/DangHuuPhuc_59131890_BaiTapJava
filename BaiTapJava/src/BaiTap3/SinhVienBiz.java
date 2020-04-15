/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author huuph
 */
public class SinhVienBiz extends SinhVienPoly {
    double diemMarketing,diemSales;
    public SinhVienBiz(double DiemMarketing,double DiemSales,String hoten,String nganh){
        super(hoten,nganh);
        this.diemMarketing = DiemMarketing;
        this.diemSales = DiemSales;
    }
   
    @Override
    public double getDiem(){
        return(2*diemMarketing+diemSales)/3;
    }
}
