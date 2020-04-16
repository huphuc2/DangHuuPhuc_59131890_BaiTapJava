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
public class BaiTap4_Main {
    public static void main(String[] args){
        QuanLyChuyenXe ql = new QuanLyChuyenXe();
        XeNoiThanh nt1 = new XeNoiThanh("A341","Nguyen Van A",11,37,23000000);
        XeNoiThanh nt2 = new XeNoiThanh("A342","Nguyen Van B",12,24,11000000);
        XeNoiThanh nt3 = new XeNoiThanh("A343","Nguyen Van C",13,16,17000000);
        XeNgoaiThanh ngt1 = new XeNgoaiThanh("A121","Nguyen Van D","A1","Nha Trang",16,12000000);
        XeNgoaiThanh ngt2 = new XeNgoaiThanh("A122","Nguyen Van E","A2","Ninh Hoa",22,19000000);
        XeNgoaiThanh ngt3 = new XeNgoaiThanh("A123","Nguyen Van F","A3","Van Gia",38,21500000);
        ql.them(nt1);
        ql.them(nt2);
        ql.them(nt3);
        ql.them(ngt1);
        ql.them(ngt2);
        ql.them(ngt3);
        ql.inDS();
        System.out.println("Tong Doanh Thu Xe Ngoai Thanh: "+ql.TinhDoanhThuNgoaiThanh());
        System.out.println("Tong Doanh Thu Xe Noi Thanh: "+ql.TinhDoanhThuNoiThanh());
        System.out.println("Tong Doanh Thu 2 hai loai xe: "+ql.TinhDoanhThu2Xe());
        
        
    }
}
