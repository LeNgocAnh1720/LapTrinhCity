/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OS
 */
public class ThongKeDAO {
    private List<Object[]> getListofArray(String sql , String[] column , Object...args){
        
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = jdbcHelper.query(sql, args);
            while(rs.next()){
                Object[] obj = new Object[column.length];
                for(int i = 0 ; i<column.length ; i++){
                    obj[i] = rs.getObject(column[i]);
                }
                list.add(obj);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
       
    }
    
    public List<Object[]> getBangDiem(Integer MaKH){
        String sql = "{call sp_ThongKeBangDiem (?)}";
        //Cấu trúc dữ liệu của mảng ta nhận được.
        String[] column = {"MaNH","HoTen","Diem"};
        return this.getListofArray(sql, column, MaKH);
    }
    
    public List<Object[]> getSoLuongNguoiHoc(){
        String sql = "{call sp_ThongKeNguoiHoc}";
        //Cấu trúc dữ liệu của mảng ta nhận được.
        String[] column = {"Nam","SoLuong","DKSomNhat","DKMuonNhat"};
        return this.getListofArray(sql, column);
    }
    
    public List<Object[]> getDiemChuyenDe(){
        String sql = "{call sp_ThongKeDiemChuyenDe}";
        //Cấu trúc dữ liệu của mảng ta nhận được.
        String[] column = {"TenCD","SLHV","DiemTN","DiemCN","DiemTB"};
        return this.getListofArray(sql, column);
    }
    
    public List<Object[]> getDoanhThu(int nam){
        String sql = "{call sp_ThongKeDoanhThu (?)}";
        //Cấu trúc dữ liệu của mảng ta nhận được.
        String[] column = {"TenCD","SoLop","HocVien","TongDoanhThu","DoanhThuNhoNhat","DoanhThuLonNhat","DoanhThuTB"};
        return this.getListofArray(sql, column, nam);
    }
}
