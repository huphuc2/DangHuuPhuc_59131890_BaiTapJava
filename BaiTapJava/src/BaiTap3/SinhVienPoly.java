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
public abstract class SinhVienPoly {
    public String hoten;
    public String nganh;
    
    SinhVienPoly(String ht, String n){
        this.hoten = ht;
        this.nganh = n;
        
    }
    public String getHoten(){
        return hoten;
    }
    public String setHoten(String hoten){
        this.hoten = hoten;
        return hoten;
    }
    public String getNganh(){
        return nganh;
    }
    public String setNganh(String nganh){
        this.nganh = nganh;
        return nganh;
    }
    public abstract double getDiem();
    public String getHocLuc(){
        if(getDiem()<5){
            return "Yeu";
        }else if(getDiem()>=5&&getDiem()<6.5){
                return "Trung Binh";
            }else if(getDiem()>=6.5&&getDiem()>7.5){
                    return "Kha";
                }else if(getDiem()>=7.5&&getDiem()<9){
                        return "Gioi";
                    }else return "Xuat sac";                       
 
    }
    public void xuat(){
        System.out.print("Ho va ten Sv: "+hoten +"\n"+ "Nganh: "+nganh+"\n");
    }
}
     
            
