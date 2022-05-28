/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Model.HocVien;
import Model.NhanVien;

/**
 *
 * @author OS
 */
public class HocVienDAO extends EduSys_DAO<HocVien, Integer>{
    String Insert_HocVien = "INSERT INTO HOCVIEN (MaKH,MaNH,Diem) VALUES(?,?,?)";
    String Update_HocVien = "UPDATE HOCVIEN SET MaKH=? , MaNH=?, Diem=? WHERE MaHV=?";
    String DELETE_HocVien = "DELETE FROM HOCVIEN WHERE MaHV=?";
    String SELECT_ALL_SQL_HocVien = "SELECT * FROM HOCVIEN";
    String SELECT_BY_ID_HocVien ="SELECT * FROM HOCVIEN WHERE MaHV=?";
    @Override
    public void insert(HocVien entity) {
        try {
            jdbcHelper.update(Insert_HocVien, entity.getMaKH(),entity.getMaNH(),entity.getDiem());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(HocVien entity) {
        try {
            jdbcHelper.update(Update_HocVien, entity.getMaKH(),entity.getMaNH(),entity.getDiem(),entity.getMaHV());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(Integer id) {
        try {
            jdbcHelper.update(DELETE_HocVien,id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public HocVien SelectById(Integer id) {
        List<HocVien> listhocvien = this.SelectBySQL(SELECT_BY_ID_HocVien, id);
        if(listhocvien.isEmpty()){
            return null;
        }
        return listhocvien.get(0);
    }

    @Override
    public List<HocVien> SelectAll() {
        return this.SelectBySQL(SELECT_ALL_SQL_HocVien);
    }

    @Override
    protected List<HocVien> SelectBySQL(String sql, Object... args) {
        List<HocVien> listhocvien = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {                
                HocVien hv = new HocVien();
                hv.setMaHV(rs.getInt(1));
                hv.setMaKH(rs.getInt(2));
                hv.setMaNH(rs.getString(3));
                hv.setDiem(rs.getFloat(4));
                listhocvien.add(hv);
            }
            rs.getStatement().getConnection().close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listhocvien;
    }
    
    public List<HocVien> selectByKhoaHoc(int MaKH){
        String sql = "SELECT * FROM HOCVIEN WHERE MaKH=?";
        return this.SelectBySQL(sql,MaKH);
    }
}
