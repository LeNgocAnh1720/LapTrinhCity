/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.NhanVienDAO;
import DAO.jdbcHelper;
import Utilities.Auths;
import Utilities.MsgBox;
import Utilities.XImages;
import Model.NhanVien;

/**
 *
 * @author OS
 */
public class DoiMatKhau extends javax.swing.JDialog {

    /**
     * Creates new form Login1
     */
    public DoiMatKhau(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTenDN = new javax.swing.JLabel();
        lblDangNhap = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhauNhacLai = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnDongY = new javax.swing.JButton();
        btnHuyBo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMatKhaucu = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        lblAnh1 = new javax.swing.JLabel();
        lblAnh2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Đăng Nhập");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenDN.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblTenDN.setText("Tên đăng nhập :");
        jPanel1.add(lblTenDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lblDangNhap.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblDangNhap.setForeground(new java.awt.Color(0, 142, 53));
        lblDangNhap.setText("ĐỔI MẬT KHẨU");
        jPanel1.add(lblDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtTenDangNhap.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTenDangNhap.setBorder(null);
        jPanel1.add(txtTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 250, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 10));

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMatKhau.setText("Mật khẩu cũ :");
        jPanel1.add(lblMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtMatKhauNhacLai.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMatKhauNhacLai.setBorder(null);
        txtMatKhauNhacLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauNhacLaiActionPerformed(evt);
            }
        });
        jPanel1.add(txtMatKhauNhacLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 250, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 250, 10));

        btnDongY.setBackground(new java.awt.Color(0, 142, 53));
        btnDongY.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnDongY.setText("ĐỒNG Ý");
        btnDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongYActionPerformed(evt);
            }
        });
        jPanel1.add(btnDongY, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        btnHuyBo.setBackground(new java.awt.Color(0, 142, 53));
        btnHuyBo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnHuyBo.setText("HUỶ BỎ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuyBo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Mật khẩu mới :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtMatKhaucu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMatKhaucu.setBorder(null);
        txtMatKhaucu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhaucuActionPerformed(evt);
            }
        });
        jPanel1.add(txtMatKhaucu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 250, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 172, 250, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Nhập lại mật khẩu mới:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        txtMatKhauMoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMatKhauMoi.setBorder(null);
        txtMatKhauMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauMoiActionPerformed(evt);
            }
        });
        jPanel1.add(txtMatKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 250, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 250, 10));

        lblAnh1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAnMau_Images/hinhnentrang1.jpg"))); // NOI18N
        lblAnh1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0), 4));
        jPanel1.add(lblAnh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 390));

        lblAnh2.setBackground(new java.awt.Color(255, 255, 255));
        lblAnh2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAnh2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAnMau_Images/ongvang1.png"))); // NOI18N
        lblAnh2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 4));
        lblAnh2.setOpaque(true);
        jPanel1.add(lblAnh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 260, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatKhauNhacLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauNhacLaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauNhacLaiActionPerformed

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
       huybo();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void btnDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongYActionPerformed
        suaMatKhau();
    }//GEN-LAST:event_btnDongYActionPerformed

    private void txtMatKhaucuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhaucuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhaucuActionPerformed

    private void txtMatKhauMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauMoiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiMatKhau.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiMatKhau dialog = new DoiMatKhau(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDongY;
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAnh1;
    private javax.swing.JLabel lblAnh2;
    private javax.swing.JLabel lblDangNhap;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenDN;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtMatKhauNhacLai;
    private javax.swing.JPasswordField txtMatKhaucu;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImages.getAppIcon());
    }
    NhanVienDAO dao = new NhanVienDAO();
    private void suaMatKhau(){
        String TenDangNhap = txtTenDangNhap.getText();
        String MatKhauCu = String.valueOf(txtMatKhaucu.getText());
        String MatKhauMoi = String.valueOf(txtMatKhauMoi.getText());
        String MatKhauNhacLai = String.valueOf(txtMatKhauNhacLai.getText());
        
        if(!TenDangNhap.equalsIgnoreCase(Auths.user.getMaNV())){
            MsgBox.alert(this, "Sai tên đăng nhập");
        }else if(!MatKhauCu.equalsIgnoreCase(Auths.user.getMatKhau())){
            MsgBox.alert(this, "Sai mật khẩu");
        }else if(!MatKhauNhacLai.equalsIgnoreCase(MatKhauMoi)){
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
        }else{
            Auths.user.setMatKhau(MatKhauMoi);
            dao.update(Auths.user);
            MsgBox.alert(this, "Đổi mật khẩu thành công");
            this.dispose();
        }
    }
    
    private void huybo(){
        this.dispose();
    }
    
}
