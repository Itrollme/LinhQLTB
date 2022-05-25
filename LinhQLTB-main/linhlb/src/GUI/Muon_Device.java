/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DAO.MuonDao;
import POJO.MuonDevice;
import Utils.Connect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import swing.EventCallBack;
import swing.EventTextField;



/**
 *
 * @author QuanLDM
 */
public class Muon_Device extends javax.swing.JFrame {
    private static String dataconstructor;
    
 
   /**
     * Creates new form MuonDevice
     */
    public Muon_Device(String data) {
//        initComponents();
        this.dataconstructor = data;
        setTitle("Quản lí thiết bị trường học");
        
        initComponents();
       
        ArrayList<MuonDevice> dv = MuonDao.layDSMuondevice("select mamuon,ma,manguoimuon,tennguoimuon,ngaymuon from muon where ngaytra is null");
        DefaultTableModel model = (DefaultTableModel) jtb_muon.getModel();
        Object[] obj = new Object[5];
        for (int i = 0; i < dv.size(); i++) {
            obj[0] = dv.get(i).getMamuon32();
            obj[1] = dv.get(i).getMathietbi32();
            obj[2] = dv.get(i).getManguoimuon32();
            obj[3] = dv.get(i).getTennguoimuon32();
            obj[4] = dv.get(i).getNgaymuon32();
//            obj[5] = dv.get(i).getNgaytra32();
            model.addRow(obj);
        }
        jtf_mamuon32.setEditable(false);
        jtf_masp32.setEditable(false);
          
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Edit_20 = new swing.ButtonGradient();
        jtf_mamuon32 = new swing.MyTextField();
        jtf_masp32 = new swing.MyTextField();
        jtf_manguoi32 = new swing.MyTextField();
        jtf_ten32 = new swing.MyTextField();
        jtf_ngaymuon32 = new swing.MyTextField();
        jtf_ngaytra32 = new swing.MyTextField();
        panelGradiente2 = new swing.PanelGradiente();
        txt_search20 = new swing.TextFieldAnimation();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlb_20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtb_muon = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelGradiente1.setColorSecundario(new java.awt.Color(107, 222, 248));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Tên người mượn");
        panelGradiente1.add(jLabel6);
        jLabel6.setBounds(370, 50, 120, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Ngày mượn");
        panelGradiente1.add(jLabel7);
        jLabel7.setBounds(370, 100, 100, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Ngày trả");
        panelGradiente1.add(jLabel8);
        jLabel8.setBounds(370, 150, 100, 17);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("Mã người mượn");
        panelGradiente1.add(jLabel5);
        jLabel5.setBounds(80, 150, 120, 17);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Mã sản phẩm");
        panelGradiente1.add(jLabel4);
        jLabel4.setBounds(80, 100, 110, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 51));
        jLabel3.setText("Mã mượn");
        panelGradiente1.add(jLabel3);
        jLabel3.setBounds(80, 50, 100, 17);

        jSeparator1.setBackground(new java.awt.Color(0, 102, 51));
        panelGradiente1.add(jSeparator1);
        jSeparator1.setBounds(210, 410, 345, 20);

        btn_Edit_20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exchange.png"))); // NOI18N
        btn_Edit_20.setText("Cập Nhật");
        btn_Edit_20.setFocusable(false);
        btn_Edit_20.setFont(new java.awt.Font("SansSerif", 2, 10)); // NOI18N
        btn_Edit_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Edit_20ActionPerformed(evt);
            }
        });
        panelGradiente1.add(btn_Edit_20);
        btn_Edit_20.setBounds(300, 210, 120, 37);
        panelGradiente1.add(jtf_mamuon32);
        jtf_mamuon32.setBounds(200, 50, 140, 27);
        panelGradiente1.add(jtf_masp32);
        jtf_masp32.setBounds(200, 100, 140, 27);
        panelGradiente1.add(jtf_manguoi32);
        jtf_manguoi32.setBounds(200, 150, 140, 27);
        panelGradiente1.add(jtf_ten32);
        jtf_ten32.setBounds(510, 50, 140, 27);
        panelGradiente1.add(jtf_ngaymuon32);
        jtf_ngaymuon32.setBounds(510, 100, 140, 27);
        panelGradiente1.add(jtf_ngaytra32);
        jtf_ngaytra32.setBounds(510, 150, 140, 27);

        panelGradiente2.setColorPrimario(new java.awt.Color(107, 222, 248));

        txt_search20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_search20MouseClicked(evt);
            }
        });
        txt_search20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search20ActionPerformed(evt);
            }
        });
        txt_search20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search20KeyReleased(evt);
            }
        });
        panelGradiente2.add(txt_search20);
        txt_search20.setBounds(510, 50, 140, 39);

        jLabel1.setFont(new java.awt.Font("Sitka Display", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Danh sách mượn");
        panelGradiente2.add(jLabel1);
        jLabel1.setBounds(220, 10, 263, 46);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/previous.png"))); // NOI18N
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelGradiente2.add(jLabel2);
        jLabel2.setBounds(10, 10, 60, 20);

        jlb_20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        panelGradiente2.add(jlb_20);
        jlb_20.setBounds(420, 50, 65, 39);

        jtb_muon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ MƯỢN", "MÃ SẢN PHẨM", "MÃ NGƯỜI MƯỢN", "TÊN NGƯỜI MƯỢN", "NGÀY MƯỢN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtb_muon.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jtb_muon.setGridColor(new java.awt.Color(0, 153, 0));
        jtb_muon.setRowHeight(30);
        jtb_muon.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jtb_muon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtb_muonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtb_muon);

        panelGradiente2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 100, 660, 182);

        jSeparator2.setBackground(new java.awt.Color(51, 51, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGradiente1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(panelGradiente2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGradiente2, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelGradiente1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        MENU s=new MENU(dataconstructor);
        s.setVisible(true);
        dispose();
        
           
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txt_search20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search20ActionPerformed

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
        DefaultTableModel model = (DefaultTableModel)jtb_muon.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jtb_muon.setRowSorter(tr);
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

    private void jtb_muonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtb_muonMouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) jtb_muon.getModel();
        int selectrowindex = jtb_muon.getSelectedRow();
        jtf_mamuon32.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        jtf_masp32.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        jtf_manguoi32.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        jtf_ten32.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        jtf_ngaymuon32.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        //      jtf_ngaytra32.setText(tmodel.getValueAt(selectrowindex, 5).toString());
        boolean a = jtb_muon.isEditing();
        if (a == false) {
            JOptionPane.showMessageDialog(null, "Bạn không thể chỉnh sửa ở đây ");
        }
    }//GEN-LAST:event_jtb_muonMouseClicked

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_Edit_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Edit_20ActionPerformed
        // TODO add your handling code here:
          try {
            Connection con = Connect.getConnection();
            String value1 = jtf_mamuon32.getText();
            String value2 = jtf_ngaytra32.getText();
            String value3 = jtf_masp32.getText();
            String sql = "UPDATE muon set ngaytra='" +value2 + "' where mamuon='" + value1 + "' ";
            String sql1 = "UPDATE thietbi set trangthai=0 where ma='" + value3 + "' ";
            PreparedStatement pstmt = con.prepareStatement(sql);
             PreparedStatement pstmt1 = con.prepareStatement(sql1);
            pstmt = con.prepareStatement(sql);
            pstmt.execute();
              pstmt1.execute();
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thành công ");
            
            con.close();
            Muon_Device s = new Muon_Device(dataconstructor);
            s.setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btn_Edit_20ActionPerformed

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
            java.util.logging.Logger.getLogger(Muon_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Muon_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Muon_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Muon_Device.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Muon_Device s = new Muon_Device(dataconstructor);
                s.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonGradient btn_Edit_20;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlb_20;
    private javax.swing.JTable jtb_muon;
    private swing.MyTextField jtf_mamuon32;
    private swing.MyTextField jtf_manguoi32;
    private swing.MyTextField jtf_masp32;
    private swing.MyTextField jtf_ngaymuon32;
    private swing.MyTextField jtf_ngaytra32;
    private swing.MyTextField jtf_ten32;
    private swing.PanelGradiente panelGradiente1;
    private swing.PanelGradiente panelGradiente2;
    private swing.TextFieldAnimation txt_search20;
    // End of variables declaration//GEN-END:variables
}