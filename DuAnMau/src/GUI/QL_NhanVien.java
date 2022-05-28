/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.NhanVienDAO;
import Utilities.Auths;
import Utilities.MsgBox;
import Utilities.Validate;
import Utilities.XImages;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Model.NhanVien;

/**
 *
 * @author OS
 */
public class QL_NhanVien extends javax.swing.JFrame {

    DefaultTableModel model;
    public QL_NhanVien() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        lblQuanTri = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        pnlCatNhap = new javax.swing.JPanel();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        lblXNMatKhau = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblVaiTro = new javax.swing.JLabel();
        rdoTruongPhong = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        txtMatKhau2 = new javax.swing.JPasswordField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDSNhanVien = new rojeru_san.complementos.RSTableMetro();

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(rSTableMetro1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - QUẢN LÝ NHÂN VIÊN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblQuanTri.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblQuanTri.setForeground(new java.awt.Color(0, 112, 192));
        lblQuanTri.setText("QUẢN LÝ NHÂN VIÊN QUẢN TRỊ");

        lblMaNV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMaNV.setText("Mã nhân viên");

        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblMatKhau.setText("Mật khẩu");

        lblXNMatKhau.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblXNMatKhau.setText("Xác nhận mật khẩu");

        lblHoTen.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblHoTen.setText("Họ và tên");

        txtHoTen.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblVaiTro.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblVaiTro.setText("Vai trò");

        buttonGroup1.add(rdoTruongPhong);
        rdoTruongPhong.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        rdoTruongPhong.setText("Trưởng phòng");

        buttonGroup1.add(rdoNhanVien);
        rdoNhanVien.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        rdoNhanVien.setSelected(true);
        rdoNhanVien.setText("Nhân Viên");

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setMaximumSize(new java.awt.Dimension(65, 29));
        btnThem.setPreferredSize(new java.awt.Dimension(65, 29));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(65, 29));
        btnSua.setPreferredSize(new java.awt.Dimension(65, 29));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.setMaximumSize(new java.awt.Dimension(65, 29));
        btnXoa.setPreferredSize(new java.awt.Dimension(65, 29));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.setMaximumSize(new java.awt.Dimension(65, 29));
        btnMoi.setPreferredSize(new java.awt.Dimension(65, 29));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAnMau_Images/icons8_rewind_38px.png"))); // NOI18N
        btnFirst.setMaximumSize(new java.awt.Dimension(55, 29));
        btnFirst.setPreferredSize(new java.awt.Dimension(55, 29));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAnMau_Images/icons8_skip_to_start_38px.png"))); // NOI18N
        btnBack.setMaximumSize(new java.awt.Dimension(55, 29));
        btnBack.setPreferredSize(new java.awt.Dimension(55, 29));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAnMau_Images/icons8_end_38px.png"))); // NOI18N
        btnNext.setMaximumSize(new java.awt.Dimension(55, 29));
        btnNext.setPreferredSize(new java.awt.Dimension(55, 29));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DuAnMau_Images/icons8_fast_forward_38px.png"))); // NOI18N
        btnLast.setMaximumSize(new java.awt.Dimension(55, 29));
        btnLast.setPreferredSize(new java.awt.Dimension(55, 29));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txtMatKhau2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        javax.swing.GroupLayout pnlCatNhapLayout = new javax.swing.GroupLayout(pnlCatNhap);
        pnlCatNhap.setLayout(pnlCatNhapLayout);
        pnlCatNhapLayout.setHorizontalGroup(
            pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCatNhapLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addComponent(txtMatKhau2)
                    .addComponent(txtMaNV)
                    .addComponent(txtMatKhau)
                    .addGroup(pnlCatNhapLayout.createSequentialGroup()
                        .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addGroup(pnlCatNhapLayout.createSequentialGroup()
                                .addComponent(rdoTruongPhong)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNhanVien))
                            .addComponent(lblVaiTro)
                            .addComponent(lblHoTen)
                            .addComponent(lblXNMatKhau)
                            .addComponent(lblMatKhau)
                            .addComponent(lblMaNV))
                        .addGap(0, 383, Short.MAX_VALUE))
                    .addComponent(txtHoTen)
                    .addGroup(pnlCatNhapLayout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlCatNhapLayout.setVerticalGroup(
            pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCatNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblXNMatKhau)
                .addGap(5, 5, 5)
                .addComponent(txtMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVaiTro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTruongPhong)
                    .addComponent(rdoNhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tab.addTab("CẬT NHẬP", pnlCatNhap);

        tblDSNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ NHÂN VIÊN", "MẬT KHẨU", "HỌ TÊN", "CHỨC VỤ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDSNhanVien.setAltoHead(30);
        tblDSNhanVien.setColorBackgoundHead(new java.awt.Color(153, 153, 192));
        tblDSNhanVien.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblDSNhanVien.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tblDSNhanVien.setFuenteHead(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        tblDSNhanVien.setRowHeight(25);
        tblDSNhanVien.setShowHorizontalLines(false);
        tblDSNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDSNhanVien);
        if (tblDSNhanVien.getColumnModel().getColumnCount() > 0) {
            tblDSNhanVien.getColumnModel().getColumn(1).setMinWidth(100);
            tblDSNhanVien.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblDSNhanVien.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        tab.addTab("DANH SÁCH", pnlDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuanTri)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tab))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuanTri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       this.delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
       this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
       this.First();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       this.Previous();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
       this.Next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.Last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblDSNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSNhanVienMouseClicked
        if(evt.getClickCount() ==2){
            this.row = tblDSNhanVien.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblDSNhanVienMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

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
            java.util.logging.Logger.getLogger(QL_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_NhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_NhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblQuanTri;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JLabel lblXNMatKhau;
    private javax.swing.JPanel pnlCatNhap;
    private javax.swing.JPanel pnlDanhSach;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoTruongPhong;
    private javax.swing.JTabbedPane tab;
    private rojeru_san.complementos.RSTableMetro tblDSNhanVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhau2;
    // End of variables declaration//GEN-END:variables
    
    NhanVienDAO dao = new NhanVienDAO(); //Làm việc với entity NhanVien
    int row = -1;
    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImages.getAppIcon());
        this.filltable();
        this.row = -1;
        this.updatestatus();
    }
    
    private void insert() {
        if(Validate.isEmpty(txtMaNV, "Mã nhân viên đang rỗng!!") == false){
            return;
        }
        if(Validate.isEmptyPass(txtMatKhau, "Mật khẩu đang rỗng!!") == false){
            return;
        }
        if(Validate.isEmptyPass(txtMatKhau2, "Xác nhận mật khẩu đang rỗng!!") == false){
            return;
        }
        if(Validate.isEmpty(txtHoTen, "Họ và Tên đang rỗng!!") == false){
            return;
        }
        if(Validate.isEmpty(txtEmail, "Email đang rỗng!!") == false){
            return;
        }
        NhanVien nv = getForm();
        String mk2 = String.valueOf(txtMatKhau2.getText());
        if(!mk2.equalsIgnoreCase(nv.getMatKhau())){
            MsgBox.alert(this, "Mật khẩu không trùng khớp!");
        }else{
            try {
                dao.insert(nv);
                this.filltable();
                MsgBox.alert(this, "Thêm mới thành công");
                this.clearForm();
                
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm thất bại");
            }
        }
    }
    private void update(){
        if(Validate.isEmpty(txtMaNV, "Mã nhân viên đang rỗng!!") == false){
            return;
        }
        if(Validate.isEmptyPass(txtMatKhau, "Mật khẩu đang rỗng!!") == false){
            return;
        }
        if(Validate.isEmptyPass(txtMatKhau2, "Xác nhận mật khẩu đang rỗng!!") == false){
            return;
        }
        if(Validate.isEmpty(txtHoTen, "Họ và Tên đang rỗng!!") == false){
            return;
        }
        if(Validate.isEmpty(txtEmail, "Email đang rỗng!!") == false){
            return;
        }
        NhanVien nv = getForm();
        String mk2 = String.valueOf(txtMatKhau2.getText());
        if(!mk2.equalsIgnoreCase(nv.getMatKhau())){
            MsgBox.alert(this, "Mật khẩu không trùng khớp!!");
        }else{
            try {
                dao.update(nv);
                this.filltable();
                MsgBox.alert(this, "Update thành công");
                this.clearForm();
            } catch (Exception e) {
                MsgBox.alert(this, "Update không thành công");
            }
        }
    }
    private void delete(){
        //Trường hợp 1: Chỉ Trưởng phòng mới được xoá nhân viên
        if(!Auths.isManager()){
            MsgBox.alert(this, "Chỉ có trưởng phòng mới được xoá nhân viên");
        }else{
            //TH2: không được xoá chính bản thân
            if(txtMaNV.getText().equals(Auths.user.getMaNV())){
                MsgBox.alert(this, "Bạn không được xoá chính bạn!!");
            }else if(MsgBox.confirm(this, "Bạn có muốn xoá hay không?")){
                try {
                    dao.delete(txtMaNV.getText());
                    this.filltable();
                    MsgBox.alert(this, "Xoá thành công");
                    this.clearForm();
                } catch (Exception e) {
                    MsgBox.alert(this, "Xoá thất bại");
                }
            }
        }
    }
    private void clearForm(){
        //Tạo ra 1 nhân viên trắng thông tin
        NhanVien nv = new NhanVien();
        this.setForm(nv);
        txtMatKhau2.setText("");
        this.row = -1;
        this.updatestatus();
    }
    private void First(){
        this.row = 0;
        this.edit();
    }
    private void Previous(){
        if(this.row>0){
            this.row--;
            this.edit();
        }
    }
    private void Next(){
        if(this.row<tblDSNhanVien.getRowCount()-1){
            this.row++;
            this.edit();
        }
    }
    private void Last(){
        this.row = tblDSNhanVien.getRowCount()-1;
        this.edit();
    }
    private void edit(){
        String manv = (String) tblDSNhanVien.getValueAt(this.row, 0);
        //Lấy lên dữ liệu từ database theo mã nhân viên vừa lấy ra
        NhanVien nv = dao.SelectById(manv);
        this.setForm(nv);
        tab.setSelectedIndex(0);
        this.updatestatus();
    }
    //Đổ dữ liệu lên table
    private void filltable(){
        DefaultTableModel model = (DefaultTableModel) tblDSNhanVien.getModel();
        model.setRowCount(0);
        try {
            List<NhanVien> list = dao.SelectAll();
            for (NhanVien nv : list) {
                model.addRow(new Object[]{
                    nv.getMaNV(),nv.getMatKhau(),nv.getHoTen(),nv.isVaiTro()?"Trưởng Phòng":"Nhân Viên"
                });
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Hiển thị NhanVien len Form
     private void setForm(NhanVien nv){
        txtMaNV.setText(nv.getMaNV());
        txtMatKhau.setText(nv.getMatKhau());
        txtHoTen.setText(nv.getHoTen());
        txtMatKhau2.setText(nv.getMatKhau());
        rdoTruongPhong.setSelected(nv.isVaiTro());
        rdoNhanVien.setSelected(!nv.isVaiTro());
        txtEmail.setText(nv.getEmail());
    }
    
    //Lấy dữ liệu nhập vào từ Form
    private NhanVien getForm(){
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setMatKhau(txtMatKhau.getText());
        nv.setHoTen(txtHoTen.getText());
        boolean gioitinh;
        if(rdoTruongPhong.isSelected()){
            gioitinh =true;
        }else{
            gioitinh = false;
        }
        nv.setVaiTro(gioitinh);
        nv.setEmail(txtEmail.getText());
        return nv;
    }
    
    private void updatestatus(){
        boolean edit = (this.row >=0 ); //Trả về True nếu đang ở hàng lớn hơn 0
        boolean first = (this.row==0); //Trả về True nếu đang ở hàng đầu tiên
        boolean last = (this.row==tblDSNhanVien.getRowCount()-1); //Trả về True nếu đang ở hàng cuối cùng
        
        //Trạng thái form
        txtMaNV.setEditable(!edit); //Không thể UPDATE  mã nhân viên 
        btnThem.setEnabled(!edit); //Không thể thêm khi đã có mã nhân viên
        btnMoi.setEnabled(edit);
        btnSua.setEnabled(edit); 
        btnXoa.setEnabled(edit);
        
        //Trạng thái điều hướng
        btnFirst.setEnabled(edit && !first); //Đang ở hàng ddaauf tiên thì không thể back
        btnBack.setEnabled(edit && !first);  
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);  
    }
    
}