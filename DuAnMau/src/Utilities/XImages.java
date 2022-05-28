/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author OS
 */
public class XImages {
    public static Image getAppIcon(){
        URL url = XImages.class.getResource("/DuAnMau_Images/fpt.png");
        return new ImageIcon(url).getImage();
    }
    
    //Lưu FIle có tên mục là logo
    public static void save(File src){
        //Lưu file vào mục logo
        File dst = new File("logo", src.getName());
        
        //Kiểm tra xem thư mục logo có tồn tại hay chưa? Nếu chưa sẽ tạo ra thư mục logo(29)
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();
        }
        
        //Copy File vào thư mục
        try {
            Path from = Paths.get(src.getAbsolutePath()); // Lấy File từ đây
            Path to = Paths.get(dst.getAbsolutePath()); //Copy vào đây
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING); //Nếu File đó đã tồn tại thì thay thế luôn
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static ImageIcon read(String fileImage){
        File path = new File("logo",fileImage);
        return new ImageIcon(path.getAbsolutePath());
    }
}
