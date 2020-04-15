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
        it.xuat();
        System.out.print("Diem: "+it.getDiem()+"\n"+
                         "Hoc luc: "+it.getHocLuc()+"\n");
        
        
    }
}
