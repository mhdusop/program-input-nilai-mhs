
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mymac
 */
public class aplikasi_input_nilai_mhs extends javax.swing.JFrame {

    /**
     * Creates new form aplikasi_input_nilai_mhs
     */
    public aplikasi_input_nilai_mhs() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        N_bp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        N_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        N_latihan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        N_tugas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        N_quiz = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        N_mid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        N_uas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        N_angka = new javax.swing.JTextField();
        N_huruf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        B_save = new javax.swing.JButton();
        B_exit = new javax.swing.JButton();
        B_add = new javax.swing.JButton();
        B_proses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Latihan 6. Input Nilai Mahasiswa");

        jLabel2.setText("Nomor  BP            :");

        N_bp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_bpActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Mahasiswa :");

        N_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_namaActionPerformed(evt);
            }
        });

        jLabel4.setText("Nilai Latihan   :");

        N_latihan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_latihanActionPerformed(evt);
            }
        });

        jLabel5.setText("Nilai Tugas :");

        N_tugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_tugasActionPerformed(evt);
            }
        });

        jLabel6.setText("Nilai Quiz   :");

        N_quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_quizActionPerformed(evt);
            }
        });

        jLabel7.setText("Nilai Mid     :");

        N_mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_midActionPerformed(evt);
            }
        });

        jLabel8.setText("Nilai UAS    :");

        N_uas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_uasActionPerformed(evt);
            }
        });

        jLabel10.setText("Nilai Angka    :");

        N_angka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_angkaActionPerformed(evt);
            }
        });

        N_huruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_hurufActionPerformed(evt);
            }
        });

        jLabel11.setText("Nilai Huruf   :");

        B_save.setText("Save");
        B_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_saveActionPerformed(evt);
            }
        });

        B_exit.setText("Exit");
        B_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_exitActionPerformed(evt);
            }
        });

        B_add.setText("Add");
        B_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_addActionPerformed(evt);
            }
        });

        B_proses.setText("Proses");
        B_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_prosesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addGap(251, 251, 251)
                                                        .addComponent(jLabel1)
                                                        .addGap(34, 34, 34))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGap(70, 70, 70)
                                                                .addComponent(B_save)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(B_add)
                                                                .addGap(82, 82, 82)
                                                                .addComponent(B_exit)
                                                                .addGap(59, 59, 59))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel6)
                                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel4,
                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel5,
                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)))
                                                                .addGap(140, 140, 140)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(N_tugas,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        251,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(N_latihan,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        251,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(N_nama,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        251,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(N_bp,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                        251,
                                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(N_quiz,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                251,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(N_mid,
                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        251,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(N_uas,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                251,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                layout.createSequentialGroup()
                                                                        .addComponent(jLabel11)
                                                                        .addGap(140, 140, 140)
                                                                        .addComponent(N_huruf,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                251,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(jLabel10)
                                                                .addGap(140, 140, 140)
                                                                .addComponent(N_angka,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 251,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(126, 126, 126))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(306, 306, 306)
                                .addComponent(B_proses)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(N_bp, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(N_nama, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(N_latihan, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(N_tugas, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(N_quiz, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(N_mid, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(N_uas, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addComponent(B_proses)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(N_angka, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(N_huruf, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(B_save)
                                        .addComponent(B_exit)
                                        .addComponent(B_add))
                                .addGap(41, 41, 41)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void N_bpActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_N_bpActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_N_bpActionPerformed

    private void N_namaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_N_namaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_N_namaActionPerformed

    private void N_latihanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_N_latihanActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_N_latihanActionPerformed

    private void N_tugasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_N_tugasActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_N_tugasActionPerformed

    private void N_quizActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_N_quizActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_N_quizActionPerformed

    private void N_midActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_N_midActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_N_midActionPerformed

    private void N_uasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_N_uasActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_N_uasActionPerformed

    private void N_angkaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_N_angkaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_N_angkaActionPerformed

    private void N_hurufActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_N_hurufActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_N_hurufActionPerformed

    private void B_saveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B_saveActionPerformed
        try {
            // Establish database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/mahasiswa", "root", "root");

            // SQL query to insert data into the table
            String sql = "INSERT INTO nilai_mahasiswa (nomor_bp, nama_mahasiswa, nilai_latihan, nilai_tugas, nilai_quiz, nilai_mid, nilai_uas, nilai_akhir, nilai_huruf) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                // Set values for prepared statement parameters
                pstmt.setString(1, N_bp.getText());
                pstmt.setString(2, N_nama.getText());
                pstmt.setInt(3, Integer.parseInt(N_latihan.getText()));
                pstmt.setInt(4, Integer.parseInt(N_tugas.getText()));
                pstmt.setInt(5, Integer.parseInt(N_quiz.getText()));
                pstmt.setInt(6, Integer.parseInt(N_mid.getText()));
                pstmt.setInt(7, Integer.parseInt(N_uas.getText()));
                pstmt.setDouble(8, Double.parseDouble(N_angka.getText()));
                pstmt.setString(9, N_huruf.getText());

                // Execute the query
                pstmt.executeUpdate();
            }

            // Close the connection
            conn.close();

            // Inform the user that data has been saved successfully
            JOptionPane.showMessageDialog(this, "Data saved successfully!");
        } catch (SQLException | NumberFormatException e) {
            // Handle exceptions
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving data to the database!");
        }
    }// GEN-LAST:event_B_saveActionPerformed

    private void B_exitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B_exitActionPerformed
        System.exit(0);
    }// GEN-LAST:event_B_exitActionPerformed

    private void B_addActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B_addActionPerformed
        N_bp.setText("");
        N_nama.setText("");
        N_latihan.setText("");
        N_tugas.setText("");
        N_quiz.setText("");
        N_mid.setText("");
        N_uas.setText("");
        N_angka.setText("");
        N_huruf.setText("");
    }// GEN-LAST:event_B_addActionPerformed

    private void B_prosesActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_B_prosesActionPerformed
        double latihan, tugas, quiz, mid, uas, nilai_angka;
        String hasil;

        latihan = Integer.parseInt(N_latihan.getText());
        tugas = Integer.parseInt(N_tugas.getText());
        quiz = Integer.parseInt(N_quiz.getText());
        mid = Integer.parseInt(N_mid.getText());
        uas = Integer.parseInt(N_uas.getText());

        nilai_angka = (0.10 * latihan) + (0.15 * tugas) + (0.20 * quiz) + (0.25 * mid) + (0.30 * uas);

        hasil = String.valueOf(nilai_angka);

        N_angka.setText(hasil);

        if (nilai_angka >= 80) {
            N_huruf.setText("A");
        } else if ((nilai_angka >= 65) && (nilai_angka <= 79)) {
            N_huruf.setText("B");
        } else if ((nilai_angka >= 55) && (nilai_angka <= 64)) {
            N_huruf.setText("C");
        } else if ((nilai_angka >= 35) && (nilai_angka <= 54)) {
            N_huruf.setText("D");
        } else {
            N_huruf.setText("E");
        }
    }// GEN-LAST:event_B_prosesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            // init drivernya 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(aplikasi_input_nilai_mhs.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasi_input_nilai_mhs.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasi_input_nilai_mhs.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasi_input_nilai_mhs.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasi_input_nilai_mhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_add;
    private javax.swing.JButton B_exit;
    private javax.swing.JButton B_proses;
    private javax.swing.JButton B_save;
    private javax.swing.JTextField N_angka;
    private javax.swing.JTextField N_bp;
    private javax.swing.JTextField N_huruf;
    private javax.swing.JTextField N_latihan;
    private javax.swing.JTextField N_mid;
    private javax.swing.JTextField N_nama;
    private javax.swing.JTextField N_quiz;
    private javax.swing.JTextField N_tugas;
    private javax.swing.JTextField N_uas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
