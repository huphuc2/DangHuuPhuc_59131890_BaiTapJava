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
    /*Khai báo biến*/
    char Ten;
    int Tuoi,TongSoGioLam;
    char DiaChi;
    double TienLuong;
    //getter cho Tên
    public char getTen(){
        return Ten;
    }
    //setter cho Tên
    public char setTen(char Ten){
        this.Ten= Ten;
        return Ten;
    }
    //getter cho Tuổi
    public int getTuoi(){
        return Tuoi;
    }
    //setter cho Tuổii
    public int setTuoi(int Tuoi){
        this.Tuoi= Tuoi;
        return Tuoi;
    }
    //getter cho Tổng số giờ làm
    public int getTongSoGioLam(){
        return TongSoGioLam;
    }
    //setter cho Tên
    public int setTongSoGioLam(int TongSoGioLam){
        this.TongSoGioLam= TongSoGioLam;
        return TongSoGioLam;
    }
    //getter cho Tên
    public char getDiaChi(){
        return DiaChi;
    }
    //setter cho Tên
    public char setDiaChi(char DiaChi){
        this.DiaChi= DiaChi;
        return DiaChi;
    }
}
