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
public class XeNgoaiThanh extends ChuyenXe {
    private String noiden;
    private int songaydiduoc;
    XeNgoaiThanh(String maso,String hotentaixe,String soxe,String noiden,int songaydiduoc,int doanhthu){
        this.hotentaixe = hotentaixe;
        this.maso = maso;
        this.noiden = noiden;
        this.soxe = soxe;
        this.songaydiduoc = songaydiduoc;
        this.doanhthu = doanhthu;
    }
    public String getNoiDen(){
        return noiden;
    }
    public String setNoiDen(String noiden){
        this.noiden = noiden;
        return noiden;
    }

}
