/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Utilities.XDate;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.KhoaHoc;

/**
 *
 * @author OS
 */
public class KhoaHocDAO extends EduSys_DAO<KhoaHoc, Integer>{
    String Insert_KhoaHoc = "INSERT INTO KHOAHOC (MaCD,HocPhi,ThoiLuong,NgayKhaiGiang,GhiChu,MaNV,NgayTao) VALUES(?,?,?,?,?,?,?)";
    String Update_KhoaHoc = "UPDATE KHOAHOC SET MaCD=? , HocPhi=?, ThoiLuong=?, NgayKhaiGiang=?, GhiChu=?, MaNV=?, NgayTao=?  WHERE MaKH=?";
    String DELETE_KhoaHoc = "DELETE FROM KHOAHOC WHERE MaKH=?";
    String SELECT_ALL_KhoaHoc = "SELECT * FROM KHOAHOC";
    String SELECT_BY_ID_KhoaHoc ="SELECT * FROM KHOAHOC WHERE MaKH=?";

    @Override
    public void insert(KhoaHoc entity) {
         try {
            jdbcHelper.update(Insert_KhoaHoc,entity.getMaCD(),entity.getHocPhi(),entity.getThoiLuong(),XDate.toString(entity.getNgayKhaiGiang(), "yyyy-MM-dd"),entity.getGhiChu(),entity.getMaNV(),XDate.toString(entity.getNgayTao(), "yyyy-MM-dd") );
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(KhoaHoc entity) {
        try {
            jdbcHelper.update(Update_KhoaHoc,entity.getMaCD(),entity.getHocPhi(),entity.getThoiLuong(),XDate.toString(entity.getNgayKhaiGiang(), "yyyy-MM-dd"),entity.getGhiChu(),entity.getMaNV(),XDate.toString(entity.getNgayTao(), "yyyy-MM-dd"),entity.getMaKH());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            jdbcHelper.update(DELETE_KhoaHoc,id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public KhoaHoc SelectById(Integer id) {
        List<KhoaHoc> listkhoahoc = this.SelectBySQL(SELECT_BY_ID_KhoaHoc, id);
        if(listkhoahoc.isEmpty()){
            return null;
        }
        return listkhoahoc.get(0);
    }

    @Override
    public List<KhoaHoc> SelectAll() {
        return this.SelectBySQL(SELECT_ALL_KhoaHoc);
    }

    @Override
    protected List<KhoaHoc> SelectBySQL(String sql, Object... args) {
        List<KhoaHoc> listkhoahoc = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                KhoaHoc kh = new KhoaHoc();
                kh.setMaKH(rs.getInt(1));
                kh.setMaCD(rs.getString(2));
                kh.setHocPhi(rs.getFloat(3));
                kh.setThoiLuong(rs.getInt(4));
                kh.setNgayKhaiGiang(rs.getDate(5));
                kh.setGhiChu(rs.getString(6));
                kh.setMaNV(rs.getString(7));
                kh.setNgayTao(rs.getDate(8));
                listkhoahoc.add(kh);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listkhoahoc;
    }
    
    public List<KhoaHoc> SelectByChuyenDe(String MaCD){
        String sql = "SELECT * FROM KHOAHOC WHERE MaCD like ?";
        return this.SelectBySQL(sql, MaCD);
    }
    
    //Methods cho thống kê
    public List<Integer> selectYear(){
        //DISTINCT để liệt kê ra các năm không bị trùng.
        String sql = "SELECT DISTINCT YEAR(NgayKhaiGiang) FROM KHOAHOC\n" +
                       "ORDER BY YEAR(NgayKhaiGiang) DESC; ";
        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql);
            while(rs.next()){
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }
}
