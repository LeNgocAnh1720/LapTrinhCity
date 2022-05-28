/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.NhanVien;

/**
 *
 * @author OS
 */
public class NhanVienDAO extends EduSys_DAO<NhanVien, String>{
    String Insert_NhanVien = "INSERT INTO NHANVIEN (MaNV,MatKhau,HoTen,VaiTro,Email) VALUES(?,?,?,?,?)";
    String Update_NhanVien = "UPDATE NHANVIEN SET MatKhau=? , HoTen=?, VaiTro=? , Email=? WHERE MaNV=?";
    String DELETE_NhanVien = "DELETE FROM NHANVIEN WHERE MaNV=?";
    String SELECT_ALL_SQL = "SELECT * FROM NHANVIEN";
    String SELECT_BY_ID ="SELECT * FROM NHANVIEN WHERE MaNV=?";
    
    @Override
    public void insert(NhanVien entity) {
        try {
            jdbcHelper.update(Insert_NhanVien, entity.getMaNV(),entity.getMatKhau(),entity.getHoTen(),entity.isVaiTro(),entity.getEmail());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(NhanVien entity) {
        try {
            jdbcHelper.update(Update_NhanVien,entity.getMatKhau(), entity.getHoTen(),entity.isVaiTro(),entity.getEmail(),entity.getMaNV());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            jdbcHelper.update(DELETE_NhanVien, id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public NhanVien SelectById(String id) {
        List<NhanVien> list = this.SelectBySQL(SELECT_BY_ID, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<NhanVien> SelectAll() {
        return this.SelectBySQL(SELECT_ALL_SQL);
    }

    @Override
    protected List<NhanVien> SelectBySQL(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {                
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setVaiTro(rs.getBoolean("VaiTro"));
                nv.setEmail(rs.getString("Email"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public NhanVien SelectEmail(String sqlString){
        String sql = "SELECT * FROM NHANVIEN WHERE Email like ?";
        List<NhanVien> list = this.SelectBySQL(sql, sqlString);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }
}
