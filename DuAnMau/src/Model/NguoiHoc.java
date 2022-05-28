/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utilities.XDate;
import java.util.Date;

/**
 *
 * @author OS
 */
public class NguoiHoc {
    private String MaNH;
    private String HoTen;
    private boolean GioiTinh;
    private Date NgaySinh;
    private String Email;
    private String SoDT;
    private String GhiChu;
    private String MaNV;
    private Date NgayDangKy = XDate.now();

    public NguoiHoc(String MaNH, String HoTen, boolean GioiTinh, Date NgaySinh, String Email, String SoDT, String GhiChu, String MaNV, Date NgayDangKy) {
        this.MaNH = MaNH;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.Email = Email;
        this.SoDT = SoDT;
        this.GhiChu = GhiChu;
        this.MaNV = MaNV;
        this.NgayDangKy = NgayDangKy;
    }

    public NguoiHoc() {
    }

    public String getMaNH() {
        return MaNH;
    }

    public void setMaNH(String MaNH) {
        this.MaNH = MaNH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSoDT() {
        return SoDT;
    }

    public void setSoDT(String SoDT) {
        this.SoDT = SoDT;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayDangKy() {
        return NgayDangKy;
    }

    public void setNgayDangKy(Date NgayDangKy) {
        this.NgayDangKy = NgayDangKy;
    }
    
}
