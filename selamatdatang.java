/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.Dimension;
import java.awt.Frame;
/**
 *
 * @author acer
 */
public class selamatdatang extends javax.swing.JFrame {

    /**
     * Creates new form selamatdatang
     */
    public selamatdatang() {
        initComponents();
        showDate();
        showTime();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2 -getHeight()/2);
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        
    }
    void showDate(){
        Date d = new Date();
        SimpleDateFormat s= new SimpleDateFormat("dd-MM-yyyy");
        Date.setText(s.format(d));
    }
    void showTime(){
        
       new Timer (0,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat s= new SimpleDateFormat("hh:mm:ss a");
                Time.setText(s.format(d));
            }
        }).start();
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
        admin = new javax.swing.JButton();
        pembeli = new javax.swing.JButton();
        tentang = new javax.swing.JButton();
        masuk = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(434, 484));
        setMinimumSize(new java.awt.Dimension(434, 484));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(434, 484));
        jPanel1.setMinimumSize(new java.awt.Dimension(434, 484));
        jPanel1.setLayout(null);

        admin.setText("Tenant");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        jPanel1.add(admin);
        admin.setBounds(230, 210, 100, 40);

        pembeli.setText("Pembeli");
        pembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembeliActionPerformed(evt);
            }
        });
        jPanel1.add(pembeli);
        pembeli.setBounds(230, 270, 100, 40);

        tentang.setText("Pegawai");
        tentang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tentangActionPerformed(evt);
            }
        });
        jPanel1.add(tentang);
        tentang.setBounds(230, 330, 100, 40);

        masuk.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        masuk.setText("Masuk Sebagai");
        jPanel1.add(masuk);
        masuk.setBounds(220, 150, 150, 50);

        Date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Date.setText("Date");
        jPanel1.add(Date);
        Date.setBounds(220, 30, 100, 30);

        Time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Time.setText("Time");
        jPanel1.add(Time);
        Time.setBounds(220, 90, 130, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/011.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 370, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 360, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        new admin().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_adminActionPerformed

    private void pembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembeliActionPerformed
        // TODO add your handling code here:
        new pembeli().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_pembeliActionPerformed

    private void tentangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tentangActionPerformed
        // TODO add your handling code here:
        new logintenant().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tentangActionPerformed

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
            java.util.logging.Logger.getLogger(selamatdatang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selamatdatang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selamatdatang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selamatdatang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selamatdatang().setVisible(true);
            }
        });
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Time;
    private javax.swing.JButton admin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel masuk;
    private javax.swing.JButton pembeli;
    private javax.swing.JButton tentang;
    // End of variables declaration//GEN-END:variables
}
 

