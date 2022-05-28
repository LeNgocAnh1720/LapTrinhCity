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
import Model.NguoiHoc;

/**
 *
 * @author OS
 */
public class NguoiHocDAO extends EduSys_DAO<NguoiHoc, String>{
    String Insert_NguoiHoc = "INSERT INTO NGUOIHOC(MaNH,HoTen,GioiTinh,NgaySinh,Email,SoDT,GhiChu,MaNV,NgayDangKy) VALUES(?,?,?,?,?,?,?,?,?)";
    String Update_NguoiHoc = "UPDATE NGUOIHOC SET HoTen=? , GioiTinh=?, NgaySinh=?, Email=?, SoDT=?, GhiChu=?, MaNV=?, NgayDangKy=?  WHERE MaNH=?";
    String DELETE_NguoiHoc = "DELETE FROM NGUOIHOC WHERE MaNH=?";
    String SELECT_ALL_NguoiHoc = "SELECT * FROM NGUOIHOC";
    String SELECT_BY_ID_NguoiHoc ="SELECT * FROM NGUOIHOC WHERE MaNH=?";
    @Override
    public void insert(NguoiHoc entity) {
         try {
            jdbcHelper.update(Insert_NguoiHoc,entity.getMaNH(),entity.getHoTen(),entity.isGioiTinh(),XDate.toString(entity.getNgaySinh(), "yyyy-MM-dd"),entity.getEmail(),entity.getSoDT(),entity.getGhiChu(),entity.getMaNV(),XDate.toString(entity.getNgayDangKy(), "yyyy-MM-dd"));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(NguoiHoc entity) {
        try {
            jdbcHelper.update(Update_NguoiHoc,entity.getHoTen(),entity.isGioiTinh(),XDate.toString(entity.getNgaySinh(), "yyyy-MM-dd"),entity.getEmail(),entity.getSoDT(),entity.getGhiChu(),entity.getMaNV(),XDate.toString(entity.getNgayDangKy(), "yyyy-MM-dd"),entity.getMaNH());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
         try {
            jdbcHelper.update(DELETE_NguoiHoc,id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public NguoiHoc SelectById(String id) {
       List<NguoiHoc> listnguoihoc = this.SelectBySQL(SELECT_BY_ID_NguoiHoc, id);
       if(listnguoihoc.isEmpty()){
           return null;
       }
       return listnguoihoc.get(0);
    }

    @Override
    public List<NguoiHoc> SelectAll() {
        return this.SelectBySQL(SELECT_ALL_NguoiHoc);
    }

    @Override
    protected List<NguoiHoc> SelectBySQL(String sql, Object... args) {
        List<NguoiHoc> listnguoihoc = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                NguoiHoc nh = new NguoiHoc();
                nh.setMaNH(rs.getString(1));
                nh.setHoTen(rs.getString(2));
                nh.setGioiTinh(rs.getBoolean(3));
                nh.setNgaySinh(rs.getDate(4));
                nh.setEmail(rs.getString(5));
                nh.setSoDT(rs.getString(6));
                nh.setGhiChu(rs.getString(7));
                nh.setMaNV(rs.getString(8));
                nh.setNgayDangKy(rs.getDate(9));
                listnguoihoc.add(nh);
            }
            rs.getStatement().getConnection().close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listnguoihoc;

    }
//    private NguoiHoc readFromResultSet(ResultSet rs) throws SQLException {
//        NguoiHoc model = new NguoiHoc();
//        model.setMaNH(rs.getString("MaNH"));
//        model.setHoTen(rs.getString("HoTen"));
//        model.setNgaySinh(rs.getDate("NgaySinh"));
//        model.setGioiTinh(rs.getBoolean("GioiTinh"));
//        model.setSoDT(rs.getString("SoDT"));
//        model.setEmail(rs.getString("Email"));
//        model.setGhiChu(rs.getString("GhiChu"));
//        model.setMaNV(rs.getString("MaNV"));
//        model.setNgayDangKy(rs.getDate("NgayDangKy"));
//        return model;
//    }
    
    public List<NguoiHoc> SelectByKeyWord(String keyword){
        String sql = "SELECT * from NGUOIHOC WHERE HoTen LIKE ?";
        return this.SelectBySQL(sql, "%"+keyword+"%");  
    }
    
    public List<NguoiHoc> SelectNotInCourse(int makh,String keyword){
        String sql = "SELECT * FROM NGUOIHOC "
                    +"WHERE HoTen LIKE ? AND "
                    +"MaNH NOT IN (SELECT MaNH FROM HOCVIEN WHERE MAKH=?)";
        return this.SelectBySQL(sql, "%"+keyword+"%",makh);
    }
}
