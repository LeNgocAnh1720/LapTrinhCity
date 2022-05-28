/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.ChuyenDeDAO;
import DAO.KhoaHocDAO;
import Utilities.Auths;
import Utilities.MsgBox;
import Utilities.Validate;
import Utilities.XDate;
import static Utilities.XDate.now;
import Utilities.XImages;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.ChuyenDe;
import Model.KhoaHoc;

/**
 *
 * @author OS
 */
public class QL_KhoaHoc extends javax.swing.JFrame {

    /**
     * Creates new form QL_KhoaHoc
     */
    DefaultTableModel model;

    public QL_KhoaHoc() {
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

        pnlChuyenDe = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        tab = new javax.swing.JTabbedPane();
        pnlCatNhap = new javax.swing.JPanel();
        lblChuyenDeCon = new javax.swing.JLabel();
        lblHocPhi = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        lblNguoiTao = new javax.swing.JLabel();
        txtNguoiTao = new javax.swing.JTextField();
        lblKhaiGiang = new javax.swing.JLabel();
        lblThoiLuong = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        lblNgayTao = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        lblGhiChu = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaGhiChu = new javax.swing.JTextArea();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblChuyenDe = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKhoaHoc = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - QUẢN LÝ KHOÁ HỌC");

        pnlChuyenDe.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 17), new java.awt.Color(0, 120, 215))); // NOI18N

        cboChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        cboChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyenDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlChuyenDeLayout = new javax.swing.GroupLayout(pnlChuyenDe);
        pnlChuyenDe.setLayout(pnlChuyenDeLayout);
        pnlChuyenDeLayout.setHorizontalGroup(
            pnlChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChuyenDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboChuyenDe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlChuyenDeLayout.setVerticalGroup(
            pnlChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChuyenDeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblChuyenDeCon.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblChuyenDeCon.setText("Chuyên đề");

        lblHocPhi.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblHocPhi.setText("Học phí");

        txtHocPhi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtHocPhi.setEnabled(false);

        lblNguoiTao.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblNguoiTao.setText("Người tạo");

        txtNguoiTao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNguoiTao.setEnabled(false);

        lblKhaiGiang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblKhaiGiang.setText("Khai giảng");

        lblThoiLuong.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblThoiLuong.setText("Thời lượng");

        txtThoiLuong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtThoiLuong.setEnabled(false);

        lblNgayTao.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblNgayTao.setText("Ngày tạo");

        txtNgayTao.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtNgayTao.setEnabled(false);

        lblGhiChu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lblGhiChu.setText("Ghi chú");

        txaGhiChu.setColumns(20);
        txaGhiChu.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        txaGhiChu.setRows(5);
        jScrollPane2.setViewportView(txaGhiChu);

        btnThem.setText("Thêm");
        btnThem.setMaximumSize(new java.awt.Dimension(55, 29));
        btnThem.setPreferredSize(new java.awt.Dimension(55, 29));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.setMaximumSize(new java.awt.Dimension(55, 29));
        btnSua.setPreferredSize(new java.awt.Dimension(55, 29));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.setMaximumSize(new java.awt.Dimension(55, 29));
        btnXoa.setPreferredSize(new java.awt.Dimension(55, 29));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.setMaximumSize(new java.awt.Dimension(55, 29));
        btnMoi.setPreferredSize(new java.awt.Dimension(55, 29));
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnFirst.setText("<<");
        btnFirst.setMaximumSize(new java.awt.Dimension(55, 29));
        btnFirst.setPreferredSize(new java.awt.Dimension(55, 29));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnBack.setText("|<");
        btnBack.setMaximumSize(new java.awt.Dimension(55, 29));
        btnBack.setPreferredSize(new java.awt.Dimension(55, 29));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setText(">|");
        btnNext.setMaximumSize(new java.awt.Dimension(55, 29));
        btnNext.setPreferredSize(new java.awt.Dimension(55, 29));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setText(">>");
        btnLast.setMaximumSize(new java.awt.Dimension(55, 29));
        btnLast.setPreferredSize(new java.awt.Dimension(55, 29));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        lblChuyenDe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblChuyenDe.setForeground(new java.awt.Color(255, 0, 0));

        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        javax.swing.GroupLayout pnlCatNhapLayout = new javax.swing.GroupLayout(pnlCatNhap);
        pnlCatNhap.setLayout(pnlCatNhapLayout);
        pnlCatNhapLayout.setHorizontalGroup(
            pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCatNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCatNhapLayout.createSequentialGroup()
                        .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblChuyenDeCon)
                            .addComponent(lblHocPhi)
                            .addComponent(txtHocPhi)
                            .addComponent(lblNguoiTao)
                            .addComponent(txtNguoiTao, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(lblChuyenDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblKhaiGiang)
                            .addComponent(lblThoiLuong)
                            .addComponent(txtThoiLuong)
                            .addComponent(lblNgayTao)
                            .addComponent(txtNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblGhiChu)
                    .addComponent(jScrollPane2)
                    .addGroup(pnlCatNhapLayout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlCatNhapLayout.setVerticalGroup(
            pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCatNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChuyenDeCon)
                    .addComponent(lblKhaiGiang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblChuyenDe, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHocPhi)
                    .addComponent(lblThoiLuong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNguoiTao)
                    .addComponent(lblNgayTao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGhiChu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(pnlCatNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab.addTab("CẬP NHẬT", pnlCatNhap);

        tblKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ KHOÁ HỌC", "HỌC PHÍ", "THỜI GIAN", "KHAI GIẢNG", "TẠO BỞI", "NGÀY TẠO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoaHoc.setAltoHead(38);
        tblKhoaHoc.setColorBackgoundHead(new java.awt.Color(153, 153, 192));
        tblKhoaHoc.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblKhoaHoc.setColorSelBackgound(new java.awt.Color(255, 51, 51));
        tblKhoaHoc.setFuenteHead(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tblKhoaHoc.setRowHeight(25);
        tblKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoaHocMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblKhoaHoc);

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tab.addTab("DANH SÁCH", pnlDanhSach);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tab, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlChuyenDe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        this.chonChuyenDe();
    }//GEN-LAST:event_cboChuyenDeActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

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

    private void tblKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoaHocMouseClicked
       if(evt.getClickCount()==2){
            this.row = tblKhoaHoc.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblKhoaHocMouseClicked

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
            java.util.logging.Logger.getLogger(QL_KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QL_KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QL_KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QL_KhoaHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QL_KhoaHoc().setVisible(true);
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
    private javax.swing.JComboBox<String> cboChuyenDe;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblChuyenDe;
    private javax.swing.JLabel lblChuyenDeCon;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblKhaiGiang;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblNguoiTao;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JPanel pnlCatNhap;
    private javax.swing.JPanel pnlChuyenDe;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JTabbedPane tab;
    private rojeru_san.complementos.RSTableMetro tblKhoaHoc;
    private javax.swing.JTextArea txaGhiChu;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtNguoiTao;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables
    ChuyenDeDAO cd = new ChuyenDeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    int row = -1;
    int MaKH = -1;

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImages.getAppIcon());
        this.fillComBoBox();
        this.updateStatus();
    }

    private void fillComBoBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = cd.SelectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }
    }

    private void filltable() {
        DefaultTableModel model = (DefaultTableModel) tblKhoaHoc.getModel();
        model.setRowCount(0);
        try {
            ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
            List<KhoaHoc> list = khdao.SelectByChuyenDe(chuyenDe.getMaCD());
            for (KhoaHoc khoaHoc : list) {
                model.addRow(new Object[]{
                    khoaHoc.getMaKH(), khoaHoc.getHocPhi(), khoaHoc.getThoiLuong(),
                    XDate.toString(khoaHoc.getNgayKhaiGiang(), "dd/MM/yyyy"),
                    khoaHoc.getMaNV(),
                    XDate.toString(khoaHoc.getNgayTao(), "dd/MM/yyyy")

                });
            }
            model.fireTableDataChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insert() {
        if(String.valueOf(jDateChooser1.getDate()).equals("")){
            JOptionPane.showMessageDialog(this, "Chưa nhập ngày khai giảng","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (Validate.isEmptyTxa(txaGhiChu, "Chưa nhập ghi chú") == false) {
            return;
        }
        if (!Auths.isLogin()) {
            MsgBox.alert(this, "Bạn cần đăng nhập!!");
            return;
        } else {
            try {
                KhoaHoc khoahoc = getForm();
                khdao.insert(khoahoc);
                this.filltable();
                MsgBox.alert(this, "Thêm mới thành công");
                this.clearForm();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void update() {
//        if (Validate.isEmpty(jDateChooser1, "Chưa nhập ngày khai giảng") == false) {
//            return;
//        }
        if (Validate.isEmptyTxa(txaGhiChu, "Chưa nhập ngày khai giảng") == false) {
            return;
        }
        if (!Auths.isLogin()) {
            MsgBox.alert(this, "Bạn cần đăng nhập!!");
            return;
        } else {
            try {
                KhoaHoc khoahoc = getForm();
                khdao.update(khoahoc);
                this.filltable();
                MsgBox.alert(this, "Update thành công");
                this.clearForm();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void delete() {
        if (!Auths.isManager()) {
            MsgBox.alert(this, "Chỉ có trưởng phòng mới được xoá !!");
            return;
        } else {
            try {
                if (MsgBox.confirm(this, "Bạn có muốn xoá không?")) {

                    khdao.delete(MaKH);
                    this.filltable();
                    MsgBox.alert(this, "Xoá thành công!!");
                    this.clearForm();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void clearForm() {
        jDateChooser1.setDate(null);
        this.row = -1;
    }

    private void First() {
       this.row = 0;
       this.edit();
    }

    private void Previous() {
        if(this.row>0){
            this.row--;
            this.edit();
        }
    }

    private void Next() {
        if(this.row<tblKhoaHoc.getRowCount()-1){
            this.row++;
            this.edit();
        }
    }

    private void Last() {
        this.row = tblKhoaHoc.getRowCount()-1;
        this.edit();
    }

    private void edit() {
        int value = (int) tblKhoaHoc.getValueAt(this.row, 0);
        KhoaHoc kh = this.khdao.SelectById(value);
        this.setForm(kh);
        tab.setSelectedIndex(0);
        this.updateStatus();
    }

    private void setForm(KhoaHoc kh) {
        //Để nhờ Mã KHoá học vì không có chỗ để trên Form
        MaKH = (int) tblKhoaHoc.getValueAt(this.row, 0);

        jDateChooser1.setDate(kh.getNgayKhaiGiang());
        txtHocPhi.setText(String.valueOf(kh.getHocPhi()));
        txtThoiLuong.setText(String.valueOf(kh.getThoiLuong()));
        txtNguoiTao.setText(kh.getMaNV());
        txtNgayTao.setText(XDate.toString(kh.getNgayTao(), "dd/MM/yyyy"));
        txaGhiChu.setText(kh.getGhiChu());
    }

    private KhoaHoc getForm() {

        KhoaHoc kh = new KhoaHoc();
        ChuyenDe chuyende = (ChuyenDe) cboChuyenDe.getSelectedItem();
        kh.setMaCD(chuyende.getMaCD());
        kh.setHocPhi((float) Double.parseDouble(txtHocPhi.getText()));
        kh.setThoiLuong(Integer.parseInt(txtThoiLuong.getText()));
        //kh.setNgayKhaiGiang(XDate.toDate(jDateChooser1.getDateFormatString(), "dd/MM/yyyy"));
        kh.setNgayKhaiGiang(jDateChooser1.getDate());
        kh.setGhiChu(txaGhiChu.getText());
        kh.setMaNV(Auths.user.getMaNV());
        kh.setNgayTao(XDate.now());
        kh.setMaKH(MaKH);
        return kh;
    }

    private void updateStatus() {
        boolean edit = (this.row>=0);
        boolean first = (this.row==0);
        boolean last = (this.row==tblKhoaHoc.getRowCount()-1);
        //Các nút
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        btnMoi.setEnabled(edit);
        
        //DK
        btnFirst.setEnabled(edit && !first);
        btnBack.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }

    private void chonChuyenDe() {
        ChuyenDe chuyende = (ChuyenDe) cboChuyenDe.getSelectedItem();
        txtThoiLuong.setText(String.valueOf(chuyende.getThoiGian()));
        txtHocPhi.setText(String.valueOf(chuyende.getHocPhi()));
        lblChuyenDe.setText(String.valueOf(chuyende.getTenCD()));
        txaGhiChu.setText(chuyende.getMoTa());
//        txtNguoiTao.setText(Auths.user.getMaNV());
        txtNgayTao.setText(XDate.toString(now(), "dd/MM/yyyy"));
        this.filltable();
        this.row = -1;
        
        tab.setSelectedIndex(1);
    }
}