/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.DeviceDao;

import POJO.Device;
import Utils.Connect;
import java.awt.Color;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;

import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.html.parser.DTDConstants;
import swing.EventCallBack;
import swing.EventTextField;


/**
 *
 * @author QuanLDM
 */
public class QuanLi_Device extends javax.swing.JFrame {

    private String dataconstructor = "";
    private String dataconstructor1 = "";
    private String dataconstructor2 = "";
    
    

    /**
     * Creates new form QuanLi_Device
     */
    public QuanLi_Device(String data) {
        initComponents();
        setTitle("Quản lí thiết bị trường học");
        this.dataconstructor = data;
        

        btn_muon32.setEnabled(false);
        btn_edit_32.setEnabled(false);
        btn_muon32.setEnabled(false);
        btn_hong_32.setEnabled(false);
        jtf_ma32.setEditable(false);
        ArrayList<Device> dv = DeviceDao.layDSdevice("select * from thietbi ");
        DefaultTableModel model = (DefaultTableModel) jtb_ds.getModel();

        Object[] obj = new Object[5];
        for (int i = 0; i < dv.size(); i++) {
            obj[0] = dv.get(i).getMa32();
            obj[1] = dv.get(i).getTen32();
            obj[2] = dv.get(i).getLoai32();
            obj[3] = dv.get(i).getTinhtrang32();
            if (dv.get(i).getTrangthai32().equals("0")) {
                obj[4] = "Chưa mượn";
            } else {
                obj[4] = "Đang mượn";
            }
//            obj[4] = dv.get(i).getTrangthai32();
            model.addRow(obj);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGradiente1 = new swing.PanelGradiente();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_ds = new javax.swing.JTable();
        txt_search20 = new swing.TextFieldAnimation();
        jlb_20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelGradiente2 = new swing.PanelGradiente();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtf_tinhtrang32 = new javax.swing.JTextField();
        btn_hong_32 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtf_ma32 = new swing.MyTextField();
        jtf_trangthai32 = new swing.MyTextField();
        jtf_ten32 = new swing.MyTextField();
        jtf_loai32 = new swing.MyTextField();
        btn_them_32 = new swing.ButtonGradient();
        btn_edit_32 = new swing.ButtonGradient();
        btn_muon32 = new swing.ButtonGradient();
        btn_delete_32 = new swing.ButtonGradient();
        lichsu_20 = new swing.ButtonGradient();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGradiente1.setColorPrimario(new java.awt.Color(107, 222, 248));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Danh sách thiết bị");
        panelGradiente1.add(jLabel2);
        jLabel2.setBounds(180, 10, 310, 41);

        jtb_ds.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtb_ds.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtb_ds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ THIẾT BỊ", "TÊN THIẾT BỊ", "LOẠI", "TÌNH TRẠNG", "TRẠNG THÁI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtb_ds.setGridColor(new java.awt.Color(0, 153, 0));
        jtb_ds.setRowHeight(30);
        jtb_ds.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jtb_ds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_dsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_ds);
        if (jtb_ds.getColumnModel().getColumnCount() > 0) {
            jtb_ds.getColumnModel().getColumn(3).setMinWidth(10);
        }

        panelGradiente1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 600, 140);

        txt_search20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_search20MouseClicked(evt);
            }
        });
        txt_search20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search20KeyReleased(evt);
            }
        });
        panelGradiente1.add(txt_search20);
        txt_search20.setBounds(350, 60, 186, 39);
        panelGradiente1.add(jlb_20);
        jlb_20.setBounds(260, 60, 78, 34);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/previous.png"))); // NOI18N
        jLabel1.setText("Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        panelGradiente1.add(jLabel1);
        jLabel1.setBounds(20, 10, 52, 18);

        panelGradiente2.setColorSecundario(new java.awt.Color(107, 222, 248));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Mã");
        panelGradiente2.add(jLabel3);
        jLabel3.setBounds(30, 120, 70, 17);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Tên");
        panelGradiente2.add(jLabel4);
        jLabel4.setBounds(30, 160, 60, 16);

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Loại");
        panelGradiente2.add(jLabel5);
        jLabel5.setBounds(30, 200, 70, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Tình trạng");
        panelGradiente2.add(jLabel6);
        jLabel6.setBounds(170, 350, 67, 17);

        jtf_tinhtrang32.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jtf_tinhtrang32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_tinhtrang32ActionPerformed(evt);
            }
        });
        panelGradiente2.add(jtf_tinhtrang32);
        jtf_tinhtrang32.setBounds(260, 350, 166, 23);

        btn_hong_32.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_hong_32.setForeground(new java.awt.Color(0, 51, 51));
        btn_hong_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/report.png"))); // NOI18N
        btn_hong_32.setText("Báo hỏng");
        btn_hong_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hong_32ActionPerformed(evt);
            }
        });
        panelGradiente2.add(btn_hong_32);
        btn_hong_32.setBounds(510, 350, 112, 25);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Trạng thái");
        panelGradiente2.add(jLabel7);
        jLabel7.setBounds(30, 80, 70, 16);

        jtf_ma32.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        panelGradiente2.add(jtf_ma32);
        jtf_ma32.setBounds(130, 120, 170, 30);

        jtf_trangthai32.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        panelGradiente2.add(jtf_trangthai32);
        jtf_trangthai32.setBounds(130, 80, 170, 30);

        jtf_ten32.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        panelGradiente2.add(jtf_ten32);
        jtf_ten32.setBounds(130, 160, 170, 30);

        jtf_loai32.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        panelGradiente2.add(jtf_loai32);
        jtf_loai32.setBounds(130, 200, 170, 30);

        btn_them_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/plus.png"))); // NOI18N
        btn_them_32.setText("Thêm");
        btn_them_32.setFocusable(false);
        btn_them_32.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        btn_them_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_them_32ActionPerformed(evt);
            }
        });
        panelGradiente2.add(btn_them_32);
        btn_them_32.setBounds(440, 70, 113, 33);

        btn_edit_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exchange.png"))); // NOI18N
        btn_edit_32.setText("Sửa");
        btn_edit_32.setFocusable(false);
        btn_edit_32.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        btn_edit_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_32ActionPerformed(evt);
            }
        });
        panelGradiente2.add(btn_edit_32);
        btn_edit_32.setBounds(440, 110, 113, 33);

        btn_muon32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/report.png"))); // NOI18N
        btn_muon32.setText("Mượn");
        btn_muon32.setColor1(new java.awt.Color(255, 107, 107));
        btn_muon32.setColor2(new java.awt.Color(85, 98, 112));
        btn_muon32.setFocusTraversalPolicyProvider(true);
        btn_muon32.setFocusable(false);
        btn_muon32.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        btn_muon32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_muon32ActionPerformed(evt);
            }
        });
        panelGradiente2.add(btn_muon32);
        btn_muon32.setBounds(440, 193, 110, 37);

        btn_delete_32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        btn_delete_32.setText("Xoá");
        btn_delete_32.setColor1(new java.awt.Color(255, 107, 107));
        btn_delete_32.setColor2(new java.awt.Color(85, 98, 112));
        btn_delete_32.setFocusTraversalPolicyProvider(true);
        btn_delete_32.setFocusable(false);
        btn_delete_32.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        btn_delete_32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete_32ActionPerformed(evt);
            }
        });
        panelGradiente2.add(btn_delete_32);
        btn_delete_32.setBounds(440, 150, 110, 37);

        lichsu_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/parchment.png"))); // NOI18N
        lichsu_20.setText("Lịch Sử");
        lichsu_20.setBorderPainted(false);
        lichsu_20.setColor1(new java.awt.Color(202, 197, 49));
        lichsu_20.setColor2(new java.awt.Color(243, 249, 167));
        lichsu_20.setFocusable(false);
        lichsu_20.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        lichsu_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lichsu_20ActionPerformed(evt);
            }
        });
        panelGradiente2.add(lichsu_20);
        lichsu_20.setBounds(440, 240, 113, 37);

        jSeparator1.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(panelGradiente2, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                    .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelGradiente2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtb_dsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_dsMouseClicked

        DefaultTableModel tmodel = (DefaultTableModel) jtb_ds.getModel();
        int selectrowindex = jtb_ds.getSelectedRow();
        jtf_ma32.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        jtf_ten32.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        jtf_loai32.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        jtf_tinhtrang32.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        jtf_trangthai32.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        dataconstructor1 = jtf_ma32.getText();
        boolean a = jtb_ds.isEditing();
        if (jtf_ma32.getText() != null) {
            btn_edit_32.setEnabled(true);
            btn_muon32.setEnabled(true);
        }
        if (jtf_tinhtrang32.getText().equals("Normal")) {
            btn_hong_32.setEnabled(true);
            btn_muon32.setEnabled(true);
        } else {
            btn_hong_32.setEnabled(false);

        }

        if (jtf_trangthai32.getText().equals("Chưa mượn") && jtf_tinhtrang32.getText().equals("Normal")) {
            btn_muon32.setEnabled(true);
        } else {
            btn_muon32.setEnabled(false);
        }
        if (a == false) {
            JOptionPane.showMessageDialog(null, "Bạn không thể chỉnh sửa ở đây ");
        }
        dataconstructor2 = jtf_ma32.getText();
        System.out.println(dataconstructor2);
    }//GEN-LAST:event_jtb_dsMouseClicked

    private void jtf_tinhtrang32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_tinhtrang32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_tinhtrang32ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        MENU s = new MENU(dataconstructor);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btn_hong_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hong_32ActionPerformed
        // TODO add your handling code here:

        try {
            Connection con = Connect.getConnection();
            String value1 = "Error";
            String value2 = jtf_ma32.getText();
            String sql = "UPDATE thietbi set tinhtrang='" + value1 + "' where ma='" + value2 + "'";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this, "Báo hỏng thành công");
            con.close();
            QuanLi_Device s = new QuanLi_Device(dataconstructor);
            s.setVisible(true);
            dispose();
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btn_hong_32ActionPerformed

    private void txt_search20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search20KeyReleased
        // TODO add your handling code here:
        getContentPane().setBackground(new Color(240, 240, 240));
        txt_search20.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                //  Test
                try {
                    for (int i = 1; i <= 100; i++) {
                        jlb_20.setText("Loading: " + i);
                        Thread.sleep(10);
                        if(i == 100)
                        {
        DefaultTableModel model = (DefaultTableModel)jtb_ds.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtb_ds.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txt_search20.getText().trim()));
                        }
                    }
                    call.done();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            @Override
            public void onCancel() {

            }
        });
    }//GEN-LAST:event_txt_search20KeyReleased

    private void txt_search20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_search20MouseClicked
        // TODO add your handling code here:
        txt_search20.getText().equals("");
    }//GEN-LAST:event_txt_search20MouseClicked

    private void btn_them_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_them_32ActionPerformed
        // TODO add your handling code here:
        Add li = new Add(dataconstructor);
        li.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_them_32ActionPerformed

    private void btn_edit_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_32ActionPerformed
        // TODO add your handling code here:
               try {
            Connection con = Connect.getConnection();
            String value1 = jtf_ma32.getText();
            String value2 = jtf_ten32.getText();
            String value3 = jtf_loai32.getText();
            String sql = "UPDATE thietbi set ten='" + value2 + "' ,loai='" + value3 + "' where ma='" + value1 + "' ";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt = con.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công ");
            con.close();
            QuanLi_Device s = new QuanLi_Device(dataconstructor);
            s.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_edit_32ActionPerformed

    private void btn_muon32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_muon32ActionPerformed
        
        Muon dv = new Muon(dataconstructor, dataconstructor1);
        dv.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_muon32ActionPerformed

    private void btn_delete_32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete_32ActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        // TODO add your handling code here:
        String sql = "delete from thietbi where ma =?";
        try {
            Connection con = Connect.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, jtf_ma32.getText());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Xóa thành công");
        } catch (Exception e) {
        }
        QuanLi_Device s = new QuanLi_Device(dataconstructor);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_delete_32ActionPerformed

    private void lichsu_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lichsu_20ActionPerformed
        // TODO add your handling code here:
        LichSuFindMa_Device s = new LichSuFindMa_Device(dataconstructor,dataconstructor2);
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_lichsu_20ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLi_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLi_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLi_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLi_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonGradient btn_delete_32;
    private swing.ButtonGradient btn_edit_32;
    private javax.swing.JButton btn_hong_32;
    private swing.ButtonGradient btn_muon32;
    private swing.ButtonGradient btn_them_32;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlb_20;
    private javax.swing.JTable jtb_ds;
    private swing.MyTextField jtf_loai32;
    private swing.MyTextField jtf_ma32;
    private swing.MyTextField jtf_ten32;
    private javax.swing.JTextField jtf_tinhtrang32;
    private swing.MyTextField jtf_trangthai32;
    private swing.ButtonGradient lichsu_20;
    private swing.PanelGradiente panelGradiente1;
    private swing.PanelGradiente panelGradiente2;
    private swing.TextFieldAnimation txt_search20;
    // End of variables declaration//GEN-END:variables
}
