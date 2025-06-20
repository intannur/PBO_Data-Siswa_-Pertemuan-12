/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crud;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Form_Siswa extends javax.swing.JFrame {
    
    private DefaultTableModel tabmode;
    private ResultSet hasil;
    
    CRUD aa = new CRUD();
    
    public Form_Siswa() throws SQLException {
        initComponents();
        tampil_database();
    }
    // method untuk menampilkan data ke tabel_siswa [JTable]
    public void tampil_database(){
        Object [] baris = {"ID","Nama","Alamat"};
        tabmode = new DefaultTableModel(null, baris);
        tabel_siswa.setModel(tabmode);
        
        try {
            hasil = aa.tampilData();
            while (hasil.next()){
                aa.setID(hasil.getString("id"));
                aa.setNama(hasil.getString("nama"));
                aa.setAlamat(hasil.getString("alamat"));
                String[] data = {aa.getID(), aa.getNama(), aa.getAlamat()};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
        }
    }
    
    public void reset_text() {
        txt_id.setText("");
        txt_nama.setText("");
        txt_alamat.setText("");
    }

    // Method cariData di Form_Siswa.java
    public void cariData(String keyword) {
    Object[] baris = {"ID", "Nama", "Alamat"};
    tabmode = new DefaultTableModel(null, baris);
    tabel_siswa.setModel(tabmode);

    try {
        hasil = aa.cariData(keyword); // panggil method dari class CRUD
        while (hasil.next()) {
            String[] data = {
                hasil.getString("id"),
                hasil.getString("nama"),
                hasil.getString("alamat")
            };
            tabmode.addRow(data);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat mencari data: " + e.getMessage());
    }
}

    /**
     * Creates new form Form_Siswa
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_siswa = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        btn_semuadata = new javax.swing.JButton();
        btn_cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data Siswa");

        jLabel2.setText("ID");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        tabel_siswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabel_siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_siswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_siswa);

        jLabel5.setText("Pencarian");

        btn_semuadata.setText("Semua Data");
        btn_semuadata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_semuadataActionPerformed(evt);
            }
        });

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_id)
                                    .addComponent(txt_nama)
                                    .addComponent(txt_alamat)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_simpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cari)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_reset)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_ubah)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_hapus)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn_keluar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(btn_cari)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btn_semuadata)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_simpan)
                            .addComponent(btn_reset)
                            .addComponent(btn_ubah)
                            .addComponent(btn_hapus)
                            .addComponent(btn_keluar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_semuadata)
                    .addComponent(btn_cari))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
       if (txt_id.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !");
            txt_id.requestFocus();
        } else if (txt_nama.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Nama belum diisi !");
            txt_nama.requestFocus();
        } else if (txt_alamat.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Alamat belum diisi !");
            txt_alamat.requestFocus();
        } else {
            try { aa.setID(txt_id.getText());
                aa.setNama(txt_nama.getText());
                aa.setAlamat(txt_alamat.getText());
                aa.simpanData(aa.getID(), aa.getNama(), aa.getAlamat());
            JOptionPane.showMessageDialog(null, "Data berhasil tersimpan" , "Informasi",
            JOptionPane.INFORMATION_MESSAGE);
                tampil_database();
                reset_text();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data gagal tersimpan" , "Informasi",
            JOptionPane.INFORMATION_MESSAGE);
        }
}
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset_text();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        if (txt_id.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !");
            txt_id.requestFocus();
        } else if (txt_nama.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Nama belum diisi !");
            txt_nama.requestFocus();
        } else if (txt_alamat.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Alamat belum diisi !");
            txt_alamat.requestFocus();
        } else {
            try { aa.setID(txt_id.getText());
                aa.setNama(txt_nama.getText());
                aa.setAlamat(txt_alamat.getText());
                aa.ubahData(aa.getID(), aa.getNama(), aa.getAlamat());
            JOptionPane.showMessageDialog(null, "Data berhasil diubah" , "Informasi",
            JOptionPane.INFORMATION_MESSAGE);
            tampil_database();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Data gagal diubah" , "Informasi",
        JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        if (txt_id.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !");
            txt_id.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus data ini ?","Warning",2) == JOptionPane.YES_OPTION){
            String id = "";
            try { aa.setID(txt_id.getText());
            aa.hapusData(aa.getID());
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus" , "Informasi",
            JOptionPane.INFORMATION_MESSAGE);
            tampil_database();
            reset_text();
            } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Data gagal dihapus" , "Informasi",
        JOptionPane.INFORMATION_MESSAGE);
}
}
}
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void tabel_siswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_siswaMouseClicked
        try { int row = tabel_siswa.rowAtPoint(evt.getPoint());
        String id = tabel_siswa.getValueAt(row, 0).toString();
        String nama = tabel_siswa.getValueAt(row, 1).toString();
        String alamat = tabel_siswa.getValueAt(row, 2).toString();

        txt_id.setText(String.valueOf(id));
        txt_nama.setText(String.valueOf(nama));
        txt_alamat.setText(String.valueOf(alamat));

        } catch (Exception e) {
      }
    }//GEN-LAST:event_tabel_siswaMouseClicked

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan keluar ?","Warning",2)
        == JOptionPane.YES_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_semuadataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_semuadataActionPerformed
        tampil_database(); // Tampilkan ulang semua data
        txt_cari.setText(""); // Kosongkan kolom pencarian
    }//GEN-LAST:event_btn_semuadataActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        String keyword = txt_cari.getText().trim();
    if (keyword.equals("")) {
        JOptionPane.showMessageDialog(null, "Silakan masukkan kata kunci pencarian!");
    } else {
        cariData(keyword); // Panggil method pencarian
    }
    }//GEN-LAST:event_btn_cariActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_semuadata;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_siswa;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
