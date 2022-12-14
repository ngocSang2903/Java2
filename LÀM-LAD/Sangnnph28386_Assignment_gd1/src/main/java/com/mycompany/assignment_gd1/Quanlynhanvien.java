/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.assignment_gd1;

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
        list.add(new Nhanvien("nv1", "Nguyen Ngoc Sang", 24, "sang@gmail.com", 290000));
        list.add(new Nhanvien("nv2", "Nguyen Van Tu", 26, "tu@gmail.com", 90000));
        list.add(new Nhanvien("nv3", "Nguyen Thi Linh", 29, "linh@gmail.com", 160000));
        list.add(new Nhanvien("nv4", "Phuong Anh", 24, "Anh@gmail.com", 210000));
        list.add(new Nhanvien("nv5", "Nguyen Cam Tu", 27, "ctu@gmail.com", 220000));
        addtable();
        index=0;
        display();
    }

    ArrayList<Nhanvien> list = new ArrayList<>();

    public void addtable() {
        DefaultTableModel bang = (DefaultTableModel) table.getModel();
        bang.setRowCount(0);
        for (Nhanvien nv : list) {
            bang.addRow(new Object[]{nv.getManhanvien(), nv.getTen(), nv.getTuoi(), nv.getEmail(), nv.getLuong()});
        }
    }
    int index;

    public void display() {
        Nhanvien nv = list.get(index);
        int ind = list.indexOf(nv);
        txtma.setText(nv.getManhanvien());
        txtten.setText(nv.getTen());
        txttuoi.setText(nv.getTuoi() + "");
        txtemail.setText(nv.getEmail());
        txtluong.setText(nv.getLuong() + "");
        table.setRowSelectionInterval(ind, ind);

        txtso.setText("Record " + (index + 1) + " of " + list.size());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txttuoi = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtluong = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        butdau = new javax.swing.JButton();
        butlui = new javax.swing.JButton();
        buttien = new javax.swing.JButton();
        butcuoi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        butnew = new javax.swing.JButton();
        butsave = new javax.swing.JButton();
        butdelete = new javax.swing.JButton();
        butfind = new javax.swing.JButton();
        butopen = new javax.swing.JButton();
        butexit = new javax.swing.JButton();
        txtso = new javax.swing.JLabel();
        jdongho = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Qu???n l?? nh??n vi??n");

        jLabel2.setText("M?? NH??N VI??N");

        jLabel3.setText("H??? V?? T??N");

        jLabel4.setText("TU???I");

        jLabel5.setText("EMAIL");

        jLabel6.setText("L????NG");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "M?? Nv", "T??n Nv", "Tu???i", "Email", "L????ng"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        butdau.setText("<|");
        butdau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butdauActionPerformed(evt);
            }
        });

        butlui.setText("<<");
        butlui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butluiActionPerformed(evt);
            }
        });

        buttien.setText(">>");
        buttien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttienActionPerformed(evt);
            }
        });

        butcuoi.setText(">|");
        butcuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcuoiActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(butopen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butfind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butdelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butnew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butsave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butdelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butfind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(butopen)
                .addGap(18, 18, 18)
                .addComponent(butexit)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        txtso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtso.setForeground(new java.awt.Color(255, 0, 51));
        txtso.setText("jLabel7");

        jdongho.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jdongho.setForeground(new java.awt.Color(255, 0, 51));
        jdongho.setText("jLabel8");
        jdongho.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jdonghoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtten)
                                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                            .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(butdau, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(butlui, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(butcuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(txtso, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 20, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdongho, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jdongho))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txttuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butdau)
                    .addComponent(butlui)
                    .addComponent(buttien)
                    .addComponent(butcuoi)
                    .addComponent(txtso))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsaveActionPerformed
        // TODO add your handling code here:
        StringBuilder sang = new StringBuilder();
        if (txtma.getText().isEmpty()) {
            sang.append("B???n ch??a nh???p m?? sinh vi??n\n");
        }
        if (txtten.getText().isEmpty()) {
            sang.append("B???n ch??a nh???p t??n nh??n vi??n\n");
        }
        if (txttuoi.getText().equals("")) {
            sang.append("B???n ch??a nh???p tu???i\n");
        }
        if (txtemail.getText().equals("")) {
            sang.append("B???n ch??a nh???p email\n");
        }
        if (txtluong.getText().equals("")) {
            sang.append("B???n ch??a nh???p l????ng");
        }

        if (sang.length() > 0) {
            JOptionPane.showMessageDialog(this, sang.toString());
            return;
        } else {
            boolean check = true;
            if (!txtten.getText().matches("[a-z A-Z]+")) {
                JOptionPane.showMessageDialog(this, "Sai ?????nh d???ng c???a kh??ch h??ng");
                check = false;
            }
            if (!txttuoi.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Tu???i ph???i l?? s???");
                check = false;
            } else if (Integer.parseInt(txttuoi.getText()) <= 23) {
                JOptionPane.showMessageDialog(this, "Tu???i ph???i l???n h??n 23 v?? nh??? h??n 55");
                check = false;
            }else if (Integer.parseInt(txttuoi.getText()) >= 55) {
                JOptionPane.showMessageDialog(this, "Tu???i ph???i l???n h??n 23 v?? nh??? h??n 55");
                check = false;
            }
            if (!txtluong.getText().matches("\\d*\\.\\d+")) {
                JOptionPane.showMessageDialog(this, "L????ng ph???i l?? s???");
                check = false;
            }else if(Double.parseDouble(txtluong.getText())<5000){
                JOptionPane.showMessageDialog(this, "L????ng ph???i l???n h??n 5 tri???u");
                check = false;
            }
            if (!txtemail.getText().matches("([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6})*$")) {
                JOptionPane.showMessageDialog(this, "Email kh??ng ????ng ?????nh d???ng");
                check = false;
            }
            if (!check) {
                JOptionPane.showMessageDialog(this, "Ghi d??? li???u th???t b???i");
            } else {
                Nhanvien nv = new Nhanvien();
                nv.setManhanvien(txtma.getText());
                nv.setTen(txtten.getText());
                nv.setTuoi(Integer.parseInt(txttuoi.getText()));
                nv.setEmail(txtemail.getText());
                nv.setLuong(Double.parseDouble(txtluong.getText()));
                list.add(nv);
                addtable();
            }
        }
    }//GEN-LAST:event_butsaveActionPerformed

    private void butnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butnewActionPerformed
        // TODO add your handling code here:
        txtma.setText("");
        txtten.setText("");
        txttuoi.setText("");
        txtemail.setText("");
        txtluong.setText("");
    }//GEN-LAST:event_butnewActionPerformed

    private void butdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdeleteActionPerformed
        // TODO add your handling code here:
        int xoa = table.getSelectedRow();
        list.remove(xoa);
        addtable();
        JOptionPane.showMessageDialog(this, "B???n ???? x??a nh??n vi??n th??nh c??ng");
    }//GEN-LAST:event_butdeleteActionPerformed

    private void butfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butfindActionPerformed
        // TODO add your handling code here:
        String tim = JOptionPane.showInputDialog(this, "B???n nh???p m?? nh??n t??m: ");
        boolean kq=false;
        for (Nhanvien nv : list) {
            //int ind = list.indexOf(nv);
            if (nv.getManhanvien().equalsIgnoreCase(tim)) {
//                txtma.setText(nv.getManhanvien());
//                txtten.setText(nv.getTen());
//                txttuoi.setText(nv.getTuoi() + "");
//                txtemail.setText(nv.getEmail());
//                txtluong.setText(nv.getLuong() + "");
//                table.setRowSelectionInterval(ind, ind);
                index = list.indexOf(nv);
                display();
                kq=true;
                break;
            }
        }
        if(!kq){
            JOptionPane.showMessageDialog(this, " Kh??ng c?? nh??n vi??n c???n t??m!");
        }else{
            JOptionPane.showMessageDialog(this, "T??m nh??n vi??n th??nh c??ng !");
        }
    }//GEN-LAST:event_butfindActionPerformed

    private void butdauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdauActionPerformed
        // TODO add your handling code here:
        index = 0;
        display();
    }//GEN-LAST:event_butdauActionPerformed

    private void butcuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcuoiActionPerformed
        // TODO add your handling code here:
        index = list.size() - 1;
        display();
    }//GEN-LAST:event_butcuoiActionPerformed

    private void butluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butluiActionPerformed
        // TODO add your handling code here:
        if (index < list.size() - 1) {
            index++;
            display();
        }
    }//GEN-LAST:event_butluiActionPerformed

    private void buttienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttienActionPerformed
        // TODO add your handling code here:
        if (index > 0) {
            index--;
            display();
        }
    }//GEN-LAST:event_buttienActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int row = table.getSelectedRow();
//        txtma.setText(table.getValueAt(row, 0).toString());
//        txtten.setText(table.getValueAt(row, 1).toString());
//        txttuoi.setText(table.getValueAt(row, 2).toString());
//        txtemail.setText(table.getValueAt(row, 3).toString());
//        txtluong.setText(table.getValueAt(row, 4).toString());
        if (row >= 0) {
            index = row;
            display();
        }
    }//GEN-LAST:event_tableMouseClicked

    private void butexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butexitActionPerformed
        // TODO add your handling code here:
        int hoi = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n l??u ko ");
        try {
            if (hoi == 0) {
                FileOutputStream fos = new FileOutputStream("a.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                JOptionPane.showMessageDialog(this, "l??u th??nh c??ng");
                System.exit(0);
            }
            if(hoi==1){
                System.exit(0);
            }
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_butexitActionPerformed

    private void jdonghoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jdonghoAncestorAdded
        // TODO add your handling code here:
        Dongho dh = new Dongho(jdongho);
        dh.start();
        jdongho.setEnabled(true);
    }//GEN-LAST:event_jdonghoAncestorAdded

    private void butopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butopenActionPerformed
        // TODO add your handling code here:
        int hoi = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n m??? file hay kh??ng");
        try {
            if (hoi == 0) {
                FileInputStream fis = new FileInputStream("a.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);
                list = (ArrayList<Nhanvien>) ois.readObject();
                if (list.size() >= 0) {
                    addtable();
                    JOptionPane.showMessageDialog(this, "M??? th??nh c??ng");
                }
            }
        } catch (Exception e) {
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jdongho;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtluong;
    private javax.swing.JTextField txtma;
    private javax.swing.JLabel txtso;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttuoi;
    // End of variables declaration//GEN-END:variables
}
