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
public class BaiTap3_Main {
    public static void main(String[] args){
        SinhVienIT it = new SinhVienIT(6.3,7.4,9.0,"Dang Huu Phuc","Cong Nghe Thong Tin");
        System.out.print("Sinh Vien IT: "+"\n");
        it.xuat();
        System.out.print("Diem: "+it.getDiem()+"\n"+
                         "Hoc luc: "+it.getHocLuc()+"\n");
        SinhVienBiz biz = new SinhVienBiz(7.9,8.3,"Ho Thanh Tam","Kinh Te");
        System.out.print("Sinh Vien Biz: "+"\n");
        biz.xuat();
        System.out.print("Diem: "+biz.getDiem()+"\n"+
                         "Hoc luc: "+biz.getHocLuc()+"\n");
        
        
    }
}
