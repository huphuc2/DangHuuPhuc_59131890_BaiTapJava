/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author huuph
 */
public class ChuyenXe {
    String maso,hotentaixe,soxe;
    int doanhthu;
    public String getMaSo(){
        return maso;
    }
    public String setMaSo(String maso){
        this.maso = maso;
        return maso;
    }
    public String gethotentaixe(){
        return hotentaixe;
    }
    public String sethotentaixe(String hotentaixe){
        this.hotentaixe = hotentaixe;
        return hotentaixe;
    }
    public String getNoiDen(){
        return soxe;
    }
    public String setSoXe(String soxe){
        this.soxe = soxe;
        return soxe;
    }
    public int getDoanhThu(){
        return doanhthu;
    }
    public int setDoanhThu(int doanhthu){
        this.doanhthu = doanhthu;
        return doanhthu;
    }
    public String getThongTinXe(){
        return  "Ma so: "+maso+"\n"+
                "Ho va ten tai xe: "+hotentaixe+"\n"+
                "So xe: "+soxe+"\n"+               
                "Doanh thu: "+doanhthu+"\n";
    }  
}
