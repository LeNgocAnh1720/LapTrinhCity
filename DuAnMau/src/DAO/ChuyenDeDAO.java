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
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.ChuyenDe;

/**
 *
 * @author OS
 */
public class ChuyenDeDAO extends EduSys_DAO<ChuyenDe, String>{
    String Insert_ChuyenDe = "INSERT INTO CHUYENDE (MaCD,TenCD,HocPhi,ThoiGian,Hinh,MoTa) VALUES(?,?,?,?,?,?)";
    String Update_ChuyenDe = "UPDATE CHUYENDE SET TenCD=? , HocPhi=?, ThoiGian=?, Hinh=?, MoTa=?  WHERE MaCD=?";
    String DELETE_ChuyenDe = "DELETE FROM CHUYENDE WHERE MaCD=?";
    String SELECT_ALL_ChuyenDe = "SELECT * FROM CHUYENDE";
    String SELECT_BY_ID_ChuyenDe ="SELECT * FROM CHUYENDE WHERE MaCD=?";

    @Override
    public void insert(ChuyenDe entity) {
        try {
            jdbcHelper.update(Insert_ChuyenDe, entity.getMaCD(),entity.getTenCD(),entity.getHocPhi(),entity.getThoiGian(),entity.getHinh(),entity.getMoTa());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void update(ChuyenDe entity) {
        try {
            jdbcHelper.update(Update_ChuyenDe,entity.getTenCD(),entity.getHocPhi(),entity.getThoiGian(),entity.getHinh(),entity.getMoTa(), entity.getMaCD());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void delete(String id) {
        try {
            jdbcHelper.update(DELETE_ChuyenDe,id);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ChuyenDe SelectById(String id) {
       List<ChuyenDe> listchuyende = this.SelectBySQL(SELECT_BY_ID_ChuyenDe, id);
       if(listchuyende.isEmpty()){
           return null;
       }
       return listchuyende.get(0);
    }

    @Override
    public List<ChuyenDe> SelectAll() {
        return this.SelectBySQL(SELECT_ALL_ChuyenDe);
    }

    @Override
    protected List<ChuyenDe> SelectBySQL(String sql, Object... args) {
        List<ChuyenDe> listchuyende = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {                
                ChuyenDe cd = new ChuyenDe();
                cd.setMaCD(rs.getString("MaCD"));
                cd.setTenCD(rs.getString("TenCD"));
                cd.setHocPhi(rs.getFloat("HocPhi"));
                cd.setThoiGian(rs.getInt("ThoiGian"));
                cd.setHinh(rs.getString("Hinh"));
                cd.setMoTa(rs.getString("MoTa"));
                listchuyende.add(cd);  
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listchuyende;
    }
    
}
