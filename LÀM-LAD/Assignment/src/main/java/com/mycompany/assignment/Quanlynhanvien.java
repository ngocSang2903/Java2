/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Quanlynhanvien extends javax.swing.JFrame {

    /**
     * Creates new form Quanlynhanvien
     */
    public Quanlynhanvien() {
        initComponents();
        setLocationRelativeTo(null);
        inttable();
        DefaultTableModel bang = (DefaultTableModel) table.getModel();
        bang = (DefaultTableModel) table.getModel();
        list.add(new Nhanvien("Ph01", "Nguyễn Ngọc Sáng", 19, "sang@gmail.com", 500000.0));
        list.add(new Nhanvien("Ph09", "Mai Hoàng Phương Anh", 19, "Anh@gmail.com", 9500000.0));
        list.add(new Nhanvien("Ph03", "Nguyễn Thị Nhung", 19, "nhung@gmail.com", 750000.0));
        list.add(new Nhanvien("Ph06", "Phạm Văn Hoàng", 19, "Hoàng@gmail.com", 450000.0));
        addTable();
        int vitri = 0;
        display(vitri);

    }

    public void inttable() {
        DefaultTableModel bang = (DefaultTableModel) table.getModel();
        bang.setColumnIdentifiers(new Object[]{"MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"});
    }

    ArrayList<Nhanvien> list = new ArrayList<>();
    int vitri;

    public void display(int vitri) {
        txtmanhanvien.setText(list.get(vitri).getManhanvien());
        txthovaten.setText(list.get(vitri).getHovaten());
        txttuoi.setText(list.get(vitri).getTuoi() + "");
        txtemail.setText(list.get(vitri).getEmail());
        txtluong.setText(list.get(vitri).getLuong() + "");

        txtso.setText("Record " + (vitri + 1) + " of  " + list.size());
        table.setRowSelectionInterval(vitri, vitri);
    }

    public void addTable() {
        DefaultTableModel bang = (DefaultTableModel) table.getModel();
        bang.setRowCount(0);
        for (Nhanvien nhanvien : list) {
            bang.addRow(new Object[]{nhanvien.getManhanvien(), nhanvien.getHovaten(), nhanvien.getTuoi(), nhanvien.getEmail(), nhanvien.getLuong()});
        }
    }

    public void deletetask() {
        txtmanhanvien.setText("");
        txthovaten.setText("");
        txttuoi.setText("");
        txtemail.setText("");
        txtluong.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        butlui = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        buttien = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        butcuoi = new javax.swing.JButton();
        txtmanhanvien = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txthovaten = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txttuoi = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        butnew = new javax.swing.JButton();
        butsave = new javax.swing.JButton();
        butdelete = new javax.swing.JButton();
        butfind = new javax.swing.JButton();
        butopen = new javax.swing.JButton();
        butexit = new javax.swing.JButton();
        txtluong = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jdongho = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        butdau = new javax.swing.JButton();
        txtso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("TUỔI");

        butlui.setText("<<");
        butlui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butluiActionPerformed(evt);
            }
        });

        jLabel5.setText("EMAIL");

        buttien.setText(">>");
        buttien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttienActionPerformed(evt);
            }
        });

        jLabel6.setText("LƯƠNG");

        butcuoi.setText(">|");
        butcuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcuoiActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        butnew.setText("New");
        butnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butnewActionPerformed(evt);
            }
        });

        butsave.setText("Save");
        butsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsaveActionPerformed(evt);
            }
        });

        butdelete.setText("Delete");
        butdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butdeleteActionPerformed(evt);
            }
        });

        butfind.setText("Find");
        butfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butfindActionPerformed(evt);
            }
        });

        butopen.setText("Open");
        butopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butopenActionPerformed(evt);
            }
        });

        butexit.setText("Exit");
        butexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butexitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(butdelete, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(butsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butfind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butopen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(butnew)
                .addGap(18, 18, 18)
                .addComponent(butsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butdelete)
                .addGap(18, 18, 18)
                .addComponent(butfind)
                .addGap(18, 18, 18)
                .addComponent(butopen)
                .addGap(18, 18, 18)
                .addComponent(butexit)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Nhân Viên");

        jLabel2.setText("MÃ NHÂN VIÊN");

        jdongho.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jdongho.setForeground(new java.awt.Color(255, 0, 0));
        jdongho.setText("jLabel7");
        jdongho.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jdonghoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setText("HỌ VÀ TÊN");

        butdau.setText("|<");
        butdau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butdauActionPerformed(evt);
            }
        });

        txtso.setBackground(new java.awt.Color(255, 0, 51));
        txtso.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtso.setForeground(new java.awt.Color(255, 0, 51));
        txtso.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdongho, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtmanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txthovaten, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                    .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtemail)
                                    .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(butdau, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butlui, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(butcuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtso, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jdongho))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txthovaten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butdau)
                            .addComponent(butlui)
                            .addComponent(buttien)
                            .addComponent(butcuoi)
                            .addComponent(jLabel8)
                            .addComponent(txtso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butnewActionPerformed
        // TODO add your handling code here:
        deletetask();
        JOptionPane.showMessageDialog(this, "Xóa trang thành công");
    }//GEN-LAST:event_butnewActionPerformed

    private void butsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsaveActionPerformed
        // TODO add your handling code here:
        StringBuilder sang = new StringBuilder();
        if (txtmanhanvien.getText().isEmpty()) {
            sang.append("Bạn chưa nhập mã sinh viên\n");
        }
        if (txthovaten.getText().isEmpty()) {
            sang.append("Bạn chưa nhập tên nhân viên\n");
        }
        if (txttuoi.getText().equals("")) {
            sang.append("Bạn chưa nhập tuổi\n");
        }
        if (txtemail.getText().equals("")) {
            sang.append("Bạn chưa nhập email\n");
        }
        if (txtluong.getText().equals("")) {
            sang.append("Bạn chưa nhập lương");
        }

        if (sang.length() > 0) {
            JOptionPane.showMessageDialog(this, sang.toString());
            return;
        } else {
            boolean check = true;
            if (!txthovaten.getText().matches("[a-z A-Z]+")) {
                JOptionPane.showMessageDialog(this, "Sai định dạng của khách hàng");
                check = false;
            }
            if (!txttuoi.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Tuổi phải là số");
                check = false;
            } else if (Integer.parseInt(txttuoi.getText()) <= 23) {
                JOptionPane.showMessageDialog(this, "Tuổi phải lớn hơn 23 và nhỏ hơn 55");
                check = false;
            } else if (Integer.parseInt(txttuoi.getText()) >= 55) {
                JOptionPane.showMessageDialog(this, "Tuổi phải lớn hơn 23 và nhỏ hơn 55");
                check = false;
            }
            if (!txtluong.getText().matches("\\d*\\.\\d+")) {
                JOptionPane.showMessageDialog(this, "Lương phải là số");
                check = false;
            } else if (Double.parseDouble(txtluong.getText()) < 5000) {
                JOptionPane.showMessageDialog(this, "Lương phải lớn hơn 5 triệu");
                check = false;
            }
            if (!txtemail.getText().matches("([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6})*$")) {
                JOptionPane.showMessageDialog(this, "Email không đúng định dạng");
                check = false;
            }
            if (!check) {
                JOptionPane.showMessageDialog(this, "Ghi dữ liệu thất bại");
            } else {
                String ma = txtmanhanvien.getText();
                String ten = txthovaten.getText();
                int tuoi = Integer.parseInt(txttuoi.getText());
                String email = txtemail.getText();
                double luong = Double.parseDouble(txtluong.getText());

                list.add(new Nhanvien(ma, ten, tuoi, email, luong));
                vitri = list.size() - 1;
                display(vitri);
                addTable();
            }
        }
    }//GEN-LAST:event_butsaveActionPerformed

    private void butexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butexitActionPerformed
        // TODO add your handling code here:
        try {
            int hoi = JOptionPane.showConfirmDialog(null, "");
            if (hoi == 0) {
                FileOutputStream fos = new FileOutputStream("a.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(list);

                oos.flush();
                fos.flush();
                oos.close();
                fos.close();
                JOptionPane.showMessageDialog(null, "Ghi thanh cong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gap loi: " + e);
        }
        System.exit(0);
    }//GEN-LAST:event_butexitActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int row = table.getSelectedRow();
        if (row >= 0) {
            vitri = row;
            display(vitri);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void butdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdeleteActionPerformed
        // TODO add your handling code here:
        list.remove(vitri);
        addTable();
        deletetask();
        JOptionPane.showMessageDialog(this, "Xóa thành công");
    }//GEN-LAST:event_butdeleteActionPerformed

    private void butfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butfindActionPerformed
        // TODO add your handling code here:
        String ma = JOptionPane.showInputDialog("Mời bạn nhập mã:");
        boolean kq = false;
        for (Nhanvien nhanvien : list) {
            if (nhanvien.getManhanvien().equalsIgnoreCase(ma)) {
                vitri = list.indexOf(nhanvien);
                display(vitri);
                kq = true;
                break;
            }
        }
        if (!kq) {
            JOptionPane.showMessageDialog(this, "Không có đối tượng cần tìm");
        } else {
            JOptionPane.showMessageDialog(this, "Bạn tìm thành công");
        }
    }//GEN-LAST:event_butfindActionPerformed

    private void butdauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdauActionPerformed
        // TODO add your handling code here:
        vitri = 0;
        display(vitri);
    }//GEN-LAST:event_butdauActionPerformed

    private void butcuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcuoiActionPerformed
        // TODO add your handling code here:
        vitri = list.size() - 1;
        display(vitri);
    }//GEN-LAST:event_butcuoiActionPerformed

    private void butluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butluiActionPerformed
        // TODO add your handling code here:
        if (vitri > 0) {
            vitri--;
            display(vitri);
        }
    }//GEN-LAST:event_butluiActionPerformed

    private void buttienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttienActionPerformed
        // TODO add your handling code here:
        if (vitri < list.size() - 1) {
            vitri++;
            display(vitri);
        }
    }//GEN-LAST:event_buttienActionPerformed

    private void jdonghoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jdonghoAncestorAdded
        // TODO add your handling code here:
        Dongho DH = new Dongho(jdongho);
        DH.start();
        jdongho.setEnabled(true);
    }//GEN-LAST:event_jdonghoAncestorAdded

    private void butopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butopenActionPerformed
        // TODO add your handling code here:
        try {

            FileInputStream fis = new FileInputStream("a.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            list = (ArrayList<Nhanvien>) ois.readObject();
            if (list.size() > 0) {
                addTable();
                vitri = 0;
                display(vitri);
            } else {
                deletetask();
            }

            ois.close();
            fis.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gap loi:" + e);
        }
    }//GEN-LAST:event_butopenActionPerformed

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
            java.util.logging.Logger.getLogger(Quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quanlynhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quanlynhanvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butcuoi;
    private javax.swing.JButton butdau;
    private javax.swing.JButton butdelete;
    private javax.swing.JButton butexit;
    private javax.swing.JButton butfind;
    private javax.swing.JButton butlui;
    private javax.swing.JButton butnew;
    private javax.swing.JButton butopen;
    private javax.swing.JButton butsave;
    private javax.swing.JButton buttien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jdongho;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthovaten;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtmanhanvien;
    private javax.swing.JLabel txtso;
    private javax.swing.JTextField txttuoi;
    // End of variables declaration//GEN-END:variables
}
