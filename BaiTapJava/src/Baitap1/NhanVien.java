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
public class NhanVien {
    public String Ten;
    public int Tuoi,TongSoGioLam;
    public String DiaChi;
    public double TienLuong,Thuong;

    public NhanVien(){
        
    }
    public NhanVien(String n,int a,String add,double tl,int sum){
        this.Ten = n;
        this.Tuoi = a;
        this.DiaChi = add;
        this.TienLuong = tl;
        this.TongSoGioLam = sum;
    } 
            
    public String getTen(){
        return Ten;
    }

    public String setTen(String Ten){
        this.Ten= Ten;
        return Ten;
    }

    public int getTuoi(){
        return Tuoi;
    }

    public int setTuoi(int Tuoi){
        this.Tuoi= Tuoi;
        return Tuoi;
    }

    public int getTongSoGioLam(){
        return TongSoGioLam;
    }

    public int setTongSoGioLam(int TongSoGioLam){
        this.TongSoGioLam= TongSoGioLam;
        return TongSoGioLam;
    }

    public String getDiaChi(){
        return DiaChi;
    }
    public String setDiaChi(String DiaChi){
        this.DiaChi= DiaChi;
        return DiaChi;
    }
    public double getTienLuong(){
        return TienLuong;
    }
    public double setTienLuong(double TienLuong){
        this.TienLuong = TienLuong;
        return TienLuong;
    }
    public void ThongTin(String name,int age,String ad){
        Ten = name;
        Tuoi = age;
        DiaChi = ad;        
    }
    public String getThongtin(){
        return "Ten: "             + Ten          + "\n" +
               "Tuoi: "            + Tuoi         + "\n" +
               "Dia Chi: "         + DiaChi       + "\n" +
               "Tien Luong: "      + TienLuong    + "\n" +
               "Tong So Gio Lam: " + TongSoGioLam + "\n";
    }
    public double TinhThuong(){
        if(TongSoGioLam>=200) {
            return TienLuong*20/100;
        }else{
            if( TongSoGioLam < 200 && TongSoGioLam >= 100){
            return TienLuong*10/100;
            }else{
                return 0;
            }
        }
        
    }
       
}
        
