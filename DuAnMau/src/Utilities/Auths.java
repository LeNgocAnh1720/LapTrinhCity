/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Model.NhanVien;

/**
 *
 * @author OS
 */
public class Auths {
    public static NhanVien user = null;
    
    public static void clear(){
        Auths.user = null;
    }
    
    //Trả về hệ thống đã được đăng nhập hay chưa (Rồi ==>T . chưa ==>F);
    public static boolean isLogin(){
        return Auths.user != null;
    }
    
    public static boolean isManager(){
        return Auths.isLogin() && user.isVaiTro();
    }
}
