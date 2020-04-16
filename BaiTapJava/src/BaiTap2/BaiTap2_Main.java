/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import Baitap1.NhanVien;
/**
 *
 * @author huuph
 */
public class BaiTap2_Main {
    public static void main(String[] args){
        QuanLyNhanVien ql = new QuanLyNhanVien(){};
        NhanVien n1 = new NhanVien("Tam",20,"Nguyen Thien Thuat",5400000,340); 
        NhanVien n2 = new NhanVien("Hoa",24,"Nguyen Trai",3100000,250); 
        NhanVien n3 = new NhanVien("Phuc",19,"Le Thanh Ton",670000,140);
        NhanVien n4 = new NhanVien("Nhan",22,"Tran Hung Dao",5700000,540);
        NhanVien n5 = new NhanVien("Duyen",20,"Ben Nghe",7400000,530);
        ql.them(n1);
        ql.them(n2);
        ql.them(n3);
        ql.them(n4);
        ql.them(n5);
        ql.inDS();
        
    }
}
