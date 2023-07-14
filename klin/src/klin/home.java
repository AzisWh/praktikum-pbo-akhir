/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klin;

import java.awt.Desktop;
import java.net.URL;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class home extends javax.swing.JFrame {
    
    String pel;
    private int xx;
    private int xy;

    public home(String parameter){
        initComponents();
        }
    /**
     * Creates new form home
     */
   
    public home() {
        initComponents();
        
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        pelanggan = new javax.swing.JMenu();
        jenis_cucian = new javax.swing.JMenu();
        penerimaan = new javax.swing.JMenu();
        transaksi = new javax.swing.JMenu();
        backup = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setLocation(new java.awt.Point(321, 74));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klin/Icon/direktori-jasa-bersih-bersih-rumah.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Klin!");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jasa Layanan Service bidang Kebersihan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

        pelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klin/Icon/icons8-user-groups-50.png"))); // NOI18N
        pelanggan.setText("Member");
        pelanggan.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        pelanggan.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                pelangganMenuSelected(evt);
            }
        });
        pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pelangganMousePressed(evt);
            }
        });
        jMenuBar1.add(pelanggan);

        jenis_cucian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klin/Icon/icons8-clean-50.png"))); // NOI18N
        jenis_cucian.setText("Jenis Service");
        jenis_cucian.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jenis_cucian.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jenis_cucianMenuSelected(evt);
            }
        });
        jenis_cucian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jenis_cucianMousePressed(evt);
            }
        });
        jMenuBar1.add(jenis_cucian);

        penerimaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klin/Icon/icons8-cheque-50.png"))); // NOI18N
        penerimaan.setText("Order Masuk");
        penerimaan.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        penerimaan.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                penerimaanMenuSelected(evt);
            }
        });
        penerimaan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                penerimaanMousePressed(evt);
            }
        });
        jMenuBar1.add(penerimaan);

        transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klin/Icon/icons8-yandex-money-50.png"))); // NOI18N
        transaksi.setText("Transaksi");
        transaksi.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        transaksi.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                transaksiMenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                transaksiMenuSelected(evt);
            }
        });
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transaksiMousePressed(evt);
            }
        });
        jMenuBar1.add(transaksi);

        backup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klin/Icon/icons8-backup-50.png"))); // NOI18N
        backup.setText("Backup");
        backup.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        backup.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                backupMenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                backupMenuSelected(evt);
            }
        });
        backup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backupMousePressed(evt);
            }
        });
        jMenuBar1.add(backup);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/klin/Icon/icons8-power-off-button-50 (1).png"))); // NOI18N
        exit.setText("Keluar");
        exit.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        exit.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                exitMenuSelected(evt);
            }
        });
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
    }//GEN-LAST:event_exitActionPerformed

    private void exitMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_exitMenuSelected
        
    }//GEN-LAST:event_exitMenuSelected

    private void pelangganMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_pelangganMenuSelected
        
    }//GEN-LAST:event_pelangganMenuSelected

    private void jenis_cucianMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jenis_cucianMenuSelected
         
    }//GEN-LAST:event_jenis_cucianMenuSelected

    private void penerimaanMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_penerimaanMenuSelected
        
    }//GEN-LAST:event_penerimaanMenuSelected

    private void transaksiMenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_transaksiMenuCanceled
        
    }//GEN-LAST:event_transaksiMenuCanceled

    private void transaksiMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_transaksiMenuSelected
        
    }//GEN-LAST:event_transaksiMenuSelected

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        
    }//GEN-LAST:event_formWindowOpened

    private void pelangganMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelangganMousePressed
        this.setVisible(true);
        new pelanggan().setVisible(true);
    }//GEN-LAST:event_pelangganMousePressed

    private void jenis_cucianMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jenis_cucianMousePressed
        this.setVisible(true);
        new jenis_barang().setVisible(true);
    }//GEN-LAST:event_jenis_cucianMousePressed

    private void penerimaanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penerimaanMousePressed
        this.setVisible(true);
        new penerimaan().setVisible(true);
    }//GEN-LAST:event_penerimaanMousePressed

    private void transaksiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMousePressed
        this.setVisible(true);
        new transaksi().setVisible(true);
    }//GEN-LAST:event_transaksiMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        int confirm = JOptionPane.showConfirmDialog(this,
           "Konfirmasi Keluar Aplikasi",
            "Yakin untuk keluar dari program",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

                if (confirm == JOptionPane.YES_OPTION) {
                 System.exit(0);
        }
    }//GEN-LAST:event_exitMousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void backupMenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_backupMenuCanceled
        // TODO add your handling code here:
    }//GEN-LAST:event_backupMenuCanceled

    private void backupMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_backupMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_backupMenuSelected

    private void backupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backupMousePressed
        // TODO add your handling code here:
        this.setVisible(true);
        new backup().setVisible(true);
    }//GEN-LAST:event_backupMousePressed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu backup;
    private javax.swing.JMenu exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu jenis_cucian;
    private javax.swing.JMenu pelanggan;
    private javax.swing.JMenu penerimaan;
    private javax.swing.JMenu transaksi;
    // End of variables declaration//GEN-END:variables

}
