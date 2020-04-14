/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap1;

/**
 *
 * @author huuph
 */
public class BaiTap1_Main {

    /**
     * @param args
     */
    public static void main(String args[]){
        NhanVien nv1 = new NhanVien("Dang Huu Phuc",23,"Nha Trang", 2500000, 240); 
        NhanVien nv2 = new NhanVien("Linh",20,"Mã Vòng", 1500000, 140);
        System.out.print(nv1.getThongtin());
        System.out.println("Tien thuong: "+ nv1.TinhThuong());
        System.out.print(nv2.getThongtin());
        System.out.println("Tien thuong: "+ nv2.TinhThuong());
        
    }
    
}
