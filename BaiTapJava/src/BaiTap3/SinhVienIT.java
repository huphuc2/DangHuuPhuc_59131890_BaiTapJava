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
public class SinhVienIT extends SinhVienPoly {
    double DiemJava,DiemCSS,DiemHTML;

    public SinhVienIT(double diemJ,double diemCss,double diemHTML,String hoten,String nganh){
        super(hoten,nganh);
        this.DiemJava = diemJ;
        this.DiemCSS = diemCss;
        this.DiemHTML = diemHTML;
    }
    
    @Override
    public double getDiem() {
        return (2*DiemJava + DiemHTML + DiemCSS)/4;
    }
}
