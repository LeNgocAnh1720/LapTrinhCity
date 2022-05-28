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
public class NhanVien {
    private String MaNV;
    private String MatKhau;
    private String HoTen;
    private boolean VaiTro;
    private String Email;

    public NhanVien(String MaNV, String MatKhau, String HoTen, boolean VaiTro, String Email) {
        this.MaNV = MaNV;
        this.MatKhau = MatKhau;
        this.HoTen = HoTen;
        this.VaiTro = VaiTro;
        this.Email = Email;
    }

    

    public NhanVien() {
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public boolean isVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(boolean VaiTro) {
        this.VaiTro = VaiTro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    



}
