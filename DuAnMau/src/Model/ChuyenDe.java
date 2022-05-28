/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author OS
 */
public class ChuyenDe {
    private String MaCD;
    private String TenCD;
    private double HocPhi;
    private int ThoiGian;
    private String Hinh;
    private String MoTa;

    public ChuyenDe() {
    }

    public ChuyenDe(String MaCD, String TenCD, double HocPhi, int ThoiGian, String Hinh, String MoTa) {
        this.MaCD = MaCD;
        this.TenCD = TenCD;
        this.HocPhi = HocPhi;
        this.ThoiGian = ThoiGian;
        this.Hinh = Hinh;
        this.MoTa = MoTa;
    }

    public String getMaCD() {
        return MaCD;
    }

    public void setMaCD(String MaCD) {
        this.MaCD = MaCD;
    }

    public String getTenCD() {
        return TenCD;
    }

    public void setTenCD(String TenCD) {
        this.TenCD = TenCD;
    }

    public double getHocPhi() {
        return HocPhi;
    }

    public void setHocPhi(float HocPhi) {
        this.HocPhi = HocPhi;
    }

    public int getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(int ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    @Override
    public String toString() {
        return this.TenCD;
    }
    
}
