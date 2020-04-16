/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;
import java.util.ArrayList;
/**
 *
 * @author huuph
 */
public class QuanLyChuyenXe{    
    ArrayList<ChuyenXe> xe1 = new ArrayList<>();
    public int tongnoithanh = 0,tongngoaithanh = 0,tong2xe=0;
    public void them(ChuyenXe cx){
        xe1.add(cx);                
    }

    public void inDS(){
        System.out.println("Danh Sach xe: ");
        for(int i =0;i<xe1.size();i++){
            System.out.println(xe1.get(i).getThongTinXe());
            
        }        
    }
    public int TinhDoanhThuNoiThanh(){
        for(int i =0;i<xe1.size();i++){
            if((xe1.get(i) instanceof XeNoiThanh)){
                tongnoithanh += xe1.get(i).getDoanhThu();
            }           
        }
        return tongnoithanh;
    }
    public int TinhDoanhThuNgoaiThanh(){
        for(int i =0;i<xe1.size();i++){
            if((xe1.get(i) instanceof XeNgoaiThanh)){
                tongngoaithanh += xe1.get(i).getDoanhThu();
            }           
        }
        return tongngoaithanh;
    }
    public int TinhDoanhThu2Xe(){
        for(int i =0;i<xe1.size();i++){
            tong2xe += xe1.get(i).getDoanhThu();                     
        }
        return tong2xe;
    }
}
        
