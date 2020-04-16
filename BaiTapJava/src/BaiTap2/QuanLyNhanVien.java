/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import Baitap1.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author huuph
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> nv1 = new ArrayList<NhanVien>();
    @Override
    public void them(NhanVien nv){

        nv1.add(nv);                
    }
    @Override
    public void inDS(){
        System.out.println("Danh Sach NV: ");
        for(int i =0;i<nv1.size();i++){
            System.out.println(nv1.get(i).getThongtin());
        }
    }
}
